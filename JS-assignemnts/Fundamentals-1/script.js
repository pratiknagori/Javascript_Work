/*
let js = 'amazing';
console.log(40 + 20);
console.log("Pratik Rocks!");
let firstName = "Pratik";
console.log(firstName);


// DATATYPES
let javascriptIsFun = true;
console.log(typeof true);
console.log(typeof "Pratik Nagori");
console.log(typeof 23);
console.log(typeof javascriptIsFun);
javascriptIsFun = "Hello Boy";
console.log(typeof javascriptIsFun);

//defining an Undefined variable
let prat;
console.log(prat);
console.log(typeof prat);


// Delcaring the variables using let, var, const
let age = 30;
console.log(age);
age = 31; //This is called mutating a variable. Thus it was declared with let
console.log(age);

const birthYear = 1990; //This variable will never change (defined using const) This variable cannot be mutated
// birthYear = 1995   >>>>>>>>>> This will never work as const variables cannot be changed

var job = "Technology Specialist"; // Old way of declaring variables. Avoid it
job = "QA"


const now = 2022;
const agePratik = now - 1990;
const ageSitu = now - 1992;

//Math operators
console.log(agePratik * 2, ageSitu / 2);

console.log("pratik" + "nagori");
console.log("pratik" + 2 ** 3); // concatenation pratik with 2 cube

//Assignment operators
let x = 10 + 5; // = is assignment operator
x += 10; // This means x = x + 10
x *= 10; // This means x = x * 10
x++; // THis means x = x + 1
x--; // This means x = x -1
console.log(x);

//Comparision Operators
//Value will be boolean
console.log(agePratik > ageSitu); // >, <, >=, <=
console.log(agePratik >= 18);
console.log(ageSitu >= 45);
const pratikName = agePratik >= 15;
console.log("THe value of boolen is " + pratikName);
console.log(now - 1990 > now - 1992);


const now = 2050;
const agePratik = now - 1990;
const ageSitu = now - 1992;

console.log(now - 1990 > now - 1992);

//precedence table and also list of all operators
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence

let x, y; // you can assign 2 variable at a time
x = y = 25 - 10 - 5;
console.log(x, y);
const averageAge = (agePratik + ageSitu) / 2;
console.log(averageAge);


//Strings and Templates literals
const firstName = "Pratik";
const job = "Team Lead";
const birthYear = 1990;
const year = 2022;

const pratik = "I'm " + firstName + ", a " + (year - birthYear) + " years old " + job + "!";
console.log(pratik);

//template literal. `` helps to write variable directly using ${}

const pratiknew = `I'm ${firstName}, a ${year - birthYear} years old ${job} `;
console.log(pratiknew);
console.log(`write whatever you want using "" or ' `);

//writing multiple lines in language
console.log(`pratik
nagori
multiple
lines`);


//if - else taking decisions, also called as control structure

const age = 15;
const isOldEnough = age >= 18;

if (isOldEnough) {
    console.log(`Congratulation, you are eligible for 🐥`);

}
else {
    const yearsleft = 18 - age;
    console.log(`You have to wait for another ${yearsleft} years`);
}

//varible DEFINED inside if else block cannot be accessed outside. So declare first and assigin in the block
let century;
const birthYear = 1990;
if (birthYear <= 2000) {
    century = 20;
} else {
    century = 21;
}
console.log(century);


//Type conversion (we do it manually) and type coercion (js does it automatically)
const inputYear = "1990"; //defined a number as string
console.log(inputYear + 18); //This concatenates as we defined the variable as string
console.log(Number(inputYear) + 18); //This convert the string to number
console.log(Number("Pratik")); //This will give an error
console.log(String("23")); //This convert the number to string
// you can only convert to string, number or boolean

// Below is TYPE COERCION, happens when dealing with values of different types
console.log("I'm " + 25 + " years old"); // automatically converted 25 to string
console.log('25' + 25 + '10'); // automatically converted 25 to string
console.log('25' - 25 + '10'); // automatically converted number only with -


//Truthly and Falsy values
// 5 falsy values: 0, '', undefined, null, NaN. If all these are tried to be converted to values, they will become falsy values
console.log(Boolean(0)); //false
console.log(Boolean(undefined)); //false
console.log(Boolean({})); //true
console.log(Boolean("Jonas"));

const money = 0;
if (money) { //this is type coercion
    console.log(`Don't spend much. Save`);
} else {
    console.log(`Get a job`);
}

//to check if a variable is defined or not
let height // undefined variable
console.log(typeof (height));
if (height) {
    console.log(`Height is defined`);
} else {
    console.log(`Height is not defined`);
}


//EQUALITY operators
const age = 31;
if (age === 31) {  // === EXACT match and does not perform type coercion
    console.log(`You are young`);
};

// == does type coercion
const number = "31";
if (number == 31) {
    console.log(`Did not perform the type coercion`);
}

//to take input from user
const favNum = prompt("Whats your favourite number");
console.log(typeof (favNum));
console.log(`Your fav number is ${favNum}`);
const notFavNum = Number(prompt("Whats your favourite number"));
console.log(typeof (notFavNum));

if (favNum == 31) {
    console.log(`Did not perform the type coercion`);
} else if (favNum == 54) {
    console.log(`Good boy`);
} else {
    console.log(`Not cool`);
}

if (favNum !== 31) { //this is EXACT not equal to operator
    console.log(`You are in first if block`);
} else if (favNum == 54) {
    console.log(`Good boy`);
} else {
    console.log(`Not cool`);
}


// BOOLEAN LOGIC AND, NOT, OR, ! (NOT) has the highest precendence
const hasDriverLicense = true;
const hasGoodVision = true;
const isTired = false;
console.log(hasDriverLicense && hasGoodVision); //AND
console.log(hasDriverLicense || hasGoodVision); //OR
console.log(!hasDriverLicense && hasGoodVision); //NOT
console.log(hasDriverLicense || hasGoodVision || isTired); //OR

if (hasDriverLicense && hasGoodVision && !isTired) {
    console.log("You can drive");
} else {
    console.log("You should not drive");
}


//SWITCH case, better to use than instead of if else, if there are many condiitions to check on a single variable (here day)

const day = 'monday';
switch (day) {
    case 'monday': // day === 'monday'
        console.log(`Plan course structure`);
        console.log(`Goto coding meetup`);
        break;
    case 'tuesday':
        console.log('Prepare training videos');
        break;
    case 'wednesday':
    case 'thursday':
        console.log('Thursday Prepare training videos');
        break;
    case 'friday':
        console.log('Friday Prepare training videos');
        break;
    case 'saturday':
        console.log('Saturday Prepare training videos');
        break;
    default:
        console.log('Not in any switch block');
}

//STATEMENTS and EXPRESSIONS
//Expressions produces a value
//Statements dont (Example) eg: conditional check, variable assignemnts


//CONDITIONAL (TERNARY) OPERATORS ?
//allows to write if else statements but i nsingle line

const age = 15;
age >= 30 ? console.log('I like to drink wine') :
    console.log('Please only drink water ');


const age = 15;

const drink = age >= 30 ? `wine` : `water`; //if age is greater than equal to 30 then drink=wine else drink=water
console.log(drink);

//correesponding if else block
let drink2;
if (age >= 31) {
    drink2 = `wine`;
} else {
    drink2 = `water`;
}
console.log(drink2);

//ternary operators can be used in template literal since it produces a value
//template literal cannot incorporate if else block since it's a statement

console.log(`I like to drink ${age >= 30 ? `wine` : `water`}`);
*/






