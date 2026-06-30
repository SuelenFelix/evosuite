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

public class AttendRequest_getAtndlut_3193055500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AttendRequest_getAtndlut_3193055500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest"));
        Object term134 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term135 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term136 = newInstance(Class.forName("java.time.LocalDate"));
        Object term140 = newInstance(Class.forName("java.time.LocalTime"));
        Object term145 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term155 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term172 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term173 = (long[]) newLongArray(1);
        Object[] term175 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term176 = (long[]) newLongArray(39);
        Object[] term216 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term217 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term218 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term219 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term1, term1.getClass(), "atnd_lut", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "atnd_prm1", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "atnd_prm2", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "atnd_prm3", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "cmd", "jJCZpVmanW");
        setField(term1, term1.getClass(), "req_id", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "game_id", "SzjVpOQTyS");
        setField(term1, term1.getClass(), "r_ver", "MjGYSRKTNF");
        setField(term1, term1.getClass(), "kc_serial", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "b_serial", "RMFIsYGgne");
        setField(term1, term1.getClass(), "place_id", "NRdvgJlhkX");
        setIntField(term136, term136.getClass(), "year", 2012);
        setShortField(term136, term136.getClass(), "month", (short) 8);
        setShortField(term136, term136.getClass(), "day", (short) 25);
        setField(term135, term135.getClass(), "date", term136);
        setByteField(term140, term140.getClass(), "hour", (byte) 5);
        setByteField(term140, term140.getClass(), "minute", (byte) 20);
        setByteField(term140, term140.getClass(), "second", (byte) 50);
        setIntField(term140, term140.getClass(), "nano", 345595912);
        setField(term135, term135.getClass(), "time", term140);
        setField(term134, term134.getClass(), "dateTime", term135);
        setIntField(term145, term145.getClass(), "totalSeconds", -10800);
        setField(term145, term145.getClass(), "id", "-03:00");
        setField(term134, term134.getClass(), "offset", term145);
        setField(term155, term155.getClass(), "id", "America/Recife");
        setLongElement(term173, 0, -1767217224L);
        setField(term172, term172.getClass(), "standardTransitions", term173);
        setElement(term175, 1, term145);
        setField(term172, term172.getClass(), "standardOffsets", term175);
        setLongElement(term176, 0, -1767217224L);
        setLongElement(term176, 1, -1206957600L);
        setLongElement(term176, 2, -1191362400L);
        setLongElement(term176, 3, -1175374800L);
        setLongElement(term176, 4, -1159826400L);
        setLongElement(term176, 5, -633819600L);
        setLongElement(term176, 6, -622069200L);
        setLongElement(term176, 7, -602283600L);
        setLongElement(term176, 8, -591832800L);
        setLongElement(term176, 9, -570747600L);
        setLongElement(term176, 10, -560210400L);
        setLongElement(term176, 11, -539125200L);
        setLongElement(term176, 12, -531352800L);
        setLongElement(term176, 13, -191365200L);
        setLongElement(term176, 14, -184197600L);
        setLongElement(term176, 15, -155163600L);
        setLongElement(term176, 16, -150069600L);
        setLongElement(term176, 17, -128898000L);
        setLongElement(term176, 18, -121125600L);
        setLongElement(term176, 19, -99954000L);
        setLongElement(term176, 20, -89589600L);
        setLongElement(term176, 21, -68418000L);
        setLongElement(term176, 22, -57967200L);
        setLongElement(term176, 23, 499748400L);
        setLongElement(term176, 24, 511236000L);
        setLongElement(term176, 25, 530593200L);
        setLongElement(term176, 26, 540266400L);
        setLongElement(term176, 27, 562129200L);
        setLongElement(term176, 28, 571197600L);
        setLongElement(term176, 29, 592974000L);
        setLongElement(term176, 30, 602042400L);
        setLongElement(term176, 31, 624423600L);
        setLongElement(term176, 32, 634701600L);
        setLongElement(term176, 33, 938919600L);
        setLongElement(term176, 34, 951616800L);
        setLongElement(term176, 35, 970974000L);
        setLongElement(term176, 36, 971575200L);
        setLongElement(term176, 37, 1003028400L);
        setLongElement(term176, 38, 1013911200L);
        setField(term172, term172.getClass(), "savingsInstantTransitions", term176);
        setField(term172, term172.getClass(), "savingsLocalTransitions", term216);
        setElement(term217, 1, term145);
        setElement(term217, 3, term145);
        setElement(term217, 5, term145);
        setElement(term217, 7, term145);
        setElement(term217, 9, term145);
        setElement(term217, 11, term145);
        setElement(term217, 13, term145);
        setElement(term217, 15, term145);
        setElement(term217, 17, term145);
        setElement(term217, 19, term145);
        setElement(term217, 21, term145);
        setElement(term217, 23, term145);
        setElement(term217, 25, term145);
        setElement(term217, 27, term145);
        setElement(term217, 29, term145);
        setElement(term217, 31, term145);
        setElement(term217, 33, term145);
        setElement(term217, 35, term145);
        setElement(term217, 37, term145);
        setElement(term217, 39, term145);
        setField(term172, term172.getClass(), "wallOffsets", term217);
        setField(term172, term172.getClass(), "lastRules", term218);
        setField(term219, term219.getClass(), "table", null);
        setField(term219, term219.getClass(), "nextTable", null);
        setLongField(term219, term219.getClass(), "baseCount", 0L);
        setIntField(term219, term219.getClass(), "sizeCtl", 0);
        setIntField(term219, term219.getClass(), "transferIndex", 0);
        setIntField(term219, term219.getClass(), "cellsBusy", 0);
        setField(term219, term219.getClass(), "counterCells", null);
        setField(term219, term219.getClass(), "keySet", null);
        setField(term219, term219.getClass(), "values", null);
        setField(term219, term219.getClass(), "entrySet", null);
        setField(term219, term219.getClass(), "keySet", null);
        setField(term219, term219.getClass(), "values", null);
        setField(term172, term172.getClass(), "lastRulesCache", term219);
        setField(term155, term155.getClass(), "rules", term172);
        setField(term134, term134.getClass(), "zone", term155);
        setField(term1, term1.getClass(), "time_stamp", term134);
        setField(term1, term1.getClass(), "start_up_mode", "uuaPigETmJ");
        setField(term1, term1.getClass(), "cmm_dly_mod", "MxlszYVzRf");
        setField(term1, term1.getClass(), "cmm_dly_sec", "LQFpaHEwXR");
        setField(term1, term1.getClass(), "cmm_err_mod", "oVcInYnLWB");
        setField(term1, term1.getClass(), "country_code", "aJlieCFVtF");
        setField(term1, term1.getClass(), "region_code", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.boot.AttendRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAtnd_lut", argTypes, term1, args);
    }

};


