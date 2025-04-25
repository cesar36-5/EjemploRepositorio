public class main {
    public static void main(String[] args) {
        System.out.println("Hello worldg2 ");
    }

    public void suma(int a, int b){
        System.out.println(a+b);
    }

    public void resta(int a, int b){
        System.out.println(a-b);
    }

    public void multi(int a, int b){
        System.out.println(a*b);
    }
    public void div(int a, int b){
        if(b==0){
            System.out.println("No se puede dividir");
        }else{
            System.out.println(a/b);
        }
        //-
    }
}