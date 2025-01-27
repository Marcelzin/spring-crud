# Sistema de Gerenciamento de Tarefas (ToDo List)

[![Status do Projeto](https://img.shields.io/badge/status-MVP-blue)]()  
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-green)]()  
[![Render](https://img.shields.io/badge/Live%20Demo-Render-orange)](https://spring-crud-2pnd.onrender.com)

## 🌟 Visão Geral
Este projeto é um **MVP simples** desenvolvido com o objetivo de demonstrar conhecimentos técnicos em **Java**, **Spring Boot** e tecnologias relacionadas.  
A aplicação é uma ToDo List funcional, permitindo criar, visualizar, editar e excluir tarefas (CRUD completo).  

**🔗 Acesse a aplicação online:** [Sistema de Gerenciamento de Tarefas](https://spring-crud-2pnd.onrender.com)

---

## ⚙️ Tecnologias Utilizadas

### **Backend**
- **Java 17**: Linguagem de programação principal.
- **Spring Boot 3.2.3**: Framework para desenvolvimento ágil.
  - Spring Web: Desenvolvimento de APIs REST.
  - Spring Data JPA: Persistência de dados.
  - Spring DevTools: Ferramentas para desenvolvimento rápido.
- **Lombok**: Redução de código boilerplate.
- **Microsoft SQL Server**: Banco de dados relacional.

### **Frontend**
- **Thymeleaf**: Engine de templates para renderização server-side.
- **Bootstrap 5**: Framework CSS para design responsivo.
- **jQuery**: Manipulação do DOM.
- **DataTables**: Tabelas dinâmicas e interativas.
- **SweetAlert2**: Alertas e modais personalizados.

### **Infraestrutura**
- **Docker**: Containerização do projeto.
  - Multi-stage build para otimização.
  - Imagem base: Ubuntu (build) e OpenJDK 17 Slim (produção).
- **Maven**: Gerenciamento de dependências e build.

---

## 🛠️ Funcionalidades
- **Listagem de Tarefas**: Com paginação e busca dinâmica.
- **Criação de Tarefas**: Adicione novas tarefas.
- **Edição de Tarefas**: Atualize as informações das tarefas existentes.
- **Exclusão de Tarefas**: Remova tarefas do sistema.
- **Marcação de Conclusão**: Marque tarefas como concluídas.
- **Interface Responsiva**: Design moderno e intuitivo.

---

## 🚀 Como Executar Localmente

### Pré-requisitos
- **Java 17** ou superior.
- Banco de dados **SQL Server**.

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/Marcelzin/spring-crud.git
   cd spring-crud
Configure as credenciais do banco de dados no arquivo application.properties.

Execute a aplicação:

git bash

./mvnw spring-boot:run
Acesse a aplicação em http://localhost:8081.

Autor: Marcel Pereira
LinkedIn: linkedin.com/in/marcelpds
