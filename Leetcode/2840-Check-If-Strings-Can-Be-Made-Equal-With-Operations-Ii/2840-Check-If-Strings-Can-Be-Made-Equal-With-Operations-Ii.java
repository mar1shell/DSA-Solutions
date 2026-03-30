class Solution:
    def checkStrings(self, s1: str, s2: str) -> bool:
        evenMap1 = {}
        evenMap2 = {}
        oddMap1 = {}
        oddMap2 = {}

        for i, ch in enumerate(s1):
            if i % 2 == 0:
                evenMap1[ch] = evenMap1.get(ch, 0) + 1
            else:
                oddMap1[ch] = oddMap1.get(ch, 0) + 1

        for i, ch in enumerate(s2):
            if i % 2 == 0:
                evenMap2[ch] = evenMap2.get(ch, 0) + 1
            else:
                oddMap2[ch] = oddMap2.get(ch, 0) + 1

    
        return evenMap1 == evenMap2 and oddMap1 == oddMap2