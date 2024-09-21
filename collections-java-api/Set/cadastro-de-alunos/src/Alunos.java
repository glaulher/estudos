import java.util.Comparator;

/**
 * Aluno
 */
public class Alunos implements Comparable<Alunos> {
  private String nome;
  private long matricula;
  private double nota;

  public Alunos(String nome, long matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
    return result;
  }

  @Override
  public int compareTo(Alunos arg0) {
    return nome.compareToIgnoreCase(arg0.nome);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Alunos other = (Alunos) obj;
    if (matricula != other.matricula)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Alunos [ " + nome + "," + matricula + "," + nota + "]";
  }

}

class ComparatorPorNota implements Comparator<Alunos> {

  @Override
  public int compare(Alunos arg0, Alunos arg1) {

    return Double.compare(arg0.getNota(), arg1.getNota());
  }

}
