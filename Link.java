import java.util.Scanner;

public class Link {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void display() {
        Node currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print("]");
        System.out.println();
    }

    static int lengthList() {
        int count = 0;
        Node current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    static void addAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    static void addAtEnding(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    static void addAtAnyPosition(int position, int value) {
        if (position < 1 || position > lengthList() + 1) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node previous = head;
        for (int i = 1; i < position - 1; i++) {
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;
    }

    static Node deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty.");
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    static Node deleteAtEnding() {
        if (head == null || head.next == null) {
            return deleteAtBeginning();
        }
        Node current = head;
        Node previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;//Current ra jha value achi saita privious ra nexty sangra same dsati pain previous.next ra rederencr ta current ku point
        //karuji current ta null kala null haijiba kintu return bala previous.next ra value asi jiba hatipain current ku phiki diya
    }

    static Node deleteAtAnyPosition(int position) {
        if (position < 1 || position > lengthList()) {
            System.out.println("Invalid position.");
            return null;
        }
        if (position == 1) {
            return deleteAtBeginning();
        }
        Node previous = head;
        for (int i = 1; i < position - 1; i++) {
            previous = previous.next;
        }
        Node deletedNode = previous.next;
        previous.next = deletedNode.next;
        deletedNode.next = null;
        return deletedNode;
    }

    public boolean searchNode(int key) {
        Node current = head;
        int count=1;
       
        while (current != null) {
            if (key == current.data) {
                return true;
            }
            current = current.next;
            count++;
        }
        return false;
    }
    public void sort(){
        if(head.next==null){
            System.out.println("List is sorted:"+head.data);
        }
        Node current,index;
        int data;
        for(current=head;current!=null;current=current.next){
            for(index=current.next;index!=null;index=index.next){
                if(current.data>index.data){
                    data=current.data;
                    current.data=index.data;
                    index.data=data;
                }
            }
        }
    }
    public void reversed(){
        Node current=head;
        Node previous=null;
        Node next=null;
        while (current!=null) {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }
    public static void main(String[] args) {
        Link list = new Link();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements to be added in the list: ");
        int numElements = scanner.nextInt();

        if (numElements <= 0) {
            System.out.println("List is empty.");
        } else {
            System.out.print("Enter the value of the head: ");
            int headValue = scanner.nextInt();
            list.head = new Node(headValue);
            Node currentNode = list.head;
            for (int i = 1; i < numElements; i++) {
                System.out.print("Enter the element for position " + (i + 1) + ": ");
                int value = scanner.nextInt();
                currentNode.next = new Node(value);
                currentNode = currentNode.next;
            }
        }

        System.out.println("Operations you can perform:");
        System.out.println("1- Display the list");
        System.out.println("2- Find the length of the list");
        System.out.println("3- Add element to the list");
        System.out.println("4- Delete element at any position of the list");
        System.out.println("5- Search for an element in the list");
        System.out.println("6- Sorted the List");
        System.out.println("7- For Reversing the LIst");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                list.display();
                break;
            case 2:
                System.out.println("Length of the list is: " + lengthList());
                break;
            case 3:
                System.out.println("1- Add element at the beginning");
                System.out.println("2- Add element at the end of the list");
                System.out.println("3- Add element at any position of the list");
                System.out.print("Enter your choice: ");
                int insertChoice = scanner.nextInt();
                switch (insertChoice) {
                    case 1:
                        System.out.print("Enter the element to add at the beginning: ");
                        int value = scanner.nextInt();
                        addAtBeginning(value);
                        list.display();
                        break;
                    case 2:
                        System.out.print("Enter the element to add at the end: ");
                        value = scanner.nextInt();
                        addAtEnding(value);
                        list.display();
                        break;
                    case 3:
                        System.out.print("Enter the position to add the element: ");
                        int position = scanner.nextInt();
                        System.out.print("Enter the element to add: ");
                        value = scanner.nextInt();
                        addAtAnyPosition(position, value);
                        list.display();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 4:
                System.out.println("1- Delete element from the beginning");
                System.out.println("2- Delete element from the end of the list");
                System.out.println("3- Delete element from any position of the list");
                System.out.print("Enter your choice: ");
                int deleteChoice = scanner.nextInt();
                switch (deleteChoice) {
                    case 1:
                        deleteAtBeginning();
                        list.display();
                        break;
                    case 2:
                        deleteAtEnding();
                        list.display();
                        break;
                    case 3:
                        System.out.print("Enter the position to delete the element: ");
                        int deletePosition = scanner.nextInt();
                        deleteAtAnyPosition(deletePosition);
                        list.display();
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                break;
            case 5:
                System.out.print("Enter the element to search: ");
                int searchElement = scanner.nextInt();
                boolean found = list.searchNode(searchElement);
                if (found) {
                    System.out.println("Element found in the list.");
                } else {
                    System.out.println("Element not found in the list.");
                }
                break;
                case 6:
                System.out.println("Array before sorting");
                list.display();
                System.out.println("List after sorting");
                list.sort();
                list.display();
                break;
                case 7:
                System.out.println("Before Reversing ");
                list.display();
                System.out.println("After Reversed");
                list.reversed();
                list.display();
                break;
                default:
                System.out.println("Invalid choice.");
                break;
        }
        scanner.close();
    }
}
