import javax.swing.*;

public class TestarExercicio {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3,7);
        triangulo.imprimeDados();
        JOptionPane.showMessageDialog(null, "Area: " + triangulo.calcularArea() );

        Data data = new Data(12,07,2008);
        data.imprimeData();
    }
}
