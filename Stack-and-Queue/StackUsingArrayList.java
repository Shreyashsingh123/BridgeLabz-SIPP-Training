import java.util.ArrayList;
// stack implementation using arraylist
public class StackUsingArrayList {
    ArrayList<Integer>ls;
    StackUsingArrayList(){
        ls=new ArrayList<>();
    }
    void push(int a){
       
        ls.add(a);
        return;
    }
    int peek(){
        return ls.get(ls.size()-1);
    }
    int pop(){
        int p=ls.get(ls.size()-1);
        ls.remove(ls.size()-1);
        return p;

    }
    boolean isempty(){
        return (ls.size()==0);
    }
    public static void main(String[] args) {
        StackUsingArrayList st=new StackUsingArrayList();
        st.push(1);
        st.push(2);
System.out.println(st.peek());
ArrStack st1=new ArrStack();
st1.push(1);
st1.push(200);
System.out.println(st1.pop());
    }
}
// stack implementation using array
class ArrStack{
    int arr[];
    int i;
    ArrStack(){
        arr=new int[1];
        i=0;
    }
    void push(int a){
        if(arr.length==i){
            int newarr[]=new int[2*i];
            for(int j=0;j<arr.length;j++){
                newarr[j]=arr[j];
            }
            arr=newarr;
        }
        arr[i++]=a;
    }
    int pop(){
        if(i==0){
            System.out.print("Stack is empty");
            return -1;
        }
        return arr[--i];
    }
    int peek(){
        if(i==0){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[i-1];
    }
    int size(){
        return i;
    }
    boolean isempty(){
        return i==0;
    }
}
