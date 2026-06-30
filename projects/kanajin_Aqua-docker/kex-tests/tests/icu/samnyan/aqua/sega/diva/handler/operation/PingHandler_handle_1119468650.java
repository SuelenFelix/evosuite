package icu.samnyan.aqua.sega.diva.handler.operation;

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
import static icu.samnyan.aqua.sega.diva.handler.operation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PingHandler_handle_1119468650 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public PingHandler_handle_1119468650() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term86 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term87 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term88 = newInstance(Class.forName("java.time.LocalDate"));
        Object term92 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term107 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term124 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term125 = (long[]) newLongArray(1);
        Object[] term127 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term128 = (long[]) newLongArray(39);
        Object[] term168 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term169 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term170 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term171 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1, term1.getClass(), "cmd", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "req_id", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "game_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term1, term1.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term88, term88.getClass(), "year", 2012);
        setShortField(term88, term88.getClass(), "month", (short) 8);
        setShortField(term88, term88.getClass(), "day", (short) 25);
        setField(term87, term87.getClass(), "date", term88);
        setByteField(term92, term92.getClass(), "hour", (byte) 5);
        setByteField(term92, term92.getClass(), "minute", (byte) 20);
        setByteField(term92, term92.getClass(), "second", (byte) 50);
        setIntField(term92, term92.getClass(), "nano", 345595912);
        setField(term87, term87.getClass(), "time", term92);
        setField(term86, term86.getClass(), "dateTime", term87);
        setIntField(term97, term97.getClass(), "totalSeconds", -10800);
        setField(term97, term97.getClass(), "id", "-03:00");
        setField(term86, term86.getClass(), "offset", term97);
        setField(term107, term107.getClass(), "id", "America/Recife");
        setLongElement(term125, 0, -1767217224L);
        setField(term124, term124.getClass(), "standardTransitions", term125);
        setElement(term127, 1, term97);
        setField(term124, term124.getClass(), "standardOffsets", term127);
        setLongElement(term128, 0, -1767217224L);
        setLongElement(term128, 1, -1206957600L);
        setLongElement(term128, 2, -1191362400L);
        setLongElement(term128, 3, -1175374800L);
        setLongElement(term128, 4, -1159826400L);
        setLongElement(term128, 5, -633819600L);
        setLongElement(term128, 6, -622069200L);
        setLongElement(term128, 7, -602283600L);
        setLongElement(term128, 8, -591832800L);
        setLongElement(term128, 9, -570747600L);
        setLongElement(term128, 10, -560210400L);
        setLongElement(term128, 11, -539125200L);
        setLongElement(term128, 12, -531352800L);
        setLongElement(term128, 13, -191365200L);
        setLongElement(term128, 14, -184197600L);
        setLongElement(term128, 15, -155163600L);
        setLongElement(term128, 16, -150069600L);
        setLongElement(term128, 17, -128898000L);
        setLongElement(term128, 18, -121125600L);
        setLongElement(term128, 19, -99954000L);
        setLongElement(term128, 20, -89589600L);
        setLongElement(term128, 21, -68418000L);
        setLongElement(term128, 22, -57967200L);
        setLongElement(term128, 23, 499748400L);
        setLongElement(term128, 24, 511236000L);
        setLongElement(term128, 25, 530593200L);
        setLongElement(term128, 26, 540266400L);
        setLongElement(term128, 27, 562129200L);
        setLongElement(term128, 28, 571197600L);
        setLongElement(term128, 29, 592974000L);
        setLongElement(term128, 30, 602042400L);
        setLongElement(term128, 31, 624423600L);
        setLongElement(term128, 32, 634701600L);
        setLongElement(term128, 33, 938919600L);
        setLongElement(term128, 34, 951616800L);
        setLongElement(term128, 35, 970974000L);
        setLongElement(term128, 36, 971575200L);
        setLongElement(term128, 37, 1003028400L);
        setLongElement(term128, 38, 1013911200L);
        setField(term124, term124.getClass(), "savingsInstantTransitions", term128);
        setField(term124, term124.getClass(), "savingsLocalTransitions", term168);
        setElement(term169, 1, term97);
        setElement(term169, 3, term97);
        setElement(term169, 5, term97);
        setElement(term169, 7, term97);
        setElement(term169, 9, term97);
        setElement(term169, 11, term97);
        setElement(term169, 13, term97);
        setElement(term169, 15, term97);
        setElement(term169, 17, term97);
        setElement(term169, 19, term97);
        setElement(term169, 21, term97);
        setElement(term169, 23, term97);
        setElement(term169, 25, term97);
        setElement(term169, 27, term97);
        setElement(term169, 29, term97);
        setElement(term169, 31, term97);
        setElement(term169, 33, term97);
        setElement(term169, 35, term97);
        setElement(term169, 37, term97);
        setElement(term169, 39, term97);
        setField(term124, term124.getClass(), "wallOffsets", term169);
        setField(term124, term124.getClass(), "lastRules", term170);
        setField(term171, term171.getClass(), "table", null);
        setField(term171, term171.getClass(), "nextTable", null);
        setLongField(term171, term171.getClass(), "baseCount", 0L);
        setIntField(term171, term171.getClass(), "sizeCtl", 0);
        setIntField(term171, term171.getClass(), "transferIndex", 0);
        setIntField(term171, term171.getClass(), "cellsBusy", 0);
        setField(term171, term171.getClass(), "counterCells", null);
        setField(term171, term171.getClass(), "keySet", null);
        setField(term171, term171.getClass(), "values", null);
        setField(term171, term171.getClass(), "entrySet", null);
        setField(term171, term171.getClass(), "keySet", null);
        setField(term171, term171.getClass(), "values", null);
        setField(term124, term124.getClass(), "lastRulesCache", term171);
        setField(term107, term107.getClass(), "rules", term124);
        setField(term86, term86.getClass(), "zone", term107);
        setField(term1, term1.getClass(), "time_stamp", term86);
        setField(term1, term1.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term1, term1.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "country_code", "uuaPigETmJ");
        setField(term1, term1.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.operation.PingHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


