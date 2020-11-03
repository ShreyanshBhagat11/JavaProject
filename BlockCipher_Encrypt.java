public class BlockCipher_Encrypt {
    public String blkEncrypt(String str) {
        char s[] = str.toCharArray();
        int l = s.length;
        int b = (int) Math.ceil(Math.sqrt(l));
        int a = (int) Math.floor(Math.sqrt(l));
        String encrypted = "";
        if (b * a < l) {
            if (Math.min(b, a) == b) {
                b++;
            } else {
                a++;
            }
        }

        // Matrix to generate the
        // Encrypted String
        char[][] arr = new char[a][b];
        int k = 0;

        // Fill the matrix row-wise
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < b; i++) {
                if (k < l) {
                    arr[j][i] = s[k];
                }
                k++;
            }
        }

        // Loop to generate
        // encrypted String
        for (int j = 0; j < b; j++) {
            for (int i = 0; i < a; i++) {
                encrypted += arr[i][j];
            }
        }
        return encrypted;
    }
}

/*{
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
}*/