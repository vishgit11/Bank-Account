public class Main {
    public static void main(String [] args){
        int result = 0;
        int num = 0;

        while(num < 1000){
            result = result * 10 + 8;
            num++;
        }
        System.out.println(result);
    }
}