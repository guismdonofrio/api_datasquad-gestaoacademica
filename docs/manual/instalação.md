# Manual de Instalação (JavaFX + MaterialFX)

## Pré-requisitos

Antes de começar, instale:

* **Java JDK 17 ou superior**
* **IntelliJ IDEA** (Community ou Ultimate)
* **Scene Builder** (opcional, mas recomendado)

---

## Clonar o Projeto

Clone o repositório com o Git:

```bash
git clone https://github.com/guismdonofrio/api_datasquad-aplicativo.git
```

Ou baixe o ZIP direto pelo GitHub.

---

## Abrindo no IntelliJ

1. Abra o **IntelliJ IDEA**
2. Clique em **"Open"**
3. Selecione a pasta do projeto clonado
4. Aguarde o IntelliJ importar as dependências automaticamente

---

## Configuração do JavaFX

Se o projeto **não usar Maven/Gradle configurado corretamente**, faça isso:

### 1. Baixe o JavaFX SDK

* JavaFX SDK
* Link: [https://gluonhq.com/products/javafx/](https://gluonhq.com/products/javafx/)

### 2. Configure no IntelliJ

Vá em:

```
File > Project Structure > Libraries
```

* Clique em **+**
* Adicione a pasta `lib` do JavaFX

---

### 3. Configurar VM Options

Vá em:

```
Run > Edit Configurations
```

E adicione:

```bash
--module-path "CAMINHO_PARA_JAVAFX/lib" --add-modules javafx.controls,javafx.fxml
```

---

## Configuração do MaterialFX (Atlanta)

Se estiver usando **MaterialFX**, verifique:

* Dependência no projeto (Maven/Gradle)

Exemplo **Maven**:

```xml
<dependency>
    <groupId>io.github.palexdev</groupId>
    <artifactId>materialfx</artifactId>
    <version>11.13.5</version>
</dependency>
```

---

## Execução do Projeto

1. Vá até a classe principal (ex: `Main.java`)
2. Clique com botão direito
3. Clique em **Run**

Ou use:

```
Shift + F10
```

---

## Possíveis Problemas

### ❌ Erro de JavaFX não encontrado

* Verifique se o **module-path** está correto

### ❌ Tela não abre

* Confirme se o `FXMLLoader` está apontando pro caminho certo

### ❌ MaterialFX não carrega

* Verifique dependências ou conexão com internet (se Maven)

---

## Observações

* O projeto utiliza **JavaFX para interface gráfica**
* O **MaterialFX (Atlanta)** é usado para componentes modernos
* Recomenda-se usar **IntelliJ atualizado**
