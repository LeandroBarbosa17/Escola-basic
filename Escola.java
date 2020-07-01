package escola;
import java.util.Scanner;
/**
 *
 * @author Leandro Barbosa Cabral
 */
public class Escola {

    public static void main(String[] args) {
        
        //Criaçao do Scanner 
        Scanner input = new Scanner(System.in);
        
        char fm;
        String nomeEscola;
        
        //Criaçao dos objetos
        Pessoa pessoa = new Pessoa();
        Professor professor = new Professor();
        Diretor diretor = new Diretor();
        Aluno aluno = new Aluno();
        
        System.out.print("Digite o nome da escola: ");
        nomeEscola = input.next();
        
        
        System.out.println("Informaçoes sobre a escola " + nomeEscola + "!");
        System.out.println("----------------------------------------");
        
        //Informaçoes do professor
        System.out.print("Digite o nome do professor: ");
        professor.setNome(input.next());
        System.out.println();
        System.out.print("Qual a idade do professor? ");
        professor.setIdade(input.nextInt());
        System.out.println();
        System.out.print("Digite o cpf do professor: ");
        professor.setCpf((int) input.nextFloat());
        System.out.print("Digite a disciplina ministrada: ");
        professor.setDisciplina(input.next());
        System.out.println();
        System.out.print("Informe qual dia da semana o professor ministra a aula: ");
        professor.setDiaAula(input.next());
        System.out.println();
        System.out.print("Informe o horario inicial da aula do professor: ");
        professor.setHorarioAula(input.nextFloat());
        System.out.println();
        System.out.print("Informe o salario do professor: ");
        professor.setSalario(input.nextFloat());
        System.out.println();
        System.out.println();
        
        //Informaçoes do diretor
        System.out.print("Informe o nome do diretor: ");
        diretor.setNome(input.next());
        System.out.println();
        System.out.print("Informe a idade do diretor: ");
        diretor.setIdade(input.nextInt());
        System.out.println();
        System.out.print("Informe o cpf do diretor: ");
        diretor.setCpf((int) input.nextFloat());
        System.out.println();
        System.out.print("Informe o horario de atendimento disponivel do diretor: ");
        diretor.setHorarioAtendimento(input.nextFloat());
        System.out.println();
        System.out.print("Informe o salario do diretor: ");
        diretor.setSalario(input.nextFloat());
        System.out.println();
        System.out.println();
        
        //Informaçoes do aluno
        System.out.print("Informe o nome do aluno: ");
        aluno.setNome(input.next());
        System.out.println();
        System.out.print("Informe a idade do aluno: ");
        aluno.setIdade(input.nextInt());
        System.out.println();
        System.out.print("Informe o cpf do aluno: ");
        aluno.setCpf((int) input.nextFloat());
        System.out.println();
        System.out.print("Informe a media anual do aluno: ");
        aluno.setMediaAnual(input.nextFloat());
        System.out.println();
        
        do{
        System.out.print("O aluno se encontra no ensino fundamental ou medio? (F/M)");
        fm = input.next().charAt(0);
        
        if (fm == 'F' || fm == 'f'){
            System.out.println();
            System.out.print("Informe a serie do fundamental em que o aluno se encontra; ");
            aluno.setSerie(input.nextInt());
        }
        
        else if(fm == 'M' || fm == 'm'){
            System.out.println();
            System.out.print("Informe a serio do ensino medio em que o aluno se encontra: ");
            aluno.setSerie(input.nextInt());
        }
       
        else{
            System.out.println("Entrada invalida!!");
        }
      } while(fm != 'F' && fm!= 'f' && fm != 'M' && fm != 'm');
        System.out.println();
        System.out.println();
        
        //Exibindo os dados do professor
        System.out.println("Nome do professor: " + professor.getNome());
        System.out.println("Idade do professor: " + professor.getIdade());
        System.out.println("Cpf do professor: " + professor.getCpf());
        System.out.println("Disciplina do professor: " + professor.getDisciplina());
        System.out.println("Dia de aula do professor: " + professor.getDiaAula());
        System.out.println("Horario da aula do professor: " + professor.getHorarioAula());
        System.out.println("Salario do professor: " + professor.getSalario());
        System.out.println();
        
        //Exibindo os dados do diretor
        System.out.println("Nome do diretor: " + diretor.getNome());
        System.out.println("Idade do diretor: " + diretor.getIdade());
        System.out.println("Cpf do diretor: " + diretor.getCpf());
        System.out.println("Horario disponivel do diretor: " + diretor.getHorarioAtendimento());
        System.out.println("Salario do diretor: " + diretor.getSalario());
        System.out.println();
        
        //Exibindo os dados do aluno
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Idade do aluno: " + aluno.getIdade());
        System.out.println("Cpf do aluno: " + aluno.getCpf());
        System.out.println("Media anual do aluno: " + aluno.getMediaAnual());
        
        if (fm == 'S' || fm == 's'){
            System.out.println("Serie do aluno: " + aluno.getSerie() + "° ano do ensino fundamental!");
        }
        else{
            System.out.println("Serie do aluno: " + aluno.getSerie() + "° ano do ensino medio!");
        }
        
        
        
        
        
        
        
    }
    
}
