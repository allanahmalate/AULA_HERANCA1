public class Aluno extends UmIndividuo
{
    private byte classe;
    private float media;
    public static int contAluno = 0;

    public Aluno(String nome, String email, byte idade, char genero, byte classe, float media)
    {
        super(nome, email, idade, genero);
        this.classe = classe;
        this.media = media;
        contAluno++;
    }

    public Aluno() {this("","",(byte)0,' ', (byte)0, 0); }

    public byte getClasse() { return classe; }
    public void setClasse(byte classe) { this.classe = classe; }

    public float getMedia() { return media; }
    public void setMedia(float media) { this.media = media; }

    public String toString() 
    { return super.toString() + "\t\nDados do Aluno: " + "Classe: " + classe + ", Média: " + media; }
}