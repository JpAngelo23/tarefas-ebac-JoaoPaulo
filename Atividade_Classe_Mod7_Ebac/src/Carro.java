public class Carro {
    private String nome;
    private String marca;
    private int ano;
    private double velocidade = 0;


    //Método Construtor
    public Carro(String nome, String marca, int ano) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
    }

    //Métodos da Classe (aceleração e frenagem):
    public void acelera(double aceleracao){
        this.velocidade += aceleracao;
        System.out.println("...Acelerando  uma velocidade média de " + aceleracao + "km/h.");
    }

    public void freia(double frenagem){
        this.velocidade -= frenagem;
        System.out.println("...Freiando  uma velocidade média de " + frenagem + "km/h.");
    }

    //Método que retorna a ficha técnica com as informações do carro:
    public void ficha(){
        System.out.println("Imprimindo a Ficha Técnica com as informações do Carro Solicitado: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Atual do " + this.nome + " está em: " + this.velocidade);
    }


    //Métodos Getters da Classe Carro (Retornam as informações dos atributos da classe):

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    //Métodos Setters da classe Carro (Modificam os atributos da classe carro - exceto velocidade que deve ser modificada exclusivamente por aceleração e frenagem (métodos)):


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}//Fim