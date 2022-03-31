package classedata;

public class Data {
    private int mes, dia, ano;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void exibeData(int dia, int mes, int ano){
        System.out.printf("\nPRINTANDO A DATA:\n-> %d / %d / %d\n", this.dia, this.mes, this.ano);
    }   
}
