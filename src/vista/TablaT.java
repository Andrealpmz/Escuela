/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControllerTeacher;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.teacher;
import java.util.LinkedList;

/**
 *
 * @author USER
 */
class TablaT {

    ControllerTeacher bus = null;

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
}
