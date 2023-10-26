const tbody = document.querySelector('tbody');
const form = document.querySelector('form')
form.addEventListener('submit',(e)=>{

    //Cancealr o Submit
    e.preventDefault();

    //Recuperar os campos do Formulario e colocar em um aray
    const campos = [
        form.querySelector('#usuario'),
        form.querySelector('#email'),
        form.querySelector('#dataCadastro'),
        form.querySelector('#tipoConta')
    ];
    const tr = document.createElement('tr');
    campos.forEach(campo =>{
        const td = document.createElement('td');
        td.textContent = campo.value;
        tr.appendChild(td);
    })
    tbody.appendChild(tr);
    form.reset();

})