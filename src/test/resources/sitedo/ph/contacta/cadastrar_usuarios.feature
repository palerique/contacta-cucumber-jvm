# language: pt
Funcionalidade: Possibilitar o cadastro de usuários

Para obter acesso ao sistema
Como um Usuário
Desejo preencher um formulário com os dados necessários

Cenário: Cadastrar o usuário no sistema com sucesso
Dado que o eleitor José da Silva deseja acompanhar seu representante no governo
Quando ele preencher o formulário de cadastro com o nome de usuário ‘jose’ e a senha ‘dasilva’ e submetê-lo
Então o sistema deve exibir a seguinte mensagem: “O usuário jose com a senha dasilva foi cadastrado com sucesso”