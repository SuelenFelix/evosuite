package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_getKcserial_9102319164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250099;

    public BaseRequest_getKcserial_9102319164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250099 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term250184 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term250185 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250186 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250190 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250195 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term250205 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term250222 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term250223 = (long[]) newLongArray(1);
        Object[] term250225 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term250226 = (long[]) newLongArray(39);
        Object[] term250266 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term250267 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term250268 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term250269 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term250099, term250099.getClass(), "cmd", "nyZemBzxeX");
        setField(term250099, term250099.getClass(), "req_id", "mYUsMDfwJF");
        setField(term250099, term250099.getClass(), "game_id", "IYNumeLuJm");
        setField(term250099, term250099.getClass(), "r_ver", "baWqGUwddd");
        setField(term250099, term250099.getClass(), "kc_serial", "ytUYpWefdA");
        setField(term250099, term250099.getClass(), "b_serial", "fdBtFIcFIQ");
        setField(term250099, term250099.getClass(), "place_id", "XixxNbivtN");
        setIntField(term250186, term250186.getClass(), "year", 2025);
        setShortField(term250186, term250186.getClass(), "month", (short) 1);
        setShortField(term250186, term250186.getClass(), "day", (short) 20);
        setField(term250185, term250185.getClass(), "date", term250186);
        setByteField(term250190, term250190.getClass(), "hour", (byte) 22);
        setByteField(term250190, term250190.getClass(), "minute", (byte) 55);
        setByteField(term250190, term250190.getClass(), "second", (byte) 9);
        setIntField(term250190, term250190.getClass(), "nano", 660955568);
        setField(term250185, term250185.getClass(), "time", term250190);
        setField(term250184, term250184.getClass(), "dateTime", term250185);
        setIntField(term250195, term250195.getClass(), "totalSeconds", -10800);
        setField(term250195, term250195.getClass(), "id", "-03:00");
        setField(term250184, term250184.getClass(), "offset", term250195);
        setField(term250205, term250205.getClass(), "id", "America/Recife");
        setLongElement(term250223, 0, -1767217224L);
        setField(term250222, term250222.getClass(), "standardTransitions", term250223);
        setElement(term250225, 1, term250195);
        setField(term250222, term250222.getClass(), "standardOffsets", term250225);
        setLongElement(term250226, 0, -1767217224L);
        setLongElement(term250226, 1, -1206957600L);
        setLongElement(term250226, 2, -1191362400L);
        setLongElement(term250226, 3, -1175374800L);
        setLongElement(term250226, 4, -1159826400L);
        setLongElement(term250226, 5, -633819600L);
        setLongElement(term250226, 6, -622069200L);
        setLongElement(term250226, 7, -602283600L);
        setLongElement(term250226, 8, -591832800L);
        setLongElement(term250226, 9, -570747600L);
        setLongElement(term250226, 10, -560210400L);
        setLongElement(term250226, 11, -539125200L);
        setLongElement(term250226, 12, -531352800L);
        setLongElement(term250226, 13, -191365200L);
        setLongElement(term250226, 14, -184197600L);
        setLongElement(term250226, 15, -155163600L);
        setLongElement(term250226, 16, -150069600L);
        setLongElement(term250226, 17, -128898000L);
        setLongElement(term250226, 18, -121125600L);
        setLongElement(term250226, 19, -99954000L);
        setLongElement(term250226, 20, -89589600L);
        setLongElement(term250226, 21, -68418000L);
        setLongElement(term250226, 22, -57967200L);
        setLongElement(term250226, 23, 499748400L);
        setLongElement(term250226, 24, 511236000L);
        setLongElement(term250226, 25, 530593200L);
        setLongElement(term250226, 26, 540266400L);
        setLongElement(term250226, 27, 562129200L);
        setLongElement(term250226, 28, 571197600L);
        setLongElement(term250226, 29, 592974000L);
        setLongElement(term250226, 30, 602042400L);
        setLongElement(term250226, 31, 624423600L);
        setLongElement(term250226, 32, 634701600L);
        setLongElement(term250226, 33, 938919600L);
        setLongElement(term250226, 34, 951616800L);
        setLongElement(term250226, 35, 970974000L);
        setLongElement(term250226, 36, 971575200L);
        setLongElement(term250226, 37, 1003028400L);
        setLongElement(term250226, 38, 1013911200L);
        setField(term250222, term250222.getClass(), "savingsInstantTransitions", term250226);
        setField(term250222, term250222.getClass(), "savingsLocalTransitions", term250266);
        setElement(term250267, 1, term250195);
        setElement(term250267, 3, term250195);
        setElement(term250267, 5, term250195);
        setElement(term250267, 7, term250195);
        setElement(term250267, 9, term250195);
        setElement(term250267, 11, term250195);
        setElement(term250267, 13, term250195);
        setElement(term250267, 15, term250195);
        setElement(term250267, 17, term250195);
        setElement(term250267, 19, term250195);
        setElement(term250267, 21, term250195);
        setElement(term250267, 23, term250195);
        setElement(term250267, 25, term250195);
        setElement(term250267, 27, term250195);
        setElement(term250267, 29, term250195);
        setElement(term250267, 31, term250195);
        setElement(term250267, 33, term250195);
        setElement(term250267, 35, term250195);
        setElement(term250267, 37, term250195);
        setElement(term250267, 39, term250195);
        setField(term250222, term250222.getClass(), "wallOffsets", term250267);
        setField(term250222, term250222.getClass(), "lastRules", term250268);
        setField(term250269, term250269.getClass(), "table", null);
        setField(term250269, term250269.getClass(), "nextTable", null);
        setLongField(term250269, term250269.getClass(), "baseCount", 0L);
        setIntField(term250269, term250269.getClass(), "sizeCtl", 0);
        setIntField(term250269, term250269.getClass(), "transferIndex", 0);
        setIntField(term250269, term250269.getClass(), "cellsBusy", 0);
        setField(term250269, term250269.getClass(), "counterCells", null);
        setField(term250269, term250269.getClass(), "keySet", null);
        setField(term250269, term250269.getClass(), "values", null);
        setField(term250269, term250269.getClass(), "entrySet", null);
        setField(term250269, term250269.getClass(), "keySet", null);
        setField(term250269, term250269.getClass(), "values", null);
        setField(term250222, term250222.getClass(), "lastRulesCache", term250269);
        setField(term250205, term250205.getClass(), "rules", term250222);
        setField(term250184, term250184.getClass(), "zone", term250205);
        setField(term250099, term250099.getClass(), "time_stamp", term250184);
        setField(term250099, term250099.getClass(), "start_up_mode", "wOXNBqWiix");
        setField(term250099, term250099.getClass(), "cmm_dly_mod", "inGpCNlqqu");
        setField(term250099, term250099.getClass(), "cmm_dly_sec", "PzAzTtIUoU");
        setField(term250099, term250099.getClass(), "cmm_err_mod", "pltGCOzvHY");
        setField(term250099, term250099.getClass(), "country_code", "snpbZcNTTs");
        setField(term250099, term250099.getClass(), "region_code", "SXATqDKVMx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKc_serial", argTypes, term250099, args);
    }

};


