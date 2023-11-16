function fmoeda(preco){
// criar obj de internaciolização
    const valorFormatado = new Intl.NumberFormat('pt-BR', {
        style: 'currency', 
        currency: 'BRL'
    }) .format(preco);
    return valorFormatado;
}