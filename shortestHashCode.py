#!/data/NYGC/Software/python/bin/python2.7
import sys
from sets import Set 

# get the shortest hash code for each given string in a list

"""
1. for each given string , generate all the substrings 
2. using hashset to store all the used sub 
	if the sub is been used:
		remove it from hashset
	else:
		add it to set
		put the sub and origin string into dic 
3. get the Shortest prefix hashcode for a string
	using DP
	looking up the dic to get the hashcode 
	compare the shortest lenth, update the one with shortest len
"""

def getUniqCode(input):
	unicode = {}
	result = []
	#used = set()
	for e in input:
		for i in range(1,len(e)+1): # get each string's substring 
			sub = e[:i]
			#if sub in unicode: 	#no duplicates
			if  sub in unicode:
				if sub in input : # if the sub in the list, keep the sub k-v 
					unicode[sub] = sub
				else:
					del unicode[sub]
			else:
				unicode[sub] = e 
	
		print unicode 
	
	for s in input:
		shortest = getShortestCode(unicode,s)
		result.append(shortest)

	return result


#for a single string, find the shortest hashcode,supporting method  

def getShortestCode(dlist, a):
	minL = sys.maxint
	minS = '' 
	for k in dlist:
		if dlist[k] == a and len(k)< minL :
			minS =k 
			minL = len(k)


	return minS 
 

if __name__ == '__main__':
	input =['abc','abcd','gefd','ge','g','ab','ac','ad']
	r = getUniqCode(input)
	print r
	
