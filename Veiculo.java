public abstract class Veiculo{

    protected String especie; // carga ou passageiro

    // Informações comuns de todos os veículos
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anoModelo;
    protected int anoFabricacao;
    protected String chassi;
    protected String renavam;
    protected String procedencia; // nacional ou importado
    
   // Dimensões e capacidade
    protected double capacidadeMaxkg;
    protected double altura;
    protected double largura;
    protected double profundidade;

    // Caracteristicas do Veículo
    protected String corExterna;
    protected String corInterna;
    protected String tipoCombustível;
    protected String motor;
    protected double quilometragem;
    protected double consumoMedio;
    protected int numeroPortas;
    protected int numeroPassageiros;
    protected String opcionais;

    //Construtor
    public Veiculo(String especie, String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                    String chassi, String renavam, String procedencia, double capacidadeMaxkg, double altura,
                    double largura, double profundidade, String corExterna, String corInterna, String tipoCombustível,
                    String motor, double quilometragem, double consumoMedio, int numeroPortas,
                    int numeroPassageiros, String opcionais) {
        this.especie = especie;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeMaxkg = capacidadeMaxkg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.tipoCombustível = tipoCombustível;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.numeroPortas = numeroPortas;
        this.numeroPassageiros = numeroPassageiros;
        this.opcionais = opcionais;
    }
}

