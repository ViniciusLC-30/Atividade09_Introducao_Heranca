public class VeiculoCarga extends Veiculo {

    // Características específicas de veículos de carga
    private double capacidadeCargaKg;
    private String tipoCarga; // Ex: perecível, não perecível, perigosa, etc.
    private boolean possuiRefrigeracao;

    // Construtor
    public VeiculoCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                        String chassi, String renavam, String procedencia, double capacidadeMaxkg, double altura,
                        double largura, double profundidade, String corExterna, String corInterna,
                        String tipoCombustível, String motor, double quilometragem, double consumoMedio,
                        int numeroPortas, int numeroPassageiros, String opcionais,
                        double capacidadeCargaKg, String tipoCarga, boolean possuiRefrigeracao) {
        super("carga", placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam,procedencia, capacidadeMaxkg, altura, largura, profundidade, corExterna, corInterna, tipoCombustível, motor, quilometragem, consumoMedio, numeroPortas,
              numeroPassageiros, opcionais);
        this.capacidadeCargaKg = capacidadeCargaKg;
        this.tipoCarga = tipoCarga;
        this.possuiRefrigeracao = possuiRefrigeracao;
    }

    // Getters e Setters
    public double getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    public void setCapacidadeCargaKg(double capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public boolean isPossuiRefrigeracao() {
        return possuiRefrigeracao;
    }

    public void setPossuiRefrigeracao(boolean possuiRefrigeracao) {
        this.possuiRefrigeracao = possuiRefrigeracao;
    }
    
}
