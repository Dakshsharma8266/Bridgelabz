import java.util.*;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int gf=1;
        int counter=n-1;
        while(counter>=1){
            if(n%counter==0){
                gf=counter;
                break;
            }
            counter--;
        }
        System.out.println(gf);
    }
}
