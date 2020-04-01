public class WarmUp {

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (weekday == false || vacation == true) {
            return true;

        }
        return false;

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return 2 * (a + b);
        }
        return a + b;
    }

    public int diff21(int n) {
        if (n < 21) {
            return Math.abs(21 - n);
        }
        return Math.abs(21 - n) * 2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour > 23) {
            return false;
        }
        if (talking == true && (hour < 7 || hour > 20)) {
            return true;

        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        if ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)) {
            return true;
        }
        return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 && negative == false || a > 0 && b < 0 && negative == false || a < 0 && b < 0 && negative == true) {
            return true;
        }
        return false;
    }

    public String notString(String str) {
        String not = "not ";
        if (str.length() < 3 && str != null) {
            return not.concat(str);

        }
        String st = str.substring(0, 3);
        if ("not".equals(st)) {
            return str;

        }
        return not.concat(str);
    }

    public String missingChar(String str, int n) {
        if (n > str.length()) {
            return str;
        }

        return str.substring(0, n) + str.substring(n + 1, str.length());
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }

    public String front3(String str) {
        String nStr = "";
        String nullStr = "";
        if (str.length() < 3) {
            return str + str + str;
        } else if (str.length() >= 3) {
            nStr = str.substring(0, 3);
        }
        return nStr + nStr + nStr;
    }

    public String backAround(String str) {
        if (str.length() == 1) {
            return str + str + str;
        }
        return str.substring(str.length() - 1, str.length()) + str + str.substring(str.length() - 1, str.length());
    }

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }

    public String front22(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
        return str + str + str;
    }

    public boolean startHi(String str) {
        if (str.length() < 2) {
            return false;
        }
        String nStr = str.substring(0, 2);
        if ("hi".equals(nStr)) {
            return true;
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        if (temp1 > 100 && temp2 < 0 || temp1 < 0 && temp2 > 100) {
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        if (10 <= a && a <= 20 || 10 <= b && b <= 20) {
            return true;
        }
        return false;
    }

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
            return true;
        }
        return false;
    }

    public boolean loneTeen(int a, int b) {
        if (!((13 <= a && a <= 19) && (13 <= b && b <= 19)) && (13 <= a && a <= 19 && a != b || 13 <= b && b <= 19 && b != a)) {
            return true;
        }
        return false;
    }

    public String delDel(String str) {
        if (str.length() < 4) {
            return str;
        }
        String nStr = str.substring(1, 4);
        if ("del".equals(nStr)) {
            return str.substring(0, 1) + str.substring(4, str.length());
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String nStr = str.substring(1, 3);
        if ("ix".equals(nStr)) {
            return true;
        }
        return false;
    }

    public String startOz(String str) {
        if (str.length() < 2) {
            return str;
        }
        String o = str.substring(0, 1);
        String z = str.substring(1, 2);
        if ("o".equals(o) && "z".equals(z)) {
            return o + z;
        }
        if ("o".equals(o)) {
            return o;
        } else if ("z".equals(z)) {
            return z;
        }
        return "";
    }

    public int intMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            }
        }
        if (a < c) {
            if (c > b) {
                return c;
            }
        }
        return b;
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(a - 10) > Math.abs(b - 10)) {
            return b;
        }
        return 0;
    }

    public boolean in3050(int a, int b) {
        if ((30 <= a && a <= 40 && 30 <= b && b <= 40) || (40 <= a && a <= 50 && 40 <= b && b <= 50)) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        if (10 <= a && a <= 20 && 10 <= b && b <= 20) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }
        if (10 <= a && a <= 20) {
            return a;
        }
        if (10 <= b && b <= 20) {
            return b;
        }
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                count++;
            }
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) {
            return true;
        }
        return false;
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String begin = str.substring(0, cut);
        String end = str.substring(cut);
        return begin + end.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String nStr = "";
        for (int i = 0; i < str.length(); i = i + n) {
            nStr = nStr + str.charAt(i);
        }
        return nStr;
    }
}
