#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeInWords' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. INTEGER h
#  2. INTEGER m
#

def timeInWords(h, m):
    # Write your code here
    numbers = {
                1: 'one',
                2: 'two',
                3: 'three',
                4: 'four',
                5: 'five',
                6: 'six',
                7: 'seven',
                8: 'eight',
                9: 'nine',
                10: 'ten',
                11: 'eleven',
                12: 'twelve',
                13: 'thirteen',
                14: 'fourteen',
                15: "quarter",
                16: 'sixteen',
                17: 'seventeen',
                18: 'eighteen',
                19: 'nineteen',
                20: 'twenty',
                21: 'twenty one',
                22: 'twenty two',
                23: 'twenty three',
                24: 'twenty four',
                25: 'twenty five',
                26: 'twenty six',
                27: 'twenty seven',
                28: 'twenty eight',
                29: 'twenty nine',
                30: "half",
    }
    if m == 0:
        result = numbers.get(h) + " o' clock"
    elif m> 0 and m <= 30:
        if m == 1:
            result = numbers.get(m, '') + ' minute past ' + numbers.get(h)
        elif m == 15 or m == 30:
            result = numbers.get(m, '') + ' past ' + numbers.get(h)      
        else:
            result = numbers.get(m, '') + ' minutes past ' + numbers.get(h)
    else:
        if m == 45:
            result = numbers.get(60 - m, '') + ' to ' + numbers.get(h + 1)
        else:
            result = numbers.get(60 - m, '') + ' minutes to ' + numbers.get(h + 1)
    return result
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    h = int(input().strip())

    m = int(input().strip())

    result = timeInWords(h, m)

    fptr.write(result + '\n')

    fptr.close()
