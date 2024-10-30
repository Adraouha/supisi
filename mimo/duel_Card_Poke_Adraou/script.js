const pokemonNames = [
    "Pikachu", "Charizard", "Squirtle", "Bulbasaur", "Jigglypuff", "Meowth", "Psyduck", "Snorlax"
];

document.getElementById('start-game').addEventListener('click', setupGame);
document.getElementById('draw-button').addEventListener('click', drawCards);

function setupGame() {
    const numPlayers = parseInt(document.getElementById('num-players').value);
    const gameContainer = document.getElementById('game-container');
    gameContainer.innerHTML = '';
    
    for (let i = 1; i <= numPlayers; i++) {
        const playerDiv = document.createElement('div');
        playerDiv.classList.add('player');
        playerDiv.id = `player${i}`;
        playerDiv.innerHTML = `
            <h2>Jugador ${i}</h2>
            <div class="hand" id="player${i}-hand"></div>
        `;
        gameContainer.appendChild(playerDiv);
    }

    document.getElementById('draw-button').style.display = 'block';
}

function drawCards() {
    const numPlayers = parseInt(document.getElementById('num-players').value);
    const resultDiv = document.getElementById('result');
    resultDiv.innerHTML = '';

    const hands = [];
    for (let i = 1; i <= numPlayers; i++) {
        const playerHand = document.getElementById(`player${i}-hand`);
        playerHand.innerHTML = '';
        const card = drawCard();
        playerHand.appendChild(card);
        hands.push(card);
    }

    determineWinner(hands);
}

function drawCard() {
    const cardValue = Math.floor(Math.random() * 100) + 1;
    const cardName = pokemonNames[Math.floor(Math.random() * pokemonNames.length)];
    const card = document.createElement('div');
    card.classList.add('card');
    card.innerHTML = `
        <div class="pokemon-name">${cardName}</div>
        <div class="pokemon-value">${cardValue}</div>
    `;
    card.dataset.value = cardValue;
    return card;
}

function determineWinner(cards) {
    let max = 0;
    let winners = [];
    cards.forEach((card, index) => {
        const value = parseInt(card.dataset.value);
        if (value > max) {
            max = value;
            winners = [`Jugador ${index + 1}`];
        } else if (value === max) {
            winners.push(`Jugador ${index + 1}`);
        }
    });

    const resultDiv = document.getElementById('result');
    if (winners.length > 1) {
        resultDiv.textContent = `¡Es un empate entre ${winners.join(', ')}!`;
    } else {
        resultDiv.textContent = `¡${winners[0]} gana!`;
    }
}
