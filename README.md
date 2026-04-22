# 🚚 FiapDelivery

Sistema de logística desenvolvido como atividade prática da disciplina de **Object-Oriented Programming** da FIAP.

---

## 📋 Sobre o projeto

Refatoração de um código legado aplicando os princípios de Orientação a Objetos, corrigindo falhas de encapsulamento, herança, associação e Clean Code.

---

## 🏗️ Estrutura de classes

| Classe | Descrição |
|--------|-----------|
| `Veiculo` | Classe pai com atributos comuns a todos os veículos (placa, pesoSuportado) |
| `Caminhao` | Herda de Veiculo, adiciona quantidade de eixos |
| `Moto` | Herda de Veiculo, adiciona se possui baú |
| `Pacote` | Representa o pacote a ser entregue com código, peso e estado |
| `Rota` | Associa um Pacote a qualquer Veiculo e valida a entrega |

---

## ✅ Conceitos aplicados

- **Encapsulamento** — atributos `private` com getters/setters
- **Herança** — `Caminhao` e `Moto` extends `Veiculo`
- **Associação flexível** — `Rota` aceita qualquer `Veiculo`
- **Validação de dados** — peso negativo bloqueado no setter
- **Javadoc** — documentação nas classes principais
- **Clean Code** — nomes descritivos e métodos com responsabilidade única

---

## 🖼️ Astah
<img src="astah print.png">


#### **Raphael Mischiatti** — rm563567
