public class Main
{
	public static void main(String[] args) {
		Professor prof1 = new Professor("Yudi Santos");
        Professor prof2 = new Professor("Letícia Aleixo");
        
        Turma turma1 = new Turma("3AM");
        
        turma1.setProfessor(prof1);
        turma1.resumo();
        
        turma1.setProfessor(prof2);
        turma1.resumo();

    }

}