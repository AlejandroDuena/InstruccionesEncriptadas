import java.io.FileWriter;
import java.io.PrintWriter;

public class crearDocumento {
    public static void main(String[] args) {
        Verificador ver = new Verificador();
        ver.mostrarResultados();
        /*String instruc1 = ver.getInstruc_1();
        String instruc2 = ver.getInstruc_2();
        FileWriter fichero = null;
        PrintWriter pw;

        try {
            fichero = new FileWriter("resultados.txt");
            pw = new PrintWriter(fichero);
            pw.println(instruc1);
            pw.println(instruc2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) ;
                fichero.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }*/
    }
}