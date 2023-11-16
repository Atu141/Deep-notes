function somarEstoque(carros) {
    const totalEstoque = carros.reduce((acumulador, carro) => acumulador + carro.preco, 0)
    return totalEstoque
}