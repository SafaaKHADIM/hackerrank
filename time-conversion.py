#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'timeConversion' function below.
#
# The function is expected to return a STRING.
# The function accepts STRING s as parameter.
#

def timeConversion(s):
    if s[-2:] == 'PM':
        if int(s[0:2]) == 12:
            return s[0: 8]
        return str(int(s[0:2])+ 12) + s[2: 8]
    else:
        if int(s[0:2]) == 12:
            return '00' + s[2: 8]
        return s[0: 8]
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = timeConversion(s)

    fptr.write(result + '\n')

    fptr.close()
