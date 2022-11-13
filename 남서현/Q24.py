N=int(input(""))
L = map(int, input().split())

L.sort()
print(L[(N-1)//2])