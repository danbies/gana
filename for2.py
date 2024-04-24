# 문제) 80점 이상이면 합격 아니면 불합격
# 결과: 
# 1번 학생은 합격입니다.
# 2번 학생은 불합격입니다.
# 총 합격자 수=4명
score=[96,70,67,82,75,88,92]
# 내답
num=0
for student in score:
    num+=1
    if student >= 80:
        print(str(num)+'번 학생은 합격입니다.')
    else:
        print(str(num)+'번 학생은 불합격입니다.')
print('총 합격자 수는 ' + str(len(str(student >= 80))) + '명입니다.')
print('===================================================')
# 선생님 답
num1=0  #학생번호
count=0  #합격자수
for chkscore in score:
    num1=num1+1
    if chkscore >= 80:
        print('%d번 학생은 합격입니다.' % num1)
        count=count+1
    else:
        print('%d번 학생은 불합격입니다.' % num1)
print('총 합격자 수= %d명' % count)