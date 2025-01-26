# Projeto taxis Viajem

Conteudo feito para atender a solicitação do RH Santander.

Criado duas tabelas tb_viagem e tb_usuario com spring Boot.

Utilzei o banco H2 Console.

# Criei um arquivo de Teste "application-test.properties",
 //H2 Connection
 
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

// H2 Client
 
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

 //Show SQL
 
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# insert into tb_viagem.
INSERT INTO tb_viagem (id_viagem, id_passageiro, id_motorista, id_cidade, status_viagem, data_solic_viagem) VALUES
(1, 1, 10, 1, 'CONCLUIDA', '2024-10-01'),
(2, 2, 11, 1, 'CANC_MOTORISTA', '2024-10-01'),
(3, 3, 12, 6, 'CONCLUIDA', '2024-10-01'),
(4, 4, 13, 6, 'CANC_MOTORISTA', '2024-10-01'),
(5, 1, 10, 1, 'CONCLUIDA', '2024-10-02'),
(6, 2, 11, 6, 'CONCLUIDA', '2024-10-02'),
(7, 3, 12, 6, 'CONCLUIDA', '2024-10-03'),
(8, 2, 12, 12, 'CONCLUIDA', '2024-10-03'),
(9, 3, 12, 12, 'CONCLUIDA', '2024-10-03'),
(10, 4, 13, 12, 'CANC_MOTORISTA', '2024-10-03');

# insert into tb_usuario.
INSERT INTO tb_usuario (id_Usuario, lista_Bloqueio, tipo_Usuario) VALUES
(1, 'NAO', 'passageiro'),
(2, 'SIM', 'passageiro'),
(3, 'NAO', 'passageiro'),
(4, 'NAO', 'passageiro'),
(10, 'NAO', 'motorista'),
(11, 'NAO', 'motorista'),
(12, 'NAO', 'motorista'),
(13, 'NAO', 'motorista');

# Visualização das duas Tabelas
![image](https://github.com/user-attachments/assets/8e6c276e-07f1-41c1-a73f-26c0cdd71fd7)

# Condição

A taxa de cancelamento é calculada dividindo o número de solicitações de viagem canceladas (por passageiro
ou motorista) com usuários que não estão na lista de bloqueio pelo número total de solicitações com usuários
fora da lista de bloqueio naquele dia.
Escreva uma solução para encontrar a taxa de cancelamento de solicitações com usuários fora da lista de
bloqueio (tanto o passageiro quanto o motorista não devem estar na lista de bloqueio) durante todos os dias
entre "01/10/2024" e "03/10/2024".
Arredondar a taxa de cancelamento para duas casas decimais

# Resposta
![image](https://github.com/user-attachments/assets/7c023660-bdf0-426c-b689-6f83912e6f4c)

# Explicação

Em 01/10/2024:
 - Foram 4 solicitações de viagens no total, sendo 2 canceladas.
 - Porém a viagem com Id=2 foi feita por um cliente da lista de bloqueio (idUsuario =2), portanto é ignorada no
cálculo.
 - Portanto, existem 3 solicitações de viagens de usuários fora da lista de bloqueio no total, das quais uma foi
cancelada.
 - A Taxa de Cancelamento é (1/3) = 0,33
Em 02/10/2014:
 - Foram 3 solicitações no total, das quais 0 foram canceladas.
 - A requisição com Id=6 foi feita por um cliente da lista de bloqueio, portanto é ignorada.
 - Portanto, há 2 solicitações de usuários fora lista de bloqueio no total, 0 das quais foram canceladas.
 - A Taxa de Cancelamento é (0/2) = 0,00
Em 03/10/2024:
 - Foram 3 solicitações no total, sendo 1 cancelada.
 - A solicitação com Id=8 foi feita por um cliente da lista de bloqueio, portanto é ignorada.
 - Portanto, há 2 solicitações fora da lista de bloqueio no total, 1 das quais foi cancelada.
 - A Taxa de Cancelamento é (1/2) = 0,50




