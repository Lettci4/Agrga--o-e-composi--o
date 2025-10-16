    class Turma{
    private String codigo;
    private Professor professor;
    
    public Turma(String codigo){
        this.codigo = codigo;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

public void resumo(){
        if (professor != null) {
            System.out.println("Turma: " + codigo + ", Professor: " + professor.getNome());
        } else {
            System.out.println("Turma: " + codigo + ", Professor: não definido");
        }
    }
}