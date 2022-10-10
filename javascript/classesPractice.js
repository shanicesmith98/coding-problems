// we can import and export code to reference and reuse in external files!
export class Character {
	constructor(age, job, fandom) { // is the "blueprint" for creating instances of Character class
		this.age = age;
		this.job = job;
		this.fandom = fandom;
   	 }
  
  	doSomething(age) {
 		this.age >= 18 ? console.log(`You're of age .. Be a hero and save the world!`) : console.log(`You're only ${this.age} .. Have a safe day at school!`);
    	} 
  
  	get metaData() { // function to get data
  		return `Age: ${this.age}, Job: ${this.job}, Fandom: ${this.fandom}`;
  	}
  
}

export class Hero extends Character { // inherits everything from Character class
	constructor(age, job, fandom, weapon) {
    		super(age, job, fandom, weapon); // calls constructor properties from Character class (Parent class)
      		this.weapon = weapon; // new property inside Hero class
    	}
}

/***** Page Break *****/

import { Character } from './character.mjs';
import { Hero } from './character.mjs';

let peterParker = new Character(17, 'Student', 'Marvel'); // creates instance of Character class
let jasonTodd = new Character(20, 'Vigilante', 'DC');

console.log(peterParker.metaData);
console.log(jasonTodd.metaData); // displays properties or metadata of instance

peterParker.doSomething();
jasonTodd.doSomething();

let tonyStark = new Hero(48, 'Engineer', 'Marvel', 'Repulsor Rays');

console.log(tonyStark.metaData);
tonyStark.doSomething();
