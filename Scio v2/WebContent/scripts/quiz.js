const questionEl = document.querySelector('.survey-question')
const surveyNumEl = document.querySelector('.survey-num')
const choicesEl = document.querySelector('.choices')
const buttonEl = document.querySelector('.nav-buttons')
const containerEl = document.querySelector('.container-fluid')


const survey = [
    {
        id: 1,
        question: 'Quais dessas alternativas não se refere à crase?',
        choices: ['Crase é a junção da preposição “a” com o artigo definido “a(s)”.', 'a fusão das vogais “a” representada por um acento grave.', 'Junção da preposição “a” com as iniciais dos pronomes demonstrativos aquela(s), aquele(s), aquilo ou com o pronome relativo a qual (as quais).', 'Uma classe de palavras invariável que liga dois elementos da oração.'],
        correctAnswer: 'Uma classe de palavras invariável que liga dois elementos da oração.',
        answer: null
    },
    {
        id: 2,
        question: 'Indique a opção em que o uso da crase está errado:',
        choices: ['À noite tudo estará resolvido. Obrigada!', 'O trabalho foi realizado graças à todos nós.', 'Amanhã meus primos chegarão às 16h.', 'Você foi à festa de Natal da empresa?'],
        correctAnswer: 'O trabalho foi realizado graças à todos nós.',
        answer: null
    },
    {
        id: 3,
        question: 'Tendo como base a frase 1 e a frase 2, assinale a opção correta. 1) Milena deu o livro a minha mãe. 2) Milena deu o livro à minha mãe.',
        choices: ['Apenas a frase 1 está correta.', 'Apenas a frase 2 está correta.', 'Ambas as frases estão corretas.', 'Nenhuma está correta'],
        correctAnswer: 'Ambas as frases estão corretas.',
        answer: null
    },
    {
        id: 4,
        question: 'Assinale a alternativa em que o a deve receber acento indicativo de crase.',
        choices: ['Você deu essa informação a alguém?', 'Vale a pena essa confusão toda?', 'O diretor deu novas indicações a secretária.', 'É possível combinarmos um pagamento a prazo?'],
        correctAnswer: 'O diretor deu novas indicações a secretária.',
        answer: null
    },
    {
        id: 5,
        question: 'Identifique a opção em que o uso da crase está incorreto.',
        choices: ['Eles apenas chegarão às 21h.', 'Eles apenas chegarão após às 21h.', 'Eles apenas chegarão à noite.'],
        correctAnswer: 'Eles apenas chegarão após às 21h.',
        answer: null
    },
    {
        id: 6,
        question: 'Assinale a opção em que o uso da crase está correto.',
        choices: ['Os apoios financeiros foram concedidos à pessoas desempregadas.', 'Os apoios financeiros foram concedidos às pessoas desempregadas.'],
        correctAnswer: 'Os apoios financeiros foram concedidos às pessoas desempregadas.',
        answer: null
    }
]


const surveyState = {
    currentQuestion: 1
}


const navigateButtonClick = (e) => {
    if(e.target.id == 'next') {
        surveyState.currentQuestion++
        initialSurvey()
    }

    if(e.target.id == 'prev') {
        surveyState.currentQuestion--
        initialSurvey()
    }
}

const checkBoxHandler = (e, question) => {    
    //Check if the chekbox has selected before if it is remove selected
    if(!e.target.checked) {
        e.target.checked = false
        question.answer = null
        return
    }
    
    const allCheckBoxes = choicesEl.querySelectorAll('input')
    allCheckBoxes.forEach(checkBox => checkBox.checked = false)
    e.target.checked = true
    question.answer = e.target.value    
}

const getResults = () => {
    const correctAnswerCount = survey.filter(question => question.answer == question.correctAnswer).length
    const emptyQuestionCount = survey.filter(question => question.answer === null).length
    const wrongQuestionCount = survey.filter(question => question.answer !== null && question.answer != question.correctAnswer).length


    return {
        correct: correctAnswerCount,
        empty: emptyQuestionCount,
        wrong: wrongQuestionCount
    }
}


const renderQuestion = (question) => {    
    //Last question of survey
    const lastQuestion = survey[survey.length - 1]

    //Check if the all questions are answered if then insert some message
    if(surveyState.currentQuestion > lastQuestion.id) {
        const results = getResults()
        containerEl.innerHTML = `<h1 class="test-completed">Parabéns! Você completou o quiz de memorização</h1>
        <p class="results-info"> Você fez <strong>${results.correct}</strong> corretas, <strong>${results.wrong}</strong> erradas, <strong>${results.empty}</strong> sem resposta</p>                        
        <span class="tick"></span>`
        return
                                
    }

    // Clean innerHTML before append
    surveyNumEl.innerHTML = ''
    choicesEl.innerHTML = ''
    buttonEl.innerHTML = ''
    // Render question and question id
    surveyNumEl.textContent = question.id + '-'
    questionEl.textContent = question.question
    // Render choices
    question.choices.forEach(choice => {
        const questionRowEl = document.createElement('p')
        questionRowEl.setAttribute('class','question-row')
        questionRowEl.innerHTML = `<label class="label">                                        
                                        <span class="choise">${choice}</span>
                                    </label>`
        //Create checkbox input
        const checkBoxEl = document.createElement('input')
        checkBoxEl.setAttribute('type', 'checkbox')
        // Bind checkboxHandler with event and current question
        checkBoxEl.addEventListener('change', (e) => checkBoxHandler(e, question))
        //Add answer to the input as a value
        checkBoxEl.value = choice
        //If question has answer already make it checked again
        if(question.answer === choice) {
            checkBoxEl.checked = true
        }
        //Insert into question row
        questionRowEl.firstChild.prepend(checkBoxEl)
        //Insert row to the wrapper
        choicesEl.appendChild(questionRowEl)                                    
    })

    //Next & Previous Buttons
    const prevButton = document.createElement('button')
    prevButton.classList.add('nav-button')
    prevButton.classList.add('prev')
    prevButton.id = 'prev'
    prevButton.textContent = 'Voltar'
    prevButton.addEventListener('click', navigateButtonClick)

    const nextButton = document.createElement('button')
    nextButton.classList.add('nav-button')
    nextButton.classList.add('next')
    nextButton.id = 'next'
    nextButton.textContent = 'Próxima'
    nextButton.addEventListener('click', navigateButtonClick)



    //Display buttons according to survey current question
    if(question.id == 1){        
        buttonEl.appendChild(nextButton)
    } else if (surveyState.currentQuestion == lastQuestion) {
        buttonEl.appendChild(prevButton)
    } else {
        buttonEl.appendChild(prevButton)
        buttonEl.appendChild(nextButton)
    }   
    
}

const initialSurvey = () => {
    //Get the current question
    const currentQuestion = survey.find(question => question.id === surveyState.currentQuestion)
    // Render the currentQuestion
    renderQuestion(currentQuestion)    

}

initialSurvey()
