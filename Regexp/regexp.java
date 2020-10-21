
import javax.swing.JOptionPane;

public class regexp {

    public static void main(String[] args) {

        String d[] = new String[10];

        boolean i = false;

        do {

            d[0] = JOptionPane.showInputDialog("Ingrese su codigo postal");
            if (d[0].matches("[0-9]{5,5}")) {

                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Tienen que ser solo 5 numeros");
                i = false;

            }

        } while (i == false);
        do {
            d[1] = JOptionPane.showInputDialog("Ingresa tu numero fijo que empiece con 55");
            if (d[1].matches("[55]+[0-9]{8,8}")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Tienen que ser exactamente 10 numeros y que empiece con 55");
                i = false;
            }
        } while (i == false);

        do {
            d[2] = JOptionPane.showInputDialog("Ingresa tu numero celular que empiece con 55");
            if (d[2].matches("[55]+[0-9]{8,8}")) {
                i = true;
                d[2] = "+52" + d[2];

            } else {
                JOptionPane.showMessageDialog(null, "Tienen que ser exactamente 10 numeros y que empiece con 55");
                i = false;
            }

        } while (i == false);

        do {
            d[3] = JOptionPane.showInputDialog("Ingresa tu direccion (Calle #, colonia, municipio, estado)");
            if (d[3].matches("[A-Za-z]+ +[#]+[0-9]+[,] +[A-Za-z]+[,] +[A-Za-z]+[,] +[A-Za-z]*")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Estructura de direccion incorrecta (Calle #, colonia, municipio, estado)");
                i = false;
            }

        } while (i == false);

        do {
            d[4] = JOptionPane.showInputDialog(
                    "Ingresa tu nombre completo(iniciales con mayusculas Nombre,Appellido Paterno, Apellido Materno)");
            if (d[4].matches("^[A-Z].[a-z]* +[A-Z].[a-z]* +[A-Z].[a-z]*")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Las iniciales de tu nombre deben de ser mayusculas y respetar la estructura(Nombre Appellido Paterno Apellido Materno)");
                i = false;
            }
        } while (i == false);
        do {
            d[5] = JOptionPane.showInputDialog("Ingresa tu correo institucional (lno.Control@milpaalta2.tecnm.mx)");
            if (d[5].matches("^l[0-9]{9,9}@milpaalta2.tecnm.mx")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Estructura incorrecta  (lno.Control@milpaalta2.tecnm.mx)");
                i = false;
            }

        } while (i == false);

        do {
            d[6] = JOptionPane.showInputDialog("Ingresa tu correo externo (nombredelcorreo@extensiondetucorreo.com)");
            if (d[6].matches("^[\\w]*@[a-z]*.com")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Estructura incorrecta  (nombredelcorreo@extensiondetucorreo.com)");
                i = false;
            }
        } while (i == false);

        do {
            d[7] = JOptionPane.showInputDialog("Ingresa la fecha con la siguiente estructura(YYYY/mm/dd)");
            if (d[7].matches("[0-9]{4,4}+[/]+(0?[1-9]|1[0-2])+[/]+(0?[1-9]|1[0-9]|2[0-9]|3[0-1])")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Estructura incorrecta  (YYYY/mm/dd)");
                i = false;
            }
        } while (i == false);

        do {
            d[8] = JOptionPane.showInputDialog("Ingresa tu Nodecontrol ");
            if (d[8].matches("[0-9]{9,9}")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "No de control incorrecto");
                i = false;
            }

        } while (i == false);

        do {
            d[9] = JOptionPane.showInputDialog("Ingresa tu edad");
            if (d[9].matches("^1[7-9]|[2-6][0-9]")) {
                i = true;
            } else {
                JOptionPane.showMessageDialog(null, "Tu edad solo debe contener numeros");
                i = false;
            }

        } while (i == false);

        JOptionPane.showMessageDialog(null,
                "C.P: " + d[0] + "\n" + "Telefono Fijo: " + d[1] + "\n" + "Telefono Celular: " + d[2] + "\n"
                        + "Direccion: " + d[3] + "\n" + "Nombre: " + d[4] + "\n" + "Correo Institucional: " + d[5]
                        + "\n" + "Correo Externo: " + d[6] + "\n" + "Fecha: " + d[7] + "\n" + "No. Control: " + d[8]
                        + "\n" + "Edad: " + d[9]);

    }
}