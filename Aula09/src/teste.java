import classes.Aluno;
import dao.AlunoDAO;

public class teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("1134", "João", 6.7F, 8.8F);

        AlunoDAO dao = new AlunoDAO();

        dao.insertAluno(aluno);

        System.out.println( dao.consultarAluno("1213").getNome());
        System.out.println(dao.getAlunos());
    }
}
