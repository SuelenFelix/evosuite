package icu.samnyan.aqua.sega.diva.handler.user;

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
import static icu.samnyan.aqua.sega.diva.handler.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StartHandler_handle_15889045780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public StartHandler_handle_15889045780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest"));
        Object term88 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term89 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term90 = newInstance(Class.forName("java.time.LocalDate"));
        Object term94 = newInstance(Class.forName("java.time.LocalTime"));
        Object term99 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term109 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term126 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term127 = (long[]) newLongArray(1);
        Object[] term129 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term130 = (long[]) newLongArray(39);
        Object[] term170 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term171 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term172 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term173 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term1, term1.getClass(), "pd_id", 568599855);
        setIntField(term1, term1.getClass(), "accept_idx", 1162663216);
        setField(term1, term1.getClass(), "cmd", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "req_id", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "game_id", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "r_ver", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "kc_serial", "jJCZpVmanW");
        setField(term1, term1.getClass(), "b_serial", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "place_id", "SzjVpOQTyS");
        setIntField(term90, term90.getClass(), "year", 2012);
        setShortField(term90, term90.getClass(), "month", (short) 8);
        setShortField(term90, term90.getClass(), "day", (short) 25);
        setField(term89, term89.getClass(), "date", term90);
        setByteField(term94, term94.getClass(), "hour", (byte) 5);
        setByteField(term94, term94.getClass(), "minute", (byte) 20);
        setByteField(term94, term94.getClass(), "second", (byte) 50);
        setIntField(term94, term94.getClass(), "nano", 345595912);
        setField(term89, term89.getClass(), "time", term94);
        setField(term88, term88.getClass(), "dateTime", term89);
        setIntField(term99, term99.getClass(), "totalSeconds", -10800);
        setField(term99, term99.getClass(), "id", "-03:00");
        setField(term88, term88.getClass(), "offset", term99);
        setField(term109, term109.getClass(), "id", "America/Recife");
        setLongElement(term127, 0, -1767217224L);
        setField(term126, term126.getClass(), "standardTransitions", term127);
        setElement(term129, 1, term99);
        setField(term126, term126.getClass(), "standardOffsets", term129);
        setLongElement(term130, 0, -1767217224L);
        setLongElement(term130, 1, -1206957600L);
        setLongElement(term130, 2, -1191362400L);
        setLongElement(term130, 3, -1175374800L);
        setLongElement(term130, 4, -1159826400L);
        setLongElement(term130, 5, -633819600L);
        setLongElement(term130, 6, -622069200L);
        setLongElement(term130, 7, -602283600L);
        setLongElement(term130, 8, -591832800L);
        setLongElement(term130, 9, -570747600L);
        setLongElement(term130, 10, -560210400L);
        setLongElement(term130, 11, -539125200L);
        setLongElement(term130, 12, -531352800L);
        setLongElement(term130, 13, -191365200L);
        setLongElement(term130, 14, -184197600L);
        setLongElement(term130, 15, -155163600L);
        setLongElement(term130, 16, -150069600L);
        setLongElement(term130, 17, -128898000L);
        setLongElement(term130, 18, -121125600L);
        setLongElement(term130, 19, -99954000L);
        setLongElement(term130, 20, -89589600L);
        setLongElement(term130, 21, -68418000L);
        setLongElement(term130, 22, -57967200L);
        setLongElement(term130, 23, 499748400L);
        setLongElement(term130, 24, 511236000L);
        setLongElement(term130, 25, 530593200L);
        setLongElement(term130, 26, 540266400L);
        setLongElement(term130, 27, 562129200L);
        setLongElement(term130, 28, 571197600L);
        setLongElement(term130, 29, 592974000L);
        setLongElement(term130, 30, 602042400L);
        setLongElement(term130, 31, 624423600L);
        setLongElement(term130, 32, 634701600L);
        setLongElement(term130, 33, 938919600L);
        setLongElement(term130, 34, 951616800L);
        setLongElement(term130, 35, 970974000L);
        setLongElement(term130, 36, 971575200L);
        setLongElement(term130, 37, 1003028400L);
        setLongElement(term130, 38, 1013911200L);
        setField(term126, term126.getClass(), "savingsInstantTransitions", term130);
        setField(term126, term126.getClass(), "savingsLocalTransitions", term170);
        setElement(term171, 1, term99);
        setElement(term171, 3, term99);
        setElement(term171, 5, term99);
        setElement(term171, 7, term99);
        setElement(term171, 9, term99);
        setElement(term171, 11, term99);
        setElement(term171, 13, term99);
        setElement(term171, 15, term99);
        setElement(term171, 17, term99);
        setElement(term171, 19, term99);
        setElement(term171, 21, term99);
        setElement(term171, 23, term99);
        setElement(term171, 25, term99);
        setElement(term171, 27, term99);
        setElement(term171, 29, term99);
        setElement(term171, 31, term99);
        setElement(term171, 33, term99);
        setElement(term171, 35, term99);
        setElement(term171, 37, term99);
        setElement(term171, 39, term99);
        setField(term126, term126.getClass(), "wallOffsets", term171);
        setField(term126, term126.getClass(), "lastRules", term172);
        setField(term173, term173.getClass(), "table", null);
        setField(term173, term173.getClass(), "nextTable", null);
        setLongField(term173, term173.getClass(), "baseCount", 0L);
        setIntField(term173, term173.getClass(), "sizeCtl", 0);
        setIntField(term173, term173.getClass(), "transferIndex", 0);
        setIntField(term173, term173.getClass(), "cellsBusy", 0);
        setField(term173, term173.getClass(), "counterCells", null);
        setField(term173, term173.getClass(), "keySet", null);
        setField(term173, term173.getClass(), "values", null);
        setField(term173, term173.getClass(), "entrySet", null);
        setField(term173, term173.getClass(), "keySet", null);
        setField(term173, term173.getClass(), "values", null);
        setField(term126, term126.getClass(), "lastRulesCache", term173);
        setField(term109, term109.getClass(), "rules", term126);
        setField(term88, term88.getClass(), "zone", term109);
        setField(term1, term1.getClass(), "time_stamp", term88);
        setField(term1, term1.getClass(), "start_up_mode", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "cmm_dly_mod", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "cmm_dly_sec", "RMFIsYGgne");
        setField(term1, term1.getClass(), "cmm_err_mod", "NRdvgJlhkX");
        setField(term1, term1.getClass(), "country_code", "uuaPigETmJ");
        setField(term1, term1.getClass(), "region_code", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.user.StartHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.StartRequest");
        Object[] args = new Object[1];
        args[0] = term1;
        callMethod(klass, "handle", argTypes, null, args);
    }

};


