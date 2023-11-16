// usando o filter() para trazer para tazer todos os carros
const carrosCor = carros.filter(carro => carro.cor.toLowerCase() === 'vermelho');
console.log(carrosCor);

// Usando o map para dar desconto de 50% nos carros
const carrosDesc = carros.map(carro => carro.preco *.5);  
console.log(carrosDesc);