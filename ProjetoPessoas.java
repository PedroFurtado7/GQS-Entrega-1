public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class PessoaFisica extends Pessoa {
    private int cpf;

    public PessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return "PF: " + super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome("PF: " + nome);
    }
}

public class PessoaJuridica extends Pessoa {
    private int cnpj;

    public PessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return "PJ: " + super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome("PJ: " + nome);
    }
}

public class Sistema {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João");
        PessoaFisica pessoaFisica1 = new PessoaFisica("Maria", 123456789);
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa X", 987654321);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoaFisica1.getNome() + " - CPF: " + pessoaFisica1.getCpf());
        System.out.println(pessoaJuridica1.getNome() + " - CNPJ: " + pessoaJuridica1.getCnpj());
    }
}
