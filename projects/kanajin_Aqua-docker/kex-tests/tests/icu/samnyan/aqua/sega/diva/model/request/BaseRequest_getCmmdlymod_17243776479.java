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

public class BaseRequest_getCmmdlymod_17243776479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252284;

    public BaseRequest_getCmmdlymod_17243776479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252284 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term252369 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term252370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252375 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252380 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term252390 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term252407 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term252408 = (long[]) newLongArray(1);
        Object[] term252410 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term252411 = (long[]) newLongArray(39);
        Object[] term252451 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term252452 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term252453 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term252454 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term252284, term252284.getClass(), "cmd", "pJVgbTDDrd");
        setField(term252284, term252284.getClass(), "req_id", "UzXAOjUtTa");
        setField(term252284, term252284.getClass(), "game_id", "NjTyNZneQx");
        setField(term252284, term252284.getClass(), "r_ver", "WZgjoyroht");
        setField(term252284, term252284.getClass(), "kc_serial", "WsLIuqMrjH");
        setField(term252284, term252284.getClass(), "b_serial", "bSGeeoWHWd");
        setField(term252284, term252284.getClass(), "place_id", "zrXiLofNaH");
        setIntField(term252371, term252371.getClass(), "year", 2019);
        setShortField(term252371, term252371.getClass(), "month", (short) 8);
        setShortField(term252371, term252371.getClass(), "day", (short) 6);
        setField(term252370, term252370.getClass(), "date", term252371);
        setByteField(term252375, term252375.getClass(), "hour", (byte) 5);
        setByteField(term252375, term252375.getClass(), "minute", (byte) 32);
        setByteField(term252375, term252375.getClass(), "second", (byte) 47);
        setIntField(term252375, term252375.getClass(), "nano", 73220317);
        setField(term252370, term252370.getClass(), "time", term252375);
        setField(term252369, term252369.getClass(), "dateTime", term252370);
        setIntField(term252380, term252380.getClass(), "totalSeconds", -10800);
        setField(term252380, term252380.getClass(), "id", "-03:00");
        setField(term252369, term252369.getClass(), "offset", term252380);
        setField(term252390, term252390.getClass(), "id", "America/Recife");
        setLongElement(term252408, 0, -1767217224L);
        setField(term252407, term252407.getClass(), "standardTransitions", term252408);
        setElement(term252410, 1, term252380);
        setField(term252407, term252407.getClass(), "standardOffsets", term252410);
        setLongElement(term252411, 0, -1767217224L);
        setLongElement(term252411, 1, -1206957600L);
        setLongElement(term252411, 2, -1191362400L);
        setLongElement(term252411, 3, -1175374800L);
        setLongElement(term252411, 4, -1159826400L);
        setLongElement(term252411, 5, -633819600L);
        setLongElement(term252411, 6, -622069200L);
        setLongElement(term252411, 7, -602283600L);
        setLongElement(term252411, 8, -591832800L);
        setLongElement(term252411, 9, -570747600L);
        setLongElement(term252411, 10, -560210400L);
        setLongElement(term252411, 11, -539125200L);
        setLongElement(term252411, 12, -531352800L);
        setLongElement(term252411, 13, -191365200L);
        setLongElement(term252411, 14, -184197600L);
        setLongElement(term252411, 15, -155163600L);
        setLongElement(term252411, 16, -150069600L);
        setLongElement(term252411, 17, -128898000L);
        setLongElement(term252411, 18, -121125600L);
        setLongElement(term252411, 19, -99954000L);
        setLongElement(term252411, 20, -89589600L);
        setLongElement(term252411, 21, -68418000L);
        setLongElement(term252411, 22, -57967200L);
        setLongElement(term252411, 23, 499748400L);
        setLongElement(term252411, 24, 511236000L);
        setLongElement(term252411, 25, 530593200L);
        setLongElement(term252411, 26, 540266400L);
        setLongElement(term252411, 27, 562129200L);
        setLongElement(term252411, 28, 571197600L);
        setLongElement(term252411, 29, 592974000L);
        setLongElement(term252411, 30, 602042400L);
        setLongElement(term252411, 31, 624423600L);
        setLongElement(term252411, 32, 634701600L);
        setLongElement(term252411, 33, 938919600L);
        setLongElement(term252411, 34, 951616800L);
        setLongElement(term252411, 35, 970974000L);
        setLongElement(term252411, 36, 971575200L);
        setLongElement(term252411, 37, 1003028400L);
        setLongElement(term252411, 38, 1013911200L);
        setField(term252407, term252407.getClass(), "savingsInstantTransitions", term252411);
        setField(term252407, term252407.getClass(), "savingsLocalTransitions", term252451);
        setElement(term252452, 1, term252380);
        setElement(term252452, 3, term252380);
        setElement(term252452, 5, term252380);
        setElement(term252452, 7, term252380);
        setElement(term252452, 9, term252380);
        setElement(term252452, 11, term252380);
        setElement(term252452, 13, term252380);
        setElement(term252452, 15, term252380);
        setElement(term252452, 17, term252380);
        setElement(term252452, 19, term252380);
        setElement(term252452, 21, term252380);
        setElement(term252452, 23, term252380);
        setElement(term252452, 25, term252380);
        setElement(term252452, 27, term252380);
        setElement(term252452, 29, term252380);
        setElement(term252452, 31, term252380);
        setElement(term252452, 33, term252380);
        setElement(term252452, 35, term252380);
        setElement(term252452, 37, term252380);
        setElement(term252452, 39, term252380);
        setField(term252407, term252407.getClass(), "wallOffsets", term252452);
        setField(term252407, term252407.getClass(), "lastRules", term252453);
        setField(term252454, term252454.getClass(), "table", null);
        setField(term252454, term252454.getClass(), "nextTable", null);
        setLongField(term252454, term252454.getClass(), "baseCount", 0L);
        setIntField(term252454, term252454.getClass(), "sizeCtl", 0);
        setIntField(term252454, term252454.getClass(), "transferIndex", 0);
        setIntField(term252454, term252454.getClass(), "cellsBusy", 0);
        setField(term252454, term252454.getClass(), "counterCells", null);
        setField(term252454, term252454.getClass(), "keySet", null);
        setField(term252454, term252454.getClass(), "values", null);
        setField(term252454, term252454.getClass(), "entrySet", null);
        setField(term252454, term252454.getClass(), "keySet", null);
        setField(term252454, term252454.getClass(), "values", null);
        setField(term252407, term252407.getClass(), "lastRulesCache", term252454);
        setField(term252390, term252390.getClass(), "rules", term252407);
        setField(term252369, term252369.getClass(), "zone", term252390);
        setField(term252284, term252284.getClass(), "time_stamp", term252369);
        setField(term252284, term252284.getClass(), "start_up_mode", "qNyGHnJtiu");
        setField(term252284, term252284.getClass(), "cmm_dly_mod", "TEpyPHqnFK");
        setField(term252284, term252284.getClass(), "cmm_dly_sec", "IuajqwVUGv");
        setField(term252284, term252284.getClass(), "cmm_err_mod", "XpFjyIwJKk");
        setField(term252284, term252284.getClass(), "country_code", "rxVTeZJIuC");
        setField(term252284, term252284.getClass(), "region_code", "EPpDDOGAQG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmm_dly_mod", argTypes, term252284, args);
    }

};


