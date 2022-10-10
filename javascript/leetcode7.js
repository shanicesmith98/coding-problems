// Leetcode 7. Reverse Integer
// Task: Given a 32-bit signed integer, reverse digits of an integer.

var reverse = function(x) {
    // parseInt returns Integer
    // to String changes int to String
    // split divides string into char array
    // reverse is an array method to reverse order of array values
    // join combines array values together back to string
    // math.sign method returns 1 or -1 depending if the int is positive or negative
    
    let reversed = parseInt(x.toString().split('').reverse().join('')) * Math.sign(x);
    
    // int limit of 2147483648 OR -2147483648 returns 0
    if (reversed >= Math.pow(2,31) || reversed <= Math.pow(-2,31))
        return 0;
    
    return reversed;
};
