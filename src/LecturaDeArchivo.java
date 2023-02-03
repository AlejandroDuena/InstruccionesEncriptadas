import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

    class LeerDocumento {
        Scanner sc = new Scanner(System.in);
        File archivo;
        {
            archivo = new File("instrucciones.txt");
            int m1 = 0, m2 = 0;
            int n = 0;
            String instruc1 = "";
            String instruc2 = "";
            String mensaje = "";
            try {
                sc = new Scanner(archivo);

                m1 = sc.nextInt();
                m2 = sc.nextInt();
                n = sc.nextInt();
                instruc1 = sc.next();
                instruc2 = sc.next();
                mensaje = sc.next();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

        }
  public class LecturaDeArchivo{
        public void main (String [] args){
            
        }
    }
}
