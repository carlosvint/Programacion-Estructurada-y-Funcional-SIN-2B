package OctavaClase;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        String[] array = new String[3];

        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}






// public class Main {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<>();

//         // Enqueue elements into the queue
//         queue.add(1);
//         queue.add(2);
//         queue.add(3);

//         System.out.println("Elemento al frente de la cola: " + queue.peek());

//         // Dequeue elements from the queue
//         while (!queue.isEmpty()) {
//             System.out.println(queue.poll());
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();

//         // Push elements onto the stack
//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         System.out.println("Elemento en la cima: " + stack.peek());

//         // Pop elements from the stack
//         while (!stack.isEmpty()) {
//             System.out.println(stack.pop());
//         }
//     }
// }
