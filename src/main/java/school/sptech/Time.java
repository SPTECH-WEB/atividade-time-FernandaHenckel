package school.sptech;

public class Time {
    String nome;
    Integer vitorias;
    Integer empates;
    Integer derrotas;

    public Time() {
        vitorias = 0;
        empates = 0;
        derrotas = 0;
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public Integer getPontos(){
        return (vitorias * 3) + empates;
    }

    public Integer getTotalPartidas(){
        return vitorias + empates + derrotas;
    }

    public Integer getAproveitamento(){
        return (vitorias / getTotalPartidas()) * 100;
    }

    public void compararAproveitamento(Time adversario){
        if(adversario.getAproveitamento() > getAproveitamento()){
            System.out.println("O time " + adversario.nome +  "tem um aproveitamento maior que o time " + nome);
        } else {
            System.out.println("O time " + nome + "tem um aproveitamento maior que o time " + adversario.nome);
        }
    }

    public void exibirInformacoes(){
        System.out.println("Vitórias: " + vitorias + "\n Empates: " + empates + "\n Derrotas: " + derrotas);
        System.out.println("Pontos: " + getPontos() + "\n Total de Partidas: " + getTotalPartidas()
                + "\n Aproveitamento: " + getAproveitamento());
    }
}