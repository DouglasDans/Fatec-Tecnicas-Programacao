import javax.swing.JOptionPane;

public class Triangulo {
    float base, altura;

    void Triangulo(){
    }

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    float calcularArea(){
        return (base * altura) / 2;
    }
    void imprimeDados(){
        JOptionPane.showMessageDialog(null,
                "Base: " + base + "\nAltura: " + altura);
    }
}
