/* 
Problem: Write a function that receives two strings and returns the number of characters we would need to rotate the first string forward to match the second.
*/

const shiftedDiff = (first, second) => {
  if (first === second) return 0; // no rotation of characters
  let secondArr = [...second]; // split second string into array
  let i = 0;
  
  for (const char of first) { // for each char of first string
    if (first === secondArr.join('')) return i; // if first equals second return count
    secondArr.push(secondArr.shift()); // push first char of second string to the back
    i++; // increases count
  }
  
  return -1; // second string isn't a valid rotation of the first string

};
