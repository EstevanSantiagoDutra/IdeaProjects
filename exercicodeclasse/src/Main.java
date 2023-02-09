public class Main {
    public static void main(String[] args) {
        class Contato {
        private String nome;
        private String email;

        public Contato(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

        class Agenda {
            private Contato[] contatos;
            private int tamanho = 0;

            public Agenda(int capacidade) {
                contatos = new Contato[capacidade];
            }

            public void adicionarContato(Contato c) {
                for (int i = 0; i < contatos.length; i++) {
                    if (contatos[i] == null) {
                        contatos[i] = c;
                        tamanho++;
                        break;
                    }
                }
            }

            public Contato buscarContato(String nome) {
                for (int i = 0; i < contatos.length; i++) {
                    if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
                        return contatos[i];
                    }
                }
                return null;
            }

            public void excluirContato(String nome) {
                for (int i = 0; i < contatos.length; i++) {
                    if (contatos[i] != null && contatos[i].getNome().equals(nome)) {
                        contatos[i] = null;
                        tamanho--;
                        break;
                    }
                }
            }
        }
    }
}