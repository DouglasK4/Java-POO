package crudfuncionario;

import java.util.ArrayList;

/* @author Juciarias Medeiros */
public class Departamentos {
    
    public int codigo;
    public String nome;
    ArrayList<Funcionarios> ListaFunc;
    
    public Departamentos( ArrayList<Funcionarios> ListaFunc){    
        ListaFunc = new ArrayList();
    }
    
    public Departamentos(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        ListaFunc = new ArrayList();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Funcionarios> getListaFunc(){
        return ListaFunc;
    }
    
    public void setListaFunc(ArrayList<Funcionarios> ListaFunc){
        this.ListaFunc = ListaFunc;
    }   
    
}
