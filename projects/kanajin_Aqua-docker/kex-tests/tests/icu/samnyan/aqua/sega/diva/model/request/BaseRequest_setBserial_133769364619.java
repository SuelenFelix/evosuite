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

public class BaseRequest_setBserial_133769364619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256764;

    public BaseRequest_setBserial_133769364619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term256764 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term256849 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term256850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term256851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term256855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256860 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term256870 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term256887 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term256888 = (long[]) newLongArray(1);
        Object[] term256890 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term256891 = (long[]) newLongArray(39);
        Object[] term256931 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term256932 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term256933 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term256934 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term256764, term256764.getClass(), "cmd", "dWaVZloZWE");
        setField(term256764, term256764.getClass(), "req_id", "vgZFgEliKc");
        setField(term256764, term256764.getClass(), "game_id", "cwNMyoCqHJ");
        setField(term256764, term256764.getClass(), "r_ver", "PzUYNYWLsN");
        setField(term256764, term256764.getClass(), "kc_serial", "rGvXtIHjBI");
        setField(term256764, term256764.getClass(), "b_serial", "PKJkUkzual");
        setField(term256764, term256764.getClass(), "place_id", "WYcqisofgT");
        setIntField(term256851, term256851.getClass(), "year", 2021);
        setShortField(term256851, term256851.getClass(), "month", (short) 10);
        setShortField(term256851, term256851.getClass(), "day", (short) 16);
        setField(term256850, term256850.getClass(), "date", term256851);
        setByteField(term256855, term256855.getClass(), "hour", (byte) 5);
        setByteField(term256855, term256855.getClass(), "minute", (byte) 6);
        setByteField(term256855, term256855.getClass(), "second", (byte) 17);
        setIntField(term256855, term256855.getClass(), "nano", 631786532);
        setField(term256850, term256850.getClass(), "time", term256855);
        setField(term256849, term256849.getClass(), "dateTime", term256850);
        setIntField(term256860, term256860.getClass(), "totalSeconds", -10800);
        setField(term256860, term256860.getClass(), "id", "-03:00");
        setField(term256849, term256849.getClass(), "offset", term256860);
        setField(term256870, term256870.getClass(), "id", "America/Recife");
        setLongElement(term256888, 0, -1767217224L);
        setField(term256887, term256887.getClass(), "standardTransitions", term256888);
        setElement(term256890, 1, term256860);
        setField(term256887, term256887.getClass(), "standardOffsets", term256890);
        setLongElement(term256891, 0, -1767217224L);
        setLongElement(term256891, 1, -1206957600L);
        setLongElement(term256891, 2, -1191362400L);
        setLongElement(term256891, 3, -1175374800L);
        setLongElement(term256891, 4, -1159826400L);
        setLongElement(term256891, 5, -633819600L);
        setLongElement(term256891, 6, -622069200L);
        setLongElement(term256891, 7, -602283600L);
        setLongElement(term256891, 8, -591832800L);
        setLongElement(term256891, 9, -570747600L);
        setLongElement(term256891, 10, -560210400L);
        setLongElement(term256891, 11, -539125200L);
        setLongElement(term256891, 12, -531352800L);
        setLongElement(term256891, 13, -191365200L);
        setLongElement(term256891, 14, -184197600L);
        setLongElement(term256891, 15, -155163600L);
        setLongElement(term256891, 16, -150069600L);
        setLongElement(term256891, 17, -128898000L);
        setLongElement(term256891, 18, -121125600L);
        setLongElement(term256891, 19, -99954000L);
        setLongElement(term256891, 20, -89589600L);
        setLongElement(term256891, 21, -68418000L);
        setLongElement(term256891, 22, -57967200L);
        setLongElement(term256891, 23, 499748400L);
        setLongElement(term256891, 24, 511236000L);
        setLongElement(term256891, 25, 530593200L);
        setLongElement(term256891, 26, 540266400L);
        setLongElement(term256891, 27, 562129200L);
        setLongElement(term256891, 28, 571197600L);
        setLongElement(term256891, 29, 592974000L);
        setLongElement(term256891, 30, 602042400L);
        setLongElement(term256891, 31, 624423600L);
        setLongElement(term256891, 32, 634701600L);
        setLongElement(term256891, 33, 938919600L);
        setLongElement(term256891, 34, 951616800L);
        setLongElement(term256891, 35, 970974000L);
        setLongElement(term256891, 36, 971575200L);
        setLongElement(term256891, 37, 1003028400L);
        setLongElement(term256891, 38, 1013911200L);
        setField(term256887, term256887.getClass(), "savingsInstantTransitions", term256891);
        setField(term256887, term256887.getClass(), "savingsLocalTransitions", term256931);
        setElement(term256932, 1, term256860);
        setElement(term256932, 3, term256860);
        setElement(term256932, 5, term256860);
        setElement(term256932, 7, term256860);
        setElement(term256932, 9, term256860);
        setElement(term256932, 11, term256860);
        setElement(term256932, 13, term256860);
        setElement(term256932, 15, term256860);
        setElement(term256932, 17, term256860);
        setElement(term256932, 19, term256860);
        setElement(term256932, 21, term256860);
        setElement(term256932, 23, term256860);
        setElement(term256932, 25, term256860);
        setElement(term256932, 27, term256860);
        setElement(term256932, 29, term256860);
        setElement(term256932, 31, term256860);
        setElement(term256932, 33, term256860);
        setElement(term256932, 35, term256860);
        setElement(term256932, 37, term256860);
        setElement(term256932, 39, term256860);
        setField(term256887, term256887.getClass(), "wallOffsets", term256932);
        setField(term256887, term256887.getClass(), "lastRules", term256933);
        setField(term256934, term256934.getClass(), "table", null);
        setField(term256934, term256934.getClass(), "nextTable", null);
        setLongField(term256934, term256934.getClass(), "baseCount", 0L);
        setIntField(term256934, term256934.getClass(), "sizeCtl", 0);
        setIntField(term256934, term256934.getClass(), "transferIndex", 0);
        setIntField(term256934, term256934.getClass(), "cellsBusy", 0);
        setField(term256934, term256934.getClass(), "counterCells", null);
        setField(term256934, term256934.getClass(), "keySet", null);
        setField(term256934, term256934.getClass(), "values", null);
        setField(term256934, term256934.getClass(), "entrySet", null);
        setField(term256934, term256934.getClass(), "keySet", null);
        setField(term256934, term256934.getClass(), "values", null);
        setField(term256887, term256887.getClass(), "lastRulesCache", term256934);
        setField(term256870, term256870.getClass(), "rules", term256887);
        setField(term256849, term256849.getClass(), "zone", term256870);
        setField(term256764, term256764.getClass(), "time_stamp", term256849);
        setField(term256764, term256764.getClass(), "start_up_mode", "vVYrwXQCzi");
        setField(term256764, term256764.getClass(), "cmm_dly_mod", "urqqtlYppy");
        setField(term256764, term256764.getClass(), "cmm_dly_sec", "znNUsUuegd");
        setField(term256764, term256764.getClass(), "cmm_err_mod", "TvOdQLksId");
        setField(term256764, term256764.getClass(), "country_code", "gbrBAjYfeF");
        setField(term256764, term256764.getClass(), "region_code", "oQyDIyWghi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VGvITdbKFh";
        callMethod(klass, "setB_serial", argTypes, term256764, args);
    }

};


