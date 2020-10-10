public class BlockCipher_Decrypt {
    private String decryptText = "";
    public String blkDecrypt(String s)
    {
        String str = s.replaceAll("\\s","");
        System.out.println("str : "+str);
        int len = str.length();
        double range = Math.sqrt(len);
        int row = (int)Math.floor(range);
        int col = (int)Math.ceil(range);
        for (int i = 0; i < row; i++) {
            for (int j = i; j <len; j+=row) {
                    decryptText += str.charAt(j);
            }
//            encryptText += " ";
        }
        return  decryptText;
    } // BlockCipher_Encrypt

//    public static void main(String[] args) {
//        System.out.println(new BlockCipher_Decrypt().blkDecrypt("hli eo lh "));
//    }
}