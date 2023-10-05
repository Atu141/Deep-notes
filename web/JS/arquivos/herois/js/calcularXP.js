//Pegando botao do HTML
const botao = document.querySelector('#calcular');
console.log(botao);

// atribuir um escutador de eventos - click 
// quando clicar, chamara a função
// () => arrow function
// nao possui call back
botao.addEventListener('click', () => {
    
    //buscando herois
    const herois = document.querySelectorAll('.heroi');
    console.log(herois)

    //usando forEach para percorrer um Array
    herois.forEach(heroi => {
        const forca = Number(heroi.querySelector('.forca').textContent)
        const velocidade = Number(heroi.querySelector('.velocidade').textContent)
        const agilidade = Number(heroi.querySelector('.agilidade').textContent)
        const xpFinal = (Math.floor((forca + velocidade + agilidade)/3));

        heroi.querySelector('.xp').textContent = xpFinal

        if(xpFinal < 80){
            //acessa a lista de classes da CSS
            heroi.classList.add('bg-danger', 'text-light', 'fs-5')
        }
    })



})