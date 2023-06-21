import java.util.*;

public class test {

    public static void main(String[] args) {

        ArrayList <String> arrList = new ArrayList<>();

        int x=0;

        for (int i=1; i<=10; i++){
            arrList.add("Obj " + i);
        }

        //Iterator
        Iterator <String> it=arrList.iterator();
        while (it.hasNext()){
            System.out.print(it.next() +  "- ");//.next = nächstes Element zugreifen u. ausgeben.
            if ((x++%2)!=0){
                it.remove();
                System.out.println("Objekt gelöscht");
            }
            else
                System.out.println("");
        }//Ende While


        //ListIterator <String>  listIt = arrList.listIterator(4); o. mit diesem Index beginnend
        ListIterator <String>  listIt = arrList.listIterator(arrList.indexOf("Obj 7"));
        while (listIt.hasPrevious()){
            System.out.println(listIt.previous()+"-");
        }

        for (String element: arrList){
            System.out.println("blubb");
            System.out.println(element);
        }



    }//Ende Main
}//Ende Klasse
