package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraModel {

    private float a, b;
    private String op;
    private float resultado;

    public CalculadoraModel() {
        // Constructor vacío
    }

    public void setOperacion(float a, float b, String op) {
        this.a = a;
        this.b = b;
        this.op = op;
    }

    public void calcular() {
        switch (op) {
            case "+":
                resultado = a + b;
                break;
            case "-":
                resultado = a - b;
                break;
            case "X":
                resultado = a * b;
                break;
            case "/":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }
    }

    public void borrar() {
        a = 0;
        b = 0;
        op = "";
        resultado = 0;
    }

    public float getResultado() {
        return resultado;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
}
