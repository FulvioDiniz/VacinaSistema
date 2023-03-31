package poov.projetovacinacao;
import java.util.Date;
import java.util.ArrayList;
import java.lang.reflect.Array;

public class Lote {
    //private long serialVersionUID;
    private long codigo;
    private Date dataValidade;
    private int nroDosesLote;
    private int nroDosesAtuais;
    private ArrayList<Vacina> vacinas = new ArrayList<Vacina>();



    public Lote() {
        this(0, new Date(0), 0, 0, new Vacina());
    }

    public Lote(long codigo, Date dataValidade, int nroDosesLote, int nroDosesAtuais, Vacina vacina) {
        setCodigo(codigo);
        setDataValidade(dataValidade);
        setNroDosesLote(nroDosesLote);
        setNroDosesAtuais(nroDosesAtuais);
        setVacina(vacina);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getNroDosesLote() {
        return nroDosesLote;
    }

    public void setNroDosesLote(int nroDosesLote) {
        this.nroDosesLote = nroDosesLote;
    }

    public int getNroDosesAtuais() {
        return nroDosesAtuais;
    }

    public void setNroDosesAtuais(int nroDosesAtuais) {
        this.nroDosesAtuais = nroDosesAtuais;
    }

  
    public ArrayList<Vacina> getVacina() {
        return vacinas;
    }

    public void setVacina(Vacina vacina) {
        this.vacinas.add(vacina);
    }




    public void MostrarTela() {
        System.out.println("Codigo lote = " + codigo);
        System.out.println("Data de validade: " + dataValidade);
        System.out.println("Número de doses do lote: " + nroDosesLote);
        System.out.println("Número de doses atuais: " + nroDosesAtuais);
        System.out.println("Vacina: " + vacinas);
    }

    @Override
    public String toString() {
        return "Lote [codigo=" + codigo + ", dataValidade=" + dataValidade + ", nroDosesAtuais=" + nroDosesAtuais
                + ", nroDosesLote=" + nroDosesLote + ", vacina=" + vacinas + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Lote other = (Lote) obj;
        if (codigo != other.codigo)
            return false;
        if (dataValidade == null) {
            if (other.dataValidade != null)
                return false;
        } else if (!dataValidade.equals(other.dataValidade))
            return false;
        if (nroDosesAtuais != other.nroDosesAtuais)
            return false;
        if (nroDosesLote != other.nroDosesLote)
            return false;
        if (vacina == null) {
            if (other.vacina != null)
                return false;
        } else if (!vacina.equals(other.vacina))
            return false;
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        result = prime * result + ((dataValidade == null) ? 0 : dataValidade.hashCode());
        result = prime * result + nroDosesAtuais;
        result = prime * result + nroDosesLote;
        result = prime * result + ((vacina == null) ? 0 : vacina.hashCode());
        return result;
    }

    
}
