public class Main {

    public static void main(String[] args) {
        fibonaciSeries(4);
    }

    private static int fibonaciSeries(int i) {


        System.out.println("adna,d,a");
        System.out.println(i);
        if(i==0){
            return 0;
        }
        if(i == 1){
            return 1;
        }
        if(i<0){
            return 0;
        }
         int sum =fibonaciSeries(i-1)+ fibonaciSeries(i-2);
        System.out.println(sum);
        return sum;
    }

}
