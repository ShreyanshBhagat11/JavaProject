public class BlockCipher_Encrypt
{
    private String encryptText = "";
    public String blkEncrypt(String s)
    {
        String str = s.replaceAll("\\s","");
        int len = str.length();
        double range = Math.sqrt(len);
        int row = (int)Math.floor(range);
        int col = (int)Math.ceil(range);
        for (int i = 0; i < col; i++) {
            for (int j = i; j <len; j+=col) {
                encryptText += str.charAt(j);
            }
            encryptText += " ";
        }
        return  encryptText;
    }
}
