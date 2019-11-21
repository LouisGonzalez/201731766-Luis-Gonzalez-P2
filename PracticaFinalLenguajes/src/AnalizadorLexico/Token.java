package AnalizadorLexico;

/**
 *
 * @author luisGonzalez
 */
public class Token {
        public  final static int palabraReservada = 1;
    public final static int tBoolean = 2;
    public final static int operador = 3;
    public final static int agrupacion = 4;
    public final static int signo = 5;
    public final static int numEntero = 6;
    public final static int numFlotante = 7;
    public final static int id = 8;
    public final static int cadena = 9;
    public final static int tCaracter = 10;
    public final static int comentario = 11;
    
    
    
    private int tipo;
    private String caracter;
    private int linea;
    
    

    public Token(int tipo, String caracter) {
        this.tipo = tipo;
        this.caracter = caracter;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getTipo() {
        return tipo;
    }

    public String getCaracter() {
        return caracter;
    }

    public int getLinea() {
        return linea;
    }
    
        public String getTipoString(){
        switch (tipo) {
            case 1:
                return "Palabra Reservada";
            case 2:
                return "Boolean";
            case 3:
                return "Operador";
            case 4:
                return "Agrupacion";
            case 5:
                return "Signo";
            case 6:
                return "Numero Entero";
            case 7:
                return "Numero Flotante";
            case 8:
                return "Identificador";
            case 9:
                return "Cadena";
            case 10:
                return "Caracter";
            case 11:
                return "Comentario";
                
            default:
                throw new AssertionError();
        }
    }

}
