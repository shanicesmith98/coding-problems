export interface PriorityQueue {
    queue: {
        [key: string]: string;
    };
    length: number;
}

export class PriorityQueue {
    constructor() {
        this.queue = {};
        this.length = 0;
    }

    public get getItems(): object {
        return this.queue;
    }

    private get getLength(): number {
        return this.length;
    }

    public add(item: string, priority: string): object | string {
        if (this.queue.hasOwnProperty(priority)) {
            return `Priority key ${priority} already exists`;
        }
        this.queue[priority] = item;
        this.length++;
        return this.queue;
    }

    public pop(): string {
        if (this.getLength === 0) {
            return "this queue is empty";
        }

        let priorityKeys: string[] = Object.keys(this.queue);
        priorityKeys = priorityKeys.sort((a: any, b: any) => b - a);

        const highestPriority = priorityKeys[0];
        const highestPriorityItem = this.queue[highestPriority];
        delete this.queue[highestPriority];
        this.length--;
        console.log(`${highestPriorityItem} has been removed`);
        return highestPriorityItem;
    }
}

const fruitBasket: PriorityQueue = new PriorityQueue();
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