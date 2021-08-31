package crudfuncionario;

public class Funcionarios {
    
    long matricula;
    String nome;
    Double salario;
    private Departamentos Dep;
    
    public Funcionarios(){
    }
    
    public Funcionarios(long matricula, String nome, Double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;        
    }
    
    public long getMatricula(){
        return matricula;
    }
    
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Double getSalario(){
        return salario;
    }
    public void setSalario(Double salario){
        this.salario = salario;
    }
    
    public void setDep(Departamentos Dep){
        this.Dep = Dep;
    }
}
