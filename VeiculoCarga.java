public class VeiculoCarga extends Veiculo {

    // Características específicas de veículos de carga
    private String tipoCarga; // Ex: perecível, não perecível, perigosa, etc.
    private boolean possuiRefrigeracao;

    // Construtor — capacidadeMaxKg já existe em Veiculo, removida duplicata capacidadeCargaKg
    public VeiculoCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                        String chassi, String renavam, Procedencia procedencia, double capacidadeMaxKg,
                        double altura, double largura, double profundidade, String corExterna,
                        String corInterna, String tipoCombustivel, String motor, double quilometragem,
                        double consumoMedio, int numeroPortas, int numeroPassageiros, String opcionais,
                        String tipoCarga, boolean possuiRefrigeracao) {
        super(Especie.CARGA, placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam,
              procedencia, capacidadeMaxKg, altura, largura, profundidade, corExterna, corInterna,
              tipoCombustivel, motor, quilometragem, consumoMedio, numeroPortas, numeroPassageiros, opcionais);
        this.tipoCarga = tipoCarga;
        this.possuiRefrigeracao = possuiRefrigeracao;
    }

    // Getters e Setters
    public String getTipoCarga() { return tipoCarga; }
    public void setTipoCarga(String tipoCarga) { this.tipoCarga = tipoCarga; }

    public boolean isPossuiRefrigeracao() { return possuiRefrigeracao; }
    public void setPossuiRefrigeracao(boolean possuiRefrigeracao) { this.possuiRefrigeracao = possuiRefrigeracao; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Tipo de Carga: " + tipoCarga + " | Refrigeração: " + possuiRefrigeracao +
                " | Cap. Máx. (kg): " + getCapacidadeMaxKg());
    }
}
