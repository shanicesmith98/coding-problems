"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.PriorityQueue = void 0;
class PriorityQueue {
    constructor() {
        this.queue = {};
        this.length = 0;
    }
    get getItems() {
        return this.queue;
    }
    get getLength() {
        return this.length;
    }
    add(item, priority) {
        if (this.queue.hasOwnProperty(priority)) {
            return `Priority key ${priority} already exists`;
        }
        this.queue[priority] = item;
        this.length++;
        return this.queue;
    }
    pop() {
        if (this.getLength === 0) {
            return "this queue is empty";
        }
        let priorityKeys = Object.keys(this.queue);
        priorityKeys = priorityKeys.sort((a, b) => b - a);
        const highestPriority = priorityKeys[0];
        const highestPriorityItem = this.queue[highestPriority];
        delete this.queue[highestPriority];
        this.length--;
        console.log(`${highestPriorityItem} has been removed`);
        return highestPriorityItem;
    }
}
exports.PriorityQueue = PriorityQueue;
const fruitBasket = new PriorityQueue();
fruitBasket.add("apple", '3');
fruitBasket.add("banana", '404');
fruitBasket.add("grape", '44');
fruitBasket.add("orange", '8');
fruitBasket.add("kiwi", '1');
fruitBasket.add("pineapple", '44'); // Priority key 44 already exists
fruitBasket.pop(); // banana has been removed
fruitBasket.pop(); // grape has been removed
fruitBasket.pop(); // orange has been removed
fruitBasket.pop(); // apple has been removed
fruitBasket.pop(); // kiwi has been removed
fruitBasket.pop(); // this queue is empty
