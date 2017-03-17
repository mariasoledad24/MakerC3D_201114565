package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String falso;
    private String verdadero;
  
    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad,String verdadero,String falso) {
        this.cad = cad;
        this.falso=falso;
        this.verdadero=verdadero;
        
    }
    public String getCad(){
        return cad;
    }

	public String getFalso() {
		return falso;
	}

	public void setFalso(String falso) {
		this.falso = falso;
	}

	public String getVerdadero() {
		return verdadero;
	}

	public void setVerdadero(String verdadero) {
		this.verdadero = verdadero;
	}

	public void setCad(String cad) {
		this.cad = cad;
	}
    
        
}
