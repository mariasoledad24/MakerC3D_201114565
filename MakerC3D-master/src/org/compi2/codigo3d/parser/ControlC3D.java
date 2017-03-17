package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = "";
    private static int etq=0;
    /**
     * Reinicia las variables est�ticas relacionadas con la generaci�n del
     * c�digo de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        etq=0;
        c3d = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    
    public static String generaEtq(){
        return "L"+etq++;
    }
    
    /**
     * Agrega la sentencia que recibe como par�metro a la cadena de c�digo
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia C�digo 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el c�digo 3D generao hasta el momento de su invocaci�n.
     * @return C�digo 3D generado
     */
    public static String getC3D(){
        return c3d;
    }

	public static int getTemp() {
		return temp;
	}

	public static void setTemp(int temp) {
		ControlC3D.temp = temp;
	}

	public static int getEtq() {
		return etq;
	}

	public static void setEtq(int etq) {
		ControlC3D.etq = etq;
	}
    
}
