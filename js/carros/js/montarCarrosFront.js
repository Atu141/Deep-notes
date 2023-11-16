// pegar o tbody para colocar os carros
const tbody = document.querySelector(".table-car");
console.log(tbody);

//percorre o array carros pelo numero de inidices, "carro" foi um nome criado na hora, ja que no arquivo, os parametros não possuem nome
carros.forEach(carro => {

    //adiciona dentro do codigo html o <tr></tr> e o <td></td> como o indice e seu parametro
    tbody.innerHTML += `
        <tr>
           <td>${carro.marca}</td> 
           <td>${carro.modelo}</td> 
           <td>${carro.ano}</td> 
           <td>${carro.cor}</td> 
           <td>${carro.transmissao}</td> 
           <td>${carro.combustivel}</td> 
           <td>${formatarMoeda(carro.preco)}</td> 
        </tr>

    `
});

// exibindo o total do estoque

document.querySelector("#total").textContent = formatarMoeda(somarEstoque(carros))
