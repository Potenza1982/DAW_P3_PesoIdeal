package es.studium.ServletArray;

public class Modelo {
    // Constructor
    public Modelo() {
    }

    // Método para calcular el IMC
    public double calcularIMC(double peso, double altura) {
        // Calcular el IMC (Índice de Masa Corporal)
        double imc = peso / (altura * altura);

        return imc; // Devuelve el resultado del cálculo del IMC
    }

    // Método para interpretar el resultado del IMC
    public String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Usted tiene un peso muy bajo.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Usted tiene un peso normal.";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Usted tiene sobrepeso, deberías replantearte hacer dieta y deporte.";
        } else {
            return "Usted tiene obesidad, por lo que le recomendamos ponerse en manos de profesionales lo antes posible.";
        }
    }
}
