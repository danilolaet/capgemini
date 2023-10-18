import javax.swing.*;

public class Matrizes {
    public static void main(String[] args) {
        String [] alunos = {"JOAO", "JOSE", "MARIA"};
        float [][] notas = new float[3][4];
        float somaNotas, mediaAluno;
        String statusAluno;

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + alunos[i]);
            somaNotas = 0;
            mediaAluno = 0;

            for (int j = 0; j < 4; j++) {
                notas [i][j] = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota Nª " + (j+1) + ":"));
                somaNotas = somaNotas + notas[i][j];
            }
        mediaAluno = somaNotas / 4;
        if (mediaAluno < 5.5){
            statusAluno = "REPROVADO";
        } else if (mediaAluno > 5.5 && mediaAluno < 7) {
            statusAluno = "RECUPERAÇÃO";
        }else{
            statusAluno = "APROVADO";
        }

        //Impressão boletim
        System.out.println("*******BOLETIM*******");
        System.out.println("Aluno.: " + alunos[i]);
        System.out.println("notas");
            for (int j1 = 0; j1 < 4; j1++) {
                System.out.println("Nota " + (j1+1) + " - " + notas [i][j1]);
            }
        System.out.println("Média: " + mediaAluno + " - " + statusAluno);

        }

    }
}
