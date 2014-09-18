/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPojo;

/**
 *
 * @author PROFESORES
 */
public class Productos {

    public Productos(int Codigo, String Nombre, String Detalle, String Proveedor, double Precio, int Stock) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Detalle = Detalle;
        this.Proveedor = Proveedor;
        this.Precio = Precio;
        this.Stock = Stock;
    }

       private int Codigo;

    /**
     * Get the value of Codigo
     *
     * @return the value of Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * Set the value of Codigo
     *
     * @param Codigo new value of Codigo
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    private String Nombre;

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    private String Detalle;

    /**
     * Get the value of Detalle
     *
     * @return the value of Detalle
     */
    public String getDetalle() {
        return Detalle;
    }

    /**
     * Set the value of Detalle
     *
     * @param Detalle new value of Detalle
     */
    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    private String Proveedor;

    /**
     * Get the value of Proveedor
     *
     * @return the value of Proveedor
     */
    public String getProveedor() {
        return Proveedor;
    }

    /**
     * Set the value of Proveedor
     *
     * @param Proveedor new value of Proveedor
     */
    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    private double Precio;

    /**
     * Get the value of Precio
     *
     * @return the value of Precio
     */
    public double getPrecio() {
        return Precio;
    }

    /**
     * Set the value of Precio
     *
     * @param Precio new value of Precio
     */
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    

    private int Stock;

    /**
     * Get the value of Stock
     *
     * @return the value of Stock
     */
    public int getStock() {
        return Stock;
    }

    /**
     * Set the value of Stock
     *
     * @param Stock new value of Stock
     */
    public void setStock(int Stock) {
        this.Stock = Stock;
    }

}
