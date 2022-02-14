package cuentas;

/**
 *
 * @author ithaldin
 */
public class CCuenta {

    /**
     * Método getter del atributo nombre
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter del atributo nombre
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter del atributo cuenta
     *
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter del atributo cuenta
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter del atributo saldo
     *
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter del atributo saldo
     *
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter del atributo tipoInteres
     *
     * @return the tipoInteres
     */
    public double getTipoInterés() {
        return tipoInteres;
    }

    /**
     * Método setter del atributo tipoInteres
     *
     * @param tipoInteres the tipoInteres to set
     */
    public void setTipoInterés(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Nombre titular de la cuenta
     */
    private String nombre;
    
    /**
     * Número de la cuenta bancaria
     */
    private String cuenta;
    
    /**
     * Saldo de la cuenta bancaria
     */
    private double saldo;
    
    /** Tipo de interés de la cuenta bancaria
     */
    private double tipoInteres;

    /**
     * Constructor de clase sin parámetros
     */
    public CCuenta() {
    }

    /**
     * Constructor de clase con parámetros
     *
     * @param nom nombre
     * @param cue cuenta
     * @param sal saldo
     * @param tipo tipo interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Método para obtener el saldo actual de la cuenta
     *
     * @return
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad en una cuenta. Comprueba que no se
     * introduzca una cantidad negativa
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar dinero de una cuenta. Comprueba que la cantidad no
     * sea negativa o que sea mayor al saldo actual de la cuenta.
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
