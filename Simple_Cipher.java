public class Simple_Cipher {
    public String Simple(String str, int key)
    {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s += (char)(str.charAt(i)+key);
        }
        return s;
    }
    public String Cipher(String str, int key)
    {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (key<0)
                s += (char)(str.charAt(i)-key);
            else
                s += (char)(str.charAt(i)-key);
        }
        return s;
    }
//    public static void main(String[] args) {
//        String encrpt = new Simple_Cipher().Simple("XYZ123",-2);
//        String decrpt = new Simple_Cipher().Cipher(encrpt,-2);
//        System.out.println("encrpt : "+encrpt);
//        System.out.println("Decrpt : "+decrpt);
//
//    }
}
