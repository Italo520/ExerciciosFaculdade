public class Nutricionista {

    public String avaliarIMC(Paciente p1) {
        float peso = p1.getPeso();
        float altura = p1.getAltura();
        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Baixo Peso";
        } else if (imc < 24.99) {
            return "Normal";
        } else if (imc < 29.99) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}