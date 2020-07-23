/* Function Basics */
let favoriteBooks = [];

const addFavoriteBooks = (bookName) => { // adds books to array without 'great' in title
    if (!bookName.includes('Great')) favoriteBooks.push(bookName);
};

addFavoriteBooks('The Jungle Book');
addFavoriteBooks('Great Gatsby'); // not added
addFavoriteBooks('Stargirl');
addFavoriteBooks('Gone Girl');
addFavoriteBooks('Great Expectations'); // not added
addFavoriteBooks('Little Fires Everywhere');
addFavoriteBooks('Stargirl'); // not added
addFavoriteBooks('Stargirl'); // not added

const printFavoriteBooks = (books) => { // prints out books in array
    for (let book of books) console.log(book);
};

printFavoriteBooks(Array.from(new Set(favoriteBooks))); // turn to set to remove duplicates & turn back to array
