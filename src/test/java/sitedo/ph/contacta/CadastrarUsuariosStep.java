package sitedo.ph.contacta;

import static org.fest.assertions.Assertions.assertThat;
import sitedo.ph.contacta.services.UsuarioService;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class CadastrarUsuariosStep {

	private String	mensagemExibida;

	@Dado("^que o eleitor José da Silva deseja acompanhar seu representante no governo$")
	public void que_o_eleitor_José_da_Silva_deseja_acompanhar_seu_representante_no_governo()
			throws Throwable {

	}

	@Quando("^ele preencher o formulário de cadastro com o nome de usuário ‘(.+)’ e a senha ‘(.+)’ e submetê-lo$")
	public void ele_preencher_o_formulário_de_cadastro_com_o_nome_de_usuário_jose_e_a_senha_dasilva_e_submetê_lo(	String usuario,
																													String senha)
			throws Throwable {

		UsuarioService usuarioService = new UsuarioService();
		mensagemExibida = usuarioService.cadastrar(	usuario,
													senha);
	}

	@Então("^o sistema deve exibir a seguinte mensagem: “(.+)”$")
	public void o_sistema_deve_exibir_a_seguinte_mensagem_O_usuário_jose_com_a_senha_dasilva_foi_cadastrado_com_sucesso(String mensagem)
			throws Throwable {

		assertThat(mensagem).isEqualTo(mensagemExibida);
	}
}
