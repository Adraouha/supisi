function convert() {
    const resultElement = document.getElementById('resultElement');
    const inputValue = document.getElementById('userInput').value;
    const unit = document.getElementById("unit").value;    
    const milesToKm = unit === 'milesToKm';
    let result = 0;
    let resultString = '';

    if (milesToKm) {
        result = inputValue * 1.60934;
    } else {
        result = inputValue / 1.60934;
    }

    resultString = inputValue + " miles are " + result + " km";
    resultElement.innerHTML = resultString;

    console.log(resultString);
}
