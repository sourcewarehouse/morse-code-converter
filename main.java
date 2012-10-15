// @author Zenith

public class main {

    public static void main(String[] args) {
        
        if (args[0].equals("word")) {
            wordConverter wc = new wordConverter ();
            System.out.println(wc.multiWordConvert(args[1]));
        }
        
        if (args[0].equals("code")) {
            codeConverter cc = new codeConverter ();
            System.out.println(cc.multiCodeConvert(args[1]));
        }
    
    }
}
