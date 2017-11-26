/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function(left, right) {
    var res= []
    for(var i = left; i <= right; i++) {
        var flag = 0
        var num = i
        while (num > 0) {
            if (flag === 0) {
                var dig = num % 10
                if (dig === 0) {
                    flag = 1
                    break;
                }   else if (i % dig !== 0) {
                    flag = 1
                    break;
                } 
                else {
                    num = Math.floor(num / 10)
                }
            } else {
                flag = 1
                break;
            }
        }
        if ( flag === 0) {
            res.push(i)
        }
    }
    return res
};
