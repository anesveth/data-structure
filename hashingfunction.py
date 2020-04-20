import math
def anesHashing(inputt):
    hashed_message_raw=""
    hashed_message=""
    if (isinstance(inputt,int)):
        strinputt=str(inputt)
        for i in range(len(strinputt)):
            hashed_message_raw+=str(inputt+len(strinputt)/(i+1))
    else:
        j=0
        for i in range(len(inputt)): 
            if (i%2 == 0):
                hashed_message_raw+=inputt[j]
                j+=1
            else:    
                hashed_message_raw+=str(i+len(inputt)/(j+1))
    hashed_message_raw=hashed_message_raw.replace(".","")
    if (len(hashed_message_raw)>16):
        for i in range(16):
            hashed_message+=hashed_message_raw[i]

    if (len(hashed_message_raw)<16):
        for i in range(len(hashed_message_raw)):
            hashed_message+=hashed_message_raw[i]
        for i in range (16-len(hashed_message_raw)):
            if (i<10):
                hashed_message+=str(i)
            else:
                i=0
                hashed_message+=str(i)
    return hashed_message

def main():
    print(anesHashing("Hola"))
    print(anesHashing("no"))
    print(anesHashing("Hola"))
    print(anesHashing(435))
if __name__=="__main__":
    main() 