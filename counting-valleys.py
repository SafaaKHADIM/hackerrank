#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'countingValleys' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER steps
#  2. STRING path
#

def countingValleys(steps, path):
    valleys_numebr = 0
    count = 0
    start = False
    for step in path:
        if step == 'D':
                count = count - 1
        else:
                count = count + 1
        if step == 'D' and start == False and count == -1:
            start = True
        if step == 'U' and start == True and count == 0:
            start = False
            valleys_numebr = valleys_numebr + 1
    return valleys_numebr

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    steps = int(input().strip())

    path = input()

    result = countingValleys(steps, path)

    fptr.write(str(result) + '\n')

    fptr.close()
