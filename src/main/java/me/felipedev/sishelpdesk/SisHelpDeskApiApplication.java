package me.felipedev.sishelpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import me.felipedev.sishelpdesk.domain.Cliente;
import me.felipedev.sishelpdesk.domain.Tecnico;
import me.felipedev.sishelpdesk.domain.Chamado;
import me.felipedev.sishelpdesk.domain.enums.Perfil;
import me.felipedev.sishelpdesk.domain.enums.Prioridade;
import me.felipedev.sishelpdesk.domain.enums.Status;
import me.felipedev.sishelpdesk.repositories.ChamadoRepository;
import me.felipedev.sishelpdesk.repositories.ClienteRepository;
import me.felipedev.sishelpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class SisHelpDeskApiApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

    public static void main(String[] args) {
        SpringApplication.run(SisHelpDeskApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        // Criando Técnicos
        Tecnico tec1 = new Tecnico(null, "Luis Lima", "51471880998", "luislima@dev.com", "123456");
        tec1.addPerfis(Perfil.ADMIN);
        
        Tecnico tec2 = new Tecnico(null, "Ana Souza", "99123456789", "ana.souza@dev.com", "abcdef");
        tec2.addPerfis(Perfil.TECNICO);

        Tecnico tec3 = new Tecnico(null, "Carlos Silva", "99234567890", "carlos.silva@dev.com", "qwerty");
        tec3.addPerfis(Perfil.TECNICO);

        Tecnico tec4 = new Tecnico(null, "Mariana Oliveira", "99876543210", "mariana@dev.com", "password");
        tec4.addPerfis(Perfil.TECNICO);

        Tecnico tec5 = new Tecnico(null, "Roberto Costa", "99765432109", "roberto@dev.com", "123abc");
        tec5.addPerfis(Perfil.ADMIN);

        // Criando Clientes
        Cliente cli1 = new Cliente(null, "Cliente 1", "65898762588", "clie1@email.com", "1122334455");
        Cliente cli2 = new Cliente(null, "Cliente 2", "65987654321", "clie2@email.com", "2233445566");
        Cliente cli3 = new Cliente(null, "Cliente 3", "66778899000", "clie3@email.com", "3344556677");
        Cliente cli4 = new Cliente(null, "Cliente 4", "66889900111", "clie4@email.com", "4455667788");
        Cliente cli5 = new Cliente(null, "Cliente 5", "66990011222", "clie5@email.com", "5566778899");

        // Criando Chamados
        Chamado c1 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 01", "Chamado de teste", tec1, cli1);
        Chamado c2 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 02", "Chamado de baixa prioridade", tec2, cli2);
        Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 03", "Chamado de baixa prioridade já fechado", tec3, cli3);
        Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ANDAMENTO, "Chamado 04", "Chamado urgente", tec4, cli4);
        Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ABERTO, "Chamado 05", "Chamado em andamento", tec5, cli5);
        
        tecnicoRepository.saveAll(Arrays.asList(tec1,tec2,tec3,tec4,tec5));
        clienteRepository.saveAll(Arrays.asList(cli1,cli2,cli3,cli4,cli5));
        chamadoRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5));
        
    }
}
