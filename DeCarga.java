public class DeCarga extends Veiculo {

    // informacão
    private double capacidadeCargaKG = 0;
    private double altura = 0;
    private double largura = 0;
    private double profundidade = 0;

    public DeCarga(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                String chassi, int renavam, String procedencia, double altura, double largura, double profundidade,
                String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem,
                double consumoMedio, int numeroPortas, String opcionais, double capacidadeCargaKG) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, tipoCombustivel, motor, quilometragem, consumoMedio, opcionais);
        this.capacidadeCargaKG = capacidadeCargaKG;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;

    }

    public String toString() {
        String texto = super.toString();
        return "Veiculo de Carga:\n"
                + texto
                + "\n    Altura: " + this.getAltura()
                + "\n    Largura: " + this.getLargura()
                + "\n    Profundidade: " + this.getProfundidade()
                + "\n    Capacidade de Carga em KG: " + this.getCapacidadeCargaKG()
                + "\n";
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    public double getCapacidadeCargaKG() {
        return capacidadeCargaKG;
    }

    public void setCapacidadeCargaKG(double capacidadeCargaKG) {
        this.capacidadeCargaKG = capacidadeCargaKG;
    }
}
