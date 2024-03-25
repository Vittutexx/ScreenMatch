import java.util.ArrayList;

public class Terminal {
    public static void main(String[] args) {
            /*2. No método main da classe Principal,
             crie um ArrayList de Pessoa chamado listaDePessoas. */
            ArrayList listaDePessoas = new ArrayList();


            /*3. Adicione pelo menos três pessoas à
            lista utilizando o método add. */

            //Instanciando os Objetos e atribuindo valor a pessoa1, pessoa2, e pessoa3
            Pessoua pessoa1 = new Pessoua();
            pessoa1.setNome("Carlos");
            pessoa1.setIdade(16);

            Pessoua pessoa2 = new Pessoua();
            pessoa2.setNome("Irineu");
            pessoa2.setIdade(20);

            Pessoua pessoa3 = new Pessoua();
            pessoa3.setIdade(25);
            pessoa3.setNome("Marfim");


            //atribuindo os objetos na array
            listaDePessoas.add(pessoa1);
            listaDePessoas.add(pessoa2);
            listaDePessoas.add(pessoa3);

            /*4. Imprima o tamanho da lista utilizando o método size. */

            //imprimindo o tamanho da array
            System.out.println(listaDePessoas.size());

            /*5. Imprima a primeira pessoa da lista utilizando o método get. */

            //imprimindo o valor inicial da array
            System.out.println("Valor inicial da array: " +listaDePessoas.get(0));

            /*6. Imprima a lista completa */

            //imprimindo todos os objetos da array
            for (int i = 0; i <= 2; i++) {
                System.out.println(listaDePessoas.get(i));
            }

        }

    }


