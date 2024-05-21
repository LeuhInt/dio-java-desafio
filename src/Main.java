import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("OO");
        curso1.setCargaHoraria(60);

        Curso curso2 = new Curso();
        curso2.setTitulo("Stream");
        curso2.setDescricao("API");
        curso2.setCargaHoraria(30);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição OO");
        mentoria1.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("OOP");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Devs devJhon = new Devs();
        devJhon.setNome("Dev Jhon");
        devJhon.inscreverBootcamp(bootcamp1);
        System.out.println("Jhon conteudos inscritos: " + devJhon.getConteudosInscritos());
        devJhon.progredir();
        System.out.println("Jhon conteudos concluidos: " + devJhon.getConteudosConcluidos());
        System.out.println("Jhon conteudos inscritos: " + devJhon.getConteudosInscritos());
        System.out.println("XP " + devJhon.calcularTotalXp());

        Devs devMary = new Devs();
        devMary.setNome("Dev Mary");
        devMary.inscreverBootcamp(bootcamp1);
        System.out.println("Mary conteudos inscritos: " + devMary.getConteudosInscritos());
        devMary.progredir();
        System.out.println("Mary conteudos concluidos: " + devMary.getConteudosConcluidos());
        System.out.println("XP " + devJhon.calcularTotalXp());


    }
}
