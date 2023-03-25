package ExercicioImpostos;
public class Consumo {
    double consumo;

    public Consumo(double consumo) {
        this.consumo = consumo;
    }

    void updateConsumo(double consumo){
        this.consumo = consumo;
    }

    double fornecimento(){
        return consumo * 0.28172;
    }

    double icms(double fornecimento){
        if (consumo <= 200) {
            return  fornecimento * 0.136363;
        } else {
            return fornecimento * 0.333333;
        }
    }

    double cofins(double fornecimento){
        if (consumo <= 200){
            return fornecimento * 0.0614722;
        }else {
            return fornecimento * 0.0730751;
        }
    }

    double pispasep(double fornecimento){
        if (consumo <= 200){
            return fornecimento * 0.013346;
        }else {
            return fornecimento * 0.0158651;
        }
    }

    double icmscofins(double fornecimento){
        if (consumo <= 200){
            return fornecimento * (0.136363 * 0.0614722);
        }else {
            return fornecimento * (0.333333 * 0.0730751);
        }
    }

    double icmspispasep(double fornecimento){
        if (consumo <= 200){
            return fornecimento * (0.136363 * 0.013346);
        }else {
            return fornecimento * (0.333333 * 0.0158651);
        }    }

    double calcularConsumo(){
        double fornecimento = fornecimento();
        return fornecimento + icms(fornecimento) + cofins(fornecimento) + pispasep(fornecimento) + icmscofins(fornecimento) + icmspispasep(fornecimento);
    }
}
