import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Escribir un programa que pida un número que represente segundos,  inferior a un millón y calcule su equivalente desglosándolo
en días, horas, minutos y segundos. Ejemplo

43300 segundos

equivale a 0 días 12 horas 1 minuto 40 segundos*/


public class principal extends JFrame {

   AccionBoton botonAct = new AccionBoton();

   private JLabel titulo;
   private JLabel segundos;
   private JTextArea area;
   private JButton convertir;
   private Container contenedorPrincipal;

    public principal() {


        super("conversion de tiempo");

        contenedorPrincipal = this.getContentPane();

        contenedorPrincipal.setLayout(new GridBagLayout());
        contenedorPrincipal.setBackground(Color.LIGHT_GRAY);
        GridBagConstraints restricciones = new GridBagConstraints();
        titulo = new JLabel("introduzca la cantidad de segundos que desea convertir");
       restricciones.gridx = 0;
       restricciones.gridy = 0;
       restricciones.gridwidth = 1;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(titulo, restricciones);

       segundos = new JLabel("segundos:");
      restricciones.gridx = 0;
       restricciones.gridy = 1;
       restricciones.gridwidth = 1;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(segundos,restricciones);

       area = new JTextArea("");
       restricciones.gridx = 1;
       restricciones.gridy = 1;
       restricciones.gridwidth = 2;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(area,restricciones);

       convertir = new JButton("convertir");
       restricciones.gridx = 3;
       restricciones.gridy = 1;
       restricciones.gridwidth = 2;
       restricciones.gridheight = 1;
       restricciones.weighty = 1;
       restricciones.weightx=1;
       restricciones.fill = GridBagConstraints.NONE;
       restricciones.anchor = GridBagConstraints.NORTHWEST;
       contenedorPrincipal.add(convertir,restricciones);


       convertir.addActionListener(this.botonAct);



   }


    public static void main(String[]args){
        principal ventana = new principal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);


    }

    class AccionBoton implements ActionListener{

        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {


                if ( ((JButton) e.getSource()) == convertir) {
                    int valorSegundos = Integer.parseInt(area.getText());

                    if (valorSegundos<=1000000)
                    {
                       int dia= valorSegundos/60/60/24;
                       valorSegundos= valorSegundos-(dia*60*60*24);

                       int hora= valorSegundos/60/60;
                       valorSegundos=valorSegundos-(hora*60*60);

                       int minuto= valorSegundos/60;
                       valorSegundos=valorSegundos-(minuto*60);

                       JOptionPane.showMessageDialog(contenedorPrincipal,"son: dias:"+dia+" horas:"+hora+" minutos:"+minuto+" segundos:"+valorSegundos);

                    }

                    else
                        JOptionPane.showMessageDialog(contenedorPrincipal,"el valor maximo es 1000000, vuelve a intentar");


                }

        }
    }
}
