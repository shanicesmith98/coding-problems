let marvelCharacters = ['Captain Marvel'];

let captainMarvelCharacters = [...marvelCharacters, 'Maria Rambeau']; // spread operator creates a new array, NOT a reference!

marvelCharacters.push('Captain America', 'Black Pantner', 'Hawkeye'); // adds to marvel character array only

console.log(marvelCharacters); // ["Captain Marvel", "Maria Rambeau"]
console.log(captainMarvelCharacters); ["Captain Marvel", "Captain America", "Black Pantner", "Hawkeye"]

let owner = {
  name: 'Bob Belcher'
};

let employee = {
  ...owner,
  salary: 30000,
  position: 'Lead Cook',
  hasHealthCare: true
};

console.log(employee); // has all the properties of owner + employee 
