//to activate strict mode
//should be the first line if you want entire script to be in strict mode
'use strict';

/* let hasDriverLicense = false;
const passTest = true;

if (passTest) {
    hasDriverLicense = true;
}
if (hasDriverLicense) console.log("You can drive");


//FUNCTIONS
// function can hold one ore more lines of code

function logger() {
    console.log(`My name is Pratik and I code`);
}

//functionname(parameter1, parameter2, ...) calling , running, invoking a function
//it can also accept data and return data

logger();
logger(23);
logger();
logger();

function fruitProcessor(numApples, numOranges) {
    //console.log(numApples, numOranges);
    const juice = `Juice with ${numApples} apples and ${numOranges} oranges`;
    return juice;
}

//storing the returned value in a variable
const returnValue = fruitProcessor(5, 6);

//displaying variable
console.log(returnValue);
console.log(fruitProcessor(5, 6));
console.log(fruitProcessor(4, 6));

//not all functions need to return something
// ###########################################################
// FUNCTION DECLARATIONS VS EXPRESSIONS

//FUNCTION DECLARATION
function calAge(birthYear) {
    return 2022 - birthYear;
}

const age1 = calAge(1992);
console.log(`Your age is ${calAge(1990)}`);

// ###########################################################

//FUNCTION EXPRESSION, function without a name (anonymous function). it can be stored in variable

const calAge2 = function (birthYear) {
    return 2022 - birthYear
}

const age2 = calAge2(1990);
console.log(age1, age2);

//function declaration can be called before creating the function which is not true with function expression

// ###########################################################

//ARROW FUNCTIONS, added in ES6, return happen implicitly if 1 line function
const calAge3 = birthYear => 2022 - birthYear;
const age3 = calAge3(1995);
console.log(age3);

//ARROW functions with multiple parameters
const yearUntilRetirement = (birthYear, firstName) => {
    const age = 2022 - birthYear;
    const retirement = 65 - age;
    return `${firstName} retires in ${retirement} years`;
}

console.log(yearUntilRetirement(1990, 'Pratik'));
console.log(yearUntilRetirement(1995, 'Bitu'));


// ###########################################################

//FUNCTION CALLING OTHER FUNCTIONS

function cutFruitPieces(fruit) {
    return fruit * 4;
}

function fruitProcessor(numApples, numOranges) {
    const applePieces = cutFruitPieces(numApples);
    const orangePieces = cutFruitPieces(numOranges);
    //console.log(numApples, numOranges);
    const juice = `Juice with ${applePieces} pieces of apples and ${orangePieces} pieces of  oranges`;
    return juice;
}

console.log(fruitProcessor(2, 3));

// ###########################################################


//parameters are local to the function, here birthyear

const calcAge = function (birthYear) {
    return 2022 - birthYear;
}

const yearUntilRetirement = function (birthYear, firstName) {
    const age = calcAge(birthYear);
    const retirement = 65 - age;

    if (retirement > 0) {
        console.log(`${firstName} retires in ${retirement} years`);
        return retirement;
    } else {
        console.log(`${firstName} has already retired`);
        return -1;
    }
}

console.log(yearUntilRetirement(1990, 'Pratik'));
console.log(yearUntilRetirement(1940, 'Bitu'));

//return statemnt immeditely exits, so put before return
// alt + up arrow to move the line up

// ###########################################################


//INTRODUCTION TO ARRAYS
//Array is type of data structure

const friends = ["Pratik", "Parth", "Kartik"];
console.log(friends);

//another way of creating an array
const years = new Array(1990, 1991, 1992, 1993);

//Accessing arrays, arrays are 0 indexed
console.log(friends[0]);
console.log(friends[1]);

//number of elements in array, it is not zero indexed
console.log(friends.length);

//friends.length - 1 below is an expression. Accessing last element of array
console.log(friends[friends.length - 1]);

//changing values,
//only primitive values are immutable, arrays are not primitive, thus we can change the value of frineds[2] even if we defined it as const
friends[2] = "Pam";
console.log(friends);

//Array can also store values of different types
const firstName = 'Jonas';
//Array having variables, expressions and another array itself
const person = [firstName, 'Brothers', 5050 - 254, friends]
console.log(person);
console.log(person.length);

const calcAge = function (birthYear) {
    return 2022 - birthYear;
}

const age = [1990, 1991, 1992, 1995];
console.log(calcAge(age[1]));

//Array having functions
const valArray = [calcAge(age[1]), calcAge(age[age.length - 1])];
console.log(valArray);


//Basic Array functions/methods

const friends = ["Pratik", "Parth", "Kartik"];

//push function/method allows you to add a new value to the end of an array
friends.push("Pam");
console.log(friends);

//push function returns the length of the new array
const newLength = friends.push("Pam");

//unshift function/method allows you to add a new value to the start of an array
friends.unshift("John");
console.log(friends);

//to remove the last elements from an array, it returns the removed element
friends.pop();
console.log(friends);

//to remove the first elements from an array, it returns the removed element
friends.shift();
console.log(friends);

//tells you the position of the element in the array
console.log(friends.indexOf('Parth'));
// returns -1 if not found

//return if the element is present in the array or not (true or false) in es6 only. Follows STRICT mode
console.log(friends.includes('Bobby'));


//Objects is another type of data structure in Javascript. it will have a key value pair. Keys are also called as properties
// { is called object literal context. Grouping of different variables that really belong together
// in objects, the order doesnt matter when we retrieve them
//Use arrays for more ordered data and objects with more unstructured data


const pratikArray = {
    firstName: "Pratik",
    lastName: "Nagori",
    age: 2022 - 1990,
    jobs: "Developer",
    friends: ["Pratik", "Parth", "Kartik"]
};

console.log(pratikArray);

//Accessing object properties
//ObjextName.propertykey

console.log(pratikArray.lastName);
console.log(pratikArray['lastName']);
//you can use bracket operation which can be used to evaluate expression

const nameKey = 'Name';
console.log(pratikArray['first' + nameKey]);
console.log(pratikArray['last' + nameKey]);

//if you need to cmpute the propertyname use the bracket notation, if not then use . notation

const interestedIn = prompt("What do you want to know about Jonas, choose between firstName, lastName, age, job and friends");
console.log(interestedIn);
console.log(pratikArray[interestedIn]); //result will be undefined if not matching any property

//Adding new properties to the object

pratikArray.location = "India";
pratikArray['socialID'] = "pratiknagori@gmail.com";
console.log(pratikArray);

console.log(`${pratikArray.firstName} has ${pratikArray.friends.length} and his best friend name is ${pratikArray.friends[1]}`);


//Object methods
//Object can have function as well

const pratikArray = {
    firstName: "Pratik",
    lastName: "Nagori",
    age: 2022 - 1990,
    birthYear: 1990,
    jobs: "Developer",
    friends: ["Pratik", "Parth", "Kartik"],
    hasDriversLicense: true,
    calcAge: function (birthYear) {
        return 2022 - birthYear;
    }
};

console.log(pratikArray.calcAge(1990));
console.log(pratikArray['calcAge'](1990));
console.log(pratikArray.calcAge(pratikArray.birthYear));
console.log(pratikArray['calcAge'](pratikArray['birthYear']));
*/

//this variable
const pratikArray = {
    firstName: "Pratik",
    lastName: "Nagori",
    age: 2022 - 1990,
    birthYear: 1990,
    jobs: "Developer",
    friends: ["Pratik", "Parth", "Kartik"],
    hasDriversLicense: false,
    //  calcAge: function () {
    //      console.log(this);
    //      return 2022 - this.birthYear; //this keyword points to the object calling the method (pratikArray). This is as good as pratikArray.birthYear. This is called object referencing 
    //  }

    calcAge: function () {
        this.age = 2022 - this.birthYear; //Adding new properties to the object pratikArray, check line 244
        return this.age;
    },

    getSummary: function () {
        return `${this.firstName} is a ${this.calcAge()} years old and has ${this.hasDriversLicense ? "a" : "no"} drivers license`
    }


};

console.log(pratikArray.age); //object pratikArray is accessing the property age

console.log(pratikArray.getSummary());

