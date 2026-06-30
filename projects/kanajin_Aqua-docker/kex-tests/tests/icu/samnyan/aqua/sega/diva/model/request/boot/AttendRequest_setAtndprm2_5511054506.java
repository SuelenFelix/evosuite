package icu.samnyan.aqua.sega.diva.model.request.boot;

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
import static icu.samnyan.aqua.sega.diva.model.request.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendRequest_setAtndprm2_5511054506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3195;

    public AttendRequest_setAtndprm2_5511054506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3195 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term3328 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3329 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3330 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3334 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3339 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3349 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3366 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3367 = (long[]) newLongArray(1);
        Object[] term3369 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3370 = (long[]) newLongArray(39);
        Object[] term3410 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3411 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3412 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3413 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3195, term3195.getClass(), "atnd_lut", "QXzGXbEXMu");
        setField(term3195, term3195.getClass(), "atnd_prm1", "qxSDVejjiY");
        setField(term3195, term3195.getClass(), "atnd_prm2", "xBsXSDjXYK");
        setField(term3195, term3195.getClass(), "atnd_prm3", "sEnIVFtZuQ");
        setField(term3195, term3195.getClass(), "cmd", "ZVecLZMLHF");
        setField(term3195, term3195.getClass(), "req_id", "fztQhjqwdP");
        setField(term3195, term3195.getClass(), "game_id", "eVpkWxjuki");
        setField(term3195, term3195.getClass(), "r_ver", "SJiQaLvSKv");
        setField(term3195, term3195.getClass(), "kc_serial", "OEXDRUKcFl");
        setField(term3195, term3195.getClass(), "b_serial", "RYdKCNNMBR");
        setField(term3195, term3195.getClass(), "place_id", "yGtHPyvYiQ");
        setIntField(term3330, term3330.getClass(), "year", 2025);
        setShortField(term3330, term3330.getClass(), "month", (short) 4);
        setShortField(term3330, term3330.getClass(), "day", (short) 24);
        setField(term3329, term3329.getClass(), "date", term3330);
        setByteField(term3334, term3334.getClass(), "hour", (byte) 18);
        setByteField(term3334, term3334.getClass(), "minute", (byte) 11);
        setByteField(term3334, term3334.getClass(), "second", (byte) 40);
        setIntField(term3334, term3334.getClass(), "nano", 137454929);
        setField(term3329, term3329.getClass(), "time", term3334);
        setField(term3328, term3328.getClass(), "dateTime", term3329);
        setIntField(term3339, term3339.getClass(), "totalSeconds", -10800);
        setField(term3339, term3339.getClass(), "id", "-03:00");
        setField(term3328, term3328.getClass(), "offset", term3339);
        setField(term3349, term3349.getClass(), "id", "America/Recife");
        setLongElement(term3367, 0, -1767217224L);
        setField(term3366, term3366.getClass(), "standardTransitions", term3367);
        setElement(term3369, 1, term3339);
        setField(term3366, term3366.getClass(), "standardOffsets", term3369);
        setLongElement(term3370, 0, -1767217224L);
        setLongElement(term3370, 1, -1206957600L);
        setLongElement(term3370, 2, -1191362400L);
        setLongElement(term3370, 3, -1175374800L);
        setLongElement(term3370, 4, -1159826400L);
        setLongElement(term3370, 5, -633819600L);
        setLongElement(term3370, 6, -622069200L);
        setLongElement(term3370, 7, -602283600L);
        setLongElement(term3370, 8, -591832800L);
        setLongElement(term3370, 9, -570747600L);
        setLongElement(term3370, 10, -560210400L);
        setLongElement(term3370, 11, -539125200L);
        setLongElement(term3370, 12, -531352800L);
        setLongElement(term3370, 13, -191365200L);
        setLongElement(term3370, 14, -184197600L);
        setLongElement(term3370, 15, -155163600L);
        setLongElement(term3370, 16, -150069600L);
        setLongElement(term3370, 17, -128898000L);
        setLongElement(term3370, 18, -121125600L);
        setLongElement(term3370, 19, -99954000L);
        setLongElement(term3370, 20, -89589600L);
        setLongElement(term3370, 21, -68418000L);
        setLongElement(term3370, 22, -57967200L);
        setLongElement(term3370, 23, 499748400L);
        setLongElement(term3370, 24, 511236000L);
        setLongElement(term3370, 25, 530593200L);
        setLongElement(term3370, 26, 540266400L);
        setLongElement(term3370, 27, 562129200L);
        setLongElement(term3370, 28, 571197600L);
        setLongElement(term3370, 29, 592974000L);
        setLongElement(term3370, 30, 602042400L);
        setLongElement(term3370, 31, 624423600L);
        setLongElement(term3370, 32, 634701600L);
        setLongElement(term3370, 33, 938919600L);
        setLongElement(term3370, 34, 951616800L);
        setLongElement(term3370, 35, 970974000L);
        setLongElement(term3370, 36, 971575200L);
        setLongElement(term3370, 37, 1003028400L);
        setLongElement(term3370, 38, 1013911200L);
        setField(term3366, term3366.getClass(), "savingsInstantTransitions", term3370);
        setField(term3366, term3366.getClass(), "savingsLocalTransitions", term3410);
        setElement(term3411, 1, term3339);
        setElement(term3411, 3, term3339);
        setElement(term3411, 5, term3339);
        setElement(term3411, 7, term3339);
        setElement(term3411, 9, term3339);
        setElement(term3411, 11, term3339);
        setElement(term3411, 13, term3339);
        setElement(term3411, 15, term3339);
        setElement(term3411, 17, term3339);
        setElement(term3411, 19, term3339);
        setElement(term3411, 21, term3339);
        setElement(term3411, 23, term3339);
        setElement(term3411, 25, term3339);
        setElement(term3411, 27, term3339);
        setElement(term3411, 29, term3339);
        setElement(term3411, 31, term3339);
        setElement(term3411, 33, term3339);
        setElement(term3411, 35, term3339);
        setElement(term3411, 37, term3339);
        setElement(term3411, 39, term3339);
        setField(term3366, term3366.getClass(), "wallOffsets", term3411);
        setField(term3366, term3366.getClass(), "lastRules", term3412);
        setField(term3413, term3413.getClass(), "table", null);
        setField(term3413, term3413.getClass(), "nextTable", null);
        setLongField(term3413, term3413.getClass(), "baseCount", 0L);
        setIntField(term3413, term3413.getClass(), "sizeCtl", 0);
        setIntField(term3413, term3413.getClass(), "transferIndex", 0);
        setIntField(term3413, term3413.getClass(), "cellsBusy", 0);
        setField(term3413, term3413.getClass(), "counterCells", null);
        setField(term3413, term3413.getClass(), "keySet", null);
        setField(term3413, term3413.getClass(), "values", null);
        setField(term3413, term3413.getClass(), "entrySet", null);
        setField(term3413, term3413.getClass(), "keySet", null);
        setField(term3413, term3413.getClass(), "values", null);
        setField(term3366, term3366.getClass(), "lastRulesCache", term3413);
        setField(term3349, term3349.getClass(), "rules", term3366);
        setField(term3328, term3328.getClass(), "zone", term3349);
        setField(term3195, term3195.getClass(), "time_stamp", term3328);
        setField(term3195, term3195.getClass(), "start_up_mode", "MvRIxilFMJ");
        setField(term3195, term3195.getClass(), "cmm_dly_mod", "iNwOJRBEjp");
        setField(term3195, term3195.getClass(), "cmm_dly_sec", "XylxrMBraH");
        setField(term3195, term3195.getClass(), "cmm_err_mod", "pORebkoRdD");
        setField(term3195, term3195.getClass(), "country_code", "mXGCWJDOqA");
        setField(term3195, term3195.getClass(), "region_code", "dpNsDgfPso");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hCWPJQKpdc";
        callMethod(klass, "setAtnd_prm2", argTypes, term3195, args);
    }

};


