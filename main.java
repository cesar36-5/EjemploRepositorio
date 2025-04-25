import java.util.ArrayList;

public class main {
    static ArrayList<String> nombres = new ArrayList<>();
    public static void main(String[] args) {
        nombres.add("Mercedes");
        nombres.add("César");
        nombres.add("Yamilet");
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
        try {
            if(b==0){
                throw new Exception("No se puede dividir por 0");
            }else{
                System.out.println(a/b);
            }
            //-
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //Mercedes
    public void funcion(double a){
        System.out.println("Double: " + a);
    }
    //Cesar
    public void funcion(int a){
        System.out.println("Int: " + a);
    }
    
}