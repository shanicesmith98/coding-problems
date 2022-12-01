"use strict";
class PriorityQueue {
    constructor() {
        this.queue = {};
        this.length = 0;
    }
    get getItems() {
        console.log(this.queue);
        return;
    }
    get getLength() {
        return this.length;
    }
    add(item, priority) {
        if (this.queue.hasOwnProperty(priority)) {
            console.log(`Priority key ${priority} already exists`);
            return;
        }
        this.queue[priority] = item;
        this.length++;
        return this.queue;
    }
    pop() {
        if (this.getLength === 0) {
            console.log("this queue is empty");
            return;
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
