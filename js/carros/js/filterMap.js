// usando filter() para trazer todos os carros vermelhos
// so funciona com arrow function
const carroCor = carros.filter(carro => carro.cor.toLowerCase() === 'vermelho')

console.log(carroCor);

//usando o map para dar o desconto de 50% nos carros

const carrosDesconto = carros.map(carro => carro.preco * .5)
console.log(carrosDesconto);