// @author Zenith

public class codeConverter {

    public String multiCodeConvert(String str) {

        counter = 0;
        if (str.contains("   ")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.startsWith("   ", i)) {
                    counter++;
                }
            }
            tmpSentence = new String[counter];
            tmpSentence = str.split("   ");

            for (int i = 0; i < tmpSentence.length; i++) {
                counter = 0;
                for (int j = 0; j < tmpSentence[i].length(); j++) {
                    if (tmpSentence[i].startsWith(" ", j)) {
                        counter++;
                    }

                    tmpWord = new String[counter];

                    if (tmpSentence[i].contains(" ")) {
                        tmpWord = tmpSentence[i].split(" ");
                    }

                    tmp = "";

                    for (int k = 0; k < tmpWord.length; k++) {
                        tmp = tmp + singleCodeConvert(tmpWord[k]);
                    }

                }
                multiStr = multiStr + tmp + " ";
            }
        }

        else {
            
            for (int i = 0; i < str.length(); i++) {
                if (str.startsWith(" ", i)) {
                    counter++;
                }
            }
            
            tmpWord = new String[counter];
            tmpWord = str.split(" ");

            for ( int i=0; i<tmpWord.length; i++ ) {
                multiStr = multiStr + singleCodeConvert(tmpWord[i]);
            }
        }
        
        return multiStr;
    }

    public String singleCodeConvert(String str) {
        singleStr = "";

        if (str.equals("*-")) {
            singleStr = "a";
        } else if (str.equals("-***")) {
            singleStr = "b";
        } else if (str.equals("-*-*")) {
            singleStr = "c";
        } else if (str.equals("-**")) {
            singleStr = "d";
        } else if (str.equals("*")) {
            singleStr = "e";
        } else if (str.equals("**-*")) {
            singleStr = "f";
        } else if (str.equals("--*")) {
            singleStr = "g";
        } else if (str.equals("****")) {
            singleStr = "h";
        } else if (str.equals("**")) {
            singleStr = "i";
        } else if (str.equals("*---")) {
            singleStr = "j";
        } else if (str.equals("-*-")) {
            singleStr = "k";
        } else if (str.equals("*-**")) {
            singleStr = "l";
        } else if (str.equals("--")) {
            singleStr = "m";
        } else if (str.equals("-*")) {
            singleStr = "n";
        } else if (str.equals("---")) {
            singleStr = "o";
        } else if (str.equals("*--*")) {
            singleStr = "p";
        } else if (str.equals("--*-")) {
            singleStr = "q";
        } else if (str.equals("*-*")) {
            singleStr = "r";
        } else if (str.equals("***")) {
            singleStr = "s";
        } else if (str.equals("-")) {
            singleStr = "t";
        } else if (str.equals("**-")) {
            singleStr = "u";
        } else if (str.equals("***-")) {
            singleStr = "v";
        } else if (str.equals("*--")) {
            singleStr = "w";
        } else if (str.equals("-**-")) {
            singleStr = "x";
        } else if (str.equals("-*--")) {
            singleStr = "y";
        } else if (str.equals("--**")) {
            singleStr = "z";
        } else if (str.equals("-----")) {
            singleStr = "0";
        } else if (str.equals("*----")) {
            singleStr = "1";
        } else if (str.equals("**---")) {
            singleStr = "2";
        } else if (str.equals("***--")) {
            singleStr = "3";
        } else if (str.equals("****-")) {
            singleStr = "4";
        } else if (str.equals("*****")) {
            singleStr = "5";
        } else if (str.equals("-****")) {
            singleStr = "6";
        } else if (str.equals("--***")) {
            singleStr = "7";
        } else if (str.equals("---**")) {
            singleStr = "8";
        } else if (str.equals("----*")) {
            singleStr = "9";
        } else if (str.equals("%SPACE%")) {
            singleStr = " ";
        } else {
            System.out.println("wrong input in single convert!");
        }
        return singleStr;
    }
    
    
    private String[] tmpSentence;
    private String[] tmpWord;
    private String tmp;
    private String multiStr = "";
    private String singleStr;
    private int counter;
}
