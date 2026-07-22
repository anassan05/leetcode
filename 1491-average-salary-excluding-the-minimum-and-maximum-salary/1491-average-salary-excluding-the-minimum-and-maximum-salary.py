class Solution(object):
    def average(self, salary):
        salary.sort()
        m=salary[0]+salary[-1] 
        a=sum(salary)-m
        final=a/float(len(salary)-2)
        return final