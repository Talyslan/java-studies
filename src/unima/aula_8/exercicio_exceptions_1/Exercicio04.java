package unima.aula_8.exercicio_exceptions_1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//public class Exercicio04 {
//    public static void salvar(String arquivo, String dados) {
//            try {
//                OutputStream out = new FileOutputStream(arquivo);
//                out.write(dados.getBytes());
//                out.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//    }
//}

/*
* LETRA A
* O OutputStream pode não ser fechado se ocorrer uma exceção ao escrever os dados, gerando vazamento de recursos.
* Quando acontece:
* Ao abrir o arquivo: caminho inválido ou sem permissão.
* Ao escrever os dados: problemas de disco ou E/S.
* Ao fechar o arquivo: falha no sistema de arquivos.
* */

/* LETRA B - Reescrevendo o código de forma a corrigir o problema.*/
public class Exercicio04 {
    public static void salvar(String arquivo, String dados) {
        try (OutputStream out = new FileOutputStream(arquivo)) {
            out.write(dados.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}