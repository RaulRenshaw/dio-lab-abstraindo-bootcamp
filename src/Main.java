import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso js");
        curso.setDescricao("Descricao curso js");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Raul");
        dev.inscreverBootcamp(bootcamp);
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
        dev.progredir();
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
        dev.progredir();
        System.out.println(dev.getConteudosInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
    }
}