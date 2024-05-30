import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app {
    static LinkedList<cls_pacientes> paciente = new LinkedList<>(); // creacion de las listas del paciente
    static LinkedList <cls_citas>  citas = new LinkedList<>(); //listas de almacenamiento de citas medicas

  public static void main(String[] args) {
  fnt_menuPrincipal(true);
  }


  private static void fnt_pacientes (boolean mp) {
    
    while (mp == true) {
        String opcionPaciente = JOptionPane.showInputDialog(null,"\n\nMENU DE PACIENTES\n1.REGISTRAR\n2.CONSULTAR\n3.SALIR");
        if (opcionPaciente.equals("3")) {
            mp = false;
          
        }
        
        if (opcionPaciente.equals("1"))  // Opcion de registro
        {
            boolean sw = false;
            String id= JOptionPane.showInputDialog(null, "ID:");
            for (int i = 0; i < paciente.size(); i++) {
                if (paciente.get(i).getIdStr().equals(id)) {
                    sw = true;
                    break; 
                }
              
            }
            if(sw == false) {
              String nombre = JOptionPane.showInputDialog(null, "NOMBRE:");
              int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "EDAD:"));
              String contacto = JOptionPane.showInputDialog(null, "CONTACTO:");
              String historia = JOptionPane.showInputDialog(null, "HISTORIA:");
              paciente.add(new cls_pacientes(nombre, id, edad, contacto, historia));
               JOptionPane.showMessageDialog(null, "Este paciente se ha Registrado con Exito");
               
            } else {
                JOptionPane.showMessageDialog(null, "Este paciente, ya se encuentra Registrado");
            }
            
        }
    
         if (opcionPaciente.equals("2")) // Opcion de consultar
         {
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
            if(sw == false) {
                JOptionPane.showMessageDialog(null, 
                "NOMBRE:" + paciente.get(pos).getNombreStr() + "\n EDAD:" + paciente.get(pos).getEdadInt() +"\n CONTACTO:"+ paciente.get(pos).getContactoStr()+ "\n HISTORIA:" + paciente.get(pos).getHistoriaStr());
            } else {
                 JOptionPane.showMessageDialog(null,"El Pacientre no se encuentra Registrado");
            }
        }       
    }
 
   }

  private  static void fnt_citas_pacientes() {
    boolean sw = false;
    String id = JOptionPane.showInputDialog(null, "ID:");
    for(int i =0 ; i < paciente.size(); i++){
        if (paciente.get(i).getIdStr().equals(id)) {
            sw = true;
            break;            
        }
    }

    if(sw == false) {
        JOptionPane.showMessageDialog(null, "Estos paciente no se encuentra registrado");
    }  else {
        String fecha = JOptionPane.showInputDialog(null, "FECHA:");
        String hora  = JOptionPane.showInputDialog(null, "HORA:");
        String detalle  = JOptionPane.showInputDialog(null, "DETALLE:");
    
        citas.add(new cls_citas(id, fecha, hora, detalle));
        JOptionPane.showMessageDialog(null, "Citas registradas con exito!");
  }
 }

private static void fnt_reporte (String id) {
    boolean swm = false;
    int pos = 0;
    for(int i = 0 ; i < paciente.size(); i++) {
        if (paciente.get(i).getIdStr().equals(id)) {
            swm = true;
            pos = i;
            break;
        }

    }
    if ( swm == false) {
        String pac = "Nombre del Paciente:" + paciente.get(pos).getNombreStr() + "\nContactatos:"+ paciente.get(pos).getContactoStr()+ "\n";
        swm = false;
    }
    for(int i =0 ; i < citas.size(); i++){
        
        if(swm == true) {
            JOptionPane.showMessageDialog(null, 
            "FECHA:" + citas.get(i).getFechaStr() + "\n HORA:" + citas.get(i).getHoraStr() +
            "\n DETALLES:"+ citas.get(i).getDetalleStr());
        }    
    }
    if ( swm == false) {
        JOptionPane.showMessageDialog(null, "Estos paciente no se encuentra registrado");
    } else {
        JOptionPane.showMessageDialog(null, "Estos paciente no se encuentra registrado");
    }
}

  private static void fnt_menuPrincipal (boolean m){
    while (m== true) {
        String opcionesStr = JOptionPane.showInputDialog(null,
        "MENU PRINCIPAL \n \n 1.NUEVO PACIENTE \n 2.NUEVA CITA \n 3.REPORTE \n 4.SALIR");
        if(opcionesStr.equals("1")) {
              fnt_pacientes(true);
        }

        if(opcionesStr.equals("2")){
            fnt_citas_pacientes();
        }

        if (opcionesStr.equals("3")) {
            fnt_reporte(
                JOptionPane.showInputDialog(null, "ID:"));
        }
        if(opcionesStr.equals("4")){
            m = false;
        }
    }

  }

}
