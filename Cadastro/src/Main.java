import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        EscreverArquivo registro = new EscreverArquivo();
        Cadastro candidato1 = new Cadastro();
        Cadastro candidato2 = new Cadastro();

        candidato1.setNome("João Wolter");
        candidato1.setCpf("111.111.111-11");
        candidato1.setDataNascimento(LocalDate.parse("01/01/1991", formatter));
        candidato1.setSexo(SexoEnum.MASCULINO);
        candidato1.setLogradouro("Rua Um");
        candidato1.setNumero("111");
        candidato1.setBairro("Centro");
        candidato1.setCidade("Blumenau");
        candidato1.setEstado("SC");
        candidato1.setEmail("joao_wolter@hotmail.com");
        candidato1.setCelular(47999998888);
        candidato1.setProfissao("Auxiliar administrativo");
        candidato1.setEmpresa("Empresa1");
        candidato1.setSalario(2000.0);
        candidato1.setPretencaoMinima(1800.0);
        candidato1.setPretencaoMaxima(3000.0);
        candidato1.setHabilidades("Excel, Atendimento, JAVA");

        registro.registrarCandidato(candidato1);

        candidato2.setNome("Camila Firmo");
        candidato2.setCpf("222.222.222-22");
        candidato2.setDataNascimento(LocalDate.parse("02/02/1992", formatter));
        candidato2.setSexo(SexoEnum.FEMININO);
        candidato2.setLogradouro("Rua dois");
        candidato2.setNumero("22");
        candidato2.setBairro("Centro 2");
        candidato2.setCidade("Pomerode");
        candidato2.setEstado("RS");
        candidato2.setEmail("camila@gmail.com");
        candidato2.setTelefone(47888889999);
        candidato2.setProfissao("Tatuadora");
        candidato2.setEmpresa("Empresa2");
        candidato2.setSalario(4000.0);
        candidato2.setPretencaoMinima(3000.0);
        candidato2.setPretencaoMaxima(8000.0);
        candidato2.setHabilidades("Comunicacao, Arte");

        registro.registrarCandidato(candidato2);

    }
}