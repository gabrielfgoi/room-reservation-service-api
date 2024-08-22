# Room Reservation Service API

## Descrição

Este projeto é uma API para reserva de salas, desenvolvida como um exercício de aprendizado e estudo. A aplicação permite a criação, leitura, atualização e exclusão de reservas de salas. A implementação utiliza uma combinação de tecnologias modernas para fornecer uma solução robusta e eficiente.

## Tecnologias Utilizadas

### 1. **Java**

Java foi escolhido como a linguagem principal do projeto devido à sua robustez, escalabilidade e vasta gama de bibliotecas e frameworks disponíveis. A API foi desenvolvida utilizando Java para garantir uma base sólida e confiável.

### 2. **Spring Framework**

O Spring Framework é utilizado para gerenciar a infraestrutura da aplicação, oferecendo suporte a injeção de dependências, configuração baseada em anotações e gerenciamento de transações. O Spring Boot simplifica a configuração e o desenvolvimento, permitindo que a API seja executada rapidamente com uma configuração mínima.

### 3. **JDBC**

JDBC (Java Database Connectivity) foi usado para a comunicação com o banco de dados MySQL. Ele fornece uma API padrão para interagir com bases de dados relacionais, garantindo que a aplicação possa executar operações de CRUD (Create, Read, Update, Delete) de maneira eficiente e segura.

### 4. **MySQL**

O MySQL é o sistema de gerenciamento de banco de dados relacional utilizado para armazenar dados da aplicação. Ele foi escolhido por sua popularidade, estabilidade e suporte a operações de alta performance.

### 5. **JUnit 4**

JUnit 4 é a biblioteca utilizada para testes unitários. Ela ajuda a garantir que a lógica de negócios da aplicação está funcionando corretamente e permite a identificação de problemas durante o desenvolvimento.

### 6. **Mockito**

Mockito é uma biblioteca de mocking utilizada para criar objetos simulados e testar interações entre componentes de forma isolada. É fundamental para garantir que os testes unitários sejam independentes e confiáveis.

### 7. **Docker**

Docker é utilizado para containerizar a aplicação e o banco de dados MySQL. Com o Docker, a aplicação pode ser executada em qualquer ambiente que suporte contêineres, garantindo consistência e facilidade de configuração. 

- **Docker para MySQL:** Um contêiner Docker é utilizado para executar o MySQL, o que simplifica a configuração e o gerenciamento do banco de dados.

## Motivação

O principal objetivo deste projeto é o estudo e aprimoramento das habilidades de desenvolvimento com Java, Spring, JDBC e outras tecnologias relacionadas. A escolha dessas tecnologias foi baseada em seu valor educacional e sua relevância no mercado de trabalho. O projeto oferece uma oportunidade prática para experimentar com essas ferramentas e entender como elas podem ser usadas para construir aplicações web robustas.

## Configuração

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/gabrielfgoi/room-reservation-service-api.git
