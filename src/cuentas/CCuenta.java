package cuentas;

/**
 * Clase que representa una cuenta bancaria.
 * Permite gestionar operaciones basicas como ingresar y retirar dinero,
 * asi como consultar el estado de la cuenta.
 * 
 * @author Diego Alexander Albarracín Jacho
 * @version 1.0
 */
public class CCuenta {

    /** Nombre del titular de la cuenta */
    private String nombre;

    /** Numero identificador de la cuenta bancaria */
    private String cuenta;

    /** Saldo actual disponible en la cuenta */
    private double saldo;

    /** Tipo de interes aplicado a la cuenta */
    private double tipoInteres;

    /**
     * Constructor por defecto.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parametros.
     * 
     * @param nom Nombre del titular
     * @param cue Numero de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interes aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInteres = tipo;
    }

    /**
     * Asigna un nuevo nombre al titular de la cuenta.
     * 
     * @param nom Nuevo nombre del titular
     */
    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    /**
     * Obtiene el nombre del titular.
     * 
     * @return Nombre del titular
     */
    public String obtenerNombre() {
        return getNombre();
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return Saldo disponible
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");

        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");

        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");

        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el numero de cuenta.
     * 
     * @return Numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo numero de cuenta.
     * 
     * @param cuenta Nuevo numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual.
     * 
     * @return Saldo actual
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Modifica el saldo de la cuenta.
     * 
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interes aplicado a la cuenta.
     * 
     * @return Tipo de interes
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Modifica el tipo de interes.
     * 
     * @param tipoInteres Nuevo tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}