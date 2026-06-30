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

public class BaseRequest_setReqid_123684365515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254928;

    public BaseRequest_setReqid_123684365515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254928 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term255013 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term255014 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255015 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255019 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255024 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term255034 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term255051 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term255052 = (long[]) newLongArray(1);
        Object[] term255054 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term255055 = (long[]) newLongArray(39);
        Object[] term255095 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term255096 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term255097 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term255098 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term254928, term254928.getClass(), "cmd", "DYmBIVURjz");
        setField(term254928, term254928.getClass(), "req_id", "BotFhHNSzH");
        setField(term254928, term254928.getClass(), "game_id", "LcLfqpnOTW");
        setField(term254928, term254928.getClass(), "r_ver", "hGwBHMBbGw");
        setField(term254928, term254928.getClass(), "kc_serial", "CzTiZXTrcB");
        setField(term254928, term254928.getClass(), "b_serial", "HOEmWmVnLk");
        setField(term254928, term254928.getClass(), "place_id", "LxSzRiSUke");
        setIntField(term255015, term255015.getClass(), "year", 2022);
        setShortField(term255015, term255015.getClass(), "month", (short) 3);
        setShortField(term255015, term255015.getClass(), "day", (short) 31);
        setField(term255014, term255014.getClass(), "date", term255015);
        setByteField(term255019, term255019.getClass(), "hour", (byte) 3);
        setByteField(term255019, term255019.getClass(), "minute", (byte) 43);
        setByteField(term255019, term255019.getClass(), "second", (byte) 28);
        setIntField(term255019, term255019.getClass(), "nano", 772790770);
        setField(term255014, term255014.getClass(), "time", term255019);
        setField(term255013, term255013.getClass(), "dateTime", term255014);
        setIntField(term255024, term255024.getClass(), "totalSeconds", -10800);
        setField(term255024, term255024.getClass(), "id", "-03:00");
        setField(term255013, term255013.getClass(), "offset", term255024);
        setField(term255034, term255034.getClass(), "id", "America/Recife");
        setLongElement(term255052, 0, -1767217224L);
        setField(term255051, term255051.getClass(), "standardTransitions", term255052);
        setElement(term255054, 1, term255024);
        setField(term255051, term255051.getClass(), "standardOffsets", term255054);
        setLongElement(term255055, 0, -1767217224L);
        setLongElement(term255055, 1, -1206957600L);
        setLongElement(term255055, 2, -1191362400L);
        setLongElement(term255055, 3, -1175374800L);
        setLongElement(term255055, 4, -1159826400L);
        setLongElement(term255055, 5, -633819600L);
        setLongElement(term255055, 6, -622069200L);
        setLongElement(term255055, 7, -602283600L);
        setLongElement(term255055, 8, -591832800L);
        setLongElement(term255055, 9, -570747600L);
        setLongElement(term255055, 10, -560210400L);
        setLongElement(term255055, 11, -539125200L);
        setLongElement(term255055, 12, -531352800L);
        setLongElement(term255055, 13, -191365200L);
        setLongElement(term255055, 14, -184197600L);
        setLongElement(term255055, 15, -155163600L);
        setLongElement(term255055, 16, -150069600L);
        setLongElement(term255055, 17, -128898000L);
        setLongElement(term255055, 18, -121125600L);
        setLongElement(term255055, 19, -99954000L);
        setLongElement(term255055, 20, -89589600L);
        setLongElement(term255055, 21, -68418000L);
        setLongElement(term255055, 22, -57967200L);
        setLongElement(term255055, 23, 499748400L);
        setLongElement(term255055, 24, 511236000L);
        setLongElement(term255055, 25, 530593200L);
        setLongElement(term255055, 26, 540266400L);
        setLongElement(term255055, 27, 562129200L);
        setLongElement(term255055, 28, 571197600L);
        setLongElement(term255055, 29, 592974000L);
        setLongElement(term255055, 30, 602042400L);
        setLongElement(term255055, 31, 624423600L);
        setLongElement(term255055, 32, 634701600L);
        setLongElement(term255055, 33, 938919600L);
        setLongElement(term255055, 34, 951616800L);
        setLongElement(term255055, 35, 970974000L);
        setLongElement(term255055, 36, 971575200L);
        setLongElement(term255055, 37, 1003028400L);
        setLongElement(term255055, 38, 1013911200L);
        setField(term255051, term255051.getClass(), "savingsInstantTransitions", term255055);
        setField(term255051, term255051.getClass(), "savingsLocalTransitions", term255095);
        setElement(term255096, 1, term255024);
        setElement(term255096, 3, term255024);
        setElement(term255096, 5, term255024);
        setElement(term255096, 7, term255024);
        setElement(term255096, 9, term255024);
        setElement(term255096, 11, term255024);
        setElement(term255096, 13, term255024);
        setElement(term255096, 15, term255024);
        setElement(term255096, 17, term255024);
        setElement(term255096, 19, term255024);
        setElement(term255096, 21, term255024);
        setElement(term255096, 23, term255024);
        setElement(term255096, 25, term255024);
        setElement(term255096, 27, term255024);
        setElement(term255096, 29, term255024);
        setElement(term255096, 31, term255024);
        setElement(term255096, 33, term255024);
        setElement(term255096, 35, term255024);
        setElement(term255096, 37, term255024);
        setElement(term255096, 39, term255024);
        setField(term255051, term255051.getClass(), "wallOffsets", term255096);
        setField(term255051, term255051.getClass(), "lastRules", term255097);
        setField(term255098, term255098.getClass(), "table", null);
        setField(term255098, term255098.getClass(), "nextTable", null);
        setLongField(term255098, term255098.getClass(), "baseCount", 0L);
        setIntField(term255098, term255098.getClass(), "sizeCtl", 0);
        setIntField(term255098, term255098.getClass(), "transferIndex", 0);
        setIntField(term255098, term255098.getClass(), "cellsBusy", 0);
        setField(term255098, term255098.getClass(), "counterCells", null);
        setField(term255098, term255098.getClass(), "keySet", null);
        setField(term255098, term255098.getClass(), "values", null);
        setField(term255098, term255098.getClass(), "entrySet", null);
        setField(term255098, term255098.getClass(), "keySet", null);
        setField(term255098, term255098.getClass(), "values", null);
        setField(term255051, term255051.getClass(), "lastRulesCache", term255098);
        setField(term255034, term255034.getClass(), "rules", term255051);
        setField(term255013, term255013.getClass(), "zone", term255034);
        setField(term254928, term254928.getClass(), "time_stamp", term255013);
        setField(term254928, term254928.getClass(), "start_up_mode", "NxbQJWSXQu");
        setField(term254928, term254928.getClass(), "cmm_dly_mod", "ByfIvofaQE");
        setField(term254928, term254928.getClass(), "cmm_dly_sec", "xvhHgJLoQS");
        setField(term254928, term254928.getClass(), "cmm_err_mod", "bKSYtrrxDp");
        setField(term254928, term254928.getClass(), "country_code", "fQYVEGPLIF");
        setField(term254928, term254928.getClass(), "region_code", "qRwTBVZctS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BRBDbdsahC";
        callMethod(klass, "setReq_id", argTypes, term254928, args);
    }

};


