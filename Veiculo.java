
public class Veiculo {

    // informacões do Veiculo
    private String placa = null;
    private String marca = null;
    private String modelo = null;
    private int anoModelo = 0;
    private int anoFabricacao = 0;
    private String chassi = null;
    private int renavam = 0;
    private String procedencia = null;

    // caracteristicas do Veiculo
    private String tipoCombustivel = null;
    private String motor = null;
    private double quilometragem = 0;
    private double consumoMedio = 0;
    private String opcionais = null;

    public Veiculo(String placa, String marca, String modelo, int anoModelo, int anoFabricacao, String chassi,
            int renavam, String procedencia,
            String tipoCombustivel, String motor, double quilometragem, double consumoMedio,
            String opcionais) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
        this.chassi = chassi;
        this.renavam = renavam;
        this.procedencia = procedencia;
        this.tipoCombustivel = tipoCombustivel;
        this.motor = motor;
        this.quilometragem = quilometragem;
        this.consumoMedio = consumoMedio;
        this.opcionais = opcionais;
    }

    public String toString() {
        return "    Placa: " + this.getPlaca()
                + "\n    Marca: " + this.getMarca()
                + "\n    Modelo: " + this.getModelo()
                + "\n    Ano do modelo: " + this.getAnoModelo()
                + "\n    Ano de fabricação: " + this.getAnoFabricacao()
                + "\n    Chassi: " + this.getChassi()
                + "\n    Renavam: " + this.getRenavam()
                + "\n    Procedencia: " + this.getProcedencia()
                + "\n    Tipo de combustivel: " + this.getTipoCombustivel()
                + "\n    Motor: " + this.getMotor()
                + "\n    Quilometragem: " + this.getQuilometragem()
                + "\n    Consumo médio: " + this.getConsumoMedio()
                + "\n    Opcionais: " + this.getOpcionais();
    }

    // gets and sets.
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getRenavam() {
        return renavam;
    }

    public void setRenavam(int renavam) {
        this.renavam = renavam;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }
}