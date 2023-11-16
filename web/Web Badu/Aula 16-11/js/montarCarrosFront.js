// pegar o tbody para colocar os carros
const tbody = document.querySelector('.table-car');
console.log(tbody);

// percorer o array 
carros.forEach(carro => {
    tbody.innerHTML += `
        <tr>
            <td>${carro.marca}</td>
            <td>${carro.modelo}</td>
            <td>${carro.ano}</td>
            <td>${carro.cor}</td>
            <td>${carro.transmissao}</td>
            <td>${carro.combustivel}</td>
            <td>${fmoeda(carro.preco)}</td>
        </tr>
    
    `
});

// exibindo o total
document.querySelector('#total').textContent = fmoeda(somarEstoque(carros));