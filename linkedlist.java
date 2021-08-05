/* Justin Garzione

Exercise: Java Integer Linked List

This program....

*/
public class linkedlist implements Comparable {
    private int indexx;
    private int randnum;

    public linkedlist(int i, int r)
    {
        indexx = i;
        randnum = r;

    }
    public int getdex()
    {
        return indexx;
    }
    public int getrand()
    {
        return randnum;
    }
    public int compareTo(Object o)
    {
        linkedlist oo = (linkedlist)o;
        if(randnum > oo.randnum){
            return 1;
        }
        else if(randnum == oo.randnum){
            return 0;
        }
        else
        {
            return -1;
        }

    }

}