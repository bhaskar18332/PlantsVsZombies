''' Read input from STDIN. Print your output to STDOUT '''
    #Use input() to read input from STDIN and use print to write your output to STDOUT

def main():
    P=int(input())
    N=int(input())
    D=int(input())
    S=int(input())
    x=int(input())
    X_arr=[]
    Y_arr=[]
    Z_arr=[]
    for i in range(N):
        if (P==1):
            X=int(input())
            X_arr.append(X)
        elif (P==2):
            X,Y=map(int,input().split(","))
            X_arr.append(X)
            Y_arr.append(Y)
        elif(P==3):
            X,Y,Z=map(int,input().split(","))
            X_arr.append(X)
            Y_arr.append(Y)
            Z_arr.append(Z)

    X_arr.sort()
    Y_arr.sort()
    Z_arr.sort()
    count_x=0
    count_y=0
    count_z=0
    #print(X_arr)
    #print(len(X_arr))'
    if (P==1):
        for i in range(len(X_arr)-1):
            if (X_arr[i+1]-X_arr[i]<=D):
                #print("ddd")
                #print(X_arr[i+1])
                #print(X_arr[i])
                count_x+=1
                #print("fff")
    elif (P==2):
        for i in range(len(X_arr)-1):
            if (X_arr[i+1]-X_arr[i]<=D and (Y_arr[i+1]==Y_arr[i])):
                #print("ddd")
                #print(X_arr[i+1])
                #print(X_arr[i])
                count_x+=1
                #print("fff")
        """for i in range(len(Y_arr)-1):
            if (Y_arr[i+1]-Y_arr[i]<=D):
                count_y+=1"""
    elif (P==3):
        for i in range(len(X_arr)-1):
            if (X_arr[i+1]-X_arr[i]<=D and (Y_arr[i+1]==Y_arr[i]) and (Z_arr[i+1]==Z_arr[i])):
                #print("ddd")
               # print(X_arr[i+1])
               # print(X_arr[i])
                count_x+=1
                #print("fff")
            if (X_arr[i+1]-X_arr[i]==0 and (Y_arr[i+1]-Y_arr[i])<=D and (Z_arr[i+1]==Z_arr[i])):
                #print("dgere")
                #print(X_arr[i+1])
                #print(X_arr[i])
                count_x+=1
                #print("ferere")    
        """for i in range(len(Z_arr)-1):
            if (Z_arr[i+1]-Z_arr[i]<=D):
                count_z+=1 """   
    print(count_x)
    #print(count_y)
    #print(count_z)
    
 # Write code here 

main()

