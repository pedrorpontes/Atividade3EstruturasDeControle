import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Atividade3EstruturasDeControle
	{
		public static void main(String[] args)
			{
				int[] lista = new int[]
					{ 1, 2, 3, 4, 5 };
				Stack<Integer> pilha = new Stack<>();
				for (int i = 0; i < lista.length; i++)
					{
						pilha.push(lista[i]);
					}

				Queue<Integer> fila = new LinkedList<>();
				for (int i = 0; i < 5; i++)
					{
						fila.offer(pilha.pop());
					}
				lista = new int[]
					{ 6, 7, 8, 9, 10 };

				for (int i = 0; i < lista.length; i++)
					{
						pilha.push(lista[i]);
					}

				for (int i = 0; i < 5; i++)
					{
						fila.offer(pilha.pop());
					}
				fila.stream().forEach(System.out::println);
			}
	}
