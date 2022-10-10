const profile = {
    firstName: 'Shanice',
    lastName: 'Smith'
};

profile['address'] = {
    city: 'Queens',
    state: 'New York'
};

profile.hobbies = ['Dancing', 'Coding', 'Volunteering', 'Gaming'];

profile.hasPet = false;

console.log(profile); // prints all key-value pairs in profile object
console.log(Object.keys(profile));
console.log(Object.values(profile));
console.log(profile.hasOwnProperty('hobbies'));

// {firstName: "Shanice", lastName: "Smith", address: {city: "Queens", state: "New York"}, hobbies: ["Dancing", "Coding", "Volunteering", "Gaming"], hasPet: false}
// ["firstName", "lastName", "address", "hobbies", "hasPet"]
// ["Shanice", "Smith", {city: "Queens", state: "New York"}, ["Dancing", "Coding", "Volunteering", "Gaming"], false]
// true
