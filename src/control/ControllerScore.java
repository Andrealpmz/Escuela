/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.score;
import modelo.student;

/**
 *
 * @author ANDREA PEREZ
 */
public class ControllerScore {

    public boolean insertScore(score objs) {
        boolean t = false;
        String sql = "insert into score(score, idSfk, idTfk, topic )"
                + " value(" + objs.getScore() + ", " + objs.getIdSfk() + ", " + objs.getIdTfk() + ", '" + objs.getTopic() + "');";
        System.out.println(sql);

        BaseDatos objbd = new BaseDatos();
        t = objbd.ejecutarSQL(sql);
        return t;
    }
//
//    public LinkedList<student> join() {
//
//        LinkedList<student> lt = null;
//
//        String sql = "SELECT * FROM  student INNER JOIN score t ON t.IdSfk = s.IdS WHERE t.score >= 2.5 AND t.score <= 4.5";
//        score objT = new score(idSC, idSfk);
//
//        lt = objT.joincon2(sql);
//        return lt;
//
//    }
}

