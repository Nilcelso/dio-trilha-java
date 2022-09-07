public class TiposVariaveis{
    public static void main(String[] args) throws Exception {
        //tipos primitivos 
        //String que representa tezto 

        String meuNome = "Nilcelso Sobrinho";

        double salarioMinimo = 2500; // geralmente em moeda se usa double

        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // neste caso ele ate aceita a variavel numeroCurto 
        short numeroCurto2 = numeroNormal; // neste caso apresenta um erro pois ele chama um int q a qlq momento pode ser alterado e o short n comportar 

        short numeroCurto3 = (short) numeroNormal; // nesse casoo fazemos a modigicação do numeto 

        
    }
}
