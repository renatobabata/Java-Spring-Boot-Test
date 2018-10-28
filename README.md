# Projeto Spring Boot - Rest API 
# Gerenciamento de clientes

# Tecnologias
- JAVA 1.8 
- Spring 4
- Spring Boot
- Spring JPA
- H2
- Postman (para testar)
- Maven
- Eclipse IDE

# Observações Gerais

O sistema não foi concluído com sucesso, pois não consegui realizar a conexão com banco de dados (H2), por consequência não consegui realizar os devidos testes add, update, delete e select. 
Ao tentar realizar os testes através do Postman, apareceu a seguinte mensagem de erro:
"status": 404
"error": "Not Found"

# Serviços 


- Consultar registro de cliente.
- Consultar registro de cliente por ID único.
- Criar registro de cliente.
- Deletar registro de cliente.
- Atualizar registro de cliente.


# Testar serviços

Para testar os serviços eu utilizei o programa  Postman (software para enviar requisição HTTP).
(obs: os procedimentos a seguir são teóricos, pois não consegui de fato executar e testar, conforme dito em "Observações Gerais")

# Consultar registro de cliente 

Ao acessar o Postman, selecionar a opção "GET" e passar como parâmetro o nome da tabela (no caso desse projeto, a tabela é cliente).
Como os testes foram realizados localmente, o endereço utilizado é "http://localhost:8080".

GET 
http://localhost:8080/cliente

# Consultar registro de cliente por Id

Utilizar a requisição "GET" com parâmetro de ID.

GET 
http://localhost:8080/cliente/1

# Criar registro de cliente

Selecionar a requisição "POST", clicar em "Body" para inserir as informações. Por exemplo:

POST 
http://localhost:8080/cliente/
{
    "id": 1,
    "nome": "Renato",
    "idade": "30",
}

# Deletar registro de cliente

Escolha a opção de requisição "DELETE" e passar como parâmetro o ID do usuário.
DELETE http://localhost:8080/cliente/1


# Atualizar registro de cliente

A requisição PUT é utilizada para atualizar algum registro passando por parâmetro o ID, e as informações através do "Body"

PUT
http://localhost:8080/cliente/1

Body:
{
  "nome": "Babata",
  "idade": 31,
}





