<h1>TODO List</h1>

<p>API para gerenciar tarefas (CRUD) que faz parte desse desafio para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.</p>

<h2>Tecnologias</h2>
<ul>
<li>Spring Boot</li>
<li>Spring MVC</li>
<li>Spring Data JPA</li>
<li>SpringDoc OpenAPI 3</li>
<li>Mysql</li>
<li>Práticas adotadas</li>
<li>SOLID</li> 
<li>DRY</li>
<li>API REST</li>
<li>Consultas com Spring Data JPA</li>
<li>Injeção de Dependências</li>
<li>Tratamento de respostas de erro</li>
<li>Geração automática do Swagger com a OpenAPI 3</li>
</ul>
<h2>Como Executar</h2>
<ul>
<li>Clonar repositório git</li>
<li>Construir o projeto:</li>
<li>$ ./mvnw clean package</li>
<li>Executar a aplicação:</li>
<li>$ java -jar target/todolist-0.0.1-SNAPSHOT.jar</li>
</ul>
<p>A API poderá ser acessada em localhost:8080/todos. O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html</p>

<h2>API Endpoints</h2>
<p>Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta <strong>Potsman</strong>:</p>

<h3>Criar Tarefa</h3>
<p>Selecionar método POST no <strong>Postman</strong></p>
<p>Em seu browser deve ser acessado a URL: localhost:8080/todos</p>

{
"descricao": "Desc Todo 1",
"id": 1,
"nome": "Todo 1",
"prioridade": 1,
"realizado": false
}

<h3>Listar Tarefas</h3>
<p>Selecionar método GET no Postman</p>
<p>Clicar em Send</p>

{
"descricao": "Desc Todo 1",
"id": 1,
"nome": "Todo 1",
"prioridade": 1,
"realizado": false
}

<h3>Atualizar Tarefa</h3>
<p>Selecionar método PUT no Postman</p>
<p>Clicar em Send</p>

{
"descricao": "Desc Todo 1 Up",
"id": 1,
"nome": "Todo 1 Up",
"prioridade": 2,
"realizado": false
}
<h3>Remover Tarefa</h3>
<p>Selecionar método DELETE no Postman</p>
<p>localhost:8080/1</p>
<p>Clicar em Send</p>
