package addinglinkedlists;

import java.util.LinkedList;

public class OBCodingChallenges {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(7);
        linkedList1.add(1);
        linkedList1.add(6);
        System.out.println(linkedList1);
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(5);
        linkedList2.add(9);
        linkedList2.add(2);
        System.out.println(linkedList2);

        LinkedList<Integer> linkedListResult = new LinkedList<>();

        Integer sum =0;
        Integer carry=0;
        Integer listOneLength = linkedList1.size();



        while (linkedList1 != null || linkedList2 != null || sum > 0) {
           if(linkedList1 != null){
                for(Integer i =0; i < listOneLength; i++){
                    sum += linkedList1.get(i).shortValue();
                    if(linkedList2 != null){
                        sum += linkedList2.get(i).shortValue();
                        carry = sum / 10;
                        sum = sum % 10;
                        linkedListResult.add(sum);
                        sum = carry;
                        carry = 0;
                        System.out.println("sum = " + sum);
                    }

                }break;
           }else{
               System.out.println("At End Of LinkedList1");
               break;
           }
       }
        if (linkedListResult != null){
            System.out.println(linkedListResult);
        }

        System.out.println("*******REVERSED*******");
        linkedList1.clear();
        linkedList1.add(6);
        linkedList1.add(1);
        linkedList1.add(7);
        System.out.println(linkedList1);
        linkedList2.clear();
        linkedList2.add(2);
        linkedList2.add(9);
        linkedList2.add(5);
        System.out.println(linkedList2);
        linkedListResult.clear();

        LinkedList<Integer> reverseList = new LinkedList<>();

        sum =0;
        carry=0;
        listOneLength = linkedList1.size() - 1;

        while (linkedList1 != null || linkedList2 != null || sum > 0) {
            if(linkedList1 != null){
                for(Integer i =listOneLength; ((i <= listOneLength) && (i != -1)); i--) {
                    sum += linkedList1.get(i).shortValue();
                    if (linkedList2 != null) {
                        sum += linkedList2.get(i).shortValue();
                        carry = sum / 10;
                        sum = sum % 10;
                        linkedListResult.add(sum);
                        sum = carry;
                        carry = 0;

                    }

                }break;
            }else{
                System.out.println("At End Of LinkedList1");
                break;
            }
        }
        if (linkedListResult != null){
            Integer reverseEnd = linkedListResult.size()-1;
            for (Integer i = reverseEnd; i <= reverseEnd && i != -1; --i){
                reverseList.add(linkedListResult.get(i));
            }

            System.out.println(reverseList);
        }
    }

}
