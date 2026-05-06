public class VeiculoPassageiro extends Veiculo {

    // Atributo específico de veículos de passageiro
    private String tipoVeiculo; // Ex: sedan, SUV, hatch, pickup, etc.

    // Construtor
    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                             String chassi, String renavam, Procedencia procedencia, double capacidadeMaxKg,
                             double altura, double largura, double profundidade, String corExterna,
                             String corInterna, String tipoCombustivel, String motor, double quilometragem,
                             double consumoMedio, int numeroPortas, int numeroPassageiros, String opcionais,
                             String tipoVeiculo) {
        super(Especie.PASSAGEIRO, placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam,
              procedencia, capacidadeMaxKg, altura, largura, profundidade, corExterna, corInterna,
              tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas, numeroPassageiros, opcionais);
        this.tipoVeiculo = tipoVeiculo;
    }

    // Getter e Setter
    public String getTipoVeiculo() { return tipoVeiculo; }
    public void setTipoVeiculo(String tipoVeiculo) { this.tipoVeiculo = tipoVeiculo; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Veículo: " + tipoVeiculo + " | Passageiros: " + getNumeroPassageiros());
    }
}

