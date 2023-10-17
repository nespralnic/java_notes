package com.nespralnic.repository;
import com.nespralnic.entity.Nota;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.nespralnic.connection.Conn;

public class NotasRepository {
    Statement statement = Conn.connect();

    public List<Nota> getNotas(){
            
            ResultSet result;
            List<Nota> notas = new ArrayList<>();
            try {
                result = statement.executeQuery("SELECT * FROM notas");
                
                while (result.next()){
                    Nota nota = new Nota();
                    nota.setTitle(result.getString("title"));
                    nota.setBody(result.getString("body"));
                    notas.add(nota);
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return notas;
    }
}
