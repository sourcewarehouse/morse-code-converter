// @author Zenith

public class wordConverter {

    public String multiWordConvert(String str) {

        if (str != null) {
            tmpWord = new String[str.length()];
            tmpWord = str.split("");
            for (int i = 0; i < tmpWord.length; i++) {
                multiStr = multiStr + singleWordConvert(tmpWord[i]);
            }
        }

        return multiStr;
    }

    public String singleWordConvert(String str) {
        singleStr = "";

        if (str.equals("a") || str.equals("A")) {
            singleStr = "*- ";
        } else if (str.equals("b") || str.equals("B")) {
            singleStr = "-*** ";
        } else if (str.equals("c") || str.equals("C")) {
            singleStr = "-*-* ";
        } else if (str.equals("d") || str.equals("D")) {
            singleStr = "-** ";
        } else if (str.equals("e") || str.equals("E")) {
            singleStr = "* ";
        } else if (str.equals("f") || str.equals("F")) {
            singleStr = "**-* ";
        } else if (str.equals("g") || str.equals("G")) {
            singleStr = "--* ";
        } else if (str.equals("h") || str.equals("H")) {
            singleStr = "**** ";
        } else if (str.equals("i") || str.equals("I")) {
            singleStr = "** ";
        } else if (str.equals("j") || str.equals("J")) {
            singleStr = "*--- ";
        } else if (str.equals("k") || str.equals("K")) {
            singleStr = "-*- ";
        } else if (str.equals("l") || str.equals("L")) {
            singleStr = "*-** ";
        } else if (str.equals("m") || str.equals("M")) {
            singleStr = "-- ";
        } else if (str.equals("n") || str.equals("N")) {
            singleStr = "-* ";
        } else if (str.equals("o") || str.equals("O")) {
            singleStr = "--- ";
        } else if (str.equals("p") || str.equals("P")) {
            singleStr = "*--* ";
        } else if (str.equals("q") || str.equals("Q")) {
            singleStr = "--*- ";
        } else if (str.equals("r") || str.equals("R")) {
            singleStr = "*-* ";
        } else if (str.equals("s") || str.equals("S")) {
            singleStr = "*** ";
        } else if (str.equals("t") || str.equals("T")) {
            singleStr = "- ";
        } else if (str.equals("u") || str.equals("U")) {
            singleStr = "**- ";
        } else if (str.equals("v") || str.equals("V")) {
            singleStr = "***- ";
        } else if (str.equals("w") || str.equals("W")) {
            singleStr = "*-- ";
        } else if (str.equals("x") || str.equals("X")) {
            singleStr = "-**- ";
        } else if (str.equals("y") || str.equals("Y")) {
            singleStr = "-*-- ";
        } else if (str.equals("z") || str.equals("Z")) {
            singleStr = "--** ";
        } else if (str.equals("0")) {
            singleStr = "----- ";
        } else if (str.equals("1")) {
            singleStr = "*---- ";
        } else if (str.equals("2")) {
            singleStr = "**--- ";
        } else if (str.equals("3")) {
            singleStr = "***-- ";
        } else if (str.equals("4")) {
            singleStr = "****- ";
        } else if (str.equals("5")) {
            singleStr = "***** ";
        } else if (str.equals("6")) {
            singleStr = "-**** ";
        } else if (str.equals("7")) {
            singleStr = "--*** ";
        } else if (str.equals("8")) {
            singleStr = "---** ";
        } else if (str.equals("9")) {
            singleStr = "----* ";
        } else if (str.equals(" ")) {
            singleStr = "  ";
        } else if (str.equals("")) {
            singleStr = "";
        } else {
            System.out.println("wrong input in single convert!");
        }
        return singleStr;
    }
    private String[] tmpWord;
    private String multiStr = "";
    private String singleStr;
}
