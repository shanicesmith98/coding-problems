// Problem: Given an integer array, return an array of missing numbers from the sequence

const findMissingNums = (arr) => {
    const NUMBERS = [1, 2, 3, 4, 5, 6, 7, 8, 9];
    if (arr.length === 0) return NUMBERS;
    
    const arrSet = new Set(arr);
    let answer = [];
    for (let i = 0; i < NUMBERS.length; i++) {
        if (!arrSet.has(NUMBERS[i])) answer.push(NUMBERS[i]);
    }
    return answer;  
};

console.log(findMissingNums([])); // [ 1, 2, 3, 4, 5, 6, 7, 8, 9 ]
console.log(findMissingNums([1, 3, 9])); // [ 2, 4, 5, 6, 7, 8 ]
console.log(findMissingNums([2, 3, 4, 5, 6, 7, 8, 9])); // [ 1 ]
console.log(findMissingNums([1, 2, 6, 7, 8])); // [ 3, 4, 5, 9 ]
console.log(findMissingNums([1, 2, 3, 4, 5, 6, 7, 8, 9])); // []
