#!/data/NYGC/Software/python/bin/python2.7

def lenOflongestSubstring(s):
	pre = 0 
	dict = {} # for each char in given string, store it's index 
	endi = 0 
		
	for i in range(len(s)):
		if s[i] not in dict:
			dict[s[i]] = i #keep track of unique substring char 
			endi = i 
		else:
			print pre , len(dict)
			pre = pre if pre > len(dict) else len(dict) #pre stores the longest substring lenth so far 
			#if  pre > len(dict):
			#	endi = i	
				
			print pre
			dict.clear()
		
		print dict 
	
	a = max( pre , len(dict) )  
	print s[endi - a +1 : endi] # trace back to find the substring	
	return max( pre , len(dict) ) 
	

if __name__ =='__main__':
	s = 'abcabcbb'
	max = lenOflongestSubstring(s)

	print max 
			  
				
		
