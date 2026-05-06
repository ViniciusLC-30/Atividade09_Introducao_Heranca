public class VeiculoPassageiro extends Veiculo {
  
    // Construtor
    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi, String renavam, String procedencia, double capacidadeMaxkg, double altura, double largura, double profundidade, String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem, double consumoMedio, int numeroPortas, int numeroPassageiros, String opcionais) {

        super("passageiro", placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, capacidadeMaxkg, altura, largura, profundidade, corExterna, corInterna, tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas,
              numeroPassageiros, opcionais);
    }
}

