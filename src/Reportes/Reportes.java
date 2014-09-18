/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Carlos
 */
public class Reportes {
    public void ReporteClientes() throws  JRException, SQLException
    {
        Connection cn;
        //direccion url de la base de datos el cual la podremos ver a lo que hacemos la conexion "jdbc:sqlserver://localhost:1433;databaseName=Programacion"
        //acompañado de ""usuario", "contraseña"
        cn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Programacion", "sa","123");
        //Creamos un jasperreport en este caso llamado reporte 
        JasperReport reporte = null;
        //la cual vamos a cargar nuestro reporte creado con la ruta en donde se encuentra "C:\Users\Carlos\Documents\NetBeansProjects\Proyecto_Pizzeria\src\Reportes\\Cliente.jasper"
        reporte = (JasperReport) JRLoader.loadObjectFromFile("C:\\Users\\Carlos\\Documents\\NetBeansProjects\\Proyecto_Pizzeria\\src\\Reportes\\Cliente.jasper");
        //El JasperPrint nos va a imprimir nuestro reporte creado
        JasperPrint imp = JasperFillManager.fillReport(reporte, null,cn);
        //Con el JasperViewer nos permite visualizar nuestro reporte
        JasperViewer ver = new JasperViewer(imp);
        ver.setTitle("Cliente");
        ver.setVisible(true);
}
}
