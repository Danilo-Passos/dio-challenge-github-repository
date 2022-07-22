const alunos = [
    {
    nome: 'Danilo',   
    nota: 6,
    turma: '1A'
    },
    {
    nome: 'Beatriz',
    nota: 8,
    turma: '1B'
    },
    {
    nome: 'Lucas',
    nota: 7,
    turma: '1C'
    },
    {
    nome: 'Rafael',   
    nota: 4,
    turma: '1A'
    },
    {
    nome: 'Pedro',
    nota:2,
    turma: '1B'
    },
    {
    nome: 'Ernesto',
    nota: 5,
    turma: '1C'
    }
]

function alunosAprovados(arr, media) {
    if(!arr || !media) return "Defina os alunos e a média";

    let aprovados = [];

    for(let i = 0; i < arr.length; i++) {

        //Object destructuring.
        const { nota, nome } = arr[i];

        if(nota >= media) {
            aprovados.push(nome);
        }        
    }

    return aprovados;
}

console.log(alunosAprovados(alunos, 6))