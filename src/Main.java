import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
        public static void main(String[] args) throws ParseException {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            // Praticando Instancias de data-hora para texto \\
            /*
            // Formatacao
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            // Data, mes e ano.
            LocalDate date01 = LocalDate.now();
            LocalDate date04 = LocalDate.parse("2023-10-15");
            LocalDate date08 = LocalDate.parse("15/10/2023",formatter1);
            LocalDate date10 = LocalDate.of(2023,10,15);
            // Data, mes, ano e tempo
            LocalDateTime date02 = LocalDateTime.now();
            LocalDateTime date05 = LocalDateTime.parse("2023-10-15T01:30:33");
            LocalDateTime date09 = LocalDateTime.parse("15/10/2023 01:30",formatter2);
            LocalDateTime date11 = LocalDateTime.of(2023,10,15,01,30);
            // Data-Hora global
            Instant date03 = Instant.now();
            Instant date06 = Instant.parse("2023-10-15T01:30:33Z");
            Instant date07 = Instant.parse("2023-10-15T01:30:33-03:00");

            // Prints:
            System.out.println("LocalDate date01: " + date01);
            System.out.println("LocalDate date04: " + date04);
            System.out.println("LocalDate with formatter 1 date08: " + date08);
            System.out.println("LocalDate with of date10: "+date10);
            System.out.println("LocalDateTime date02: " + date02);
            System.out.println("LocalDateTime date05: " + date05);
            System.out.println("LocalDateTime with formatter 2 date09: " + date09);
            System.out.println("LocalDateTime with of date11: "+date11);
            System.out.println("Instant date03: " + date03);
            System.out.println("Instant date06: " + date06);
            System.out.println("Instant date07: " + date07);
            */

            // ======================================================== \\
            // Praticando Convercão de data-hora pra String ( texto ) \\

            // Criando variaveis para praticar.
            /*
            LocalDate localDate01 = LocalDate.parse("2023-10-15");
            LocalDateTime localDateTime01 = LocalDateTime.parse("2023-10-15T11:30:33");
            Instant instant01 = Instant.parse("2023-10-15T11:30:33Z");

            // Criando Formatacões
            DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            DateTimeFormatter localDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
            DateTimeFormatter localDateTimeFormatter2= DateTimeFormatter.ISO_DATE_TIME;
            DateTimeFormatter instantFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
            DateTimeFormatter instantFormatter2 = DateTimeFormatter.ISO_INSTANT;

            // Prints:
            System.out.println("LocalDate tests: ");
            System.out.println("LocalDate01 without format: " + localDate01);
            System.out.println("LocalDate01 with format: " + localDate01.format(localDateFormatter));
            System.out.println("==============================");
            System.out.println("LocalDateTime tests: ");
            System.out.println("LocalDateTime01 without format: " + localDate01);
            System.out.println("LocalDateTime01 with format: " + localDateTime01.format(localDateTimeFormatter));
            System.out.println("LocalDateTime01 with format ISO_DATE_TIME: " + localDateTime01.format(localDateTimeFormatter2));
            System.out.println("==============================");
            System.out.println("Instant tests: ");
            System.out.println("Instant01 without format: "+ instant01);
            System.out.println("Instant01 with format: "+ instantFormatter.format(instant01));
            System.out.println("Instant01 with format ISO_INSANT: "+ instantFormatter2.format(instant01));
             */
            // ======================================================== \\
            // Praticando Convercão de data-hora global para local \\

            // Criando variaveis para praticar.
            /*
            LocalDate localDate01 = LocalDate.parse("2023-10-15");
            LocalDateTime localDateTime01 = LocalDateTime.parse("2023-10-15T01:30:33");
            Instant instant01 = Instant.parse("2023-10-15T01:30:33Z");

            // Retorna quais nomes posso usar para declarar um fuso-horario especifico
            // ZoneId.getAvailableZoneIds();

            // Convertendo o instant para localDate
            LocalDate result1 = LocalDate.ofInstant(instant01,ZoneId.systemDefault());
            LocalDate result2 = LocalDate.ofInstant(instant01,ZoneId.of("Portugal"));
            // Convertendo instant para localDateTime
            LocalDateTime result3 = LocalDateTime.ofInstant(instant01,ZoneId.systemDefault());
            LocalDateTime result4 = LocalDateTime.ofInstant(instant01,ZoneId.of("Portugal"));


            // Prints :
            System.out.println("LocalDate: ");
            System.out.println("Instant for LocalDate - Result one: "+result1);
            System.out.println("Instant for LocalDate Portugal Zone - Result two: "+result2);
            System.out.println("LocalDate 01 day: "+localDate01.getDayOfMonth());
            System.out.println("LocalDate 01 month: "+localDate01.getMonthValue());
            System.out.println("LocalDate 01 year: "+localDate01.getYear());
            System.out.println("==============================");
            System.out.println("LocalDateTime: ");
            System.out.println("Instant for LocalDateTime - Result one: "+result3);
            System.out.println("Instant for LocalDateTime Portugal Zone - Result two: "+result4);
            System.out.println("LocalDateTime 01 hour: "+localDateTime01.getHour());
            System.out.println("LocalDateTime 01 minutes: "+localDateTime01.getMinute());
            System.out.println("==============================");
             */

            // ======================================================== \\
            // Operacões importantes com data-hora \\
            // Data-hora são imutaveis, se queremos saber algo sobre uma data temos de criar outra para fazer operacões
            /*
            // Métodos padrões usados até mesmo nas outras práticas
            LocalDate localDate01 = LocalDate.parse("2023-10-15");
            LocalDateTime localDateTime01 = LocalDateTime.parse("2023-10-15T01:30:33");
            Instant instant01 = Instant.parse("2023-10-15T01:30:33Z");

            // Métodos novos para diminuir e adicionar 7 dias para todos os metodos de tempo
            LocalDate localDate01PastWeek = localDate01.minusDays(7);
            LocalDate localDate01NextWeek = localDate01.plusDays(7);
            LocalDateTime localDateTime01PastWeek = localDateTime01.minusDays(7);
            LocalDateTime localDateTime01NextWeek = localDateTime01.plusDays(7);
            Instant instantPastWeek = instant01.minus(7, ChronoUnit.DAYS);
            Instant instantNextWeek = instant01.plus(7,ChronoUnit.DAYS);

            // Duration of :
            // Não da para fazer a duracão de duas localDate, precisamos converte-las para localDateTime
            // Temos essas duas formas :
            // Duration dur01 = Duration.between(localDate01PastWeek.atTime(0,0),localDate01.atTime(0,0));
            // Duration dur01 = Duration.between(localDate01PastWeek.atStartOfDay(),localDate01.atStartOfDay());
            // Diferenca é que uma nos manualmente podemos declarar o horario e a outra inicia as 00:00, startOfDay
            Duration dur01 = Duration.between(localDate01PastWeek.atStartOfDay(),localDate01.atStartOfDay());
            Duration dur02 = Duration.between(localDateTime01PastWeek,localDateTime01);
            Duration dur03 = Duration.between(instantPastWeek,instant01);
            // Importante fazermos a data anterior a data que queremos , como uma semana ja passada com dias de hoje , caso contrario a conta da negativo

            // Prints:
            System.out.println("LocalDate: ");
            System.out.println("LocalDate01: "+localDate01);
            System.out.println("LocalDate01PastWeek: "+localDate01PastWeek);
            System.out.println("LocalDate01NextWeek: "+localDate01NextWeek);
            System.out.println("Duration LocalDate01 for LocalDate01PastWeek: "+dur01.toDays());
            System.out.println("==============================");
            System.out.println("LocalDateTime: ");
            System.out.println("LocalDateTime01: "+localDateTime01);
            System.out.println("LocalDateTime01PastWeek: "+localDateTime01PastWeek);
            System.out.println("LocalDateTime01NextWeek: "+localDateTime01NextWeek);
            System.out.println("Duration LocalDateTime01 for LocalDateTime01PastWeek: "+dur02.toDays());
            System.out.println("==============================");
            System.out.println("Instant: "+instant01);
            System.out.println("InstantPastWeek: "+instantPastWeek);
            System.out.println("InstantNextWeek: "+instantNextWeek);
            System.out.println("Instant instant01 for instant01pastWeek: "+dur03.toDays());
            System.out.println("==============================");
            */

            // ======================================================== \\
            // Trabalhando com date \\
            /*
            // Date é um num inteiro que armazema um Long
            // SimpleDateFormat = formata a conversão de date para String
            // * dd/MM/yyyy -> 23/07/2018
            // * dd/mm/yyyy HH:mm:ss -> 23/07/2018 15:42:07
            // Padrão ISO 8601 & Classe Instant
            // Formato ISO: yyyy-MM-ddTHH:mm:ssZ
            // Exemplo: "2018-06-25T15:42:07Z"
            // Date y3 = Date.from(Instant.parse("2018-06-25T15:42"07Z"))

            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

            //System.out.print("Enter with date y1: ");
            //Date y1 = sdf1.parse(sc.next());

            Date x1 = new Date();
            Date x2 = new Date(System.currentTimeMillis());
            Date x3 = new Date(0L);
            Date x4 = new Date(1000L * 60L * 60L * 5L); // Data do dia 01 01 1970 as 05:00
            Date y1 = sdf1.parse("25/06/2018");
            Date y2 = sdf2.parse("25/06/2018 15:42:07");
            Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

            // Without format, padrão java
            System.out.println("Without format: ");
            System.out.println("Date x1: "+x1);
            System.out.println("Date x2: "+x2);
            System.out.println("Date x3: "+x3);
            System.out.println("Date x4: "+x4);
            System.out.println("Date Y1: "+y1);
            System.out.println("Date Y2: "+y2);
            System.out.println("Date Y3: "+y3);
            System.out.println("==============================");
            // Brazilian Hours
            System.out.println("Simple Date Format 2: ");
            System.out.println("Date x1: "+sdf2.format(x1));
            System.out.println("Date x2: "+sdf2.format(x2));
            System.out.println("Date x3: "+sdf2.format(x3));
            System.out.println("Date x4: "+sdf2.format(x4));
            System.out.println("Date Y1: "+sdf2.format(y1));
            System.out.println("Date Y2: "+sdf2.format(y2));
            System.out.println("Date Y3: "+sdf2.format(y3));
            System.out.println("==============================");
            // GMT Hours
            System.out.println("Simple Date Format 3: ");
            System.out.println("Date x1: "+sdf3.format(x1));
            System.out.println("Date x2: "+sdf3.format(x2));
            System.out.println("Date x3: "+sdf3.format(x3));
            System.out.println("Date x4: "+sdf3.format(x4));
            System.out.println("Date Y1: "+sdf3.format(y1));
            System.out.println("Date Y2: "+sdf3.format(y2));
            System.out.println("Date Y3: "+sdf3.format(y3));
            */
            // ======================================================== \\
            // Manipulando data com calendar\\
            /*
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

            System.out.println(sdf.format(d));

            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            // Diferenca: HOUR_OF_DAY muda a hora do dia, oque significa que se eu por 4 e já for 22:00 ele para as 00:00 , enquanto HOUR ignora isso
            cal.add(Calendar.HOUR_OF_DAY,4);
            cal.add(Calendar.HOUR,4);
            d = cal.getTime();
            System.out.println(sdf.format(d));

            // Capturando uma unidade de tempo
            int tempo = cal.get(Calendar.MINUTE);
            // Mais um pois inicia-se em "mes 0"
            int month = 1 + cal.get(Calendar.MONTH);

            System.out.println("Minutes: " +tempo);
            System.out.println("Months: " +month);

             */
        }
}