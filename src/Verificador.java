public class Verificador {
    public String instruc1() {

        leerDocumento LD = new leerDocumento();
        int instruccion_uno = LD.getCaractInstruccion_uno();
        int instruccion_dos = LD.getCaractInstruccion_dos();
        int mensajeIncriptado = LD.getCaractMensajeIncriptado();
        String instruccion1 = LD.getInstruccion1();
        String mensaje = LD.getMensaje();
        String instruc_1 = "";

        if ((mensajeIncriptado >= 3 && mensajeIncriptado <= 5000) &&
                (instruccion_uno >= 2 && instruccion_uno <= 50) &&
                (instruccion_dos >= 2 && instruccion_dos <= 50)) {
            int i = 0;
            int j = 0;

            while (i < mensaje.length()-1 && j < instruccion1.length()) {
                i++;
                if (instruccion1.charAt(j) == mensaje.charAt(i)) {
                    j++;
                }
            }
            if (j == instruccion1.length())
            {
                instruc_1 = "SI";
            } else {
                instruc_1 = "NO";
            }
        }
        return instruc_1;
    }
    public String instruc2() {

        leerDocumento LD = new leerDocumento();
        int instruccion_uno = LD.getCaractInstruccion_uno();
        int instruccion_dos = LD.getCaractInstruccion_dos();
        int mensajeIncriptado = LD.getCaractMensajeIncriptado();
        String instruccion2 = LD.getInstruccion2();
        String mensaje = LD.getMensaje();
        String instruc_2 = "";

        if ((mensajeIncriptado >= 3 && mensajeIncriptado <= 5000) &&
                (instruccion_uno >= 2 && instruccion_uno <= 50) &&
                (instruccion_dos >= 2 && instruccion_dos <= 50)) {
            int i = 0;
            int j = 0;

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
        return instruc_2;
    }
    /*private static boolean caractDuplicado (String input) {
        for (int interaccionInput = 0; interaccionInput < input.length()-1; interaccionInput++){
            if (input.charAt(interaccionInput) == input.charAt(interaccionInput + 1)){
                return false;
            }
        }
        return true;
    }
    private static boolean validarCaracteresEspeciales(String mensaje) {
        String caractValidos = "[a-zA-Z0-9]";
        String vaidarMensaje = mensaje.replaceAll(caractValidos, "");
        if (mensaje.equals(vaidarMensaje)){
            return true;
        }else {
            return false;
        }
    }*/
}
