#this is a program to calculate the repeated word in a string
#I have used dict
a= "My name is alok alok is my name is it so"
d=dict()
a=a.strip()
a=a.lower()
words=a.split(" ")
for word in words:
    if word in d:
        d[word]=d[word]+1
    else:
        d[word]=1
m=max(d,key=d.get)
print(m, ":" ,d[m])