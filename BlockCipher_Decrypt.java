public class BlockCipher_Decrypt {
    String blkDecrypt(String str)
    {
        char []s = str.toCharArray();
        int l = s.length;
        int b = (int) Math.ceil(Math.sqrt(l));
        int a = (int) Math.floor(Math.sqrt(l));
        String decrypted="";

        // Matrix to generate the
        // Encrypted String
        char [][]arr = new char[a][b];
        int k = 0;

        // Fill the matrix column-wise
        for (int j = 0; j < b; j++)
        {
            for (int i = 0; i < a; i++)
            {
                if (k < l)
                {
                    arr[j][i] = s[k];
                }
                k++;
            }
        }
        // Loop to generate
        // decrypted String
        for (int j = 0; j < a; j++)
        {
            for (int i = 0; i < b; i++)
            {
                decrypted += arr[i][j];
            }
        }
        return decrypted;
    }
}
    /*private String decryptText = "";
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
}*/