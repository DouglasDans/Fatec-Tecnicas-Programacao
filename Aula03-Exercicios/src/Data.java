import javax.swing.*;

public class Data {

    int dia, mes,ano;

    void Data(){
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void imprimeData(){
        JOptionPane.showMessageDialog(null, "Hoje é dia " + dia + "/" + mes + "/" + ano);
    }
}
