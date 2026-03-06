import java.io.*;
import java.util.*;

public class Tarefas 
{
    private ArrayList lista;

    public Tarefas()
    {
        lista = new ArrayList();
    }

    public void lerDoFicheiro(String nf)
    {
        char criterio;
        String umaLinha;
        StringTokenizer x;

        char genero;
        String nome, email;
        byte idade, numHoras, classe;
        float media; 


        try
        {
            BufferedReader br = new BufferedReader(new FileReader(nf));
            umaLinha = br.readLine();

            while (umaLinha != null) 
            {
                x = new StringTokenizer(umaLinha, ",");
                nome = x.nextToken();
                email = x.nextToken();
                idade = Byte.parseByte(x.nextToken());
                genero = x.nextToken().charAt(0);
                criterio = x.nextToken().charAt(0);

                if(criterio == 'a' || criterio == 'A')
                {
                    classe = Byte.parseByte(x.nextToken());
                    media = Float.parseFloat(x.nextToken());
                    criarOBJAluno(nome, email, idade, genero, classe, media);
                }
                else if(criterio == 'p' || criterio == 'P')
                    {
                        numHoras = Byte.parseByte(x.nextToken());
                        criarOBJProf(nome, email, idade, genero, numHoras);
                }

                //lista.add(o);
                umaLinha = br.readLine();
            }
            lista.trimToSize();
            br.close();
            System.out.println("Ficheiro lido com sucesso!");
        }
        catch(FileNotFoundException a) { System.out.println("Ficheiro nao encontrado!");}
        catch(NumberFormatException b) { System.out.println(b.getMessage());}
        catch(IOException c) { System.out.println(c.getMessage());}
    }

    /*
    public void criarOBJAluno(String nome, String email, byte idade, char genero, byte classe, float media)
    {
        Aluno a = new Aluno(nome, email, idade, genero, classe, media);
        lista.add(a);
    }

    public void criarOBJProf(String nome, String email, byte idade, char genero, byte numHoras)
    {
        Professor p = new Professor(nome, email, idade, genero, numHoras);
        lista.add(p);
    }
    */
}
