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

public class BaseRequest_getCmmdlysec_171913539210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252721;

    public BaseRequest_getCmmdlysec_171913539210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252721 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term252806 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term252807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252817 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term252827 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term252844 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term252845 = (long[]) newLongArray(1);
        Object[] term252847 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term252848 = (long[]) newLongArray(39);
        Object[] term252888 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term252889 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term252890 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term252891 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term252721, term252721.getClass(), "cmd", "QCvbbAbluL");
        setField(term252721, term252721.getClass(), "req_id", "TCfDANoRXy");
        setField(term252721, term252721.getClass(), "game_id", "SNBGphBiIl");
        setField(term252721, term252721.getClass(), "r_ver", "RmHGsfbaBq");
        setField(term252721, term252721.getClass(), "kc_serial", "RSDlfIpFkY");
        setField(term252721, term252721.getClass(), "b_serial", "ZaTowywgws");
        setField(term252721, term252721.getClass(), "place_id", "XPrRiBUedX");
        setIntField(term252808, term252808.getClass(), "year", 2025);
        setShortField(term252808, term252808.getClass(), "month", (short) 2);
        setShortField(term252808, term252808.getClass(), "day", (short) 23);
        setField(term252807, term252807.getClass(), "date", term252808);
        setByteField(term252812, term252812.getClass(), "hour", (byte) 16);
        setByteField(term252812, term252812.getClass(), "minute", (byte) 39);
        setByteField(term252812, term252812.getClass(), "second", (byte) 42);
        setIntField(term252812, term252812.getClass(), "nano", 342777686);
        setField(term252807, term252807.getClass(), "time", term252812);
        setField(term252806, term252806.getClass(), "dateTime", term252807);
        setIntField(term252817, term252817.getClass(), "totalSeconds", -10800);
        setField(term252817, term252817.getClass(), "id", "-03:00");
        setField(term252806, term252806.getClass(), "offset", term252817);
        setField(term252827, term252827.getClass(), "id", "America/Recife");
        setLongElement(term252845, 0, -1767217224L);
        setField(term252844, term252844.getClass(), "standardTransitions", term252845);
        setElement(term252847, 1, term252817);
        setField(term252844, term252844.getClass(), "standardOffsets", term252847);
        setLongElement(term252848, 0, -1767217224L);
        setLongElement(term252848, 1, -1206957600L);
        setLongElement(term252848, 2, -1191362400L);
        setLongElement(term252848, 3, -1175374800L);
        setLongElement(term252848, 4, -1159826400L);
        setLongElement(term252848, 5, -633819600L);
        setLongElement(term252848, 6, -622069200L);
        setLongElement(term252848, 7, -602283600L);
        setLongElement(term252848, 8, -591832800L);
        setLongElement(term252848, 9, -570747600L);
        setLongElement(term252848, 10, -560210400L);
        setLongElement(term252848, 11, -539125200L);
        setLongElement(term252848, 12, -531352800L);
        setLongElement(term252848, 13, -191365200L);
        setLongElement(term252848, 14, -184197600L);
        setLongElement(term252848, 15, -155163600L);
        setLongElement(term252848, 16, -150069600L);
        setLongElement(term252848, 17, -128898000L);
        setLongElement(term252848, 18, -121125600L);
        setLongElement(term252848, 19, -99954000L);
        setLongElement(term252848, 20, -89589600L);
        setLongElement(term252848, 21, -68418000L);
        setLongElement(term252848, 22, -57967200L);
        setLongElement(term252848, 23, 499748400L);
        setLongElement(term252848, 24, 511236000L);
        setLongElement(term252848, 25, 530593200L);
        setLongElement(term252848, 26, 540266400L);
        setLongElement(term252848, 27, 562129200L);
        setLongElement(term252848, 28, 571197600L);
        setLongElement(term252848, 29, 592974000L);
        setLongElement(term252848, 30, 602042400L);
        setLongElement(term252848, 31, 624423600L);
        setLongElement(term252848, 32, 634701600L);
        setLongElement(term252848, 33, 938919600L);
        setLongElement(term252848, 34, 951616800L);
        setLongElement(term252848, 35, 970974000L);
        setLongElement(term252848, 36, 971575200L);
        setLongElement(term252848, 37, 1003028400L);
        setLongElement(term252848, 38, 1013911200L);
        setField(term252844, term252844.getClass(), "savingsInstantTransitions", term252848);
        setField(term252844, term252844.getClass(), "savingsLocalTransitions", term252888);
        setElement(term252889, 1, term252817);
        setElement(term252889, 3, term252817);
        setElement(term252889, 5, term252817);
        setElement(term252889, 7, term252817);
        setElement(term252889, 9, term252817);
        setElement(term252889, 11, term252817);
        setElement(term252889, 13, term252817);
        setElement(term252889, 15, term252817);
        setElement(term252889, 17, term252817);
        setElement(term252889, 19, term252817);
        setElement(term252889, 21, term252817);
        setElement(term252889, 23, term252817);
        setElement(term252889, 25, term252817);
        setElement(term252889, 27, term252817);
        setElement(term252889, 29, term252817);
        setElement(term252889, 31, term252817);
        setElement(term252889, 33, term252817);
        setElement(term252889, 35, term252817);
        setElement(term252889, 37, term252817);
        setElement(term252889, 39, term252817);
        setField(term252844, term252844.getClass(), "wallOffsets", term252889);
        setField(term252844, term252844.getClass(), "lastRules", term252890);
        setField(term252891, term252891.getClass(), "table", null);
        setField(term252891, term252891.getClass(), "nextTable", null);
        setLongField(term252891, term252891.getClass(), "baseCount", 0L);
        setIntField(term252891, term252891.getClass(), "sizeCtl", 0);
        setIntField(term252891, term252891.getClass(), "transferIndex", 0);
        setIntField(term252891, term252891.getClass(), "cellsBusy", 0);
        setField(term252891, term252891.getClass(), "counterCells", null);
        setField(term252891, term252891.getClass(), "keySet", null);
        setField(term252891, term252891.getClass(), "values", null);
        setField(term252891, term252891.getClass(), "entrySet", null);
        setField(term252891, term252891.getClass(), "keySet", null);
        setField(term252891, term252891.getClass(), "values", null);
        setField(term252844, term252844.getClass(), "lastRulesCache", term252891);
        setField(term252827, term252827.getClass(), "rules", term252844);
        setField(term252806, term252806.getClass(), "zone", term252827);
        setField(term252721, term252721.getClass(), "time_stamp", term252806);
        setField(term252721, term252721.getClass(), "start_up_mode", "kultXgiMsw");
        setField(term252721, term252721.getClass(), "cmm_dly_mod", "invWIgTrSn");
        setField(term252721, term252721.getClass(), "cmm_dly_sec", "tdDWYXQBpB");
        setField(term252721, term252721.getClass(), "cmm_err_mod", "yLbSZvdjZX");
        setField(term252721, term252721.getClass(), "country_code", "FhCGxrukXm");
        setField(term252721, term252721.getClass(), "region_code", "KAmjFnlvKU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmm_dly_sec", argTypes, term252721, args);
    }

};


