public abstract class Veiculo {

    // Uso de enum para evitar valores inválidos em especie e procedencia
    public enum Especie { CARGA, PASSAGEIRO }
    public enum Procedencia { NACIONAL, IMPORTADO }

    private Especie especie;

    // Informações comuns de todos os veículos
    private String placa;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;
    private String chassi;
    private String renavam;
    private Procedencia procedencia;

    // Dimensões e capacidade
    private double capacidadeMaxKg;
    private double altura;
    private double largura;
    private double profundidade;

    // Características do Veículo
    private String corExterna;
    private String corInterna;
    private String tipoCombustivel;
    private String motor;
    private double quilometragem;
    private double consumoMedio;
    private int numeroPortas;
    private int numeroPassageiros;
    private String opcionais;

    // Construtor
    public Veiculo(Especie especie, String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                   String chassi, String renavam, Procedencia procedencia, double capacidadeMaxKg, double altura,
                   double largura, double profundidade, String corExterna, String corInterna,
                   String tipoCombustivel, String motor, double quilometragem, double consumoMedio,
                   int numeroPortas, int numeroPassageiros, String opcionais) {
        this.especie = especie;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.capacidadeMaxKg = capacidadeMaxKg;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.corExterna = corExterna;
        this.corInterna = corInterna;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.numeroPortas = numeroPortas;
        this.numeroPassageiros = numeroPassageiros;
        this.opcionais = opcionais;
    }

    // Getters e Setters
    public Especie getEspecie() { return especie; }
    public void setEspecie(Especie especie) { this.especie = especie; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }

    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    public String getChassi() { return chassi; }
    public void setChassi(String chassi) { this.chassi = chassi; }

    public String getRenavam() { return renavam; }
    public void setRenavam(String renavam) { this.renavam = renavam; }

    public Procedencia getProcedencia() { return procedencia; }
    public void setProcedencia(Procedencia procedencia) { this.procedencia = procedencia; }

    public double getCapacidadeMaxKg() { return capacidadeMaxKg; }
    public void setCapacidadeMaxKg(double capacidadeMaxKg) { this.capacidadeMaxKg = capacidadeMaxKg; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getLargura() { return largura; }
    public void setLargura(double largura) { this.largura = largura; }

    public double getProfundidade() { return profundidade; }
    public void setProfundidade(double profundidade) { this.profundidade = profundidade; }

    public String getCorExterna() { return corExterna; }
    public void setCorExterna(String corExterna) { this.corExterna = corExterna; }

    public String getCorInterna() { return corInterna; }
    public void setCorInterna(String corInterna) { this.corInterna = corInterna; }

    public String getTipoCombustivel() { return tipoCombustivel; }
    public void setTipoCombustivel(String tipoCombustivel) { this.tipoCombustivel = tipoCombustivel; }

    public String getMotor() { return motor; }
    public void setMotor(String motor) { this.motor = motor; }

    public double getQuilometragem() { return quilometragem; }
    public void setQuilometragem(double quilometragem) { this.quilometragem = quilometragem; }

    public double getConsumeMedio() { return consumoMedio; }
    public void setConsumoMedio(double consumoMedio) { this.consumoMedio = consumoMedio; }

    public int getNumeroPortas() { return numeroPortas; }
    public void setNumeroPortas(int numeroPortas) { this.numeroPortas = numeroPortas; }

    public int getNumeroPassageiros() { return numeroPassageiros; }
    public void setNumeroPassageiros(int numeroPassageiros) { this.numeroPassageiros = numeroPassageiros; }

    public String getOpcionais() { return opcionais; }
    public void setOpcionais(String opcionais) { this.opcionais = opcionais; }

    // Método genérico — sobrescrito nas subclasses
    public void exibirDados() {
        System.out.println("Espécie: " + especie + " | Placa: " + placa + " | Modelo: " + modelo +
                " | Marca: " + marca + " | Ano: " + anoModelo + " | Procedência: " + procedencia);
    }
}

