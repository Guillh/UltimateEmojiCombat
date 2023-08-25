public class Lutador {

    //Atributos

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Metodos

    public void apresentar(){
        System.out.println("--------------------------------------");
        System.out.println("Com " + getIdade() + " anos do " + getNacionalidade());
        System.out.println("Com " + getAltura() + " metros e pesando " + getPeso() + " Kgs");
        System.out.println("Com " + getVitorias()+ " Vitorias,");
        System.out.println(getDerrotas() + " Derrotas,");
        System.out.println(getEmpates() + " Empates.");
        System.out.println("Vem ai " + getNome() + "!!!!!!!!!!!!");
    }
    public void status(){
        System.out.println("----------------------------------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println("Com " + getVitorias()+ " Vitorias,");
        System.out.println(getDerrotas() + " Derrotas,");
        System.out.println(getEmpates() + " Empates.");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }

    // Metodos especiais

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float al) {
        this.altura = al;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() < 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() < 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() < 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int de) {
        this.derrotas = de;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int em) {
        this.empates = em;
    }
}
