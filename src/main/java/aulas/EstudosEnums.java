package aulas;

public class EstudosEnums {
    public static void main(String[] args) {
        // Enums são estruturas com constantes definidas,
        //Dias da semana, Meses do ano, Turnos do dia, Estações
        //Feriados

        enum DiaDaSemana{
            SEGUNDA,
            TERÇA,
            QUARTA,
            QUINTA,
            SEXTA,
            SÁBADO,
            DOMINGO
        }

        DiaDaSemana hoje=DiaDaSemana.QUINTA;
        System.out.println(hoje);

        enum NivelDev{JUNIOR, PLENO, SENIOR}
        NivelDev nivel=NivelDev.PLENO;

        switch (nivel){
            case JUNIOR :
                System.out.println("Seu nivel é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nivel é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nivel é SENIOR");
                break;
        }
    }
}
