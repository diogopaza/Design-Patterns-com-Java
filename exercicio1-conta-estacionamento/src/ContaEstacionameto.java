public class ContaEstacionameto {

    private Veiculo veiculo;
    private long inicio, fim;

    public double valorConta() {
        long atual = (fim == 0) ? System.currentTimeMillis() : fim;
        long periodoEmMililis = atual - inicio;
        System.out.println("Tempo estacionado (horas): " + (periodoEmMililis / 1000 / 60 / 60));
        long periodo = periodoEmMililis / 1000 / 60 / 60;

        if (veiculo instanceof Passeio) {
            if (periodo < 12) {
                return 2.0 * Math.ceil(periodo);
            } else if (periodo > 12 && periodo < 15) {
                return 26.0 * Math.ceil(periodo);
            } else {
                return 300.0 * Math.ceil(periodo);
            }
        } else if (veiculo instanceof Carga) {
            return 10;
        }
        return 0;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public long getInicio() {
        return inicio;
    }

    public long getFim() {
        return fim;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setInicio(long inicio) {
        this.inicio = inicio;
    }

    public void setFim(long fim) {
        this.fim = fim;
    }
}
