Para compilar e rodar projetos com pacotes no terminal:

Assumindo que sua pasta raiz (onde estão as pastas modelo e principal) se chama projeto-audio, siga estes passos:

Vá para a raiz do projeto:

cd C:\caminho\para\projeto-audio

Compile todos os arquivos de uma vez:

javac -d . modelo/*.java principal/*.java

(O -d . diz ao compilador para colocar os arquivos .class na estrutura de pastas correta, ou seja, nas pastas modelo e principal dentro da raiz.)

Execute a classe principal:

java principal.Principal

(É necessário especificar o nome do pacote (principal) seguido do nome da classe (Principal)).
