/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;

import CapaDatos.Conexionbd;
import CapaInterfaz.InterfazEmpleado;
import ClasesPojo.Empleados;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROFESORES
 */
public class GestionEmpleado implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaPersona;
    String consulta;
    
        private Empleados empleados;

    public GestionEmpleado() {
        
        empleados=new Empleados(0,"","","",0,"","");
        Conexionbd.setPersona("sa");
        Conexionbd.setClave("123");
        Conexionbd.setCadenaConexion("jdbc:sqlserver://localhost:1433;databaseName=Programacion");
    }
        
        

    /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Empleados getEmpleados() {
        return empleados;
    }

    /**
     * Set the value of usuario
     *
     * @param empleados new value of usuario
     */
    public void setPersona(Empleados empleados) {
        this.empleados = empleados;
    }

    @Override
    public void Nuevo() {
        empleados.setCodigo(0);
        empleados.setNombre(null);
        empleados.setApellido(null);
        empleados.setSexo(null);
        empleados.setEdad(0);
        empleados.setCedula(null);
        empleados.setTelefono(null);
        
        
    }

    @Override
    public void Insertar() throws SQLException {
        
        try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Empleado (codigo_empleado,nombre_empleado,apellido_empleado,sexo_empleado, edad_empleado, cedula_empleado, telefono_empleado) values ("+empleados.getCodigo()+",'"+empleados.getNombre()+"','"+empleados.getApellido()+"','"+empleados.getSexo()+"','"+empleados.getEdad()+"','"+empleados.getCedula()+"','"+empleados.getTelefono()+"')");
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
        
    }

    @Override
    public void Consultar() throws SQLException {
        try
        {
         Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT * FROM Empleado WHERE Codigo_empleado = '"+empleados.getCodigo()+"';");
           while(rs.next()){
               empleados.setCodigo(rs.getInt(1));
               empleados.setNombre(rs.getString(2));
               empleados.setApellido(rs.getString(3));
               empleados.setSexo(rs.getString(4));
               empleados.setEdad(rs.getInt(5));
               empleados.setCedula(rs.getString(6));
               empleados.setTelefono(rs.getString(7));
               
              
        }
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    @Override
    public void ConsultaTotal()throws SQLException{

}
    
     
    @Override
    public void Modificar() throws SQLException {        
        try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("UPDATE Empleado SET Nombre_empleado = '"+empleados.getNombre()+"', Apellido_empleado = '"+empleados.getApellido()+"', Sexo_empleado = '"+empleados.getSexo()+"', Edad_empleado = '"+empleados.getEdad()+"', Cedula_empleado = '"+empleados.getCedula()+"', Telefono_empleado = '"+empleados.getTelefono()+"' WHERE codigo_empleado = "+empleados.getCodigo());
             
        }
       catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }

    @Override
    public void Eliminar() throws SQLException {
         try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("DELETE FROM Empleado WHERE Codigo_empleado = "+empleados.getCodigo());
               
        }
        catch(SQLException ex)
        {
            throw ex;
        }
        finally 
        {
            Conexionbd.getInstancia().desconectar();
        }
    }
    
     @Override
     public DefaultTableModel cargarTabla()throws SQLException{;
     {
        String[] columnas = {"Codigo","Nombre", "Apellido", "Cedula","Edad","Telefono","Celular" };
        String[] registro = new String[9];
        this.tablaPersona=new DefaultTableModel((Object[][])null,columnas);
       
        try
        {
             Conexionbd.getInstancia().conectar();
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("SELECT Codigo_empleado,Nombre_empleado,Apellido_empleado,Sexo_empleado, Edad_empleado, Cedula_empleado, Telefono_empleado FROM Empleado ");
               while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                registro[6]=rs.getString(7);
                this.tablaPersona.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaPersona;
    }
}
}
    

