public class Main {
    public static void main(String [] args){
        String str = "asdfrrsg";
        int maxChar = 0;
        int secMaxChar = 0;
        char secChar = '0';
        for(int i= 0; i < str.length(); i++)
        {
            int ch = str.charAt(i);

            if(maxChar < ch){
                secMaxChar = maxChar;
                maxChar = ch;
            }else if(secMaxChar < ch && maxChar != ch)
                secMaxChar = ch;
        }

        secChar = (char) secMaxChar;
        System.out.println(secChar);
    }
}