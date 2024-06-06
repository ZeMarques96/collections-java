package set.OperacoesBasicas;

public class Convidado {

    private String nome;

    private String codigoConvite;

    public Convidado(String nome, String codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(String codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoConvite == null) ? 0 : codigoConvite.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite == null) {
            if (other.codigoConvite != null)
                return false;
        } else if (!codigoConvite.equals(other.codigoConvite))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

    
}
