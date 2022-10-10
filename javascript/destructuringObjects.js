const character = {
  name: 'Carol Danvers',
  superHeroName: 'Captain Marvel',
  birthPlace: 'Earth',
  occupation: 'Air Force Pilot',
  team: {
    allies: 'The Avengers',
    rivals: 'Thanos'
  },
  species: 'Human-Kree'
};

const { name, superHeroName, birthPlace, occupation, team: { allies, rivals }, species } = character;

console.log(`${superHeroName}, also known as ${name}, came from ${birthPlace} as a ${species} ${occupation} to save the world from ${rivals} with the help from her friends ${allies}.`);

// Captain Marvel, also known as Carol Danvers, came from Earth as a Human-Kree Air Force Pilot to save the world from Thanos with the help from her friends The Avengers.
