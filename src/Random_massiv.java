import java.util.Random;

public class Random_massiv {
    public static void main(String[] args){
    Random rand = new Random();
    int mas[]=new int[10];
        System.out.println("Неотсортированный массив");
    for(int i=0;i<10;i++)
    {
        mas[i]=rand.nextInt(20);
        System.out.println(mas[i]);
    }
    int temp;
    boolean fixed=false;
    while(fixed==false){
        fixed=true;
        for(int i=0;i<mas.length-1;i++){
            if(mas[i]>mas[i+1]){
                temp=mas[i+1];
                mas[i+1]=mas[i];
                mas[i]=temp;
                fixed=false;
            }
        }
    }
    System.out.println("Отсортированный массив");
        for(int i=0;i<mas.length;i++){
            System.out.println(mas[i]);
        }
        System.out.println("Массив неотсортированный random Math");
        double masiv[]=new double[10];
        for(int i=0;i<10;i++)
        {
            masiv[i]=Math.floor((Math.random() * ((1000 - 10) + 1)) + 10);
            System.out.println(masiv[i]);
        }
        double tempy;
        boolean fixy=false;
        while(fixy==false){
            fixy=true;
            for(int i=0;i<masiv.length-1;i++){
                if(masiv[i]>masiv[i+1]){
                    tempy=masiv[i+1];
                    masiv[i+1]=masiv[i];
                    masiv[i]=tempy;
                    fixy=false;
                }
            }
        }
        System.out.println("Отсортированный массив");
        for(int i=0;i<masiv.length;i++){
            System.out.println(masiv[i]);
        }

    }
}