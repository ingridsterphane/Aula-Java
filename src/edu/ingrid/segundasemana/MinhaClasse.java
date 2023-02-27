package edu.ingrid.segundasemana;
public class MinhaClasse {

    public static void main(String [] args) {
        String primeiroNome = "Ingrid";
        String segundoNome = "Sterphane";

        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);

        System.out.println (nomeCompleto);
       
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat("").concat(segundoNome);
    }
}
