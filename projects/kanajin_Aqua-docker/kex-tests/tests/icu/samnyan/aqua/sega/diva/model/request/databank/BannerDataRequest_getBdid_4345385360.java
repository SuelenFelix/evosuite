package icu.samnyan.aqua.sega.diva.model.request.databank;

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
import static icu.samnyan.aqua.sega.diva.model.request.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BannerDataRequest_getBdid_4345385360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1821;

    public BannerDataRequest_getBdid_4345385360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1821 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest"));
        Object term1907 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1908 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1909 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1913 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1918 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1928 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1945 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1946 = (long[]) newLongArray(1);
        Object[] term1948 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1949 = (long[]) newLongArray(39);
        Object[] term1989 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1990 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1991 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1992 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1821, term1821.getClass(), "bd_id", -244121226);
        setField(term1821, term1821.getClass(), "cmd", "UoYtihxVaS");
        setField(term1821, term1821.getClass(), "req_id", "JDswTTCZHV");
        setField(term1821, term1821.getClass(), "game_id", "onpbIeEKoi");
        setField(term1821, term1821.getClass(), "r_ver", "YRHGsAkhxb");
        setField(term1821, term1821.getClass(), "kc_serial", "ffYhPOzlUs");
        setField(term1821, term1821.getClass(), "b_serial", "MLqYREekMl");
        setField(term1821, term1821.getClass(), "place_id", "ytSBIKXogI");
        setIntField(term1909, term1909.getClass(), "year", 2022);
        setShortField(term1909, term1909.getClass(), "month", (short) 2);
        setShortField(term1909, term1909.getClass(), "day", (short) 26);
        setField(term1908, term1908.getClass(), "date", term1909);
        setByteField(term1913, term1913.getClass(), "hour", (byte) 11);
        setByteField(term1913, term1913.getClass(), "minute", (byte) 42);
        setByteField(term1913, term1913.getClass(), "second", (byte) 15);
        setIntField(term1913, term1913.getClass(), "nano", 377731937);
        setField(term1908, term1908.getClass(), "time", term1913);
        setField(term1907, term1907.getClass(), "dateTime", term1908);
        setIntField(term1918, term1918.getClass(), "totalSeconds", -10800);
        setField(term1918, term1918.getClass(), "id", "-03:00");
        setField(term1907, term1907.getClass(), "offset", term1918);
        setField(term1928, term1928.getClass(), "id", "America/Recife");
        setLongElement(term1946, 0, -1767217224L);
        setField(term1945, term1945.getClass(), "standardTransitions", term1946);
        setElement(term1948, 1, term1918);
        setField(term1945, term1945.getClass(), "standardOffsets", term1948);
        setLongElement(term1949, 0, -1767217224L);
        setLongElement(term1949, 1, -1206957600L);
        setLongElement(term1949, 2, -1191362400L);
        setLongElement(term1949, 3, -1175374800L);
        setLongElement(term1949, 4, -1159826400L);
        setLongElement(term1949, 5, -633819600L);
        setLongElement(term1949, 6, -622069200L);
        setLongElement(term1949, 7, -602283600L);
        setLongElement(term1949, 8, -591832800L);
        setLongElement(term1949, 9, -570747600L);
        setLongElement(term1949, 10, -560210400L);
        setLongElement(term1949, 11, -539125200L);
        setLongElement(term1949, 12, -531352800L);
        setLongElement(term1949, 13, -191365200L);
        setLongElement(term1949, 14, -184197600L);
        setLongElement(term1949, 15, -155163600L);
        setLongElement(term1949, 16, -150069600L);
        setLongElement(term1949, 17, -128898000L);
        setLongElement(term1949, 18, -121125600L);
        setLongElement(term1949, 19, -99954000L);
        setLongElement(term1949, 20, -89589600L);
        setLongElement(term1949, 21, -68418000L);
        setLongElement(term1949, 22, -57967200L);
        setLongElement(term1949, 23, 499748400L);
        setLongElement(term1949, 24, 511236000L);
        setLongElement(term1949, 25, 530593200L);
        setLongElement(term1949, 26, 540266400L);
        setLongElement(term1949, 27, 562129200L);
        setLongElement(term1949, 28, 571197600L);
        setLongElement(term1949, 29, 592974000L);
        setLongElement(term1949, 30, 602042400L);
        setLongElement(term1949, 31, 624423600L);
        setLongElement(term1949, 32, 634701600L);
        setLongElement(term1949, 33, 938919600L);
        setLongElement(term1949, 34, 951616800L);
        setLongElement(term1949, 35, 970974000L);
        setLongElement(term1949, 36, 971575200L);
        setLongElement(term1949, 37, 1003028400L);
        setLongElement(term1949, 38, 1013911200L);
        setField(term1945, term1945.getClass(), "savingsInstantTransitions", term1949);
        setField(term1945, term1945.getClass(), "savingsLocalTransitions", term1989);
        setElement(term1990, 1, term1918);
        setElement(term1990, 3, term1918);
        setElement(term1990, 5, term1918);
        setElement(term1990, 7, term1918);
        setElement(term1990, 9, term1918);
        setElement(term1990, 11, term1918);
        setElement(term1990, 13, term1918);
        setElement(term1990, 15, term1918);
        setElement(term1990, 17, term1918);
        setElement(term1990, 19, term1918);
        setElement(term1990, 21, term1918);
        setElement(term1990, 23, term1918);
        setElement(term1990, 25, term1918);
        setElement(term1990, 27, term1918);
        setElement(term1990, 29, term1918);
        setElement(term1990, 31, term1918);
        setElement(term1990, 33, term1918);
        setElement(term1990, 35, term1918);
        setElement(term1990, 37, term1918);
        setElement(term1990, 39, term1918);
        setField(term1945, term1945.getClass(), "wallOffsets", term1990);
        setField(term1945, term1945.getClass(), "lastRules", term1991);
        setField(term1992, term1992.getClass(), "table", null);
        setField(term1992, term1992.getClass(), "nextTable", null);
        setLongField(term1992, term1992.getClass(), "baseCount", 0L);
        setIntField(term1992, term1992.getClass(), "sizeCtl", 0);
        setIntField(term1992, term1992.getClass(), "transferIndex", 0);
        setIntField(term1992, term1992.getClass(), "cellsBusy", 0);
        setField(term1992, term1992.getClass(), "counterCells", null);
        setField(term1992, term1992.getClass(), "keySet", null);
        setField(term1992, term1992.getClass(), "values", null);
        setField(term1992, term1992.getClass(), "entrySet", null);
        setField(term1992, term1992.getClass(), "keySet", null);
        setField(term1992, term1992.getClass(), "values", null);
        setField(term1945, term1945.getClass(), "lastRulesCache", term1992);
        setField(term1928, term1928.getClass(), "rules", term1945);
        setField(term1907, term1907.getClass(), "zone", term1928);
        setField(term1821, term1821.getClass(), "time_stamp", term1907);
        setField(term1821, term1821.getClass(), "start_up_mode", "nHXjMycHlU");
        setField(term1821, term1821.getClass(), "cmm_dly_mod", "ieCtQFdkii");
        setField(term1821, term1821.getClass(), "cmm_dly_sec", "dEnhdmILtU");
        setField(term1821, term1821.getClass(), "cmm_err_mod", "hoicvmsovO");
        setField(term1821, term1821.getClass(), "country_code", "eqJfYWRaEL");
        setField(term1821, term1821.getClass(), "region_code", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.databank.BannerDataRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBd_id", argTypes, term1821, args);
    }

};


