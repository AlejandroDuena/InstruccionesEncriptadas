public class Verificador {
    public void main(String[] args) {

        leerDocumento LD = new leerDocumento();
        int instruccion_uno = LD.getCaractInstruccion_uno();
        int instruccion_dos = LD.getCaractInstruccion_dos();
        int mensajeIncriptado = LD.getCaractMensajeIncriptado();
        String instruccion1 = LD.getInstruccion1();
        String instruccion2 = LD.getInstruccion2();
        String mensaje = LD.getMensaje();
        String instruc_1 = "";
        String instruc_2 = "";

        setInstruc_1(instruc_1);
        setInstruc_2(instruc_2);

        if ((mensajeIncriptado >= 3 && mensajeIncriptado <= 5000) &&
                (instruccion_uno >= 2 && instruccion_uno <= 50) &&
                (instruccion_dos >= 2 && instruccion_dos <= 50)) {
            int i = 0;
            int j = 0;
            //int m = 0;
            //int n = 0;
            while (i < mensaje.length()-1 && j < instruccion1.length()) {
                i++;
                if (instruccion1.charAt(j) == mensaje.charAt(i)) {
                    j++;
                }
            }
                if (j == instruccion1.length()) {
                    instruc_1 = "SI";
                } else {
                    instruc_1 = "NO";
                }
                while (i < mensaje.length()-1 && j < instruccion2.length()) {
                    i++;
                    if (instruccion2.charAt(j) == mensaje.charAt(i)) {
                        j++;
                    }
                }
                    if (j == instruccion2.length())
                    {
                        instruc_2 = "SI";
                    } else {
                        instruc_2 = "NO";
                    }
        }
        System.out.println(instruc_1 + " " + instruc_2);
    }
    private String instruc_1;
    private String instruc_2;

    public void setInstruc_1 (String instruc_1){
        this.instruc_1 = instruc_1;
    }
    public void setInstruc_2(String instruc_2){
        this.instruc_2 = instruc_2;
    }
    public String getInstruc_1 (){
        return instruc_1;
    }
    public String getInstruc_2 (){
        return  instruc_2;
    }
    public void mostrarResultados(){
        System.out.println(instruc_1);
        System.out.println(instruc_2);
    }
}
