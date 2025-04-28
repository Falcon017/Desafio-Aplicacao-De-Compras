Este projeto em Java simula o uso de um cartão de crédito, permitindo que o usuário registre compras até atingir o limite disponível. A aplicação é dividida em três classes principais:

Principal: gerencia a interação com o usuário, solicitando o limite do cartão, registrando compras e exibindo um resumo final com os produtos comprados, valores e o saldo restante.

Compra: representa cada compra feita, contendo o nome do produto e o valor. Implementa a interface Comparable para que as compras possam ser ordenadas por valor.

CartaoDeCredito: armazena o limite e o saldo atual do cartão, além de uma lista de compras. Possui métodos para lançar novas compras e verificar se há saldo suficiente.

Ao final, o sistema exibe todas as compras feitas em ordem crescente de valor, o total gasto e o saldo disponível. O projeto utiliza boas práticas de orientação a objetos e validação de dados.
