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

public class BaseRequest_setRver_108904286317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255846;

    public BaseRequest_setRver_108904286317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255846 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term255931 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term255932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255942 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term255952 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term255969 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term255970 = (long[]) newLongArray(1);
        Object[] term255972 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term255973 = (long[]) newLongArray(39);
        Object[] term256013 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term256014 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term256015 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term256016 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term255846, term255846.getClass(), "cmd", "sERwhJnfhH");
        setField(term255846, term255846.getClass(), "req_id", "ttMftcuYTC");
        setField(term255846, term255846.getClass(), "game_id", "ktSwbNnkjp");
        setField(term255846, term255846.getClass(), "r_ver", "GnPQSLhuqc");
        setField(term255846, term255846.getClass(), "kc_serial", "mfxNrcSOVD");
        setField(term255846, term255846.getClass(), "b_serial", "jrsTEswExz");
        setField(term255846, term255846.getClass(), "place_id", "ZQJeRspiaW");
        setIntField(term255933, term255933.getClass(), "year", 2017);
        setShortField(term255933, term255933.getClass(), "month", (short) 4);
        setShortField(term255933, term255933.getClass(), "day", (short) 5);
        setField(term255932, term255932.getClass(), "date", term255933);
        setByteField(term255937, term255937.getClass(), "hour", (byte) 15);
        setByteField(term255937, term255937.getClass(), "minute", (byte) 9);
        setByteField(term255937, term255937.getClass(), "second", (byte) 36);
        setIntField(term255937, term255937.getClass(), "nano", 504876449);
        setField(term255932, term255932.getClass(), "time", term255937);
        setField(term255931, term255931.getClass(), "dateTime", term255932);
        setIntField(term255942, term255942.getClass(), "totalSeconds", -10800);
        setField(term255942, term255942.getClass(), "id", "-03:00");
        setField(term255931, term255931.getClass(), "offset", term255942);
        setField(term255952, term255952.getClass(), "id", "America/Recife");
        setLongElement(term255970, 0, -1767217224L);
        setField(term255969, term255969.getClass(), "standardTransitions", term255970);
        setElement(term255972, 1, term255942);
        setField(term255969, term255969.getClass(), "standardOffsets", term255972);
        setLongElement(term255973, 0, -1767217224L);
        setLongElement(term255973, 1, -1206957600L);
        setLongElement(term255973, 2, -1191362400L);
        setLongElement(term255973, 3, -1175374800L);
        setLongElement(term255973, 4, -1159826400L);
        setLongElement(term255973, 5, -633819600L);
        setLongElement(term255973, 6, -622069200L);
        setLongElement(term255973, 7, -602283600L);
        setLongElement(term255973, 8, -591832800L);
        setLongElement(term255973, 9, -570747600L);
        setLongElement(term255973, 10, -560210400L);
        setLongElement(term255973, 11, -539125200L);
        setLongElement(term255973, 12, -531352800L);
        setLongElement(term255973, 13, -191365200L);
        setLongElement(term255973, 14, -184197600L);
        setLongElement(term255973, 15, -155163600L);
        setLongElement(term255973, 16, -150069600L);
        setLongElement(term255973, 17, -128898000L);
        setLongElement(term255973, 18, -121125600L);
        setLongElement(term255973, 19, -99954000L);
        setLongElement(term255973, 20, -89589600L);
        setLongElement(term255973, 21, -68418000L);
        setLongElement(term255973, 22, -57967200L);
        setLongElement(term255973, 23, 499748400L);
        setLongElement(term255973, 24, 511236000L);
        setLongElement(term255973, 25, 530593200L);
        setLongElement(term255973, 26, 540266400L);
        setLongElement(term255973, 27, 562129200L);
        setLongElement(term255973, 28, 571197600L);
        setLongElement(term255973, 29, 592974000L);
        setLongElement(term255973, 30, 602042400L);
        setLongElement(term255973, 31, 624423600L);
        setLongElement(term255973, 32, 634701600L);
        setLongElement(term255973, 33, 938919600L);
        setLongElement(term255973, 34, 951616800L);
        setLongElement(term255973, 35, 970974000L);
        setLongElement(term255973, 36, 971575200L);
        setLongElement(term255973, 37, 1003028400L);
        setLongElement(term255973, 38, 1013911200L);
        setField(term255969, term255969.getClass(), "savingsInstantTransitions", term255973);
        setField(term255969, term255969.getClass(), "savingsLocalTransitions", term256013);
        setElement(term256014, 1, term255942);
        setElement(term256014, 3, term255942);
        setElement(term256014, 5, term255942);
        setElement(term256014, 7, term255942);
        setElement(term256014, 9, term255942);
        setElement(term256014, 11, term255942);
        setElement(term256014, 13, term255942);
        setElement(term256014, 15, term255942);
        setElement(term256014, 17, term255942);
        setElement(term256014, 19, term255942);
        setElement(term256014, 21, term255942);
        setElement(term256014, 23, term255942);
        setElement(term256014, 25, term255942);
        setElement(term256014, 27, term255942);
        setElement(term256014, 29, term255942);
        setElement(term256014, 31, term255942);
        setElement(term256014, 33, term255942);
        setElement(term256014, 35, term255942);
        setElement(term256014, 37, term255942);
        setElement(term256014, 39, term255942);
        setField(term255969, term255969.getClass(), "wallOffsets", term256014);
        setField(term255969, term255969.getClass(), "lastRules", term256015);
        setField(term256016, term256016.getClass(), "table", null);
        setField(term256016, term256016.getClass(), "nextTable", null);
        setLongField(term256016, term256016.getClass(), "baseCount", 0L);
        setIntField(term256016, term256016.getClass(), "sizeCtl", 0);
        setIntField(term256016, term256016.getClass(), "transferIndex", 0);
        setIntField(term256016, term256016.getClass(), "cellsBusy", 0);
        setField(term256016, term256016.getClass(), "counterCells", null);
        setField(term256016, term256016.getClass(), "keySet", null);
        setField(term256016, term256016.getClass(), "values", null);
        setField(term256016, term256016.getClass(), "entrySet", null);
        setField(term256016, term256016.getClass(), "keySet", null);
        setField(term256016, term256016.getClass(), "values", null);
        setField(term255969, term255969.getClass(), "lastRulesCache", term256016);
        setField(term255952, term255952.getClass(), "rules", term255969);
        setField(term255931, term255931.getClass(), "zone", term255952);
        setField(term255846, term255846.getClass(), "time_stamp", term255931);
        setField(term255846, term255846.getClass(), "start_up_mode", "ZPHvVTleEx");
        setField(term255846, term255846.getClass(), "cmm_dly_mod", "HTaevTdmSx");
        setField(term255846, term255846.getClass(), "cmm_dly_sec", "fxACzuCTdG");
        setField(term255846, term255846.getClass(), "cmm_err_mod", "ZbjykDvTqF");
        setField(term255846, term255846.getClass(), "country_code", "HmpRVfDNrn");
        setField(term255846, term255846.getClass(), "region_code", "PdGPETcyXN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rWXLyvesHI";
        callMethod(klass, "setR_ver", argTypes, term255846, args);
    }

};


