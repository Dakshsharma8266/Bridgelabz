import java.util.*;
class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int counter=100;
        if(n>0 && n<100){
            while(counter>=1){
                if(counter%n==0) System.out.println(counter);
                counter--;
            }
        }
    }
}
