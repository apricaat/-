public class program_5 {
    public static void main(String[] args){
        float  n=1;
        while (n<=10){
            double r=1/n;
            System.out.println("Гармонический ряд из 10 элементов "+String.format("%.2f",(double)r));
            n++;
        }

    }
}
