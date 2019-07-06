package produto;

import java.util.ArrayList;
import java.util.HashMap;

public class GerenciarProduto {

	private int id;
	private HashMap<Integer, Produto> produtos;
	
	public GerenciarProduto() {
		id = 1;
		produtos = new HashMap<>();
	}
	
	public void salvar(Produto produto){
		produtos.put(id, produto);
		produto.setId(id);
		id++;
	}
	
	public ArrayList<Produto> listar(){
		return new ArrayList<>(produtos.values());
		
	}
	
	public void apagar(int id ){
		produtos.remove(id);
	}

	public void atualizar(Produto produto){
		produtos.remove(produto.getId());
		produtos.put(produto.getId(),produto);
		
	}
}
