//Formatação regional

function formatarMoeda(preco){
    // criar um objeto de Internacionalização
    const valorFormatado = new Intl.NumberFormat('pt-BR', {
        style: 'currency',
        currency: 'BRL'
    }).format(preco);
    return valorFormatado;
}