// Evaluate expression in given string
function calculator(s){
    var total = 0;
    s = s.replace(/\s/g, '').match(/[+\-]?([0-9\.\s]+)/g) || [];
    while(s.length) total += parseFloat(s.shift());
    return total;
}
var string="1+3*(9/3)+24/4";
console.log(calculator(string));