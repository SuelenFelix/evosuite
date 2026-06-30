package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetPvPdRequest_getDifficulty_17717049941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term270823;

    public GetPvPdRequest_getDifficulty_17717049941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term270823 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term270826 = (int[]) newIntArray(4);
        Object term270915 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term270916 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term270917 = newInstance(Class.forName("java.time.LocalDate"));
        Object term270921 = newInstance(Class.forName("java.time.LocalTime"));
        Object term270926 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term270936 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term270953 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term270954 = (long[]) newLongArray(1);
        Object[] term270956 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term270957 = (long[]) newLongArray(39);
        Object[] term270997 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term270998 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term270999 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term271000 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term270823, term270823.getClass(), "pd_id", 970424473);
        setIntField(term270823, term270823.getClass(), "difficulty", -540535075);
        setIntElement(term270826, 0, 766883012);
        setIntElement(term270826, 1, -1902114975);
        setIntElement(term270826, 2, -1187168212);
        setIntElement(term270826, 3, -231591657);
        setField(term270823, term270823.getClass(), "pd_pv_id_lst", term270826);
        setField(term270823, term270823.getClass(), "cmd", "LxSzRiSUke");
        setField(term270823, term270823.getClass(), "req_id", "NxbQJWSXQu");
        setField(term270823, term270823.getClass(), "game_id", "ByfIvofaQE");
        setField(term270823, term270823.getClass(), "r_ver", "xvhHgJLoQS");
        setField(term270823, term270823.getClass(), "kc_serial", "bKSYtrrxDp");
        setField(term270823, term270823.getClass(), "b_serial", "fQYVEGPLIF");
        setField(term270823, term270823.getClass(), "place_id", "qRwTBVZctS");
        setIntField(term270917, term270917.getClass(), "year", 2021);
        setShortField(term270917, term270917.getClass(), "month", (short) 7);
        setShortField(term270917, term270917.getClass(), "day", (short) 6);
        setField(term270916, term270916.getClass(), "date", term270917);
        setByteField(term270921, term270921.getClass(), "hour", (byte) 12);
        setByteField(term270921, term270921.getClass(), "minute", (byte) 46);
        setByteField(term270921, term270921.getClass(), "second", (byte) 42);
        setIntField(term270921, term270921.getClass(), "nano", 512890850);
        setField(term270916, term270916.getClass(), "time", term270921);
        setField(term270915, term270915.getClass(), "dateTime", term270916);
        setIntField(term270926, term270926.getClass(), "totalSeconds", -10800);
        setField(term270926, term270926.getClass(), "id", "-03:00");
        setField(term270915, term270915.getClass(), "offset", term270926);
        setField(term270936, term270936.getClass(), "id", "America/Recife");
        setLongElement(term270954, 0, -1767217224L);
        setField(term270953, term270953.getClass(), "standardTransitions", term270954);
        setElement(term270956, 1, term270926);
        setField(term270953, term270953.getClass(), "standardOffsets", term270956);
        setLongElement(term270957, 0, -1767217224L);
        setLongElement(term270957, 1, -1206957600L);
        setLongElement(term270957, 2, -1191362400L);
        setLongElement(term270957, 3, -1175374800L);
        setLongElement(term270957, 4, -1159826400L);
        setLongElement(term270957, 5, -633819600L);
        setLongElement(term270957, 6, -622069200L);
        setLongElement(term270957, 7, -602283600L);
        setLongElement(term270957, 8, -591832800L);
        setLongElement(term270957, 9, -570747600L);
        setLongElement(term270957, 10, -560210400L);
        setLongElement(term270957, 11, -539125200L);
        setLongElement(term270957, 12, -531352800L);
        setLongElement(term270957, 13, -191365200L);
        setLongElement(term270957, 14, -184197600L);
        setLongElement(term270957, 15, -155163600L);
        setLongElement(term270957, 16, -150069600L);
        setLongElement(term270957, 17, -128898000L);
        setLongElement(term270957, 18, -121125600L);
        setLongElement(term270957, 19, -99954000L);
        setLongElement(term270957, 20, -89589600L);
        setLongElement(term270957, 21, -68418000L);
        setLongElement(term270957, 22, -57967200L);
        setLongElement(term270957, 23, 499748400L);
        setLongElement(term270957, 24, 511236000L);
        setLongElement(term270957, 25, 530593200L);
        setLongElement(term270957, 26, 540266400L);
        setLongElement(term270957, 27, 562129200L);
        setLongElement(term270957, 28, 571197600L);
        setLongElement(term270957, 29, 592974000L);
        setLongElement(term270957, 30, 602042400L);
        setLongElement(term270957, 31, 624423600L);
        setLongElement(term270957, 32, 634701600L);
        setLongElement(term270957, 33, 938919600L);
        setLongElement(term270957, 34, 951616800L);
        setLongElement(term270957, 35, 970974000L);
        setLongElement(term270957, 36, 971575200L);
        setLongElement(term270957, 37, 1003028400L);
        setLongElement(term270957, 38, 1013911200L);
        setField(term270953, term270953.getClass(), "savingsInstantTransitions", term270957);
        setField(term270953, term270953.getClass(), "savingsLocalTransitions", term270997);
        setElement(term270998, 1, term270926);
        setElement(term270998, 3, term270926);
        setElement(term270998, 5, term270926);
        setElement(term270998, 7, term270926);
        setElement(term270998, 9, term270926);
        setElement(term270998, 11, term270926);
        setElement(term270998, 13, term270926);
        setElement(term270998, 15, term270926);
        setElement(term270998, 17, term270926);
        setElement(term270998, 19, term270926);
        setElement(term270998, 21, term270926);
        setElement(term270998, 23, term270926);
        setElement(term270998, 25, term270926);
        setElement(term270998, 27, term270926);
        setElement(term270998, 29, term270926);
        setElement(term270998, 31, term270926);
        setElement(term270998, 33, term270926);
        setElement(term270998, 35, term270926);
        setElement(term270998, 37, term270926);
        setElement(term270998, 39, term270926);
        setField(term270953, term270953.getClass(), "wallOffsets", term270998);
        setField(term270953, term270953.getClass(), "lastRules", term270999);
        setField(term271000, term271000.getClass(), "table", null);
        setField(term271000, term271000.getClass(), "nextTable", null);
        setLongField(term271000, term271000.getClass(), "baseCount", 0L);
        setIntField(term271000, term271000.getClass(), "sizeCtl", 0);
        setIntField(term271000, term271000.getClass(), "transferIndex", 0);
        setIntField(term271000, term271000.getClass(), "cellsBusy", 0);
        setField(term271000, term271000.getClass(), "counterCells", null);
        setField(term271000, term271000.getClass(), "keySet", null);
        setField(term271000, term271000.getClass(), "values", null);
        setField(term271000, term271000.getClass(), "entrySet", null);
        setField(term271000, term271000.getClass(), "keySet", null);
        setField(term271000, term271000.getClass(), "values", null);
        setField(term270953, term270953.getClass(), "lastRulesCache", term271000);
        setField(term270936, term270936.getClass(), "rules", term270953);
        setField(term270915, term270915.getClass(), "zone", term270936);
        setField(term270823, term270823.getClass(), "time_stamp", term270915);
        setField(term270823, term270823.getClass(), "start_up_mode", "BRBDbdsahC");
        setField(term270823, term270823.getClass(), "cmm_dly_mod", "TQAFOeWgvq");
        setField(term270823, term270823.getClass(), "cmm_dly_sec", "AtYIxbvLDg");
        setField(term270823, term270823.getClass(), "cmm_err_mod", "rQdqhBCIJv");
        setField(term270823, term270823.getClass(), "country_code", "OWnGgqSmUN");
        setField(term270823, term270823.getClass(), "region_code", "BLSUZfTILp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term270823, args);
    }

};


