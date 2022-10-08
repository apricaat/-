public class Main {
    public static void main(String[] args) {
        int [] massiv = new int [5];
        massiv[0]=43;
        massiv[1]=3;
        massiv[2]=33;
        massiv[3]=52;
        massiv[4]=1;
        int i;
        int sum=0;
        for(i=0; i<massiv.length;i++) {
            sum+=massiv[i];
        }
        System.out.println("for:"+sum);
        i=0;
        sum=0;
        while(i<massiv.length) {
            sum+=massiv[i];
            i++;
        }
        System.out.println("while: "+sum);
        i=0;
        sum=0;
        do{
            sum+=massiv[i];
            i++;

        }
        while(i!=massiv.length);
        System.out.println("do while: "+sum);
    }
}