/*
//coding challenge 1
const markWeight = 78;
const markHeight = 1.69;
const johnWeight = 92;
const johnHeight = 1.95;

const bmiMark = markWeight / (markHeight ** 2);
console.log("The bmi of Mark is " + bmiMark);
const bmiJohn = johnWeight / (johnHeight ** 2);
console.log("The bmi of John is " + bmiJohn);

const markHigherBMI = bmiMark > bmiJohn;
console.log("Is Mark's BMI higher? " + markHigherBMI);

//coding challenge 2
if (bmiMark > bmiJohn) {
    console.log(`The BMI of Mark is higher than of John's by ${bmiMark - bmiJohn}`);
} else {
    console.log(`The BMI of John is higher than of Mark's ${bmiJohn - bmiMark}`)
};


//coding challenge 3
const avgDolphinScore = (109 + 95 + 106) / 3;
const avgKoalasScore = (97 + 112 + 101) / 3;
console.log(avgDolphinScore);
console.log(avgKoalasScore);

if (avgDolphinScore > avgKoalasScore) {
    console.log(`Dophins won the tournament`);
} else if (avgDolphinScore < avgKoalasScore) {
    console.log(`Koalas won the tournament`);
} else {
    console.log(`It is a DRAW`);
}

if (avgDolphinScore > avgKoalasScore && (avgDolphinScore > 100)) {
    console.log(`Dophins won the tournament`);
} else if (avgDolphinScore < avgKoalasScore && (avgKoalasScore > 100)) {
    console.log(`Koalas won the tournament`);
} else {
    console.log(`No one won`);
}

if (avgDolphinScore > avgKoalasScore && (avgDolphinScore > 100)) {
    console.log(`Dophins won the tournament`);
} else if (avgDolphinScore < avgKoalasScore && (avgKoalasScore > 100)) {
    console.log(`Koalas won the tournament`);
} else if (avgDolphinScore === avgKoalasScore && avgDolphinScore >= 100 && avgKoalasScore >= 100) {
    console.log(`FINALLY A DRAW`);
}


//coding challenge 4

const totalBill = 275;
//const tip = (totalBill > 50 && totalBill < 300) ? `${totalBill * 0.15}` : `${totalBill * 0.20}`;
const tip = totalBill > 50 && totalBill < 300 ? totalBill * 0.15 : totalBill * 0.20;
console.log(`The total Bill is ${totalBill} and tip is ${tip} and your total bill is ${Number(totalBill) + Number(tip)}`);
*/




