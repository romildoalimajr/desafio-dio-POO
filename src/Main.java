import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da Mentoria de Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcammp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRomildo = new Dev();
        devRomildo.setNome("Romildo");
        devRomildo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Romildo.: " + devRomildo.getConteudosInscritos());
        devRomildo.progredir();
        devRomildo.progredir();
        devRomildo.progredir();
        System.out.println("------------------");
        System.out.println("Conteudos Inscritos Romildo.: " + devRomildo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Romildo.: " + devRomildo.getConteudosConcluidos());
        System.out.println("XP.: " + devRomildo.calcularTotalXp());

        System.out.println(" -+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

        Dev devCecilia = new Dev();
        devCecilia.setNome("Cecília");
        devCecilia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Cecília.: " + devCecilia.getConteudosInscritos());
        devCecilia.progredir();
        System.out.println("------------------");
        System.out.println("Conteudos Inscritos Cecília.: " + devCecilia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Cecília.: " + devCecilia.getConteudosConcluidos());
        System.out.println("XP.: " + devCecilia.calcularTotalXp());

    }
}
