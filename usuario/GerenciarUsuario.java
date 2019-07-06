package usuario;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarUsuario {

	private int id;
	private HashMap<Integer, Usuario> usuarios;
	
	public GerenciarUsuario() {
		id = 1;
		usuarios = new HashMap<>();
	}
	
	public void salvar(Usuario usuario){
		usuario.setId(id);
		usuarios.put(id, usuario);
		id++;
	}
	
	public ArrayList<Usuario> listar(){
		return new ArrayList<>(usuarios.values());
	}
	
	public void apagar(int id){
		usuarios.remove(id);
	}
		
	public void atualizar(Usuario usuario){
		usuarios.remove(usuario.getId());
		usuarios.put(usuario.getId(), usuario);	
	}
	
}
