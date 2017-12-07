package local.util;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class GetDateTime {

    Locale locale = new Locale("pt", "BR");
    GregorianCalendar calendar = new GregorianCalendar();

    public String getHoraAtual() {
        SimpleDateFormat formatador = new SimpleDateFormat("HH", locale);
        return formatador.format(calendar.getTime());
    }
    public String getMinutoAtual() {
        SimpleDateFormat formatador = new SimpleDateFormat("mm", locale);
        return formatador.format(calendar.getTime());
    }

}
