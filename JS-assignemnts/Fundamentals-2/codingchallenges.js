'use strict';
//coding challenge 1

const calAverage = (score1, score2, score3) => (score1 + score2 + score3) / 3;
console.log(calAverage(85, 54, 41));

//TEST 1

//calculating average
const avgDolphins = calAverage(85, 54, 41);
console.log(`The average of Dolphins is ${avgDolphins}`);
const avgKoalas = calAverage(23, 34, 27);
console.log(`The average of Koalas is ${avgKoalas}`);

//creating function to check winners taking average as parameters
const checkWinner = function (scoreDolphins, scoreKoalas) {
    console.log(scoreDolphins);
    console.log(scoreKoalas);
    if (scoreDolphins >= 2 * scoreKoalas) {
        console.log(`Dolphins won with ${scoreDolphins} vs ${scoreKoalas}`);
    } else if (scoreKoalas >= 2 * scoreDolphins) {
        console.log(`Koalas won with ${scoreKoalas} vs ${scoreDolphins} `);
    } else {
        console.log(`No one won`);
    }
}

checkWinner(avgDolphins, avgKoalas);
