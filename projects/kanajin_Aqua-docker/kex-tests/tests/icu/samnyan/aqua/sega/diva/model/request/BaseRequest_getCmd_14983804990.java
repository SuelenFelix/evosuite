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

public class BaseRequest_getCmd_14983804990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248351;

    public BaseRequest_getCmd_14983804990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term248351 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term248436 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term248437 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term248438 = newInstance(Class.forName("java.time.LocalDate"));
        Object term248442 = newInstance(Class.forName("java.time.LocalTime"));
        Object term248447 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term248457 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term248474 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term248475 = (long[]) newLongArray(1);
        Object[] term248477 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term248478 = (long[]) newLongArray(39);
        Object[] term248518 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term248519 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term248520 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term248521 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term248351, term248351.getClass(), "cmd", "FSZMcVNHZZ");
        setField(term248351, term248351.getClass(), "req_id", "uasckiUYzs");
        setField(term248351, term248351.getClass(), "game_id", "dyPJplpZGY");
        setField(term248351, term248351.getClass(), "r_ver", "FidoqFOZww");
        setField(term248351, term248351.getClass(), "kc_serial", "VthnTywRxB");
        setField(term248351, term248351.getClass(), "b_serial", "yHLHaopFRB");
        setField(term248351, term248351.getClass(), "place_id", "dYnLcyZTKV");
        setIntField(term248438, term248438.getClass(), "year", 2018);
        setShortField(term248438, term248438.getClass(), "month", (short) 2);
        setShortField(term248438, term248438.getClass(), "day", (short) 4);
        setField(term248437, term248437.getClass(), "date", term248438);
        setByteField(term248442, term248442.getClass(), "hour", (byte) 5);
        setByteField(term248442, term248442.getClass(), "minute", (byte) 35);
        setByteField(term248442, term248442.getClass(), "second", (byte) 40);
        setIntField(term248442, term248442.getClass(), "nano", 354661894);
        setField(term248437, term248437.getClass(), "time", term248442);
        setField(term248436, term248436.getClass(), "dateTime", term248437);
        setIntField(term248447, term248447.getClass(), "totalSeconds", -10800);
        setField(term248447, term248447.getClass(), "id", "-03:00");
        setField(term248436, term248436.getClass(), "offset", term248447);
        setField(term248457, term248457.getClass(), "id", "America/Recife");
        setLongElement(term248475, 0, -1767217224L);
        setField(term248474, term248474.getClass(), "standardTransitions", term248475);
        setElement(term248477, 1, term248447);
        setField(term248474, term248474.getClass(), "standardOffsets", term248477);
        setLongElement(term248478, 0, -1767217224L);
        setLongElement(term248478, 1, -1206957600L);
        setLongElement(term248478, 2, -1191362400L);
        setLongElement(term248478, 3, -1175374800L);
        setLongElement(term248478, 4, -1159826400L);
        setLongElement(term248478, 5, -633819600L);
        setLongElement(term248478, 6, -622069200L);
        setLongElement(term248478, 7, -602283600L);
        setLongElement(term248478, 8, -591832800L);
        setLongElement(term248478, 9, -570747600L);
        setLongElement(term248478, 10, -560210400L);
        setLongElement(term248478, 11, -539125200L);
        setLongElement(term248478, 12, -531352800L);
        setLongElement(term248478, 13, -191365200L);
        setLongElement(term248478, 14, -184197600L);
        setLongElement(term248478, 15, -155163600L);
        setLongElement(term248478, 16, -150069600L);
        setLongElement(term248478, 17, -128898000L);
        setLongElement(term248478, 18, -121125600L);
        setLongElement(term248478, 19, -99954000L);
        setLongElement(term248478, 20, -89589600L);
        setLongElement(term248478, 21, -68418000L);
        setLongElement(term248478, 22, -57967200L);
        setLongElement(term248478, 23, 499748400L);
        setLongElement(term248478, 24, 511236000L);
        setLongElement(term248478, 25, 530593200L);
        setLongElement(term248478, 26, 540266400L);
        setLongElement(term248478, 27, 562129200L);
        setLongElement(term248478, 28, 571197600L);
        setLongElement(term248478, 29, 592974000L);
        setLongElement(term248478, 30, 602042400L);
        setLongElement(term248478, 31, 624423600L);
        setLongElement(term248478, 32, 634701600L);
        setLongElement(term248478, 33, 938919600L);
        setLongElement(term248478, 34, 951616800L);
        setLongElement(term248478, 35, 970974000L);
        setLongElement(term248478, 36, 971575200L);
        setLongElement(term248478, 37, 1003028400L);
        setLongElement(term248478, 38, 1013911200L);
        setField(term248474, term248474.getClass(), "savingsInstantTransitions", term248478);
        setField(term248474, term248474.getClass(), "savingsLocalTransitions", term248518);
        setElement(term248519, 1, term248447);
        setElement(term248519, 3, term248447);
        setElement(term248519, 5, term248447);
        setElement(term248519, 7, term248447);
        setElement(term248519, 9, term248447);
        setElement(term248519, 11, term248447);
        setElement(term248519, 13, term248447);
        setElement(term248519, 15, term248447);
        setElement(term248519, 17, term248447);
        setElement(term248519, 19, term248447);
        setElement(term248519, 21, term248447);
        setElement(term248519, 23, term248447);
        setElement(term248519, 25, term248447);
        setElement(term248519, 27, term248447);
        setElement(term248519, 29, term248447);
        setElement(term248519, 31, term248447);
        setElement(term248519, 33, term248447);
        setElement(term248519, 35, term248447);
        setElement(term248519, 37, term248447);
        setElement(term248519, 39, term248447);
        setField(term248474, term248474.getClass(), "wallOffsets", term248519);
        setField(term248474, term248474.getClass(), "lastRules", term248520);
        setField(term248521, term248521.getClass(), "table", null);
        setField(term248521, term248521.getClass(), "nextTable", null);
        setLongField(term248521, term248521.getClass(), "baseCount", 0L);
        setIntField(term248521, term248521.getClass(), "sizeCtl", 0);
        setIntField(term248521, term248521.getClass(), "transferIndex", 0);
        setIntField(term248521, term248521.getClass(), "cellsBusy", 0);
        setField(term248521, term248521.getClass(), "counterCells", null);
        setField(term248521, term248521.getClass(), "keySet", null);
        setField(term248521, term248521.getClass(), "values", null);
        setField(term248521, term248521.getClass(), "entrySet", null);
        setField(term248521, term248521.getClass(), "keySet", null);
        setField(term248521, term248521.getClass(), "values", null);
        setField(term248474, term248474.getClass(), "lastRulesCache", term248521);
        setField(term248457, term248457.getClass(), "rules", term248474);
        setField(term248436, term248436.getClass(), "zone", term248457);
        setField(term248351, term248351.getClass(), "time_stamp", term248436);
        setField(term248351, term248351.getClass(), "start_up_mode", "EuhpauGeVe");
        setField(term248351, term248351.getClass(), "cmm_dly_mod", "kgFJtzMrPn");
        setField(term248351, term248351.getClass(), "cmm_dly_sec", "NIkocNvjmy");
        setField(term248351, term248351.getClass(), "cmm_err_mod", "slAGCmeSHy");
        setField(term248351, term248351.getClass(), "country_code", "DRgskGEoHQ");
        setField(term248351, term248351.getClass(), "region_code", "EnWOFmweOs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCmd", argTypes, term248351, args);
    }

};


