
package clientes.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DataBase {
    private Connection conexao = null;
    private final String usuario = "root";
    private final String senha ="";
    private final String urlConexao ="jdbc:mysql://localhost:3306/movedb?sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false";
    public String Status= null;
       
public void conectarBanco() {
    String saida = "";
    try{
        conexao = DriverManager.getConnection(urlConexao,usuario,senha);
    }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null,ex.getMessage(), "Erro ao conectar no banco", JOptionPane.ERROR_MESSAGE);
        Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        
    }
    
}
public void desconectarBanco(){
    try{
        if(conexao!=null){
            conexao.close();
        }
        else{
            
        }
    }catch (SQLException ex){
        JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro ao desconectar", JOptionPane.ERROR_MESSAGE);
        
    }
  }   
public String Status() throws SQLException{
    String msg;
    if(conexao!=null){
        msg=" Banco de dados Online!";
        
    }
    else{
       msg= "Banco de dados Offline!";
    }
    return msg;
}

     
     


public Statement stm() throws SQLException{
     
    Statement stmt=conexao.createStatement();
    
    return stmt;
}   



    
    
    
    

}



