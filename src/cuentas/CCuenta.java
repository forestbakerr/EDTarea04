/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * Clase qeu define objetos de tipo cuenta bancaria y que define varios 
 * métodos para manipular dichos objetos.
 * @author Aiala Medrano 
 * DAW ED_Tarea04
 */
public class CCuenta {

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Nombre del propietario de la cuenta.
     */
    private String nombre;
    /**
     * Nombre de la cuenta.
     */
    private String cuenta;
    /**
     * Valor del total almacenado enla cuenta.
     */
    private double saldo;
    /**
     * Valor del interés que genera la cuenta.
     */
    private double tipoInterés;

    /**
     * Método constructor.
     */
    public CCuenta()
    {
    }
    /**
     * Método constructor con parámetros especificados.
     * @param nom Nombre del propietario de la cuenta.
     * @param cue Nombre de la cuenta.
     * @param sal Valor del total almacenado en la cuenta.
     * @param tipo Valor del interés que genera la cuenta. Por algún motivo, 
     * se pide este valor por parámetro, pero después el constructor no lo utiliza.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Método que pide una cadena de caracteres por parámetro y la almacena en 
     * el atributo nombre.
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    /**
     * Método que devuelve la cadena de caracteres almacenada en el atributo 
     * nombre.
     * @return devuelve una cadena de caracteres.
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Método que devuelve el valor almacenado en el atributo saldo.
     * @return Devuelve un valor de tipo double.
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método que suma un valor que entra por parámetro al atributo saldo.
     * @param cantidad Valor que se quiere sumar al saldo.
     * @throws Exception Si el método no puede operar con éxito lanza una 
     * excepción.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Método que resta un valor que entra por parámetro al atributo saldo.
     * @param cantidad Valor que se quiere restar al saldo.
     * @throws Exception Si el método no puede operar con éxito lanza una 
     * excepción.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /** 
     * Método que devuelve la cadena de caracteres almacenada en el atributo 
     * cuenta.
     * @return devuelve una cadena de caracteres.
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Método que devuelve la cadena de caracteres almacenada en el atributo
     * nombre.
     * @return Devuelve una cadena de caracteres.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que asigna una cadena de caracteres que entra por parámetro al 
     * atributo nombre.
     * @param nombre Nombre del propietario de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que devuelve el valor almacenado en el atributo tipoInterés.
     * @return Devuelve un valor tipo double.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Método que asigna un valor tipo double que entra por parámetro al 
     * atributo tipoInterés.
     * @param tipoInterés Valor del tipo de interés que genera la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
