import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<Candidato> lista = new ArrayList<>();

        
        try (BufferedReader br = new BufferedReader(new FileReader("resources/candidatos_vestibular.csv"))) {
            String linha;

            
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                String nome = partes[0].trim();
                double nota = Double.parseDouble(partes[1].trim());
                lista.add(new Candidato(nome, nota));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        
        System.out.println("Lista original:");
        for (Candidato c : lista) {
            System.out.println(c.nome + " - " + c.nota);
        }

        
        Sorts<Candidato> sorts = new Sorts<>();
        Candidato[] array = lista.toArray(new Candidato[0]);
        sorts.sort(array);

        
        System.out.println("\nLista ordenada:");
        for (Candidato c : array) {
            System.out.println(c.nome + " - " + c.nota);
        }
    }
}
