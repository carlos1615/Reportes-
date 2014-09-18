/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestiones;
import ClasesPojo.Bebida;
import CapaDatos.Conexionbd;
import java.sql.SQLException;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Carlos
 */
public class GestionBebida implements IGestion {
     private Object[][] dtPersona;
     DefaultTableModel tablaBebida;
    String consulta;
    private Bebida bebida;
    
     public GestionBebida() {
        
        bebida=new Bebida(0,"","","",0.0,0);
        Conexionbd.setPersona("sa");
        Conexionbd.setClave("123");
        Conexionbd.setCadenaConexion("jdbc:sqlserver://localhost:1433;databaseName=Programacion");
    }

 /**
     * Get the value of usuario
     *
     * @return the value of usuario
     */
    public Bebida getBebida() {
        return bebida;
    }
   /**
     * Set the value of usuario
     *
     * @param cliente new value of usuario
     */
    public void setBebida(Bebida cliente) {
        this.bebida = bebida;
    }

    @Override
    public void Nuevo() {
    bebida.setCodigo(0);
        bebida.setNombre(null);
        bebida.setDetalle(null);
        bebida.setTamaño(null);
        bebida.setPrecio(0.0);
        bebida.setStock(0);
        
        
    }

    @Override
    public void Insertar() throws SQLException {
      try
        {
         Conexionbd.getInstancia().conectar();
         Conexionbd.getInstancia().ejecutar("insert into Bebida (codigo_bebida,nombre_bebida,detalle_bebida,tamaño_bebida,precio_bebida, stock_bebida) values ("+bebida.getCodigo()+",'"+bebida.getNombre()+"','"+bebida.getDetalle()+"','"+bebida.getTamaño()+"','"+bebida.getPrecio()+"','"+bebida.getStock()+"')");
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
        ResultSet rs = Conexionbd.getInstancia().ejecutarbusqueda("select Codigo_bebida,Nombre_bebida,detalle_bebida,tamaño_bebida,precio_bebida, stock_bebida FROM Bebida WHERE Codigo_bebida = "+bebida.getCodigo()+";");
           while(rs.next()){
               bebida.setCodigo(rs.getInt(1));
               bebida.setNombre(rs.getString(2));
               bebida.setDetalle(rs.getString(3));
               bebida.setTamaño(rs.getString(4));
               bebida.setPrecio(rs.getDouble(5));
               bebida.setStock(rs.getInt(6));
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
    public void Modificar() throws SQLException {
    try
        {
            Conexionbd.getInstancia().conectar();
            Conexionbd.getInstancia().ejecutar("update Bebida SET Nombre_bebida = '"+bebida.getNombre()+"', detalle_bebida = '"+bebida.getDetalle()+"', Tamaño_bebida = '"+bebida.getTamaño()+"',  precio_bebida = '"+bebida.getPrecio()+"', stock_bebida = '"+bebida.getStock()+"' WHERE codigo_bebida = "+bebida.getCodigo());
             
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
            Conexionbd.getInstancia().ejecutar("DELETE FROM Bebida WHERE Codigo_bebida = "+bebida.getCodigo());
               
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
    public void ConsultaTotal() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public DefaultTableModel cargarTabla() throws SQLException {
     
        String[] columnas = {"Codigo","Nombre", "Detalle", "Tamaño", "Precio","Stock" };
        String[] registro = new String[6];
        this.tablaBebida=new DefaultTableModel((Object[][])null,columnas);
        
        try
        {
             Conexionbd.getInstancia().conectar();
            
            ResultSet rs = Conexionbd.getInstancia().ejecutarbusquedatotal("select * from Bebida");
            while (rs.next()) {
                registro[0]=rs.getString(1);
                registro[1]=rs.getString(2);
                registro[2]=rs.getString(3);
                registro[3]=rs.getString(4);
                registro[4]=rs.getString(5);
                registro[5]=rs.getString(6);
                this.tablaBebida.addRow(registro);                
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }        
        return tablaBebida;
    }    

     

}
