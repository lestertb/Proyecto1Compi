package BackJava.BackJava.Routes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import BackJava.BackJava.Classes.MyErrorListener;
import BackJava.BackJava.Classes.response;
import generated.miParser;
import generated.miScanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

@RestController
public class testRoute {

    private static String res = "";
    private static String res2 = "";
    private List<String> listTokens = new ArrayList<>();

    @GetMapping("/test")
    public response greeting() {
        return new response(res);
    }
    @GetMapping("/test2")
    public response greeting1() {
        return new response(res2);
    }

    @PostMapping("/test3")
    public response greeting2(@RequestBody String test) {
        guardarTokens(test);
        return new response( "\nTokens utilizados:\n"+"\n"+listTokens.toString());
    }

    @PostMapping("/agregar")
    void agregar (@RequestBody String test){
        miScanner inst = null;
        miParser parser = null;
        ParseTree tree=null;

        CommonTokenStream tokens = null;
        MyErrorListener errorListener = null;
        try {
            inst = new miScanner(CharStreams.fromString(test));
            tokens = new CommonTokenStream(inst);
            parser = new miParser(tokens);

            errorListener = new MyErrorListener();

            inst.removeErrorListeners();
            inst.addErrorListener( errorListener );

            parser.removeErrorListeners();
            parser.addErrorListener ( errorListener );

            try {
                tree = parser.program();
            }
            catch(RecognitionException e){
                System.out.println("Error!!!");
                e.printStackTrace();
            }

            if ( !errorListener.hasErrors() ) {
                res2 = "Compilacion exitosa\n";
                //java.util.concurrent.Future<JFrame> treeGUI = org.antlr.v4.gui.Trees.inspect(tree, parser);
                //treeGUI.get().setVisible(true);

                res = errorListener.toString();
            }
            else {
                res2 = "Compilacion fallida\n";
                res = errorListener.toString();
            }
        }

        catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }


   void guardarTokens (String test2){
       listTokens.clear();
       miScanner inst2 = null;
       try {
           inst2 = new miScanner(CharStreams.fromString(test2));
           List<Token> lista2 = (List<Token>) inst2.getAllTokens();
           String mensaje = "";
           for (Token t : lista2) {
               mensaje = "\n"+miScanner.VOCABULARY.getSymbolicName(t.getType()) + ":" + t.getText() + "\n";
               listTokens.add(mensaje);
           }
       }
       catch(Exception e){System.out.println("No hay archivo");e.printStackTrace();}
    }
}
