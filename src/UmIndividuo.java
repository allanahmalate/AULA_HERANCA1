public class UmIndividuo 
{
    private String nome, email;
    private byte idade;
    private char genero;

    public UmIndividuo(String nome, String email, byte idade, char genero)
    {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.genero = genero;
    }

    public UmIndividuo() { this("","",(byte)0,' '); }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setIdade(byte idade) { this.idade = idade; }
    public void setGenero(char genero) { this.genero = genero; }

    /*
    public String getNome() { return this.nome; }
    public String getEmail() { return this.email; }
    public byte getIdade() { return this.idade; }
    public char getGenero() { return this.genero; }
    */

    public String toString()
    {
        return "\nNome: " + nome + " Email: " + email + " Idade: " + idade + " Genero: " + genero;
    }
}
