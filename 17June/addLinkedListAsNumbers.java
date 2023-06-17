/**
 * Definition of linked list:
 *
 * class Node {
 * public:
 *      int data;
 *      Node *next;
 *      Node() {
 *          this->data = 0;
 *          this->next = NULL;
 *      }
 *      Node(int data) {
 *          this->data = data;
 *          this->next = NULL;
 *      }
 *      Node (int data, Node *next) {
 *          this->data = data;
 *          this->next = next;
 *      }
 * };
 *
 *************************************************************************/

    // java solution server error
    // static LinkedListNode reverseLL(LinkedListNode curr){
    //     LinkedListNode prev = null;
    //     while(curr != null){
    //         LinkedListNode temp = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = temp;
    //     }
    //     return prev;
    // }
    // static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
    //     LinkedListNode h1 = reverseLL(head1);
    //     LinkedListNode h2 = reverseLL(head2);

    //     return h1;
    //     LinkedListNode ans = new LinkedListNode(-1);
    //     LinkedListNode h3 = ans.next;
    //     int carry = 0;
    //     while(h1 != null && h2 != null){
    //         int sum = h1.data + h2.data + carry;

    //         LinkedListNode curr = new LinkedListNode(sum % 10);
    //         ans.next = curr;
    //         ans = ans.next;

    //         carry = sum / 10;
    //         h1 = h1.next;
    //         h2 = h2.next;
    //     }
    //     if(carry != 0){
    //         LinkedListNode curr = new LinkedListNode(carry);
    //         ans.next = curr;
    //         ans = ans.next;
    //     }
    //     return reverseLL(h3);
    // }

// Node *addTwoNumbers(Node *num1, Node *num2)
// {
//      Node *dummy=new Node();
//     Node *temp=dummy;
//     int carry=0;
//     while(num1!=NULL || num2!=NULL || carry!=0){
//         int sum=0;
//         if(num1 != NULL){
//             sum+=num1->data;
//             num1=num1->next;
//         }
//         if(num2 != NULL){
//             sum+=num2->data;
//             num2=num2->next;
//         }
//         sum+=carry;
//         carry=sum/10;
//         Node* newtempnode=new Node(sum%10);
//         temp->next=newtempnode;
//         temp=temp->next;
//     }
//     return dummy->next;
// }
