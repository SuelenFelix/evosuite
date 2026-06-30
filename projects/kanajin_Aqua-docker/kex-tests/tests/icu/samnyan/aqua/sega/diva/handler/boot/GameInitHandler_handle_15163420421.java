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

public class GameInitHandler_handle_15163420421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public GameInitHandler_handle_15163420421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.GameInitHandler"));
        setField(term1, term1.getClass(), "mapper", null);
        term2 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term87 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term88 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term89 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93 = newInstance(Class.forName("java.time.LocalTime"));
        Object term98 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term108 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term125 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term126 = (long[]) newLongArray(1);
        Object[] term128 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term129 = (long[]) newLongArray(39);
        Object[] term169 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term170 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term171 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term172 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2, term2.getClass(), "cmd", "PAEBtnZtTD");
        setField(term2, term2.getClass(), "req_id", "sjlJAEtRrb");
        setField(term2, term2.getClass(), "game_id", "MuLcgQHgqz");
        setField(term2, term2.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term2, term2.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term2, term2.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term2, term2.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term89, term89.getClass(), "year", 2012);
        setShortField(term89, term89.getClass(), "month", (short) 8);
        setShortField(term89, term89.getClass(), "day", (short) 25);
        setField(term88, term88.getClass(), "date", term89);
        setByteField(term93, term93.getClass(), "hour", (byte) 5);
        setByteField(term93, term93.getClass(), "minute", (byte) 20);
        setByteField(term93, term93.getClass(), "second", (byte) 50);
        setIntField(term93, term93.getClass(), "nano", 345595912);
        setField(term88, term88.getClass(), "time", term93);
        setField(term87, term87.getClass(), "dateTime", term88);
        setIntField(term98, term98.getClass(), "totalSeconds", -10800);
        setField(term98, term98.getClass(), "id", "-03:00");
        setField(term87, term87.getClass(), "offset", term98);
        setField(term108, term108.getClass(), "id", "America/Recife");
        setLongElement(term126, 0, -1767217224L);
        setField(term125, term125.getClass(), "standardTransitions", term126);
        setElement(term128, 1, term98);
        setField(term125, term125.getClass(), "standardOffsets", term128);
        setLongElement(term129, 0, -1767217224L);
        setLongElement(term129, 1, -1206957600L);
        setLongElement(term129, 2, -1191362400L);
        setLongElement(term129, 3, -1175374800L);
        setLongElement(term129, 4, -1159826400L);
        setLongElement(term129, 5, -633819600L);
        setLongElement(term129, 6, -622069200L);
        setLongElement(term129, 7, -602283600L);
        setLongElement(term129, 8, -591832800L);
        setLongElement(term129, 9, -570747600L);
        setLongElement(term129, 10, -560210400L);
        setLongElement(term129, 11, -539125200L);
        setLongElement(term129, 12, -531352800L);
        setLongElement(term129, 13, -191365200L);
        setLongElement(term129, 14, -184197600L);
        setLongElement(term129, 15, -155163600L);
        setLongElement(term129, 16, -150069600L);
        setLongElement(term129, 17, -128898000L);
        setLongElement(term129, 18, -121125600L);
        setLongElement(term129, 19, -99954000L);
        setLongElement(term129, 20, -89589600L);
        setLongElement(term129, 21, -68418000L);
        setLongElement(term129, 22, -57967200L);
        setLongElement(term129, 23, 499748400L);
        setLongElement(term129, 24, 511236000L);
        setLongElement(term129, 25, 530593200L);
        setLongElement(term129, 26, 540266400L);
        setLongElement(term129, 27, 562129200L);
        setLongElement(term129, 28, 571197600L);
        setLongElement(term129, 29, 592974000L);
        setLongElement(term129, 30, 602042400L);
        setLongElement(term129, 31, 624423600L);
        setLongElement(term129, 32, 634701600L);
        setLongElement(term129, 33, 938919600L);
        setLongElement(term129, 34, 951616800L);
        setLongElement(term129, 35, 970974000L);
        setLongElement(term129, 36, 971575200L);
        setLongElement(term129, 37, 1003028400L);
        setLongElement(term129, 38, 1013911200L);
        setField(term125, term125.getClass(), "savingsInstantTransitions", term129);
        setField(term125, term125.getClass(), "savingsLocalTransitions", term169);
        setElement(term170, 1, term98);
        setElement(term170, 3, term98);
        setElement(term170, 5, term98);
        setElement(term170, 7, term98);
        setElement(term170, 9, term98);
        setElement(term170, 11, term98);
        setElement(term170, 13, term98);
        setElement(term170, 15, term98);
        setElement(term170, 17, term98);
        setElement(term170, 19, term98);
        setElement(term170, 21, term98);
        setElement(term170, 23, term98);
        setElement(term170, 25, term98);
        setElement(term170, 27, term98);
        setElement(term170, 29, term98);
        setElement(term170, 31, term98);
        setElement(term170, 33, term98);
        setElement(term170, 35, term98);
        setElement(term170, 37, term98);
        setElement(term170, 39, term98);
        setField(term125, term125.getClass(), "wallOffsets", term170);
        setField(term125, term125.getClass(), "lastRules", term171);
        setField(term172, term172.getClass(), "table", null);
        setField(term172, term172.getClass(), "nextTable", null);
        setLongField(term172, term172.getClass(), "baseCount", 0L);
        setIntField(term172, term172.getClass(), "sizeCtl", 0);
        setIntField(term172, term172.getClass(), "transferIndex", 0);
        setIntField(term172, term172.getClass(), "cellsBusy", 0);
        setField(term172, term172.getClass(), "counterCells", null);
        setField(term172, term172.getClass(), "keySet", null);
        setField(term172, term172.getClass(), "values", null);
        setField(term172, term172.getClass(), "entrySet", null);
        setField(term172, term172.getClass(), "keySet", null);
        setField(term172, term172.getClass(), "values", null);
        setField(term125, term125.getClass(), "lastRulesCache", term172);
        setField(term108, term108.getClass(), "rules", term125);
        setField(term87, term87.getClass(), "zone", term108);
        setField(term2, term2.getClass(), "time_stamp", term87);
        setField(term2, term2.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term2, term2.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term2, term2.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term2, term2.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term2, term2.getClass(), "country_code", "uuaPigETmJ");
        setField(term2, term2.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.boot.GameInitHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "handle", argTypes, term1, args);
    }

};


