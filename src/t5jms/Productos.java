package t5jms;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio
 */
public class Productos {

    private String codigoProducto;
    private String nombre;
    private String cantidad;
    private String descripcion;
    private String lista;
    private String buscado;

    public Productos() {
    }

    public Productos(String codigoProducto, String nombre, String cantidad, String descripcion) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void altas() {
        File fichero = new File("C:\\Users\\Julio\\Desktop\\1DAM\\PGR\\Tarea 5\\Julio_Moro\\productos.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fichero, true);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeUTF(codigoProducto);
            dos.writeUTF(nombre);
            dos.writeUTF(cantidad);
            dos.writeUTF(descripcion);
            dos.close();

        } catch (Exception e) {
            System.out.println("Error en altas" + e.getMessage());
        }
    }

    /*  public String listado() {
        File fichero = new File("C:\\Users\\Julio\\Desktop\\1DAM\\PGR\\Tarea 5\\Julio_Moro\\productos.txt");
        
        try {
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);
            
            codigoProducto = dis.readUTF();
            while(codigoProducto!=null){
                nombre=dis.readUTF();
                cantidad = dis.readUTF();
                descripcion = dis.readUTF();
                codigoProducto = dis.readUTF();
                lista += codigoProducto+ " " + nombre+ " " +cantidad+ " " +descripcion;
                lista += "\n";
            }
            
            
        } catch (IOException e) {
            System.out.println("Error en listado " + e.getMessage());
        }
        return lista;*/
 /*  public String buscar(){
          String entrada = JOptionPane.showInputDialog("Introduzca nombre");
        
        
        try(DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Julio\\Desktop\\1DAM\\PGR\\Tarea 5\\Julio_Moro\\productos.txt"));){
            
            String nombre=null;
            String cantidad;
            String descripcion;
            String buscado;
            String codigo = dis.readUTF();
            while(codigo!=null){
                
                nombre = dis.readUTF();
                cantidad = dis.readUTF();
                descripcion = dis.readUTF();
            
                if(entrada.equals(nombre)){
                    buscado = codigo + " " + nombre + " " + cantidad + " " + descripcion;
                    System.out.println(codigo + " " + nombre + " " + cantidad + " " + descripcion);
                }
                codigo = dis.readUTF();
            }
        }catch(EOFException e){
            System.out.println("Fin de fichero");
        }catch(IOException e){
            System.out.println("Error lectura");
        }return buscado;
        
    }*/
}
