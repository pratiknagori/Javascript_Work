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
*/

//INTRODUCTION TO ARRAYS
