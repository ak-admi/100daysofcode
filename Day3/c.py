#this is a simple code to convert string to integers
#Here untill n is in ascending after n is descding
p="8 9 10 20 6 8 9 4"
i=p.split(" ")
integers=[int(x) for x in i]
print(integers)
integs = [int(x) for x in p.split(' ')]
print(integs)
m=integers[0:3]
n=integers[3:len(integers)]
sorted(m)

reversed(sorted(n))

print(m+n)