public class CaesarCipher {
    
    public static void caesarCipher(String a, int key, int signal){
        String finalText = " ";

        for(int i = 0; i < a.length(); i++){
            finalText += (char)(97+(((a.charAt(i) - 97) + (signal * key)) % 25));
        }
        System.out.println(finalText);
    }
}
