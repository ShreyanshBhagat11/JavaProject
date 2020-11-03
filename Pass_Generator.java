public class Pass_Generator {
    String PassGenerate(int len) 
    {
        String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Small_chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String password = "";
        int j = 0;
        for (int i = 0; i < len; i++)
            switch ((int) (Math.random() * 4 + 1)) {
                case 1:
                    password += Capital_chars.charAt((int) (Math.random() * 25 + 0));
                    break;
                case 2:
                    password += Small_chars.charAt((int) (Math.random() * 25 + 0));
                    break;
                case 3:
                    password += numbers.charAt((int) (Math.random() * 9 + 0));
                    break;
                case 4:
                    password += symbols.charAt((int) (Math.random() * 17 + 0));
                    break;
            }
//            password[i] = values.charAt(rndm_method.nextInt(values.length()));
        return password;
    }
}
