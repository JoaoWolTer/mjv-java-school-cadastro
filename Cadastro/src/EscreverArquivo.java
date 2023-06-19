import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;

public class EscreverArquivo {

    public void registrarCandidato(Cadastro cadastro){
        try{
            StringBuilder conteudo = new StringBuilder();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String conteudoFinal;
			
            conteudo.append(cadastro.getNome() + ";");
            conteudo.append(cadastro.getCpf() + ";");
            conteudo.append(formatter.format(cadastro.getDataNascimento())+ ";");
            conteudo.append(cadastro.getSexo() + ";");
            conteudo.append(cadastro.getLogradouro() + ";");
            conteudo.append(cadastro.getNumero() + ";");
            conteudo.append(cadastro.getBairro() + ";");
            conteudo.append(cadastro.getCidade() + ";");
            conteudo.append(cadastro.getEstado() + ";");
            conteudo.append(cadastro.getEmail() + ";");
            conteudo.append(cadastro.getTelefone() + ";");
            conteudo.append(cadastro.getCelular() + ";");
            conteudo.append(cadastro.getProfissao() + ";");
            conteudo.append(cadastro.getEmpresa() + ";");
            conteudo.append(cadastro.getSalario() + ";");
            conteudo.append(cadastro.isEmpregoAtual() == true ? "SIM;" : "NÃO;");
            conteudo.append(cadastro.getPretencaoMinima() + ";");
            conteudo.append(cadastro.getPretencaoMaxima() + ";");
            conteudo.append(cadastro.getHabilidades());
            conteudo.append(System.lineSeparator());

            conteudoFinal = conteudo.toString().replace("null", " "); 

            Path diretorio = Paths.get(System.getProperty("user.dir") + "\\arquivos");
            Path arquivo = Paths.get(diretorio+"\\candidatos.csv");

            if(!Files.exists(diretorio)) 
                Files.createDirectory(diretorio);

            if(!Files.exists(arquivo)){ 
                Files.createFile(arquivo);
                String cabecalho = "NOME;CPF;DATA_NASCIMENTO;SEXO;LOGRADOURO;NUMERO;BAIRRO;" +
                        "CIDADE;ESTADO;EMAIL;TELEFONE;CELULAR;PROFISSAO;EMPRESA;SALARIO;" +
                        "EMPREGO_ATUAL;PRETENCAO_MINIMA;PRETENCAO_MAXIMA;HABILIDADES"+System.lineSeparator();
                Files.write(arquivo, cabecalho.getBytes(StandardCharsets.UTF_8),  StandardOpenOption.APPEND);
            }

            Files.write(arquivo, conteudoFinal.getBytes(StandardCharsets.UTF_8),  StandardOpenOption.APPEND);

        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
