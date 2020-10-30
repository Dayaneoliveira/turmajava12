programa
{
    inclua biblioteca Matematica --> mat

    funcao inicio()
    {
        real sal = 0, filhos = 0, tfilhos = 0, msal = 0, tsal = 0, mfilhos = 0, maiorsal = 0, menorcem = 0
        inteiro funci, contador = 0


        para (funci=0; funci < 3; funci++)
        {
            escreva ("\nInforme o salário: ")
            leia (sal)
            escreva ("\nInforme o número de filhos: ")
            leia (filhos)

            se (sal > maiorsal)
            {
                maiorsal = sal

            }

            se (sal <= 100)
            {
                    contador ++
            }

        }
            tsal = tsal + sal
            tfilhos = tfilhos + filhos
            msal = mat.arredondar((tsal / 2),3)
            mfilhos = mat.arredondar((tfilhos / 2),3)
            menorcem = (contador*100)/3

            escreva ("\nA média do sal da população é de: "+msal)
            escreva ("\nA média dde fil da população é de: "+mfilhos)
            escreva ("\nO maior sal dentro os inseridos é de: "+maiorsal)
            escreva ("\nO percentual de pessoal com salário até 100 é de: "+menorcem+" %")

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 595; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */