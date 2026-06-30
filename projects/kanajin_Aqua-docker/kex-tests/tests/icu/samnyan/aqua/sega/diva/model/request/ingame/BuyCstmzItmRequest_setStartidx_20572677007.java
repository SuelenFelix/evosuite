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
import java.lang.Integer;

public class BuyCstmzItmRequest_setStartidx_20572677007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276215;
     Object term276467;

    public BuyCstmzItmRequest_setStartidx_20572677007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276215 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term276305 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term276306 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276307 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276311 = newInstance(Class.forName("java.time.LocalTime"));
        Object term276316 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term276326 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term276343 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term276344 = (long[]) newLongArray(1);
        Object[] term276346 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term276347 = (long[]) newLongArray(39);
        Object[] term276387 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term276388 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term276389 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term276390 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term276215, term276215.getClass(), "pd_id", -215337872);
        setIntField(term276215, term276215.getClass(), "accept_idx", 1326057468);
        setIntField(term276215, term276215.getClass(), "start_idx", 59948236);
        setIntField(term276215, term276215.getClass(), "cstmz_itm_id", -1218952912);
        setIntField(term276215, term276215.getClass(), "cstmz_itm_price", -823943170);
        setField(term276215, term276215.getClass(), "cmd", "raishRurKx");
        setField(term276215, term276215.getClass(), "req_id", "PpeSAmBPlT");
        setField(term276215, term276215.getClass(), "game_id", "XmRRZpyFKp");
        setField(term276215, term276215.getClass(), "r_ver", "QXOnXJGHZk");
        setField(term276215, term276215.getClass(), "kc_serial", "tckSURIPmO");
        setField(term276215, term276215.getClass(), "b_serial", "GZSnqwBCPQ");
        setField(term276215, term276215.getClass(), "place_id", "zxdSWLKWYw");
        setIntField(term276307, term276307.getClass(), "year", 2020);
        setShortField(term276307, term276307.getClass(), "month", (short) 9);
        setShortField(term276307, term276307.getClass(), "day", (short) 2);
        setField(term276306, term276306.getClass(), "date", term276307);
        setByteField(term276311, term276311.getClass(), "hour", (byte) 17);
        setByteField(term276311, term276311.getClass(), "minute", (byte) 47);
        setByteField(term276311, term276311.getClass(), "second", (byte) 32);
        setIntField(term276311, term276311.getClass(), "nano", 161829485);
        setField(term276306, term276306.getClass(), "time", term276311);
        setField(term276305, term276305.getClass(), "dateTime", term276306);
        setIntField(term276316, term276316.getClass(), "totalSeconds", -10800);
        setField(term276316, term276316.getClass(), "id", "-03:00");
        setField(term276305, term276305.getClass(), "offset", term276316);
        setField(term276326, term276326.getClass(), "id", "America/Recife");
        setLongElement(term276344, 0, -1767217224L);
        setField(term276343, term276343.getClass(), "standardTransitions", term276344);
        setElement(term276346, 1, term276316);
        setField(term276343, term276343.getClass(), "standardOffsets", term276346);
        setLongElement(term276347, 0, -1767217224L);
        setLongElement(term276347, 1, -1206957600L);
        setLongElement(term276347, 2, -1191362400L);
        setLongElement(term276347, 3, -1175374800L);
        setLongElement(term276347, 4, -1159826400L);
        setLongElement(term276347, 5, -633819600L);
        setLongElement(term276347, 6, -622069200L);
        setLongElement(term276347, 7, -602283600L);
        setLongElement(term276347, 8, -591832800L);
        setLongElement(term276347, 9, -570747600L);
        setLongElement(term276347, 10, -560210400L);
        setLongElement(term276347, 11, -539125200L);
        setLongElement(term276347, 12, -531352800L);
        setLongElement(term276347, 13, -191365200L);
        setLongElement(term276347, 14, -184197600L);
        setLongElement(term276347, 15, -155163600L);
        setLongElement(term276347, 16, -150069600L);
        setLongElement(term276347, 17, -128898000L);
        setLongElement(term276347, 18, -121125600L);
        setLongElement(term276347, 19, -99954000L);
        setLongElement(term276347, 20, -89589600L);
        setLongElement(term276347, 21, -68418000L);
        setLongElement(term276347, 22, -57967200L);
        setLongElement(term276347, 23, 499748400L);
        setLongElement(term276347, 24, 511236000L);
        setLongElement(term276347, 25, 530593200L);
        setLongElement(term276347, 26, 540266400L);
        setLongElement(term276347, 27, 562129200L);
        setLongElement(term276347, 28, 571197600L);
        setLongElement(term276347, 29, 592974000L);
        setLongElement(term276347, 30, 602042400L);
        setLongElement(term276347, 31, 624423600L);
        setLongElement(term276347, 32, 634701600L);
        setLongElement(term276347, 33, 938919600L);
        setLongElement(term276347, 34, 951616800L);
        setLongElement(term276347, 35, 970974000L);
        setLongElement(term276347, 36, 971575200L);
        setLongElement(term276347, 37, 1003028400L);
        setLongElement(term276347, 38, 1013911200L);
        setField(term276343, term276343.getClass(), "savingsInstantTransitions", term276347);
        setField(term276343, term276343.getClass(), "savingsLocalTransitions", term276387);
        setElement(term276388, 1, term276316);
        setElement(term276388, 3, term276316);
        setElement(term276388, 5, term276316);
        setElement(term276388, 7, term276316);
        setElement(term276388, 9, term276316);
        setElement(term276388, 11, term276316);
        setElement(term276388, 13, term276316);
        setElement(term276388, 15, term276316);
        setElement(term276388, 17, term276316);
        setElement(term276388, 19, term276316);
        setElement(term276388, 21, term276316);
        setElement(term276388, 23, term276316);
        setElement(term276388, 25, term276316);
        setElement(term276388, 27, term276316);
        setElement(term276388, 29, term276316);
        setElement(term276388, 31, term276316);
        setElement(term276388, 33, term276316);
        setElement(term276388, 35, term276316);
        setElement(term276388, 37, term276316);
        setElement(term276388, 39, term276316);
        setField(term276343, term276343.getClass(), "wallOffsets", term276388);
        setField(term276343, term276343.getClass(), "lastRules", term276389);
        setField(term276390, term276390.getClass(), "table", null);
        setField(term276390, term276390.getClass(), "nextTable", null);
        setLongField(term276390, term276390.getClass(), "baseCount", 0L);
        setIntField(term276390, term276390.getClass(), "sizeCtl", 0);
        setIntField(term276390, term276390.getClass(), "transferIndex", 0);
        setIntField(term276390, term276390.getClass(), "cellsBusy", 0);
        setField(term276390, term276390.getClass(), "counterCells", null);
        setField(term276390, term276390.getClass(), "keySet", null);
        setField(term276390, term276390.getClass(), "values", null);
        setField(term276390, term276390.getClass(), "entrySet", null);
        setField(term276390, term276390.getClass(), "keySet", null);
        setField(term276390, term276390.getClass(), "values", null);
        setField(term276343, term276343.getClass(), "lastRulesCache", term276390);
        setField(term276326, term276326.getClass(), "rules", term276343);
        setField(term276305, term276305.getClass(), "zone", term276326);
        setField(term276215, term276215.getClass(), "time_stamp", term276305);
        setField(term276215, term276215.getClass(), "start_up_mode", "VurQtsudbR");
        setField(term276215, term276215.getClass(), "cmm_dly_mod", "KdIGyBXZVB");
        setField(term276215, term276215.getClass(), "cmm_dly_sec", "eKvGCdbyoP");
        setField(term276215, term276215.getClass(), "cmm_err_mod", "MgMUmPLywB");
        setField(term276215, term276215.getClass(), "country_code", "pNJhowQpXJ");
        setField(term276215, term276215.getClass(), "region_code", "gyfupqhzxo");
        term276467 = new Integer(1759857602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276467;
        callMethod(klass, "setStart_idx", argTypes, term276215, args);
    }

};


