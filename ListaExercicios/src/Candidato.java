public class Candidato implements Comparable <Candidato> {

    public String nome;
    public double nota;

    public Candidato (String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    @Override 
    public int compareTo (Candidato c){

        int resultadoNota = Double.compare(c.nota, this.nota);

        if(resultadoNota !=0){
            return resultadoNota;
        }
        
        return this.nome.compareTo(c.nome);
        
    }
    
}