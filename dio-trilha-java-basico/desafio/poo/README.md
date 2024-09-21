# trilha-java-basico DIO - digitalinnovationone
<p align="center" >
  <img align="center" src="https://upload.wikimedia.org/wikipedia/pt/thumb/3/30/Java_programming_language_logo.svg/96px-Java_programming_language_logo.svg.png" width="100" />
</p>

<h1 align="center"> 
  🚀Desafio Poo🚀 
 
</h1>




## 📋 Sobre 

<img align="center" src="https://upload.wikimedia.org/wikipedia/pt/thumb/3/30/Java_programming_language_logo.svg/96px-Java_programming_language_logo.svg.png" width="18" /> Desafio poo para a trilha-java-basico bootcamp Claro - DIo

---
#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

[Lançamento iPhone 2007](https://www.youtube.com/watch?v=9ou608QQRq8)
- Minutos relevantes: 00:15 até 00:55

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### 🔍 Diagrama de classes

```mermaid
classDiagram
    class Iphone {
        <<abstract>>
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) String
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    class ReprodutorMusical {
        +tocar() void
        +pausar() void
        +selecionarMusica(String musica) String
    }

    class AparelhoTelefonico {
        +ligar(String numero) void
        +atender() void
        +iniciarCorreioVoz() void
    }

    class NavegadorInternet {
        +exibirPagina(String url) void
        +adicionarNovaAba() void
        +atualizarPagina() void
    }

    Iphone <|-- ReprodutorMusical
    Iphone <|-- AparelhoTelefonico
    Iphone <|-- NavegadorInternet
```

---

 
  <img alt="Repository size" src="https://img.shields.io/badge/Java-000?style=for-the-badge&logo=java">