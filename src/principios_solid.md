Aqui está um exercício estruturado para que os alunos apliquem os princípios **SOLID** na construção de um modelo de software.

---

# **Exercício: Aplicando os Princípios SOLID no Design de Software**

## **Contexto: Sistema de Gestão de Pedidos**
Uma empresa deseja desenvolver um sistema para gerenciar pedidos de um e-commerce. O sistema deve permitir:
- Criar e processar pedidos.
- Aplicar descontos baseados no tipo de cliente.
- Enviar notificações quando um pedido for concluído.
- Registrar os pedidos em um banco de dados.

No entanto, a empresa quer garantir que o código siga as boas práticas de design de software, aplicando os princípios **SOLID**.

## **Tarefa**
Implemente um modelo em **Java** aplicando os princípios **SOLID**, separando responsabilidades corretamente e garantindo a flexibilidade do código.

### **Requisitos**
1. **Princípio da Responsabilidade Única (SRP)**
   - O sistema **não deve ter uma classe monolítica** que gerencie tudo.
   - Cada classe deve ter **uma única responsabilidade** bem definida.

2. **Princípio Aberto-Fechado (OCP)**
   - O cálculo de descontos deve ser extensível para novos tipos de clientes sem modificar o código existente.

3. **Princípio da Substituição de Liskov (LSP)**
   - O código deve permitir substituir subclasses sem afetar o funcionamento do sistema.

4. **Princípio da Segregação de Interfaces (ISP)**
   - Interfaces devem ser bem definidas, evitando métodos que algumas classes não utilizam.

5. **Princípio da Inversão de Dependência (DIP)**
   - O sistema deve depender de **abstrações**, e não de implementações concretas.

---

## **Sugestão de Estrutura do Modelo**
Para ajudar no desenvolvimento, siga a estrutura abaixo:

1. **Classe `Pedido`**: Representa um pedido no sistema.
2. **Interface `DescontoStrategy` e Implementações (`DescontoClienteComum`, `DescontoClienteVip`)**: Define regras de desconto baseadas no tipo de cliente.
3. **Interface `Notificador` e Implementações (`EmailNotificador`, `SmsNotificador`)**: Permite o envio de notificações por e-mail ou SMS.
4. **Classe `PedidoRepository`**: Responsável por salvar pedidos no banco de dados.
5. **Classe `ProcessadorDePedidos`**: Gerencia a criação e finalização de pedidos, utilizando os serviços de desconto e notificação.

---

## **Critérios de Avaliação**
✔ **Organização do código** – Cada classe deve ter uma única responsabilidade.  
✔ **Uso correto dos princípios SOLID** – Aplicação dos cinco princípios no design do sistema.  
✔ **Flexibilidade e Extensibilidade** – O modelo deve permitir adicionar novos tipos de desconto e notificadores sem precisar modificar o código existente.  
✔ **Clareza e boas práticas** – Código bem estruturado, de fácil leitura e manutenção.  

---

## **Desafio Extra (Opcional)**
Caso o aluno queira um desafio extra, ele pode adicionar **meios de pagamento** (cartão, boleto, Pix) usando o mesmo conceito de estratégias.

---

### **O que o aluno deve entregar?**
- Código-fonte do sistema em **Java**, seguindo os princípios SOLID.
- (Opcional) Diagrama UML simples mostrando a estrutura das classes.

---
