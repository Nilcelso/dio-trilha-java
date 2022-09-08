public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status --> TV ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status2 --> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("canal mudado para: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("canal aumentado: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("canal diminuido: " + smartTv.canal);
               
    }
}
