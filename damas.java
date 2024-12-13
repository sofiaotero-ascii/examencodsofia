/**
 * @author Sofía Otero
 * @version 1.0
 *Amosa un taboeriro de damas para contar as ficahs que hay en cada lugar:
 * - crearTaboleiroInicial: crea e inicializa o taboleiro con fichas e casillas baleiras.
 * - contarFichas: devolve cantas fichas hai dun tipo dado.
 * - imprimirTaboleiro: imprime o estado das casillas e devolve cantas casillas baleiras hai.
 * - imprimirTaboleiroCompleto: imprime o taboleiro completo como unha matriz.
 */

public class DamasDemo {
    public static void main(String[] args) {
        // Chamamos á función para crear o taboleiro inicial
        char[][] taboleiro = crearTaboleiroInicial();

        // Chamamos á función para imprimir o taboleiro en forma de matriz
        System.out.println("----- Taboleiro Completo -----");
        imprimirTaboleiroCompleto(taboleiro);

        // Chamamos á función para imprimir o estado do taboleiro e gardamos o resultado
        int casillasBaleiras = imprimirTaboleiro(taboleiro);

        // Chamamos á función para contar as fichas brancas e negras
        int brancas = contarFichas(taboleiro, 'B');
        int negras = contarFichas(taboleiro, 'N');

        // Amosamos o resultado final
        System.out.println("\n----- Resultado -----");
        System.out.println("Casillas baleiras: " + casillasBaleiras);
        System.out.println("Brancas: " + brancas);
        System.out.println("Negras: " + negras);

        // Quen vai gañando?
        if (brancas > negras) {
            System.out.println("Van gañando as Brancas!");
        } else if (negras > brancas) {
            System.out.println("Van gañando as Negras!");
        } else {
            System.out.println("Empate!");
        }
    }

    /**
     * Función para crear un taboleiro inicial de Damas.
     * Coloca fichas brancas (B) nas primeiras 3 filas, negras (N) nas últimas 3 filas,
     * e deixa as filas centrais baleiras ('.').
     * @return Un taboleiro 8x8 inicializado
     */
    public static char[][] crearTaboleiroInicial() {
        // Creamos o taboleiro 8x8
        char[][] taboleiro = new char[8][8];

        // Poñemos todas as casillas baleiras ('.')
        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                taboleiro[fila][col] = '.';
            }
        }

        // Colocamos fichas brancas (B) nas primeiras 3 filas
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 8; col++) {
                taboleiro[fila][col] = 'B';
            }
        }

        // Colocamos fichas negras (N) nas últimas 3 filas
        for (int fila = 5; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                taboleiro[fila][col] = 'N';
            }
        }

        // Devolvemos o taboleiro inicializado
        return taboleiro;
    }

    /**
     * Función para contar cantas fichas dun tipo hai no taboleiro.
     * @param taboleiro Matriz 8x8 coas fichas
     * @param tipoFicha Carácter que indica o tipo de ficha ('B' ou 'N')
     * @return Cantidade de fichas dese tipo
     */
    public static int contarFichas(char[][] taboleiro, char tipoFicha) {
        int contador = 0;
        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                if (taboleiro[fila][col] == tipoFicha) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Función para imprimir o estado do taboleiro.
     * Mostra cada casilla, se está baleira ou que ficha ten.
     * Devolve o número de casillas baleiras.
     * @param taboleiro Matriz 8x8 coas fichas
     * @return número de casillas baleiras
     */
    public static int imprimirTaboleiro(char[][] taboleiro) {
        int baleiras = 0;
        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                char ficha = taboleiro[fila][col];
                System.out.print("Casilla (" + fila + "," + col + "): ");
                if (ficha == '.') {
                    System.out.println("Baleira.");
                    baleiras++;
                } else {
                    System.out.println("Ficha " + (ficha == 'B' ? "Branca" : "Negra") + ".");
                }
            }
        }
        return baleiras;
    }

    /**
     * Función para imprimir o taboleiro completo como unha matriz.
     * Mostra as filas e columnas con fichas ou casillas baleiras.
     * @param taboleiro Matriz 8x8 coas fichas
     */
    public static void imprimirTaboleiroCompleto(char[][] taboleiro) {
        for (int fila = 0; fila < 8; fila++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(taboleiro[fila][col] + " ");
            }
            System.out.println(); // Nova liña para separar as filas
        }
    }
}
