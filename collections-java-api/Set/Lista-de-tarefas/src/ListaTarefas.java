import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ListaTarefas {
  Set<Tarefa> tarefaSet;

  public ListaTarefas() {
    this.tarefaSet = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaSet.add(new Tarefa(descricao, false));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaRemovida = null;
    if (!tarefaSet.isEmpty()) {

      for (Tarefa t : tarefaSet) {
        if (Objects.equals(t.getDescricao(), descricao)) {
          tarefaRemovida = t;
          break;
        }
      }
      tarefaSet.remove(tarefaRemovida);
    }

  }

  public void exibirTarefas() {
    System.out.println(tarefaSet);
  }

  public int contarTarefas() {
    return tarefaSet.size();

  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();
    for (Tarefa t : tarefaSet) {
      if (t.isConcluida()) {
        tarefasConcluidas.add(t);

      }
    }

    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();
    for (Tarefa t : tarefaSet) {
      if (!t.isConcluida()) {
        tarefasPendentes.add(t);

      }
    }

    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {

    for (Tarefa t : tarefaSet) {
      if (!t.isConcluida() && Objects.equals(t.getDescricao(), descricao)) {
        t.setConcluida(true);

      }
    }

  }

  public void marcarTarefaPendente(String descricao) {

    for (Tarefa t : tarefaSet) {
      if (Objects.equals(t.getDescricao(), descricao)) {
        t.setConcluida(false);

      }
    }

  }

  public void limparListaTarefas() {
    tarefaSet.clear();
  }
}
