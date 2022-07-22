const pessoa1 = {
    nome: 'Beatriz',
    idade: 30
}

const pessoa2 = {
    nome: 'Danilo',
    idade: 28
}

const pessoa3 = {
    nome: 'Diego',
    idade: 30
}

const animal = {
    nome: 'Nino',
    idade: 5,
    raca: 'Pug'
}

function calculaIdade(anos) {
    if(!anos) return 'Defina a pessoa e os anos'

	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

console.log(calculaIdade.apply(pessoa1, [23]))