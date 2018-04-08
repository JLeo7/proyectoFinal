package com.softwareCelestial.cl;
import java.io.File;

public class Producto {
    private String nombre;
    private File logo;
    private String descripcion;
    private String idProducto;

    public Producto() {
    }

    public Producto(String nombre, File logo, String descripcion, String idProducto) {
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getLogo() {
        return logo;
    }

    public void setLogo(File logo) {
        this.logo = logo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void modificarProducto(String id,String nombre,File logo,String descripcion){
        this.idProducto = id;
        this.nombre = nombre;
        this.logo = logo;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", logo=" + logo +
                ", descripcion='" + descripcion + '\'' +
                ", idProducto='" + idProducto + '\'' +
                '}';
    }
}
