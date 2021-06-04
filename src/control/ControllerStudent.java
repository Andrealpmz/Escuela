/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.administrator;
import modelo.student;
import modelo.teacher;

/**
 *
 * @author ANDREA PEREZ
 */
    public class ControllerStudent {
     public boolean insertEstudiante(student objs) { 
        boolean t=false;
        
//        String admin;
//        admin = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()).getIdAfk();
        String sql="insert into student(name1S, lastName1S,user,pass, age, gender, grade, weeklyStudyHours, socioeconomicStatus, idAfk)" 
                + " value('"+objs.getName1S()+"', '"+objs.getLastName1S()+"', '"+objs.getUser()+"', '"+objs.getPass()+"', '"+objs.getAge()+"', "
                + "'"+objs.getGender()+"', '"+objs.getGrade()+"', '"+objs.getWeeklyStudyHours()+"', '"+objs.getSocioeconomicStatus()+"', '"+objs.getIdAfk()+"');";
         System.out.println(sql);
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

//    public LinkedList<student> join() {
//       
//     LinkedList<student> lt=null;
//        
//      String sql= "SELECT * FROM  student INNER JOIN score t ON t.IdSfk = s.IdS WHERE t.score >= 2.5 AND t.score <= 4.5";
//        student objT=new student();
//        
//        lt=objT.joincon2(sql);
//        return lt;
//    
//    }
    public LinkedList<student> consultarEstudiante() {
        
                LinkedList<student> lc=null;
        
        String sql="select * from student;";
        student objc=new student();
        
        lc=objc.consultarStudent(sql);
        return lc;
    }
 public LinkedList<student> BuscarEstudianteRegistrado() {
        
        LinkedList<student> lc=null;
        
        String sql="SELECT idS, name1S, lastName1S, user, pass, age,gender,grade, weeklyStudyHours,socioeconomicStatus FROM student";
        student objc=new student();
        
        lc=objc.consultarStudent(sql);
        return lc;
 
        
//    public LinkedList<student> join() {
//
//        LinkedList<student> lt = null;
//
//        String sql = "SELECT * FROM  student INNER JOIN score t ON t.IdSfk = s.IdS WHERE t.score >= 2.5 AND t.score <= 4.5";
//        student objT = new student(idSC, idSfk);
//
//        lt = objT.joincon2(sql);
//        return lt;
//
//    }

}
    }
