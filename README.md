# Trafego-app

Aplicativo criado com a intenção de unificar os quatro aplicativos atuais do tráfego, e trazer mais funcionalidades gradativmente.
## Atualizar telefones e frotas
Para atualizar tanto a lista de telefones como a lista de frotas, devemos utilizar seus respectivos métodos auxiliares, **insertFones()** e **insertFrota()**.
Esses métodos se encontram no arquivo java *InsertData*, que pode ser encontrado navegando em **Trafego-app/app/src/main/java/com/rodrigoneves/trafegometro/data/**.
## Atualizar o guia de falhas
Os dados com a lista de falhas, por sua vez, foi dividido em duas partes:
* Uma parte está localizada no método **insertFalhas()**;
* Os dados referentes à solução de cada uma das falhas porém, estão localizados no arquivo **strings.xml** 
## Nota importante sobre o banco de dados
Sempre que alterarmos algum dos valores referentes à frotas, telefones ou guia de falhas, devemos atualizar a versão do banco de dados, para que as novas informações sejam inseridas nas tabelas.
Para atualizar a versão atual do banco de dados, usamos o aquivo **Trafego-app/app/src/main/java/com/rodrigoneves/trafegometro/data/TrafegoDbHelper.java** e incrementamos o valor da constante *DATABASE_VERSION*.
