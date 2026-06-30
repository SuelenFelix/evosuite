package icu.samnyan.aqua.sega.diva.handler.boot;

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
import static icu.samnyan.aqua.sega.diva.handler.boot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AttendHandler_handle_3549349421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term440;
     Object term441;

    public AttendHandler_handle_3549349421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term440 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.AttendHandler"));
        setField(term440, term440.getClass(), "mapper", null);
        term441 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term526 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term532 = newInstance(Class.forName("java.time.LocalTime"));
        Object term537 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term547 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term564 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term565 = (long[]) newLongArray(1);
        Object[] term567 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term568 = (long[]) newLongArray(39);
        Object[] term608 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term609 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term610 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term611 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term441, term441.getClass(), "cmd", "LQFpaHEwXR");
        setField(term441, term441.getClass(), "req_id", "oVcInYnLWB");
        setField(term441, term441.getClass(), "game_id", "aJlieCFVtF");
        setField(term441, term441.getClass(), "r_ver", "ZiaGIbnzTs");
        setField(term441, term441.getClass(), "kc_serial", "tbcdzjIfER");
        setField(term441, term441.getClass(), "b_serial", "HyxfbSQYBe");
        setField(term441, term441.getClass(), "place_id", "pCTimMblYc");
        setIntField(term528, term528.getClass(), "year", 2021);
        setShortField(term528, term528.getClass(), "month", (short) 1);
        setShortField(term528, term528.getClass(), "day", (short) 18);
        setField(term527, term527.getClass(), "date", term528);
        setByteField(term532, term532.getClass(), "hour", (byte) 13);
        setByteField(term532, term532.getClass(), "minute", (byte) 38);
        setByteField(term532, term532.getClass(), "second", (byte) 26);
        setIntField(term532, term532.getClass(), "nano", 544608644);
        setField(term527, term527.getClass(), "time", term532);
        setField(term526, term526.getClass(), "dateTime", term527);
        setIntField(term537, term537.getClass(), "totalSeconds", -10800);
        setField(term537, term537.getClass(), "id", "-03:00");
        setField(term526, term526.getClass(), "offset", term537);
        setField(term547, term547.getClass(), "id", "America/Recife");
        setLongElement(term565, 0, -1767217224L);
        setField(term564, term564.getClass(), "standardTransitions", term565);
        setElement(term567, 1, term537);
        setField(term564, term564.getClass(), "standardOffsets", term567);
        setLongElement(term568, 0, -1767217224L);
        setLongElement(term568, 1, -1206957600L);
        setLongElement(term568, 2, -1191362400L);
        setLongElement(term568, 3, -1175374800L);
        setLongElement(term568, 4, -1159826400L);
        setLongElement(term568, 5, -633819600L);
        setLongElement(term568, 6, -622069200L);
        setLongElement(term568, 7, -602283600L);
        setLongElement(term568, 8, -591832800L);
        setLongElement(term568, 9, -570747600L);
        setLongElement(term568, 10, -560210400L);
        setLongElement(term568, 11, -539125200L);
        setLongElement(term568, 12, -531352800L);
        setLongElement(term568, 13, -191365200L);
        setLongElement(term568, 14, -184197600L);
        setLongElement(term568, 15, -155163600L);
        setLongElement(term568, 16, -150069600L);
        setLongElement(term568, 17, -128898000L);
        setLongElement(term568, 18, -121125600L);
        setLongElement(term568, 19, -99954000L);
        setLongElement(term568, 20, -89589600L);
        setLongElement(term568, 21, -68418000L);
        setLongElement(term568, 22, -57967200L);
        setLongElement(term568, 23, 499748400L);
        setLongElement(term568, 24, 511236000L);
        setLongElement(term568, 25, 530593200L);
        setLongElement(term568, 26, 540266400L);
        setLongElement(term568, 27, 562129200L);
        setLongElement(term568, 28, 571197600L);
        setLongElement(term568, 29, 592974000L);
        setLongElement(term568, 30, 602042400L);
        setLongElement(term568, 31, 624423600L);
        setLongElement(term568, 32, 634701600L);
        setLongElement(term568, 33, 938919600L);
        setLongElement(term568, 34, 951616800L);
        setLongElement(term568, 35, 970974000L);
        setLongElement(term568, 36, 971575200L);
        setLongElement(term568, 37, 1003028400L);
        setLongElement(term568, 38, 1013911200L);
        setField(term564, term564.getClass(), "savingsInstantTransitions", term568);
        setField(term564, term564.getClass(), "savingsLocalTransitions", term608);
        setElement(term609, 1, term537);
        setElement(term609, 3, term537);
        setElement(term609, 5, term537);
        setElement(term609, 7, term537);
        setElement(term609, 9, term537);
        setElement(term609, 11, term537);
        setElement(term609, 13, term537);
        setElement(term609, 15, term537);
        setElement(term609, 17, term537);
        setElement(term609, 19, term537);
        setElement(term609, 21, term537);
        setElement(term609, 23, term537);
        setElement(term609, 25, term537);
        setElement(term609, 27, term537);
        setElement(term609, 29, term537);
        setElement(term609, 31, term537);
        setElement(term609, 33, term537);
        setElement(term609, 35, term537);
        setElement(term609, 37, term537);
        setElement(term609, 39, term537);
        setField(term564, term564.getClass(), "wallOffsets", term609);
        setField(term564, term564.getClass(), "lastRules", term610);
        setField(term611, term611.getClass(), "table", null);
        setField(term611, term611.getClass(), "nextTable", null);
        setLongField(term611, term611.getClass(), "baseCount", 0L);
        setIntField(term611, term611.getClass(), "sizeCtl", 0);
        setIntField(term611, term611.getClass(), "transferIndex", 0);
        setIntField(term611, term611.getClass(), "cellsBusy", 0);
        setField(term611, term611.getClass(), "counterCells", null);
        setField(term611, term611.getClass(), "keySet", null);
        setField(term611, term611.getClass(), "values", null);
        setField(term611, term611.getClass(), "entrySet", null);
        setField(term611, term611.getClass(), "keySet", null);
        setField(term611, term611.getClass(), "values", null);
        setField(term564, term564.getClass(), "lastRulesCache", term611);
        setField(term547, term547.getClass(), "rules", term564);
        setField(term526, term526.getClass(), "zone", term547);
        setField(term441, term441.getClass(), "time_stamp", term526);
        setField(term441, term441.getClass(), "start_up_mode", "hNxWaHcfhY");
        setField(term441, term441.getClass(), "cmm_dly_mod", "RkybSrpybU");
        setField(term441, term441.getClass(), "cmm_dly_sec", "xOEqzGAmDU");
        setField(term441, term441.getClass(), "cmm_err_mod", "eZFUvlxvGV");
        setField(term441, term441.getClass(), "country_code", "BYqFIqCKAV");
        setField(term441, term441.getClass(), "region_code", "vrQLuWIDJX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.AttendHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term441;
        callMethod(klass, "handle", argTypes, term440, args);
    }

};


