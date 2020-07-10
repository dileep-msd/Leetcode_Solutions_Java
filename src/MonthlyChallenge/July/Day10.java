package MonthlyChallenge.July;

public class Day10 {
    // Flatten a multileveled doubly linked list.
    /*

    #Type : dfs
    Time & Space complexity: O(n)

    Node dummyHead = head;
    Node curr, prev = dummyhead;

    queue<Node> queue = new ArrayList<>();
    queue.add(dummyHead);

    while(!queue.isEmpty()){
        curr = queue.pop();
        prev.next = curr;
        curr.next = prev;

        if(curr.next != null) stack.push()
          if(curr.child != null)
            stack.push(child);
            curr.child= null;

       prev = curr;
    }

    dummyHead.next.prev = null;
    return dummyHead.next;
     */
}
