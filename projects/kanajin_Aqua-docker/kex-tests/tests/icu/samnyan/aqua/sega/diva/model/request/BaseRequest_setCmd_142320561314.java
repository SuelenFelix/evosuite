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

public class BaseRequest_setCmd_142320561314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254469;

    public BaseRequest_setCmd_142320561314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254469 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term254554 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term254555 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term254556 = newInstance(Class.forName("java.time.LocalDate"));
        Object term254560 = newInstance(Class.forName("java.time.LocalTime"));
        Object term254565 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term254575 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term254592 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term254593 = (long[]) newLongArray(1);
        Object[] term254595 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term254596 = (long[]) newLongArray(39);
        Object[] term254636 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term254637 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term254638 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term254639 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term254469, term254469.getClass(), "cmd", "jCLmdVxyvG");
        setField(term254469, term254469.getClass(), "req_id", "FYniCuCHuO");
        setField(term254469, term254469.getClass(), "game_id", "VJXbdWMtjC");
        setField(term254469, term254469.getClass(), "r_ver", "AugzpVbSsO");
        setField(term254469, term254469.getClass(), "kc_serial", "tBGQmugLvu");
        setField(term254469, term254469.getClass(), "b_serial", "oxWULKaNGt");
        setField(term254469, term254469.getClass(), "place_id", "cbZjrijpVX");
        setIntField(term254556, term254556.getClass(), "year", 2020);
        setShortField(term254556, term254556.getClass(), "month", (short) 10);
        setShortField(term254556, term254556.getClass(), "day", (short) 2);
        setField(term254555, term254555.getClass(), "date", term254556);
        setByteField(term254560, term254560.getClass(), "hour", (byte) 1);
        setByteField(term254560, term254560.getClass(), "minute", (byte) 41);
        setByteField(term254560, term254560.getClass(), "second", (byte) 48);
        setIntField(term254560, term254560.getClass(), "nano", 834720747);
        setField(term254555, term254555.getClass(), "time", term254560);
        setField(term254554, term254554.getClass(), "dateTime", term254555);
        setIntField(term254565, term254565.getClass(), "totalSeconds", -10800);
        setField(term254565, term254565.getClass(), "id", "-03:00");
        setField(term254554, term254554.getClass(), "offset", term254565);
        setField(term254575, term254575.getClass(), "id", "America/Recife");
        setLongElement(term254593, 0, -1767217224L);
        setField(term254592, term254592.getClass(), "standardTransitions", term254593);
        setElement(term254595, 1, term254565);
        setField(term254592, term254592.getClass(), "standardOffsets", term254595);
        setLongElement(term254596, 0, -1767217224L);
        setLongElement(term254596, 1, -1206957600L);
        setLongElement(term254596, 2, -1191362400L);
        setLongElement(term254596, 3, -1175374800L);
        setLongElement(term254596, 4, -1159826400L);
        setLongElement(term254596, 5, -633819600L);
        setLongElement(term254596, 6, -622069200L);
        setLongElement(term254596, 7, -602283600L);
        setLongElement(term254596, 8, -591832800L);
        setLongElement(term254596, 9, -570747600L);
        setLongElement(term254596, 10, -560210400L);
        setLongElement(term254596, 11, -539125200L);
        setLongElement(term254596, 12, -531352800L);
        setLongElement(term254596, 13, -191365200L);
        setLongElement(term254596, 14, -184197600L);
        setLongElement(term254596, 15, -155163600L);
        setLongElement(term254596, 16, -150069600L);
        setLongElement(term254596, 17, -128898000L);
        setLongElement(term254596, 18, -121125600L);
        setLongElement(term254596, 19, -99954000L);
        setLongElement(term254596, 20, -89589600L);
        setLongElement(term254596, 21, -68418000L);
        setLongElement(term254596, 22, -57967200L);
        setLongElement(term254596, 23, 499748400L);
        setLongElement(term254596, 24, 511236000L);
        setLongElement(term254596, 25, 530593200L);
        setLongElement(term254596, 26, 540266400L);
        setLongElement(term254596, 27, 562129200L);
        setLongElement(term254596, 28, 571197600L);
        setLongElement(term254596, 29, 592974000L);
        setLongElement(term254596, 30, 602042400L);
        setLongElement(term254596, 31, 624423600L);
        setLongElement(term254596, 32, 634701600L);
        setLongElement(term254596, 33, 938919600L);
        setLongElement(term254596, 34, 951616800L);
        setLongElement(term254596, 35, 970974000L);
        setLongElement(term254596, 36, 971575200L);
        setLongElement(term254596, 37, 1003028400L);
        setLongElement(term254596, 38, 1013911200L);
        setField(term254592, term254592.getClass(), "savingsInstantTransitions", term254596);
        setField(term254592, term254592.getClass(), "savingsLocalTransitions", term254636);
        setElement(term254637, 1, term254565);
        setElement(term254637, 3, term254565);
        setElement(term254637, 5, term254565);
        setElement(term254637, 7, term254565);
        setElement(term254637, 9, term254565);
        setElement(term254637, 11, term254565);
        setElement(term254637, 13, term254565);
        setElement(term254637, 15, term254565);
        setElement(term254637, 17, term254565);
        setElement(term254637, 19, term254565);
        setElement(term254637, 21, term254565);
        setElement(term254637, 23, term254565);
        setElement(term254637, 25, term254565);
        setElement(term254637, 27, term254565);
        setElement(term254637, 29, term254565);
        setElement(term254637, 31, term254565);
        setElement(term254637, 33, term254565);
        setElement(term254637, 35, term254565);
        setElement(term254637, 37, term254565);
        setElement(term254637, 39, term254565);
        setField(term254592, term254592.getClass(), "wallOffsets", term254637);
        setField(term254592, term254592.getClass(), "lastRules", term254638);
        setField(term254639, term254639.getClass(), "table", null);
        setField(term254639, term254639.getClass(), "nextTable", null);
        setLongField(term254639, term254639.getClass(), "baseCount", 0L);
        setIntField(term254639, term254639.getClass(), "sizeCtl", 0);
        setIntField(term254639, term254639.getClass(), "transferIndex", 0);
        setIntField(term254639, term254639.getClass(), "cellsBusy", 0);
        setField(term254639, term254639.getClass(), "counterCells", null);
        setField(term254639, term254639.getClass(), "keySet", null);
        setField(term254639, term254639.getClass(), "values", null);
        setField(term254639, term254639.getClass(), "entrySet", null);
        setField(term254639, term254639.getClass(), "keySet", null);
        setField(term254639, term254639.getClass(), "values", null);
        setField(term254592, term254592.getClass(), "lastRulesCache", term254639);
        setField(term254575, term254575.getClass(), "rules", term254592);
        setField(term254554, term254554.getClass(), "zone", term254575);
        setField(term254469, term254469.getClass(), "time_stamp", term254554);
        setField(term254469, term254469.getClass(), "start_up_mode", "OGWRelGqxR");
        setField(term254469, term254469.getClass(), "cmm_dly_mod", "fKSWVsjAjO");
        setField(term254469, term254469.getClass(), "cmm_dly_sec", "mgPzmcygcU");
        setField(term254469, term254469.getClass(), "cmm_err_mod", "mvEDoAbPuT");
        setField(term254469, term254469.getClass(), "country_code", "EUWHyMdRKl");
        setField(term254469, term254469.getClass(), "region_code", "YsUKZpMHKF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sPGChMFTge";
        callMethod(klass, "setCmd", argTypes, term254469, args);
    }

};


