package Atividades;

public class PrincipalEmpresa {
	
	public static void main(String[] args) {
		

		Departamento departamento = new Departamento ("Desenvolvimento");
		Empresa empresa = new Empresa ("Samsung" , departamento);
		
		System.out.println("Empresa: " + empresa.getNome() + " Departamento: " + departamento.getNome());
	}

}
