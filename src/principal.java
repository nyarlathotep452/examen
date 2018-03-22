import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Escribir un programa que pida un número que represente segundos,  inferior a un millón y calcule su equivalente desglosándolo
en días, horas, minutos y segundos. Ejemplo

43300 segundos

equivale a 0 días 12 horas 1 minuto 40 segundos*/


public class principal extends JFrame {

   public principal() {


        super("conversion de tiempo");

        Container contenedorPrincipal = this.getContentPane();

        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel titulo = new JLabel("introduzca la cantidad de segundos que desea convertir");
       restricciones.gridx = 0;
       restricciones.gridy = 0;
       restricciones.gridwidth = 1;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(titulo, restricciones);

       JLabel segundos = new JLabel("segundos:");
      restricciones.gridx = 0;
       restricciones.gridy = 1;
       restricciones.gridwidth = 1;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(segundos,restricciones);

       JTextArea area = new JTextArea("          ");
       restricciones.gridx = 1;
       restricciones.gridy = 1;
       restricciones.gridwidth = 2;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(area,restricciones);

       JButton convertir = new JButton("convertir");
       restricciones.gridx = 3;
       restricciones.gridy = 1;
       restricciones.gridwidth = 2;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(convertir,restricciones);


       convertir.addActionListener(new ActionListener(){
           public void actionPerformed (ActionEvent e){

              /* if (segundos.getText())
               {
                   if (segundos <1000){

                   }
               }*/

               JOptionPane.showMessageDialog(contenedorPrincipal, "aqui sale tu conversion");
           }
       });



   }


    public static void main(String[]args){
        principal ventana = new principal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);


    }

    /*class AccionBoton implements ActionListener{

        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {
            System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());




                if ( ((JButton) e.getSource()) == convertir) {

                    if ((edtUsuario.getText().contentEquals("admin"))
                            && edtClave.getText().contentEquals("1234")) {
                        System.out.println("Acceso concedido");


                    } else System.out.println("Acceso denegado");


                }



        }
    }*/
}
