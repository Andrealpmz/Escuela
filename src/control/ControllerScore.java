/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.BaseDatos;
import modelo.score;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerScore {
        public boolean insertScore(score objs) {
        boolean t = false;
        String sql = "insert into score(score, idSfk, idTfk, topic )"
                + " value(" + objs.getScore()+ ", " + objs.getIdSfk() + ", " + objs.getIdTfk()+ ", '" + objs.getTopic()+ "');";
        System.out.println(sql);

        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }
    
}
