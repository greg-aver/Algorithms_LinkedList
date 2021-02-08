
public static LinkedList sumLikedListIfLengthsIsEqual(LinkedList list1,LinkedList list2){
        LinkedList listResult = new LinkedList();

        if(list1.count() != list2.count() || list1.head == null){
            return listResult;
        }
        Node nodeFirst = list1.head.next;
        Node nodeSecond = list2.head.next;

        Node nodeResult = new Node(list1.head.value+list2.head.value);
        listResult.head = nodeResult;

        while(nodeFirst!=null){
            nodeResult.next = new Node(nodeFirst.value+nodeSecond.value);
            nodeResult=nodeResult.next;
            nodeFirst=nodeFirst.next;
            nodeSecond=nodeSecond.next;
        }

        listResult.tail=nodeResult;
        return listResult;
}
