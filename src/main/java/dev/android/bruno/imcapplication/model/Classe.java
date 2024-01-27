package dev.android.bruno.imcapplication.model;

public class Classe {

    public String primeiroNome;
    public String sobreNome;
    public String userAltura;
    public String userPeso;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getUserAltura() {
        return userAltura;
    }

    public void setUserAltura(String userAltura) {
        this.userAltura = userAltura;
    }

    public String getUserPeso() {
        return userPeso;
    }

    public void setUserPeso(String userPeso) {
        this.userPeso = userPeso;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", userAltura='" + userAltura + '\'' +
                ", userPeso='" + userPeso + '\'' +
                '}';
    }
}
