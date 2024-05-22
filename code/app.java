import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    static LinkedList<cls_pasientes> paciente = new LinkedList<cls_pasientes>();

  public static void main(String[] args) {
  fnt_menuPrincipal(true);
  }


  private static void fnt_pacientes () {
    String opcionPaciente = JOptionPane.showInputDialog(null,"\n\nMENU PACIENTE \n 1.REGISTRA \n2.CONSULTAR \n 3.SALIR");

    if (opcionPaciente.equals("1")) {
        boolean sw = false;
        String id= JOptionPane.showInputDialog(null, "ID:");
        for (int i = 0; i < paciente.size(); i++) {
            if (paciente.get(i).getIdStr().equals(id)) {
                sw = true;
                break; 
            }
          
        }
        if(sw==false) {
          String nombre = JOptionPane.showInputDialog(null, "NOMBRE:");
          int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "EDAD:"));
          String contacto = JOptionPane.showInputDialog(null, "CONTACTO:");
          String historia= JOptionPane.showInputDialog(null, "HISTORIA:");
          paciente.add(new cls_pasientes(nombre, id, edad, contacto, historia));
           JOptionPane.showMessageDialog(null, "Este paciente se encuentra Registrado con Exito");
           
        } else {
            JOptionPane.showMessageDialog(null, "Este paciente ya se encuentra Registrado");
        }
        
    }

     if (opcionPaciente.equals("2")) {
        boolean sw = false;
        int pos = 0;
        String id= JOptionPane.showInputDialog(null, "ID:");
        for (int i = 0; i < paciente.size(); i++) {
            if (paciente.get(i).getIdStr().equals(id)) {
                JOptionPane.showMessageDialog(null, paciente.get(i).toString());
                sw = true;
                pos = i;
                break;
            }
        }
        if(sw == true) {
            JOptionPane.showMessageDialog(null, 
            "NOMBRE:" + paciente.get(pos).getNombreStr() + "\n EDAD:" + paciente.get(pos).getEdadInt() +"\n CONTACRTO:"+ paciente.get(pos).getContactoStr()+ "\n HISTORIA:" + paciente.get(pos).getHistoriaStr());
        } else {
             JOptionPane.showMessageDialog(null,"El Pacientre no se encuentra Registrado");
        }
        
     }

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
