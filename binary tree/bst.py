# from memory_profiler import profile
import gc

class Node:
    def __init__(self,val):
        self.value=val
        self.leftchild=None
        self.rightchild=None
    def insert(self,data):
        if self.value == data:
            ##no se puede data duplicada
            return False
        elif self.value >data:
            if self.leftchild: 
                return self.leftchild.insert(data)
            else:
                self.leftchild=Node(data)
                return True
            ##si es menor tiene q ir del lado izquierdo
        else:
            if self.rightchild:
                return self.rightchild.insert(data)
            else:
                self.rightchild=Node(data)
                return True
    def remove(self,key):
        #if the key is smaller, its gonna be on the left
        if self.value>key:
            if self.leftchild:
                self.leftchild = self.leftchild.remove(key)
            return self
        #if the key is bigger, its gonna be on the right
        if self.value<key:
            if self.rightchild:
                self.rightchild = self.rightchild.remove(key)
            return self
        ##when it finds the key
        else:
            if not self.rightchild:
                if self.leftchild:
                    return self.leftchild
            elif not self.leftchild:
                if self.rightchild:
                    return self.rightchild
            else:
                xmin = self.rightchild.value
                ##if the rightchilf had a leftchild
                if self.rightchild.leftchild:
                    xmin = self.rightchild.find_min()
                self.value = xmin
                ##rightchild is no longer 'the right child'
                self.rightchild.remove(xmin)
                return self
        


    def find(self,key):
        if self.value == key:
            return True
        elif self.value> key:
            if self.leftchild:
                return self.leftchild.find(key)
            else:
                return False
        else:
            if self.rightchild:
                return self.rightchild.find(key)
            else:
                return False
    def traverse(self):
        print(self.value)
        if self.leftchild:
            self.leftchild.traverse()
        if self.rightchild:
            self.rightchild.traverse()
    def find_min(self):
        ##como ya esta ordenado, siempre el valor q este mas a la izquierda va a ser el minimo
        if self.leftchild:
            return self.leftchild.find_min()
        else:
            return self.value
    def find_max(self):
        if self.rightchild:
            return self.rightchild.find_max()
        else:
            return self.value





class Tree:
    def __init__(self):
        self.root=None
    def insert(self,data):
        if self.root:
            return self.root.insert(data)
        else:
            self.root=Node(data)
            return True 
    def remove(self,key):
        if self.root:
            return self.root.remove(key)
        else:
            return False
    def find(self,key):
        if self.root:
            return self.root.find(key)
        else:
            return False
    def traverse(self):
        if self.root:
            return self.root.traverse()
        else:
            return False
    def find_min(self):
        if self.root:
            return self.root.find_min()
        else:
            return False
    def find_max(self):
        if self.root:
            return self.root.find_max()
        else:
            return False




def main():
    bst = Tree()
    print(bst.insert(5))
    print(bst.insert(-15))
    print(bst.insert(15))
    print(bst.insert(20))
    print(bst.insert(18))
    print(bst.insert(21))
    print(bst.insert(30))
    print(bst.find(21))
    print(bst.find(-15))
    # 
    print("valor maximo: " +str(bst.find_max()))
    print("valor minimo: " +str(bst.find_min()))
    print(bst.remove(20))
    print(bst.remove(5))
    print(bst.traverse())
    print("valor maximo: " +str(bst.find_max()))

#     for obj in gc.get_objects():
#         if isinstance(obj, Tree):
#             print("Tree: ", obj)
# ​
#     for obj in gc.get_objects():
#         if isinstance(obj, Node):
#             print("Node: ", obj.value, obj)
#             print("Right Child: ", obj.right_child)

    

if __name__=="__main__":
    main()

