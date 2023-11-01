public class Main {
    public static void main(String[] args) {

        //Instanciando um objeto: carro1
        Carro carro1 = new Carro("Uno", "FIAT", 2018);

        //Instanciando um objeto: carro2
        Carro carro2 = new Carro("Gol", "VW", 2020);

        //Imprimindo a ficha técnica e verificando se foi instanciado:
        carro1.ficha();

        carro1.acelera(50.30);
        carro1.getVelocidade();
        carro1.freia(20);
        carro1.getVelocidade();

        carro2.acelera(70.5);
        carro2.getVelocidade();
        carro2.freia(15);

        carro1.ficha();
        carro2.ficha();

    }
}
