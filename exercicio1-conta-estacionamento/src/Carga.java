public class Carga implements Veiculo {

    int numeroEixos = 0;

    @Override
    public String getFabricante() {
        return "";
    }

    @Override
    public String getModelo() {
        return "";
    }

    @Override
    public String getPlaca() {
        return "";
    }

    @Override
    public String getAno() {
        return "";
    }

    public int getNumeroEixos() {
        return numeroEixos;
    }

    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}
