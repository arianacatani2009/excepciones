import java.util.Scanner;
public class principal {
    public class main{
        public void main(String[]args){
            try{
                int[] ayNumbers = {1,2,3};
                System.out.println(ayNumbers[10]);
            }catch (Exception e){
                System.out.println("Algo salio mal.");
                System.out.println(e);
            }
            finally {
                System.out.println("De todas formas voy a mostrar este mensaje");
            }
        }
    }
}
