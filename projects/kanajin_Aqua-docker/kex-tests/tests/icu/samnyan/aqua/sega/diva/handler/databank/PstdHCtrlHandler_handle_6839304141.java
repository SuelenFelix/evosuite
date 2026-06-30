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

public class PstdHCtrlHandler_handle_6839304141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1767;
     Object term1768;

    public PstdHCtrlHandler_handle_6839304141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1767 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdHCtrlHandler"));
        setField(term1767, term1767.getClass(), "mapper", null);
        term1768 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term1853 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1859 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1864 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1874 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1891 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1892 = (long[]) newLongArray(1);
        Object[] term1894 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1895 = (long[]) newLongArray(39);
        Object[] term1935 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1936 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1937 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1938 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1768, term1768.getClass(), "cmd", "UoYtihxVaS");
        setField(term1768, term1768.getClass(), "req_id", "JDswTTCZHV");
        setField(term1768, term1768.getClass(), "game_id", "onpbIeEKoi");
        setField(term1768, term1768.getClass(), "r_ver", "YRHGsAkhxb");
        setField(term1768, term1768.getClass(), "kc_serial", "ffYhPOzlUs");
        setField(term1768, term1768.getClass(), "b_serial", "MLqYREekMl");
        setField(term1768, term1768.getClass(), "place_id", "ytSBIKXogI");
        setIntField(term1855, term1855.getClass(), "year", 2022);
        setShortField(term1855, term1855.getClass(), "month", (short) 2);
        setShortField(term1855, term1855.getClass(), "day", (short) 26);
        setField(term1854, term1854.getClass(), "date", term1855);
        setByteField(term1859, term1859.getClass(), "hour", (byte) 11);
        setByteField(term1859, term1859.getClass(), "minute", (byte) 42);
        setByteField(term1859, term1859.getClass(), "second", (byte) 15);
        setIntField(term1859, term1859.getClass(), "nano", 377731937);
        setField(term1854, term1854.getClass(), "time", term1859);
        setField(term1853, term1853.getClass(), "dateTime", term1854);
        setIntField(term1864, term1864.getClass(), "totalSeconds", -10800);
        setField(term1864, term1864.getClass(), "id", "-03:00");
        setField(term1853, term1853.getClass(), "offset", term1864);
        setField(term1874, term1874.getClass(), "id", "America/Recife");
        setLongElement(term1892, 0, -1767217224L);
        setField(term1891, term1891.getClass(), "standardTransitions", term1892);
        setElement(term1894, 1, term1864);
        setField(term1891, term1891.getClass(), "standardOffsets", term1894);
        setLongElement(term1895, 0, -1767217224L);
        setLongElement(term1895, 1, -1206957600L);
        setLongElement(term1895, 2, -1191362400L);
        setLongElement(term1895, 3, -1175374800L);
        setLongElement(term1895, 4, -1159826400L);
        setLongElement(term1895, 5, -633819600L);
        setLongElement(term1895, 6, -622069200L);
        setLongElement(term1895, 7, -602283600L);
        setLongElement(term1895, 8, -591832800L);
        setLongElement(term1895, 9, -570747600L);
        setLongElement(term1895, 10, -560210400L);
        setLongElement(term1895, 11, -539125200L);
        setLongElement(term1895, 12, -531352800L);
        setLongElement(term1895, 13, -191365200L);
        setLongElement(term1895, 14, -184197600L);
        setLongElement(term1895, 15, -155163600L);
        setLongElement(term1895, 16, -150069600L);
        setLongElement(term1895, 17, -128898000L);
        setLongElement(term1895, 18, -121125600L);
        setLongElement(term1895, 19, -99954000L);
        setLongElement(term1895, 20, -89589600L);
        setLongElement(term1895, 21, -68418000L);
        setLongElement(term1895, 22, -57967200L);
        setLongElement(term1895, 23, 499748400L);
        setLongElement(term1895, 24, 511236000L);
        setLongElement(term1895, 25, 530593200L);
        setLongElement(term1895, 26, 540266400L);
        setLongElement(term1895, 27, 562129200L);
        setLongElement(term1895, 28, 571197600L);
        setLongElement(term1895, 29, 592974000L);
        setLongElement(term1895, 30, 602042400L);
        setLongElement(term1895, 31, 624423600L);
        setLongElement(term1895, 32, 634701600L);
        setLongElement(term1895, 33, 938919600L);
        setLongElement(term1895, 34, 951616800L);
        setLongElement(term1895, 35, 970974000L);
        setLongElement(term1895, 36, 971575200L);
        setLongElement(term1895, 37, 1003028400L);
        setLongElement(term1895, 38, 1013911200L);
        setField(term1891, term1891.getClass(), "savingsInstantTransitions", term1895);
        setField(term1891, term1891.getClass(), "savingsLocalTransitions", term1935);
        setElement(term1936, 1, term1864);
        setElement(term1936, 3, term1864);
        setElement(term1936, 5, term1864);
        setElement(term1936, 7, term1864);
        setElement(term1936, 9, term1864);
        setElement(term1936, 11, term1864);
        setElement(term1936, 13, term1864);
        setElement(term1936, 15, term1864);
        setElement(term1936, 17, term1864);
        setElement(term1936, 19, term1864);
        setElement(term1936, 21, term1864);
        setElement(term1936, 23, term1864);
        setElement(term1936, 25, term1864);
        setElement(term1936, 27, term1864);
        setElement(term1936, 29, term1864);
        setElement(term1936, 31, term1864);
        setElement(term1936, 33, term1864);
        setElement(term1936, 35, term1864);
        setElement(term1936, 37, term1864);
        setElement(term1936, 39, term1864);
        setField(term1891, term1891.getClass(), "wallOffsets", term1936);
        setField(term1891, term1891.getClass(), "lastRules", term1937);
        setField(term1938, term1938.getClass(), "table", null);
        setField(term1938, term1938.getClass(), "nextTable", null);
        setLongField(term1938, term1938.getClass(), "baseCount", 0L);
        setIntField(term1938, term1938.getClass(), "sizeCtl", 0);
        setIntField(term1938, term1938.getClass(), "transferIndex", 0);
        setIntField(term1938, term1938.getClass(), "cellsBusy", 0);
        setField(term1938, term1938.getClass(), "counterCells", null);
        setField(term1938, term1938.getClass(), "keySet", null);
        setField(term1938, term1938.getClass(), "values", null);
        setField(term1938, term1938.getClass(), "entrySet", null);
        setField(term1938, term1938.getClass(), "keySet", null);
        setField(term1938, term1938.getClass(), "values", null);
        setField(term1891, term1891.getClass(), "lastRulesCache", term1938);
        setField(term1874, term1874.getClass(), "rules", term1891);
        setField(term1853, term1853.getClass(), "zone", term1874);
        setField(term1768, term1768.getClass(), "time_stamp", term1853);
        setField(term1768, term1768.getClass(), "start_up_mode", "nHXjMycHlU");
        setField(term1768, term1768.getClass(), "cmm_dly_mod", "ieCtQFdkii");
        setField(term1768, term1768.getClass(), "cmm_dly_sec", "dEnhdmILtU");
        setField(term1768, term1768.getClass(), "cmm_err_mod", "hoicvmsovO");
        setField(term1768, term1768.getClass(), "country_code", "eqJfYWRaEL");
        setField(term1768, term1768.getClass(), "region_code", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PstdHCtrlHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term1768;
        callMethod(klass, "handle", argTypes, term1767, args);
    }

};


