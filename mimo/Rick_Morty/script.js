// Function to fetch data from the Rick and Morty API
async function fetchCharacters() {
  try {
    const response = await fetch('https://rickandmortyapi.com/api/character')
      .then(response => response.json())
      .then(data => {
        const charactersContainer = document.getElementById(
          "characters-container");
        charactersContainer.innerHTML = ""; // Clear existing content
        
        data.results.forEach(character => {
          const card = document.createElement("div");
          card.className = "card";
          
          card.innerHTML = `
                        <img src="${character.image}" alt="${character.name}" class="character-image">
                        <p class="character-detail"><span class="attribute">Name:</span> ${character.name}</p>
                        <p class="character-detail"><span class="attribute">Status:</span> ${character.status}</p>
                        <p class="character-detail"><span class="attribute">Species:</span> ${character.species}</p>
                    `;
          
          charactersContainer.appendChild(card);
        });
        return data.results; // Extract character data
      });
    return response;
  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

// Call the fetchCharacters function to ensure it works
fetchCharacters();