public class Zarbb  {
    public Zarbb(){}

    public void zarb(){
        int i = 0;
        int j = 0;
        int z = 0;
        for(i = 0 ; i<=10 ; i++){
            System.out.print(i+" :");
            for(j = 0 ; j<=10 ; j++){
                z = i*j;
                System.out.print(" "+z);
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Zarbb tentoten = new Zarbb();
        tentoten.zarb();
    }
}

