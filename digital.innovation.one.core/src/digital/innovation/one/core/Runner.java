package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;
//nao funciona mois tera de ser chamado no module-info;
//import java.sql.*;


public class Runner {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sub(3,1));
    }
}
