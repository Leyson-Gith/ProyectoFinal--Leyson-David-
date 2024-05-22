import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    static LinkedList<cls_pasientes> paciente = new LinkedList<cls_pasientes>();

  public static void main(String[] args) {
  fnt_menuPrincipal(true);
  }


  private static void fnt_pacientes () {
    String nombre= JOptionPane.showInputDialog(null, "NOMBRE:");
    String id= JOptionPane.showInputDialog(null, "ID:");
    int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "EDAD:"));
    String contacto = JOptionPane.showInputDialog(null, "CONTACTO:");
    String historia= JOptionPane.showInputDialog(null, "HISTORIA:");
    paciente.add(new cls_pasientes(nombre, id, edad, contacto, historia));
  }
  private static void fnt_menuPrincipal (boolean m){
    while (m== true) {
        String opcionStr = JOptionPane.showInputDialog(null,"MENUPRINCIPAL \n \n 1.NUEVO PACIENTE \n 2.NUEVA CITA \n 3.REPORTE \n 4. Salir");
        if(opcionStr.equals("1")) {
              fnt_pacientes();
        }
    }

  }

}
