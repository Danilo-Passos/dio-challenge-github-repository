function compararNumeros(num1, num2) {
    if (!num1 || !num2) return 'Defina os dois números!';

    const frase1 = criarFrase1(num1, num2);
    const frase2 = criarFrase2(num1, num2);
    
    return `${frase1} ${frase2}`;
}

function criarFrase1(num1, num2) {
    let frase1 = `Os números ${num1} e ${num2}`;
    let simNao = 'não';

    if (num1 === num2){
        simNao = '';
    }

    return `${frase1} ${simNao} são iguais`;
}

function criarFrase2(num1, num2) {
    const soma = num1 + num2;
    let comparaDez = 'menor';
    let comparaVinte = 'menor';

    if (soma > 10) {
        comparaDez = 'maior';
    }

    if  (soma > 20) {
        comparaVinte = 'maior';
    }

    return `\nSua soma é ${soma}.\nQue é ${comparaDez} do que 10.\nE ${comparaVinte} do que 20.`;
}

console.log(compararNumeros(1, 2));

