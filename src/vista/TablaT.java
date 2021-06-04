/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControllerStudent;
import control.ControllerTeacher;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.teacher;
import java.util.LinkedList;
import modelo.student;

/**
 *
 * @author USER
 */
class TablaT {

    ControllerTeacher bus = null;
    ControllerStudent bus2 = null;
    ControllerTeacher bus3 = null;
        ControllerStudent bus6 = null;

    public void visualizar_ProductoVO(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("idT");
        dt.addColumn("nombre");
        dt.addColumn("correo");
        dt.addColumn("contraseña");
        
        bus= new ControllerTeacher();
        teacher te = new teacher();
        LinkedList <teacher> list = bus.buscarTeacher();
         if(list.size() > 0){
         for(int i=0; i<list.size(); i++)
         {
         Object fila[] = new Object[5];
          te = list.get(i);
          fila[0] = te.getIdT();
                fila[1] = te.getNameT1();
                fila[2] = te.getLastNameT1();
                fila[3] = te.getEmail();
         dt.addRow(fila);
         
         }
         tabla.setModel(dt);
            tabla.setRowHeight(60);
         
         
         }
    }
     public void visualizar_ProductoVO2(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("idS");
        dt.addColumn("nombre");
        dt.addColumn("Apellido");
        dt.addColumn("Usuario");
        
        bus2= new ControllerStudent();
         student st = new student();
        LinkedList <student> list = bus2.consultarEstudiante();
         if(list.size() > 0){
         for(int i=0; i<list.size(); i++)
         {
         Object fila[] = new Object[5];
          st = list.get(i);
          fila[0] = st.getIdS();
                fila[1] = st.getName1S();
                fila[2] = st.getLastName1S();
                fila[3] = st.getUser();
         dt.addRow(fila);
         
         }
         tabla.setModel(dt);
            tabla.setRowHeight(60);
         
         
         }
    }
     public void visualizar_ProductoVO3(JTable tabla) {

        tabla.setDefaultRenderer(Object.class, new Render());
        DefaultTableModel dt = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dt.addColumn("idT");
        dt.addColumn("idSufk");
       
        
        bus3= new ControllerTeacher();
         teacher te = new teacher();
        LinkedList <teacher> list = bus3.join();
         if(list.size() > 0){
         for(int i=0; i<list.size(); i++)
         {
         Object fila[] = new Object[5];
          te = list.get(i);
          fila[0] = te.getIdT();
                fila[1] = te.getIdSufk();
         dt.addRow(fila);
         
         }
         tabla.setModel(dt);
            tabla.setRowHeight(60);
         
         
         }
     }
         
//         public void visualizar_ProductoVO6(JTable tabla) {
//
//        tabla.setDefaultRenderer(Object.class, new Render());
//        DefaultTableModel dt = new DefaultTableModel() {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//        dt.addColumn("idS");
//        dt.addColumn("name1S");
//        dt.addColumn("lastName1S");
//        dt.addColumn("score");
//       
//        
//        bus6= new ControllerStudent();
//         student te = new student();
//        LinkedList <student> list = bus6.join();
//         if(list.size() > 0){
//         for(int i=0; i<list.size(); i++)
//         {
//         Object fila[] = new Object[5];
//          te = list.get(i);
//          fila[0] = te.getIdS();
//                fila[1] = te.getIdS();
//         dt.addRow(fila);
//         
//         }
//         tabla.setModel(dt);
//            tabla.setRowHeight(60);
//         
//         
//         }
//    }
}
