# 📱 Desafio de projeto iPhone da DIO - Bootcamp Santander

Este projeto simula um iPhone utilizando os princípios da Programação Orientada a Objetos em Java, com foco no uso de **interfaces** e **implementação múltipla**.

## 🚀 Funcionalidades

O sistema representa um iPhone com 3 módulos principais:

### 🎵 Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### 📞 Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### 🌐 Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## 🧩 Estrutura do Projeto

- **Interfaces**: definem os comportamentos genéricos de cada funcionalidade.
  - `ReprodutorMusical`
  - `AparelhoTelefonico`
  - `NavegadorInternet`

- **Classe `Iphone`**: implementa as três interfaces e fornece a lógica de funcionamento dos métodos.

## ✅ Conceitos aplicados
- Programação Orientada a Objetos (POO)
- Interfaces
- Implementação múltipla
- Organização de responsabilidades por função
