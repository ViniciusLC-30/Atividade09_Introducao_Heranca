public class VeiculoPassageiro extends Veiculo {
  
   // Características específicas de veículos de passageiros
    private int numeroPassageiros;

    // Construtor
    public VeiculoPassageiro(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi, String renavam, String procedencia, double capacidadeMaxkg, double altura, double largura, double profundidade, String corExterna, String corInterna, String tipoCombustível, String motor, double quilometragem, double consumoMedio, int numeroPortas, int numeroPassageiros, String opcionais) {

        super("passageiro", placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam,procedencia, capacidadeMaxkg, altura, largura, profundidade, corExterna, corInterna, tipoCombustível, motor, quilometragem, consumoMedio, numeroPortas,
              numeroPassageiros, opcionais);
 
        this.numeroPassageiros = numeroPassageiros;
    }
}

