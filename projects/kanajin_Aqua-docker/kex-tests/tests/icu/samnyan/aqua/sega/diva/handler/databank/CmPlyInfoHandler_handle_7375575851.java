package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CmPlyInfoHandler_handle_7375575851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1328;
     Object term1329;

    public CmPlyInfoHandler_handle_7375575851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1328 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CmPlyInfoHandler"));
        setField(term1328, term1328.getClass(), "mapper", null);
        term1329 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term1414 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term1415 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1416 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1420 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1425 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1435 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1452 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term1453 = (long[]) newLongArray(1);
        Object[] term1455 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term1456 = (long[]) newLongArray(39);
        Object[] term1496 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term1497 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term1498 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term1499 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1329, term1329.getClass(), "cmd", "aKnKipADSo");
        setField(term1329, term1329.getClass(), "req_id", "wSQxaModmm");
        setField(term1329, term1329.getClass(), "game_id", "UlajhuVLaP");
        setField(term1329, term1329.getClass(), "r_ver", "gGSMzuGICf");
        setField(term1329, term1329.getClass(), "kc_serial", "hxCBltsObl");
        setField(term1329, term1329.getClass(), "b_serial", "BndsHwAFMv");
        setField(term1329, term1329.getClass(), "place_id", "GzFkzHGYFt");
        setIntField(term1416, term1416.getClass(), "year", 2015);
        setShortField(term1416, term1416.getClass(), "month", (short) 4);
        setShortField(term1416, term1416.getClass(), "day", (short) 14);
        setField(term1415, term1415.getClass(), "date", term1416);
        setByteField(term1420, term1420.getClass(), "hour", (byte) 18);
        setByteField(term1420, term1420.getClass(), "minute", (byte) 24);
        setByteField(term1420, term1420.getClass(), "second", (byte) 32);
        setIntField(term1420, term1420.getClass(), "nano", 369233818);
        setField(term1415, term1415.getClass(), "time", term1420);
        setField(term1414, term1414.getClass(), "dateTime", term1415);
        setIntField(term1425, term1425.getClass(), "totalSeconds", -10800);
        setField(term1425, term1425.getClass(), "id", "-03:00");
        setField(term1414, term1414.getClass(), "offset", term1425);
        setField(term1435, term1435.getClass(), "id", "America/Recife");
        setLongElement(term1453, 0, -1767217224L);
        setField(term1452, term1452.getClass(), "standardTransitions", term1453);
        setElement(term1455, 1, term1425);
        setField(term1452, term1452.getClass(), "standardOffsets", term1455);
        setLongElement(term1456, 0, -1767217224L);
        setLongElement(term1456, 1, -1206957600L);
        setLongElement(term1456, 2, -1191362400L);
        setLongElement(term1456, 3, -1175374800L);
        setLongElement(term1456, 4, -1159826400L);
        setLongElement(term1456, 5, -633819600L);
        setLongElement(term1456, 6, -622069200L);
        setLongElement(term1456, 7, -602283600L);
        setLongElement(term1456, 8, -591832800L);
        setLongElement(term1456, 9, -570747600L);
        setLongElement(term1456, 10, -560210400L);
        setLongElement(term1456, 11, -539125200L);
        setLongElement(term1456, 12, -531352800L);
        setLongElement(term1456, 13, -191365200L);
        setLongElement(term1456, 14, -184197600L);
        setLongElement(term1456, 15, -155163600L);
        setLongElement(term1456, 16, -150069600L);
        setLongElement(term1456, 17, -128898000L);
        setLongElement(term1456, 18, -121125600L);
        setLongElement(term1456, 19, -99954000L);
        setLongElement(term1456, 20, -89589600L);
        setLongElement(term1456, 21, -68418000L);
        setLongElement(term1456, 22, -57967200L);
        setLongElement(term1456, 23, 499748400L);
        setLongElement(term1456, 24, 511236000L);
        setLongElement(term1456, 25, 530593200L);
        setLongElement(term1456, 26, 540266400L);
        setLongElement(term1456, 27, 562129200L);
        setLongElement(term1456, 28, 571197600L);
        setLongElement(term1456, 29, 592974000L);
        setLongElement(term1456, 30, 602042400L);
        setLongElement(term1456, 31, 624423600L);
        setLongElement(term1456, 32, 634701600L);
        setLongElement(term1456, 33, 938919600L);
        setLongElement(term1456, 34, 951616800L);
        setLongElement(term1456, 35, 970974000L);
        setLongElement(term1456, 36, 971575200L);
        setLongElement(term1456, 37, 1003028400L);
        setLongElement(term1456, 38, 1013911200L);
        setField(term1452, term1452.getClass(), "savingsInstantTransitions", term1456);
        setField(term1452, term1452.getClass(), "savingsLocalTransitions", term1496);
        setElement(term1497, 1, term1425);
        setElement(term1497, 3, term1425);
        setElement(term1497, 5, term1425);
        setElement(term1497, 7, term1425);
        setElement(term1497, 9, term1425);
        setElement(term1497, 11, term1425);
        setElement(term1497, 13, term1425);
        setElement(term1497, 15, term1425);
        setElement(term1497, 17, term1425);
        setElement(term1497, 19, term1425);
        setElement(term1497, 21, term1425);
        setElement(term1497, 23, term1425);
        setElement(term1497, 25, term1425);
        setElement(term1497, 27, term1425);
        setElement(term1497, 29, term1425);
        setElement(term1497, 31, term1425);
        setElement(term1497, 33, term1425);
        setElement(term1497, 35, term1425);
        setElement(term1497, 37, term1425);
        setElement(term1497, 39, term1425);
        setField(term1452, term1452.getClass(), "wallOffsets", term1497);
        setField(term1452, term1452.getClass(), "lastRules", term1498);
        setField(term1499, term1499.getClass(), "table", null);
        setField(term1499, term1499.getClass(), "nextTable", null);
        setLongField(term1499, term1499.getClass(), "baseCount", 0L);
        setIntField(term1499, term1499.getClass(), "sizeCtl", 0);
        setIntField(term1499, term1499.getClass(), "transferIndex", 0);
        setIntField(term1499, term1499.getClass(), "cellsBusy", 0);
        setField(term1499, term1499.getClass(), "counterCells", null);
        setField(term1499, term1499.getClass(), "keySet", null);
        setField(term1499, term1499.getClass(), "values", null);
        setField(term1499, term1499.getClass(), "entrySet", null);
        setField(term1499, term1499.getClass(), "keySet", null);
        setField(term1499, term1499.getClass(), "values", null);
        setField(term1452, term1452.getClass(), "lastRulesCache", term1499);
        setField(term1435, term1435.getClass(), "rules", term1452);
        setField(term1414, term1414.getClass(), "zone", term1435);
        setField(term1329, term1329.getClass(), "time_stamp", term1414);
        setField(term1329, term1329.getClass(), "start_up_mode", "tShwQLRGNe");
        setField(term1329, term1329.getClass(), "cmm_dly_mod", "LvtrsXUliU");
        setField(term1329, term1329.getClass(), "cmm_dly_sec", "xLbjWUgOIL");
        setField(term1329, term1329.getClass(), "cmm_err_mod", "jDtqGUpnZN");
        setField(term1329, term1329.getClass(), "country_code", "nGKItKLYNC");
        setField(term1329, term1329.getClass(), "region_code", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.CmPlyInfoHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term1329;
        callMethod(klass, "handle", argTypes, term1328, args);
    }

};


