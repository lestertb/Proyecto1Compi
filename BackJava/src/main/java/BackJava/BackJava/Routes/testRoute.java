package BackJava.BackJava.Routes;

import java.util.concurrent.atomic.AtomicLong;

import BackJava.BackJava.Classes.MyErrorListener;
import BackJava.BackJava.Classes.response;
import generated.miParser;
import generated.miScanner;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
public class testRoute {

    private static String res = "";

    @GetMapping("/test")
    public response greeting() {
        return new response(res);
    }

    @PostMapping("/agregar")
    void agregar (@RequestBody String test){

        miScanner inst = null;
        miParser parser = null;
        //ParseTree tree=null;

        CharStream input=null;
        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            input = CharStreams.fromFileName("test.txt");
            inst = new miScanner(input);
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            /*try {
                tree = parser.program();
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }*/

            if (!errorListener.hasErrors()) {
                res = "Compilación Exitosa!!\n";
                /*java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                treeGUI.get().setVisible(true);*/
            }
            else {
                res = "Compilación Fallida!!\n" + errorListener.toString();
            }

        }
        catch(Exception e) {
            res = "Sucedió algún error";
        }
    }
}
