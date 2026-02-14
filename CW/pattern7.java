public class pattern7 {
    public static void main(String[] args) {
        int count = 1 ;
        for(int i=1; i<=5; i++){

            //for spaces
            for (int s = 5-1 ; s >= i; s--) {
                System.out.print(" ");
            }

            //for letters
            for(int j=1; j<=i; j++){
                System.out.print(count+" ");
                ++count ;
            }
            System.out.println();
        }
    }
}
