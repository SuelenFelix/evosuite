package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SpendCreditRequest_getCmpgnid_15511149274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1895;

    public SpendCreditRequest_getCmpgnid_15511149274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1895 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest"));
        int[] term1897 = (int[]) newIntArray(0);
        int[] term1898 = (int[]) newIntArray(2);
        int[] term1902 = (int[]) newIntArray(8);
        int[] term1911 = (int[]) newIntArray(6);
        Object term2002 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term2003 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2004 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2008 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2013 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term2023 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2040 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2041 = (long[]) newLongArray(1);
        Object[] term2043 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term2044 = (long[]) newLongArray(39);
        Object[] term2084 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term2085 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term2086 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term2087 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1895, term1895.getClass(), "pd_id", 933028652);
        setField(term1895, term1895.getClass(), "my_qst_id", term1897);
        setIntElement(term1898, 0, 287287233);
        setIntElement(term1898, 1, 962840079);
        setField(term1895, term1895.getClass(), "my_qst_sts", term1898);
        setIntField(term1895, term1895.getClass(), "crdt_typ", 1540719661);
        setIntElement(term1902, 0, 1265463001);
        setIntElement(term1902, 1, 335112684);
        setIntElement(term1902, 2, 1551099402);
        setIntElement(term1902, 3, -2027534003);
        setIntElement(term1902, 4, 1063420942);
        setIntElement(term1902, 5, 1375330971);
        setIntElement(term1902, 6, -478195677);
        setIntElement(term1902, 7, 972867650);
        setField(term1895, term1895.getClass(), "cmpgn_id", term1902);
        setIntElement(term1911, 0, 1655935355);
        setIntElement(term1911, 1, -481533957);
        setIntElement(term1911, 2, 1240914516);
        setIntElement(term1911, 3, -1465035361);
        setIntElement(term1911, 4, 1090617576);
        setIntElement(term1911, 5, -1547384488);
        setField(term1895, term1895.getClass(), "cmpgn_pb", term1911);
        setField(term1895, term1895.getClass(), "cmd", "UoYtihxVaS");
        setField(term1895, term1895.getClass(), "req_id", "JDswTTCZHV");
        setField(term1895, term1895.getClass(), "game_id", "onpbIeEKoi");
        setField(term1895, term1895.getClass(), "r_ver", "YRHGsAkhxb");
        setField(term1895, term1895.getClass(), "kc_serial", "ffYhPOzlUs");
        setField(term1895, term1895.getClass(), "b_serial", "MLqYREekMl");
        setField(term1895, term1895.getClass(), "place_id", "ytSBIKXogI");
        setIntField(term2004, term2004.getClass(), "year", 2022);
        setShortField(term2004, term2004.getClass(), "month", (short) 2);
        setShortField(term2004, term2004.getClass(), "day", (short) 26);
        setField(term2003, term2003.getClass(), "date", term2004);
        setByteField(term2008, term2008.getClass(), "hour", (byte) 11);
        setByteField(term2008, term2008.getClass(), "minute", (byte) 42);
        setByteField(term2008, term2008.getClass(), "second", (byte) 15);
        setIntField(term2008, term2008.getClass(), "nano", 377731937);
        setField(term2003, term2003.getClass(), "time", term2008);
        setField(term2002, term2002.getClass(), "dateTime", term2003);
        setIntField(term2013, term2013.getClass(), "totalSeconds", -10800);
        setField(term2013, term2013.getClass(), "id", "-03:00");
        setField(term2002, term2002.getClass(), "offset", term2013);
        setField(term2023, term2023.getClass(), "id", "America/Recife");
        setLongElement(term2041, 0, -1767217224L);
        setField(term2040, term2040.getClass(), "standardTransitions", term2041);
        setElement(term2043, 1, term2013);
        setField(term2040, term2040.getClass(), "standardOffsets", term2043);
        setLongElement(term2044, 0, -1767217224L);
        setLongElement(term2044, 1, -1206957600L);
        setLongElement(term2044, 2, -1191362400L);
        setLongElement(term2044, 3, -1175374800L);
        setLongElement(term2044, 4, -1159826400L);
        setLongElement(term2044, 5, -633819600L);
        setLongElement(term2044, 6, -622069200L);
        setLongElement(term2044, 7, -602283600L);
        setLongElement(term2044, 8, -591832800L);
        setLongElement(term2044, 9, -570747600L);
        setLongElement(term2044, 10, -560210400L);
        setLongElement(term2044, 11, -539125200L);
        setLongElement(term2044, 12, -531352800L);
        setLongElement(term2044, 13, -191365200L);
        setLongElement(term2044, 14, -184197600L);
        setLongElement(term2044, 15, -155163600L);
        setLongElement(term2044, 16, -150069600L);
        setLongElement(term2044, 17, -128898000L);
        setLongElement(term2044, 18, -121125600L);
        setLongElement(term2044, 19, -99954000L);
        setLongElement(term2044, 20, -89589600L);
        setLongElement(term2044, 21, -68418000L);
        setLongElement(term2044, 22, -57967200L);
        setLongElement(term2044, 23, 499748400L);
        setLongElement(term2044, 24, 511236000L);
        setLongElement(term2044, 25, 530593200L);
        setLongElement(term2044, 26, 540266400L);
        setLongElement(term2044, 27, 562129200L);
        setLongElement(term2044, 28, 571197600L);
        setLongElement(term2044, 29, 592974000L);
        setLongElement(term2044, 30, 602042400L);
        setLongElement(term2044, 31, 624423600L);
        setLongElement(term2044, 32, 634701600L);
        setLongElement(term2044, 33, 938919600L);
        setLongElement(term2044, 34, 951616800L);
        setLongElement(term2044, 35, 970974000L);
        setLongElement(term2044, 36, 971575200L);
        setLongElement(term2044, 37, 1003028400L);
        setLongElement(term2044, 38, 1013911200L);
        setField(term2040, term2040.getClass(), "savingsInstantTransitions", term2044);
        setField(term2040, term2040.getClass(), "savingsLocalTransitions", term2084);
        setElement(term2085, 1, term2013);
        setElement(term2085, 3, term2013);
        setElement(term2085, 5, term2013);
        setElement(term2085, 7, term2013);
        setElement(term2085, 9, term2013);
        setElement(term2085, 11, term2013);
        setElement(term2085, 13, term2013);
        setElement(term2085, 15, term2013);
        setElement(term2085, 17, term2013);
        setElement(term2085, 19, term2013);
        setElement(term2085, 21, term2013);
        setElement(term2085, 23, term2013);
        setElement(term2085, 25, term2013);
        setElement(term2085, 27, term2013);
        setElement(term2085, 29, term2013);
        setElement(term2085, 31, term2013);
        setElement(term2085, 33, term2013);
        setElement(term2085, 35, term2013);
        setElement(term2085, 37, term2013);
        setElement(term2085, 39, term2013);
        setField(term2040, term2040.getClass(), "wallOffsets", term2085);
        setField(term2040, term2040.getClass(), "lastRules", term2086);
        setField(term2087, term2087.getClass(), "table", null);
        setField(term2087, term2087.getClass(), "nextTable", null);
        setLongField(term2087, term2087.getClass(), "baseCount", 0L);
        setIntField(term2087, term2087.getClass(), "sizeCtl", 0);
        setIntField(term2087, term2087.getClass(), "transferIndex", 0);
        setIntField(term2087, term2087.getClass(), "cellsBusy", 0);
        setField(term2087, term2087.getClass(), "counterCells", null);
        setField(term2087, term2087.getClass(), "keySet", null);
        setField(term2087, term2087.getClass(), "values", null);
        setField(term2087, term2087.getClass(), "entrySet", null);
        setField(term2087, term2087.getClass(), "keySet", null);
        setField(term2087, term2087.getClass(), "values", null);
        setField(term2040, term2040.getClass(), "lastRulesCache", term2087);
        setField(term2023, term2023.getClass(), "rules", term2040);
        setField(term2002, term2002.getClass(), "zone", term2023);
        setField(term1895, term1895.getClass(), "time_stamp", term2002);
        setField(term1895, term1895.getClass(), "start_up_mode", "nHXjMycHlU");
        setField(term1895, term1895.getClass(), "cmm_dly_mod", "ieCtQFdkii");
        setField(term1895, term1895.getClass(), "cmm_dly_sec", "dEnhdmILtU");
        setField(term1895, term1895.getClass(), "cmm_err_mod", "hoicvmsovO");
        setField(term1895, term1895.getClass(), "country_code", "eqJfYWRaEL");
        setField(term1895, term1895.getClass(), "region_code", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.SpendCreditRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmpgn_id", argTypes, term1895, args);
    }

};


