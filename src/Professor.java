public class Professor extends UmIndividuo
{
    private byte numHoras;
    public static int contProfessor = 0;

    public Professor(String nome, String email, byte idade, char genero, byte numHoras)
    {
        super(nome, email, idade, genero);
        this.numHoras = numHoras;
        contProfessor++;
    }

    public Professor() {this("","",(byte)0,' ', (byte)0); }

    public byte getnumHoras() { return numHoras; }
    public void setnumHoras(byte numHoras) { this.numHoras = numHoras; }

    public String toString() 
    { return super.toString() + "\t\nDados do PROFESSOR: " + "Numero de Horas: " + numHoras; }
}