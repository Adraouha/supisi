// Questions array
var questions = [
    "What planet is known as the 'Red Planet'?",
    "Who painted the Mona Lisa?"
];

// Choices array for the questions
var choicesArray = [
    ["Earth", "Mars", "Jupiter", "Saturn"],
    ["Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet"]
];

// Correct answers array
var correctAnswers = ["Mars", "Leonardo da Vinci"];

// Variable to keep track of the current question index
var currentQuestionIndex = 0;

// Variable to keep track of the score
var score = 0;

// Function to display the current question and choices
function displayQuestion() {
    if (currentQuestionIndex < questions.length) {
        var questionElement = document.getElementById("question");
        questionElement.innerHTML = questions[currentQuestionIndex];

        for (let i = 0; i < choicesArray[currentQuestionIndex].length; i++) {
            const btn = document.getElementById("choice" + (i + 1));
            btn.innerHTML = choicesArray[currentQuestionIndex][i];
            btn.value = choicesArray[currentQuestionIndex][i];
            btn.disabled = false; // Re-enable buttons for new question
        }
    } else {
        var resultElement = document.getElementById("result");
        resultElement.innerHTML = "Your final score is: " + score;

        // Remove the question and choices
        document.getElementById("question").innerHTML = "";
        document.getElementById("choices").innerHTML = "";
    }
}

// Function to check the answer
function checkAnswer(button) {
    if (button.value === correctAnswers[currentQuestionIndex]) {
        score++;
    }

    currentQuestionIndex++;
    displayQuestion();
}

// Call the displayQuestion function to ensure it works
displayQuestion();

