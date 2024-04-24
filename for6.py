for a in range(1,6):
    for b in range(a):
        print('*',end='')
    print()

#내 답
for i in range(1,16):
    for n in range(16,1,-1):
        print(' ',end='')
    for j in range(1,2*i):
        print('*',end='')
    print()
# 풀이: 여기에서 for n in range(16,1,-1):에서 괄호를  for n in range(16-i):로 바꿨다.


#선생님 답
for i in range(1,16):
    for n in range(16-i):
        print(' ',end='')
    for j in range(i*2-1):
        print('*',end='')
    print()