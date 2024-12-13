# Examen 1ª Evaluación
# 🖥️ Traballando con Git: Clonando un Repositorio 

## 📋 O que fixen na imaxe
Aquí explico paso a paso o que fixen na imaxe mentres utilizaba Git para clonar un repositorio remoto ao meu ordenador e deixalo listo para traballar.

---

## 🛠️ Pasos realizados

### 1. **Cambio ao directorio onde quero traballar**
- **Comando utilizado:** `cd C:/Users/Jacobo/Desktop/examencodsofia`
- Cambiei ao directorio onde quería clonar o proxecto. Isto asegura que todo o contido descargado do repositorio remoto se garde no lugar correcto.

---

### 2. **Clonación do repositorio remoto**
- **Comando utilizado:** `git clone https://github.com/damiancastelao/ex1ev.git`
- Usei o comando de Git para clonar o repositorio remoto `ex1ev` no directorio local.
- O proceso completouse con éxito:
    - **Enumeración de obxectos:** Git identificou todos os arquivos e carpetas do repositorio remoto.
    - **Compresión e transferencia:** Os arquivos foron comprimidos, transferidos e descomprimidos no meu ordenador.
    - **Resolución de deltas:** Git verificou que todo o contido do proxecto estaba sincronizado correctamente.

---

## 📂 Resultado final
Agora teño o repositorio `ex1ev` clonado correctamente no meu ordenador, no directorio `C:/Users/Jacobo/Desktop/examencodsofia`. Podo acceder aos arquivos do proxecto e empezar a traballar neles de inmediato.



![img.png](img.png)

# 🏁 Taboleiro de Damas en Java

## 📋 Descrición
Este proxecto en Java crea e amosa un **taboleiro de damas de 8x8**. A súa funcionalidade principal é contar as fichas de cada tipo (`Brancas` e `Negras`) e determinar quen ten máis. Ademais, imprime o estado detallado do taboleiro e o representa como unha matriz visual.

---

## 📌 Funcionalidades principais
O código inclúe catro funcións principais para realizar operacións sobre o taboleiro:

### 1. **crearTaboleiroInicial**
- **Que fai?**
  - Crea e inicializa o taboleiro de 8x8.
  - Coloca as fichas:
    - Fichas `Brancas (B)` nas primeiras 3 filas.
    - Fichas `Negras (N)` nas últimas 3 filas.
    - As filas centrais permanecen baleiras (`.`).
- **Retorno:** Un taboleiro `char[][]` de 8x8 coas fichas colocadas.

---

### 2. **contarFichas**
- **Que fai?**
  - Conta cantas fichas dun tipo dado (`B` ou `N`) hai no taboleiro.
- **Parámetros:**
  - `taboleiro`: Matriz 8x8 co estado do xogo.
  - `tipoFicha`: O tipo de ficha que se quere contar (`B` ou `N`).
- **Retorno:** O número de fichas do tipo especificado.

---

### 3. **imprimirTaboleiro**
- **Que fai?**
  - Imprime o estado de cada casilla do taboleiro:
    - Indica se está baleira ou ocupada por unha ficha (Branca ou Negra).
  - Conta e devolve o número de casillas baleiras.
- **Parámetros:**
  - `taboleiro`: Matriz 8x8 coas fichas.
- **Retorno:** O número de casillas baleiras (`.`).

---

### 4. **imprimirTaboleiroCompleto**
- **Que fai?**
  - Imprime o taboleiro completo como unha matriz de 8x8.
  - Cada celda amosa o contido (`B`, `N`, ou `.`).
- **Parámetros:**
  - `taboleiro`: Matriz 8x8 co estado do xogo.
- **Retorno:** Ningún, só imprime o taboleiro.

---

## 🚀 Execución
1. O programa chama a `crearTaboleiroInicial` para inicializar o taboleiro.
2. Emprega `imprimirTaboleiroCompleto` para visualizar o taboleiro como unha matriz.
3. Conta as fichas brancas (`B`) e negras (`N`) usando `contarFichas`.
4. Imprime o estado detallado de cada casilla con `imprimirTaboleiro`.
5. Amosamos os resultados finais:
  - Número de casillas baleiras.
  - Número de fichas brancas e negras.
  - Determina quen vai gañando ou se hai empate.

---

## 📂 Estrutura do código
```plaintext
DamasDemo.java
  ├── crearTaboleiroInicial()     -> Inicializa o taboleiro.
  ├── contarFichas()              -> Conta fichas dun tipo.
  ├── imprimirTaboleiro()         -> Imprime o estado das casillas.
  ├── imprimirTaboleiroCompleto() -> Mostra o taboleiro como matriz.
 ````
  
## 📂 Estrutura do código
```plaintext
----- Taboleiro Completo -----
B B B B B B B B 
B B B B B B B B 
B B B B B B B B 
. . . . . . . . 
. . . . . . . . 
N N N N N N N N 
N N N N N N N N 
N N N N N N N N 

Casilla (0,0): Ficha Branca.
Casilla (0,1): Ficha Branca.
...
Casilla (3,0): Baleira.
...
----- Resultado -----
Casillas baleiras: 16
Brancas: 24
Negras: 24
Empate!
````