public class DePassageiros extends Veiculo {

    // caracteristica
    private int numeroPassageiros = 0;
    private String corExterna = null;
    private String corInterna = null;
    private int numeroPortas = 0;

    public DePassageiros(String placa, String marca, String modelo, int anoModelo, int anoFabricacao,
                String chassi, int renavam, String procedencia, double altura, double largura, double profundidade,
                String corExterna, String corInterna, String tipoCombustivel, String motor, double quilometragem,
                double consumoMedio, int numeroPortas, String opcionais, int numeroPassageiros) {
        super(placa, marca, modelo, anoModelo, anoFabricacao, chassi, renavam, procedencia, tipoCombustivel, motor, quilometragem, consumoMedio, opcionais);
        this.numeroPassageiros = numeroPassageiros;
        this.corExterna = corExterna; 
        this.corInterna = corInterna; 
        this.numeroPortas = numeroPortas; 

    }

    public String toString() {
        String texto = super.toString();
        return "Veiculo de Passageiro:\n"
                + texto
                + "\n    Cor externa: " + this.getCorExterna()
                + "\n    Cor interna: " + this.getCorInterna()
                + "\n    Número de portas: " + this.getNumeroPortas()
                + "\n    Número de passageiros: " + this.getNumeroPassageiros()
                + "\n";
    }

    public String getCorExterna() {
        return corExterna;
    }

    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }
}
