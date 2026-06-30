package icu.samnyan.aqua.sega.diva.handler.databank;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CstmzItmCtlgHandler_handle_1100617470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8758;

    public CstmzItmCtlgHandler_handle_1100617470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8758 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term8843 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term8844 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term8845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term8849 = newInstance(Class.forName("java.time.LocalTime"));
        Object term8854 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term8864 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8881 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8882 = (long[]) newLongArray(1);
        Object[] term8884 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8885 = (long[]) newLongArray(39);
        Object[] term8925 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8926 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8927 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8928 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term8758, term8758.getClass(), "cmd", "OIHoJeysUi");
        setField(term8758, term8758.getClass(), "req_id", "WXMWFDGcLB");
        setField(term8758, term8758.getClass(), "game_id", "wKWbJssZuG");
        setField(term8758, term8758.getClass(), "r_ver", "NzBMMhkhpT");
        setField(term8758, term8758.getClass(), "kc_serial", "qCpEbQDHdF");
        setField(term8758, term8758.getClass(), "b_serial", "AHbZyFOmlo");
        setField(term8758, term8758.getClass(), "place_id", "TwfWVQGiIj");
        setIntField(term8845, term8845.getClass(), "year", 2029);
        setShortField(term8845, term8845.getClass(), "month", (short) 6);
        setShortField(term8845, term8845.getClass(), "day", (short) 23);
        setField(term8844, term8844.getClass(), "date", term8845);
        setByteField(term8849, term8849.getClass(), "hour", (byte) 21);
        setByteField(term8849, term8849.getClass(), "minute", (byte) 55);
        setByteField(term8849, term8849.getClass(), "second", (byte) 27);
        setIntField(term8849, term8849.getClass(), "nano", 66889274);
        setField(term8844, term8844.getClass(), "time", term8849);
        setField(term8843, term8843.getClass(), "dateTime", term8844);
        setIntField(term8854, term8854.getClass(), "totalSeconds", -10800);
        setField(term8854, term8854.getClass(), "id", "-03:00");
        setField(term8843, term8843.getClass(), "offset", term8854);
        setField(term8864, term8864.getClass(), "id", "America/Recife");
        setLongElement(term8882, 0, -1767217224L);
        setField(term8881, term8881.getClass(), "standardTransitions", term8882);
        setElement(term8884, 1, term8854);
        setField(term8881, term8881.getClass(), "standardOffsets", term8884);
        setLongElement(term8885, 0, -1767217224L);
        setLongElement(term8885, 1, -1206957600L);
        setLongElement(term8885, 2, -1191362400L);
        setLongElement(term8885, 3, -1175374800L);
        setLongElement(term8885, 4, -1159826400L);
        setLongElement(term8885, 5, -633819600L);
        setLongElement(term8885, 6, -622069200L);
        setLongElement(term8885, 7, -602283600L);
        setLongElement(term8885, 8, -591832800L);
        setLongElement(term8885, 9, -570747600L);
        setLongElement(term8885, 10, -560210400L);
        setLongElement(term8885, 11, -539125200L);
        setLongElement(term8885, 12, -531352800L);
        setLongElement(term8885, 13, -191365200L);
        setLongElement(term8885, 14, -184197600L);
        setLongElement(term8885, 15, -155163600L);
        setLongElement(term8885, 16, -150069600L);
        setLongElement(term8885, 17, -128898000L);
        setLongElement(term8885, 18, -121125600L);
        setLongElement(term8885, 19, -99954000L);
        setLongElement(term8885, 20, -89589600L);
        setLongElement(term8885, 21, -68418000L);
        setLongElement(term8885, 22, -57967200L);
        setLongElement(term8885, 23, 499748400L);
        setLongElement(term8885, 24, 511236000L);
        setLongElement(term8885, 25, 530593200L);
        setLongElement(term8885, 26, 540266400L);
        setLongElement(term8885, 27, 562129200L);
        setLongElement(term8885, 28, 571197600L);
        setLongElement(term8885, 29, 592974000L);
        setLongElement(term8885, 30, 602042400L);
        setLongElement(term8885, 31, 624423600L);
        setLongElement(term8885, 32, 634701600L);
        setLongElement(term8885, 33, 938919600L);
        setLongElement(term8885, 34, 951616800L);
        setLongElement(term8885, 35, 970974000L);
        setLongElement(term8885, 36, 971575200L);
        setLongElement(term8885, 37, 1003028400L);
        setLongElement(term8885, 38, 1013911200L);
        setField(term8881, term8881.getClass(), "savingsInstantTransitions", term8885);
        setField(term8881, term8881.getClass(), "savingsLocalTransitions", term8925);
        setElement(term8926, 1, term8854);
        setElement(term8926, 3, term8854);
        setElement(term8926, 5, term8854);
        setElement(term8926, 7, term8854);
        setElement(term8926, 9, term8854);
        setElement(term8926, 11, term8854);
        setElement(term8926, 13, term8854);
        setElement(term8926, 15, term8854);
        setElement(term8926, 17, term8854);
        setElement(term8926, 19, term8854);
        setElement(term8926, 21, term8854);
        setElement(term8926, 23, term8854);
        setElement(term8926, 25, term8854);
        setElement(term8926, 27, term8854);
        setElement(term8926, 29, term8854);
        setElement(term8926, 31, term8854);
        setElement(term8926, 33, term8854);
        setElement(term8926, 35, term8854);
        setElement(term8926, 37, term8854);
        setElement(term8926, 39, term8854);
        setField(term8881, term8881.getClass(), "wallOffsets", term8926);
        setField(term8881, term8881.getClass(), "lastRules", term8927);
        setField(term8928, term8928.getClass(), "table", null);
        setField(term8928, term8928.getClass(), "nextTable", null);
        setLongField(term8928, term8928.getClass(), "baseCount", 0L);
        setIntField(term8928, term8928.getClass(), "sizeCtl", 0);
        setIntField(term8928, term8928.getClass(), "transferIndex", 0);
        setIntField(term8928, term8928.getClass(), "cellsBusy", 0);
        setField(term8928, term8928.getClass(), "counterCells", null);
        setField(term8928, term8928.getClass(), "keySet", null);
        setField(term8928, term8928.getClass(), "values", null);
        setField(term8928, term8928.getClass(), "entrySet", null);
        setField(term8928, term8928.getClass(), "keySet", null);
        setField(term8928, term8928.getClass(), "values", null);
        setField(term8881, term8881.getClass(), "lastRulesCache", term8928);
        setField(term8864, term8864.getClass(), "rules", term8881);
        setField(term8843, term8843.getClass(), "zone", term8864);
        setField(term8758, term8758.getClass(), "time_stamp", term8843);
        setField(term8758, term8758.getClass(), "start_up_mode", "gUvcueTURF");
        setField(term8758, term8758.getClass(), "cmm_dly_mod", "EwQBhZjCIT");
        setField(term8758, term8758.getClass(), "cmm_dly_sec", "aSkmSwTnEw");
        setField(term8758, term8758.getClass(), "cmm_err_mod", "xvkbvaEGYd");
        setField(term8758, term8758.getClass(), "country_code", "HBGNxdNURv");
        setField(term8758, term8758.getClass(), "region_code", "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CstmzItmCtlgHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term8758;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


