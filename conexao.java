package logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;





public class conexao {
    public String bd = "b.reserva";
    public String url = "jdbc:mysql://127.0.0.1/" + bd;
    public String user = "root";
    public String pass = "";


public conexao(){
    
}

public Connection conectar(){
    Connection link = null;
    try {
        Class.forName("org.gjt.mm.mysql.Driver");
        link = DriverManager.getConnection(this.url, this.user, this.user);
    }
    catch (ClassNotFoundException | SQLException e){
        JOptionPane.showConfirmDialog(null, e);
    }
    return link;
}
}
