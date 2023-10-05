//pegar pelo ID
//atribui o documento id herois para uma variavel
const getId1 = document.getElementById('herois');
console.log(getId1);

// retorna o primeiro elemento que ele encontrar
// seletor global = pegar qualquer coisa com ele
// caso haja um erro onde o log mostre diversas funcionalidades, apenas recarregue a pagina
const getId2 = document.querySelector('#heroi-um'); // é necessario identificar que é um ID com uma #
console.log(getId2);

// pegar pela class
// getElementsByClassName = ja esta especificado que pede o nome da CLASSE
const getClass1 = document.getElementsByClassName('nome')
console.log(getClass1);
console.log(getClass1[3]);
//Traz o conteudo de texto (Heroi 4)
console.log(getClass1[3].textContent)

//pegar a class pelo querySelector, porem so chama o primeiro com a classe, para chamar todos deve-se usar querySelectorAll
// para pegar a class deve-se usar "."
const getClass2 = document.querySelectorAll('.nome')
console.log(getClass2)
console.log(getClass2[3])
console.log(getClass2[3].textContent)

// É possivel alterar o conteudo que quiser 
// Heroi 4 => Mulher maravilha
getClass2[3].textContent = 'Mulher maravilha'

// pegando pela tag 
const getTag1 = document.getElementsByTagName('td')
console.log(getTag1)

//sem nenhuma representação ("#"".""[]") ele identifica uma tag
const getTag2 = document.querySelectorAll('td')
console.log(getTag2);