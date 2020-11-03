public class Base_64 {
    public String BaseEncrypt(String str) {
        String encryptedString = getEncodedString(str);
        return encryptedString;
    }

    public String BaseDecrypt(String str) {
        String decryptedString = getDecodedString(str);
        return decryptedString;
    }
    private String getEncodedString(String password) {
        return java.util.Base64.getEncoder().encodeToString(password.getBytes());
    }

    private static String getDecodedString(String encryptedString) {
        return new String(java.util.Base64.getMimeDecoder().decode(encryptedString));
    }
}
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Base_64 bs = new Base_64();
        System.out.print("Enter String : ");
        String s = sc.nextLine();
        String en = bs.BaseEncrypt(s);
        System.out.println("Encrypted String is : "+en);
        System.out.println("DEcrypted String is : "+bs.BaseDecrypt(en));

    } } */