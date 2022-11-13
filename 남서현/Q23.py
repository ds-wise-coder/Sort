N=int(input(""))
for i in range(N):
    [name,kor,eng,math]=input().split()
    list.append([name,int(kor), int(eng), int(math)])

list.sort(key = lambda x: (-int(x[1]), int(x[2]), -int(x[3]), x[0]))

for s in list:
    print(s[0])