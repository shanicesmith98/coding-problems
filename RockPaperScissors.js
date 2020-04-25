const getUserInput = userInput => {
  userInput = userInput.toLowerCase();
  if (userInput === 'rock' || userInput === 'paper' || userInput === 'scissors' || userInput === 'bomb') {
    return userInput;
  }
  else {
    console.log("Error move!");
  }
};

const getComputerChoice = () => {
  let randomNumber = Math.floor(Math.random() * 3);
  switch (randomNumber) {
    case 0:
      return 'rock';
    case 1:
      return 'paper';
    case 2:
      return 'scissors';
  }
};

const determineWinner = (userChoice, computerChoice) => {
  if (userChoice == computerChoice) {
    return 'It\'s a tie!';
  }

  if (userChoice == 'rock') {
    if (computerChoice == 'paper') {
      return 'Computer wins';
    }
    else {
      return 'You won';
    }
  }

  if (userChoice == 'paper') {
    if (computerChoice == 'scissors') {
      return 'Computer wins';
    }
    else {
      return 'You won';
    }
  }

  if (userChoice == 'scissors') {
    if (computerChoice == 'rock') {
      return 'Computer wins';
    }
    else {
      return 'You won';
    }
  }

  if (userChoice == 'bomb') {
    return 'You won';
  }
  /*else if (computerChoice == 'bomb') {
    return 'Computer wins';
  }*/
};

const playGame = () => {
  const userChoice = getUserInput('scissors');
  const computerChoice = getComputerChoice();

  console.log(userChoice);
  console.log(computerChoice);

  console.log(determineWinner(userChoice, computerChoice));
};

playGame();
