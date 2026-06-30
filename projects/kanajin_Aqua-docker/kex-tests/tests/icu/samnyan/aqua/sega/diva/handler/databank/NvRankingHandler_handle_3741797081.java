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

public class NvRankingHandler_handle_3741797081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4399;
     Object term4400;

    public NvRankingHandler_handle_3741797081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4399 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NvRankingHandler"));
        setField(term4399, term4399.getClass(), "mapper", null);
        term4400 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term4485 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term4486 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4487 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4491 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4496 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term4506 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term4523 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term4524 = (long[]) newLongArray(1);
        Object[] term4526 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term4527 = (long[]) newLongArray(39);
        Object[] term4567 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term4568 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term4569 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term4570 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term4400, term4400.getClass(), "cmd", "OJJtVNPyKZ");
        setField(term4400, term4400.getClass(), "req_id", "AKNapTAfmD");
        setField(term4400, term4400.getClass(), "game_id", "xJgPlLxpgC");
        setField(term4400, term4400.getClass(), "r_ver", "EYtfuJaxiM");
        setField(term4400, term4400.getClass(), "kc_serial", "gCWtLVKVVe");
        setField(term4400, term4400.getClass(), "b_serial", "fWKJoSoCwE");
        setField(term4400, term4400.getClass(), "place_id", "wfaXBpWAUH");
        setIntField(term4487, term4487.getClass(), "year", 2019);
        setShortField(term4487, term4487.getClass(), "month", (short) 2);
        setShortField(term4487, term4487.getClass(), "day", (short) 21);
        setField(term4486, term4486.getClass(), "date", term4487);
        setByteField(term4491, term4491.getClass(), "hour", (byte) 5);
        setByteField(term4491, term4491.getClass(), "minute", (byte) 41);
        setByteField(term4491, term4491.getClass(), "second", (byte) 11);
        setIntField(term4491, term4491.getClass(), "nano", 859829782);
        setField(term4486, term4486.getClass(), "time", term4491);
        setField(term4485, term4485.getClass(), "dateTime", term4486);
        setIntField(term4496, term4496.getClass(), "totalSeconds", -10800);
        setField(term4496, term4496.getClass(), "id", "-03:00");
        setField(term4485, term4485.getClass(), "offset", term4496);
        setField(term4506, term4506.getClass(), "id", "America/Recife");
        setLongElement(term4524, 0, -1767217224L);
        setField(term4523, term4523.getClass(), "standardTransitions", term4524);
        setElement(term4526, 1, term4496);
        setField(term4523, term4523.getClass(), "standardOffsets", term4526);
        setLongElement(term4527, 0, -1767217224L);
        setLongElement(term4527, 1, -1206957600L);
        setLongElement(term4527, 2, -1191362400L);
        setLongElement(term4527, 3, -1175374800L);
        setLongElement(term4527, 4, -1159826400L);
        setLongElement(term4527, 5, -633819600L);
        setLongElement(term4527, 6, -622069200L);
        setLongElement(term4527, 7, -602283600L);
        setLongElement(term4527, 8, -591832800L);
        setLongElement(term4527, 9, -570747600L);
        setLongElement(term4527, 10, -560210400L);
        setLongElement(term4527, 11, -539125200L);
        setLongElement(term4527, 12, -531352800L);
        setLongElement(term4527, 13, -191365200L);
        setLongElement(term4527, 14, -184197600L);
        setLongElement(term4527, 15, -155163600L);
        setLongElement(term4527, 16, -150069600L);
        setLongElement(term4527, 17, -128898000L);
        setLongElement(term4527, 18, -121125600L);
        setLongElement(term4527, 19, -99954000L);
        setLongElement(term4527, 20, -89589600L);
        setLongElement(term4527, 21, -68418000L);
        setLongElement(term4527, 22, -57967200L);
        setLongElement(term4527, 23, 499748400L);
        setLongElement(term4527, 24, 511236000L);
        setLongElement(term4527, 25, 530593200L);
        setLongElement(term4527, 26, 540266400L);
        setLongElement(term4527, 27, 562129200L);
        setLongElement(term4527, 28, 571197600L);
        setLongElement(term4527, 29, 592974000L);
        setLongElement(term4527, 30, 602042400L);
        setLongElement(term4527, 31, 624423600L);
        setLongElement(term4527, 32, 634701600L);
        setLongElement(term4527, 33, 938919600L);
        setLongElement(term4527, 34, 951616800L);
        setLongElement(term4527, 35, 970974000L);
        setLongElement(term4527, 36, 971575200L);
        setLongElement(term4527, 37, 1003028400L);
        setLongElement(term4527, 38, 1013911200L);
        setField(term4523, term4523.getClass(), "savingsInstantTransitions", term4527);
        setField(term4523, term4523.getClass(), "savingsLocalTransitions", term4567);
        setElement(term4568, 1, term4496);
        setElement(term4568, 3, term4496);
        setElement(term4568, 5, term4496);
        setElement(term4568, 7, term4496);
        setElement(term4568, 9, term4496);
        setElement(term4568, 11, term4496);
        setElement(term4568, 13, term4496);
        setElement(term4568, 15, term4496);
        setElement(term4568, 17, term4496);
        setElement(term4568, 19, term4496);
        setElement(term4568, 21, term4496);
        setElement(term4568, 23, term4496);
        setElement(term4568, 25, term4496);
        setElement(term4568, 27, term4496);
        setElement(term4568, 29, term4496);
        setElement(term4568, 31, term4496);
        setElement(term4568, 33, term4496);
        setElement(term4568, 35, term4496);
        setElement(term4568, 37, term4496);
        setElement(term4568, 39, term4496);
        setField(term4523, term4523.getClass(), "wallOffsets", term4568);
        setField(term4523, term4523.getClass(), "lastRules", term4569);
        setField(term4570, term4570.getClass(), "table", null);
        setField(term4570, term4570.getClass(), "nextTable", null);
        setLongField(term4570, term4570.getClass(), "baseCount", 0L);
        setIntField(term4570, term4570.getClass(), "sizeCtl", 0);
        setIntField(term4570, term4570.getClass(), "transferIndex", 0);
        setIntField(term4570, term4570.getClass(), "cellsBusy", 0);
        setField(term4570, term4570.getClass(), "counterCells", null);
        setField(term4570, term4570.getClass(), "keySet", null);
        setField(term4570, term4570.getClass(), "values", null);
        setField(term4570, term4570.getClass(), "entrySet", null);
        setField(term4570, term4570.getClass(), "keySet", null);
        setField(term4570, term4570.getClass(), "values", null);
        setField(term4523, term4523.getClass(), "lastRulesCache", term4570);
        setField(term4506, term4506.getClass(), "rules", term4523);
        setField(term4485, term4485.getClass(), "zone", term4506);
        setField(term4400, term4400.getClass(), "time_stamp", term4485);
        setField(term4400, term4400.getClass(), "start_up_mode", "VMeAzAHwZj");
        setField(term4400, term4400.getClass(), "cmm_dly_mod", "PznxWXsZME");
        setField(term4400, term4400.getClass(), "cmm_dly_sec", "ZzIujlwVsw");
        setField(term4400, term4400.getClass(), "cmm_err_mod", "LWyEaeIyAo");
        setField(term4400, term4400.getClass(), "country_code", "yVMkkQhvmN");
        setField(term4400, term4400.getClass(), "region_code", "mvrkADEgpp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.NvRankingHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term4400;
        callMethod(klass, "handle", argTypes, term4399, args);
    }

};


