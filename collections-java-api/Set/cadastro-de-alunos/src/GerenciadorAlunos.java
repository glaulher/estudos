import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
  Set<Alunos> alunosSet;

  public GerenciadorAlunos() {
    alunosSet = new HashSet<>();
  }

  public void adicionarAluno(String nome, Long matricula, double media) {
    alunosSet.add(new Alunos(nome, matricula, media));
  }

  public void removerAluno(long matricula) {
    Alunos removeAluno = null;

    for (Alunos a : alunosSet) {
      if (a.getMatricula() == matricula) {
        removeAluno = a;
        break;
      }
    }
    if (removeAluno != null) {
      alunosSet.remove(removeAluno);
    } else {
      System.out.println("Nenhum aluno para ser retirado");
    }

  }

  public Set<Alunos> exibirAlunosPorNome() {
    Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);

    if (!alunosSet.isEmpty()) {
      return alunosPorNome;
    } else {
      System.out.println("O conjunto está vazio!");
      return Collections.emptySet();
    }

  }

  public Set<Alunos> exibirAlunosPorNota() {

    Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

    if (!alunosSet.isEmpty()) {
      return alunosPorNota;
    } else {
      System.out.println("O conjunto está vazio!");
      return Collections.emptySet();
    }

  }

  public void exibirAlunos() {
    System.out.println(alunosSet);
  }

}
