package data_hora;

public class Conceitos {
    
    public static void main(String[] args) {
        /*
         * Data - [Hora] local:
         * ano-mês-dia-[hora] sem fuso horário
         * [hora] opcional
         * É indicado quando o momento exato não interessa a pessoas de outro fuso horário. ex: sistemas de reunião única, EXCEL.
         * data de nascimento
         * data-hora da venda 13/08/2022 às 15:32

         * Data-hora global:
         * ano-mês-dia-hora com fuso horário
         * Quando o momento exato interessa a pessoas de outro fuso horário
         * ex: sistemas multi-região, web 

         * Duração:
         * tempo decorrido entre duas data-horas


         * Timezone (fuso horário):

         * GMT - Greenwich Mean Time
         * Horário de Londres
         * Horário do padrão UTC 
         * Tabém chamado de "Z" time, ou Zulu time

         * Outros fusos horários são relativos ao GMT/UTC:
         * São Paulo: GMT -3
         * Manaus: GMT -4
         * Portugal: GMT +1

         * Muitas linguagens/tecnologias usam nomes para as timezones:
         * US/PACIFIC
         * AMERICA/SAO_PAULO
         * etc

         * Padrão ISO 8601
         * Data-[Hora] local:
         * 2022-07-21
         * 2022-07-21T14:52
         * 2022-07-21T14:52:09
         * 2022-07-21T14:52:09:4073

         * Data-hora global:
         * 2022-07-23T14:52:09Z
         * 2022-07-23T14:52:09.254935Z
         * 2022-07-23T14:52:09-03:00 // horário gmt -3

         * Operações importantes com data-hora:

         * Instanciação
         * (agora) -> Data-Hora
         * Texto ISO 8601 -> Data-Hora
         * Texto formato customizado -> Data-Hora
         * dia,mês,ano,[horário] -> Data-hora local

         * Formatação
         * Data-hora -> Texto ISO 8601
         * Data-Hora -> Texto formato customizado
 
         * Obter dados de uma data-hora local
         * Data-Hora local -> dia,mês,ano,horário
   
         * Converter data-hora global para local
         * Data-hora global, timezone (sistema local) -> Data-hora local

         * Cálculos com data-hora
         * Data-hora +/- tempo -> Data-hora
         * Data-Hora 1, Data-Hora2 -> Duração


         * Principais tipos:

         * Data-Hora local:
         * LocalDate
         * LocalDateTime

         * Data-hora global
         * Instant

         * Duração
         * Duration

         * Outros
         * Zoneid
         * ChronoUnit
         */
    }
}
