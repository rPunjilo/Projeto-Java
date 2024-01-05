package br.com.infox.dal;

import java.sql.*;

public class ModuloConexao {

    //Método responsávelpor establelecer a conexão com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://127.0.0.1:3306/dbinfox";
        String user = "root";
        String password = "kiryuYakuza0.";
        //Estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            //Sintaxe para linkar o banco de dados
            //Se der tudo certo, obtenha e armazena a conexão na variavel
        } catch (Exception e) {
            //A linha abaixo especifica o erro
            //System.out.println(e);
            return null;
            //caso aconteça algum erro
        }
    }
}
