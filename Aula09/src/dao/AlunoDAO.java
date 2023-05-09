package dao;

import classes.*;
import java.sql.*;
import java.util.ArrayList;

public class AlunoDAO {

    public String insertAluno (Aluno aluno) {
        String resp = "";
        try {
            Connection con = Conecta.getConexao();
            String sql = "INSERT INTO dados (rgm, nome, nota1, nota2) VALUES (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, aluno.getRgm());
            ps.setString(2, aluno.getNome());
            ps.setFloat(3, aluno.getNota1());
            ps.setFloat(4, aluno.getNota2());
            ps.execute();
            ps.close();
            con.close();
            resp = "OK";
        }catch (Exception e){
            resp = "Erro: " + e.toString();
        }
        return resp;
    }

    public ArrayList<Aluno> getAlunos(){
        ArrayList<Aluno> lista = new ArrayList<Aluno>();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM dados ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Aluno aluno= new Aluno();
                aluno.setRgm(rs.getString("rdm"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));

                lista.add(aluno);
            }
            rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    public Aluno consultarAluno (String rgm){
        Aluno aluno = new Aluno();
        try {
            Connection con = Conecta.getConexao();
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM dados WHERE rgm = '"+rgm+"'";
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()){
                aluno.setRgm(rs.getString("rgm"));
                aluno.setNome(rs.getString("nome"));
                aluno.setNota1(rs.getFloat("nota1"));
                aluno.setNota2(rs.getFloat("nota2"));
            }else {
                aluno.setRgm("");
                aluno.setNome("");
                aluno.setNota1(0);
                aluno.setNota2(0);
            }
            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return aluno;
    }
}

