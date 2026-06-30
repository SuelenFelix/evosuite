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

public class BaseRequest_getTimestamp_1434107057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251410;

    public BaseRequest_getTimestamp_1434107057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251410 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term251495 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term251496 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251497 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251501 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251506 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term251516 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term251533 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term251534 = (long[]) newLongArray(1);
        Object[] term251536 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term251537 = (long[]) newLongArray(39);
        Object[] term251577 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term251578 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term251579 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term251580 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term251410, term251410.getClass(), "cmd", "SptxbRhzuT");
        setField(term251410, term251410.getClass(), "req_id", "mIFDQhdALu");
        setField(term251410, term251410.getClass(), "game_id", "IfjNTGtdwY");
        setField(term251410, term251410.getClass(), "r_ver", "ToupqTNDBq");
        setField(term251410, term251410.getClass(), "kc_serial", "yzFbLpPTrq");
        setField(term251410, term251410.getClass(), "b_serial", "iYRIEjEhxB");
        setField(term251410, term251410.getClass(), "place_id", "EyLarnQiro");
        setIntField(term251497, term251497.getClass(), "year", 2029);
        setShortField(term251497, term251497.getClass(), "month", (short) 11);
        setShortField(term251497, term251497.getClass(), "day", (short) 6);
        setField(term251496, term251496.getClass(), "date", term251497);
        setByteField(term251501, term251501.getClass(), "hour", (byte) 2);
        setByteField(term251501, term251501.getClass(), "minute", (byte) 55);
        setByteField(term251501, term251501.getClass(), "second", (byte) 43);
        setIntField(term251501, term251501.getClass(), "nano", 109400580);
        setField(term251496, term251496.getClass(), "time", term251501);
        setField(term251495, term251495.getClass(), "dateTime", term251496);
        setIntField(term251506, term251506.getClass(), "totalSeconds", -10800);
        setField(term251506, term251506.getClass(), "id", "-03:00");
        setField(term251495, term251495.getClass(), "offset", term251506);
        setField(term251516, term251516.getClass(), "id", "America/Recife");
        setLongElement(term251534, 0, -1767217224L);
        setField(term251533, term251533.getClass(), "standardTransitions", term251534);
        setElement(term251536, 1, term251506);
        setField(term251533, term251533.getClass(), "standardOffsets", term251536);
        setLongElement(term251537, 0, -1767217224L);
        setLongElement(term251537, 1, -1206957600L);
        setLongElement(term251537, 2, -1191362400L);
        setLongElement(term251537, 3, -1175374800L);
        setLongElement(term251537, 4, -1159826400L);
        setLongElement(term251537, 5, -633819600L);
        setLongElement(term251537, 6, -622069200L);
        setLongElement(term251537, 7, -602283600L);
        setLongElement(term251537, 8, -591832800L);
        setLongElement(term251537, 9, -570747600L);
        setLongElement(term251537, 10, -560210400L);
        setLongElement(term251537, 11, -539125200L);
        setLongElement(term251537, 12, -531352800L);
        setLongElement(term251537, 13, -191365200L);
        setLongElement(term251537, 14, -184197600L);
        setLongElement(term251537, 15, -155163600L);
        setLongElement(term251537, 16, -150069600L);
        setLongElement(term251537, 17, -128898000L);
        setLongElement(term251537, 18, -121125600L);
        setLongElement(term251537, 19, -99954000L);
        setLongElement(term251537, 20, -89589600L);
        setLongElement(term251537, 21, -68418000L);
        setLongElement(term251537, 22, -57967200L);
        setLongElement(term251537, 23, 499748400L);
        setLongElement(term251537, 24, 511236000L);
        setLongElement(term251537, 25, 530593200L);
        setLongElement(term251537, 26, 540266400L);
        setLongElement(term251537, 27, 562129200L);
        setLongElement(term251537, 28, 571197600L);
        setLongElement(term251537, 29, 592974000L);
        setLongElement(term251537, 30, 602042400L);
        setLongElement(term251537, 31, 624423600L);
        setLongElement(term251537, 32, 634701600L);
        setLongElement(term251537, 33, 938919600L);
        setLongElement(term251537, 34, 951616800L);
        setLongElement(term251537, 35, 970974000L);
        setLongElement(term251537, 36, 971575200L);
        setLongElement(term251537, 37, 1003028400L);
        setLongElement(term251537, 38, 1013911200L);
        setField(term251533, term251533.getClass(), "savingsInstantTransitions", term251537);
        setField(term251533, term251533.getClass(), "savingsLocalTransitions", term251577);
        setElement(term251578, 1, term251506);
        setElement(term251578, 3, term251506);
        setElement(term251578, 5, term251506);
        setElement(term251578, 7, term251506);
        setElement(term251578, 9, term251506);
        setElement(term251578, 11, term251506);
        setElement(term251578, 13, term251506);
        setElement(term251578, 15, term251506);
        setElement(term251578, 17, term251506);
        setElement(term251578, 19, term251506);
        setElement(term251578, 21, term251506);
        setElement(term251578, 23, term251506);
        setElement(term251578, 25, term251506);
        setElement(term251578, 27, term251506);
        setElement(term251578, 29, term251506);
        setElement(term251578, 31, term251506);
        setElement(term251578, 33, term251506);
        setElement(term251578, 35, term251506);
        setElement(term251578, 37, term251506);
        setElement(term251578, 39, term251506);
        setField(term251533, term251533.getClass(), "wallOffsets", term251578);
        setField(term251533, term251533.getClass(), "lastRules", term251579);
        setField(term251580, term251580.getClass(), "table", null);
        setField(term251580, term251580.getClass(), "nextTable", null);
        setLongField(term251580, term251580.getClass(), "baseCount", 0L);
        setIntField(term251580, term251580.getClass(), "sizeCtl", 0);
        setIntField(term251580, term251580.getClass(), "transferIndex", 0);
        setIntField(term251580, term251580.getClass(), "cellsBusy", 0);
        setField(term251580, term251580.getClass(), "counterCells", null);
        setField(term251580, term251580.getClass(), "keySet", null);
        setField(term251580, term251580.getClass(), "values", null);
        setField(term251580, term251580.getClass(), "entrySet", null);
        setField(term251580, term251580.getClass(), "keySet", null);
        setField(term251580, term251580.getClass(), "values", null);
        setField(term251533, term251533.getClass(), "lastRulesCache", term251580);
        setField(term251516, term251516.getClass(), "rules", term251533);
        setField(term251495, term251495.getClass(), "zone", term251516);
        setField(term251410, term251410.getClass(), "time_stamp", term251495);
        setField(term251410, term251410.getClass(), "start_up_mode", "xPXCillnkF");
        setField(term251410, term251410.getClass(), "cmm_dly_mod", "UQdNECYgYF");
        setField(term251410, term251410.getClass(), "cmm_dly_sec", "tWKRqEdXvq");
        setField(term251410, term251410.getClass(), "cmm_err_mod", "IzICHEiRZJ");
        setField(term251410, term251410.getClass(), "country_code", "OVdPWRdMle");
        setField(term251410, term251410.getClass(), "region_code", "oimCfCnzdd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime_stamp", argTypes, term251410, args);
    }

};


