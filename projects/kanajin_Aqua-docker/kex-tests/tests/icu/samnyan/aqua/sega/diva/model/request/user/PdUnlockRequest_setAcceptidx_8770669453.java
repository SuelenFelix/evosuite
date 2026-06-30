package icu.samnyan.aqua.sega.diva.model.request.user;

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
import static icu.samnyan.aqua.sega.diva.model.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class PdUnlockRequest_setAcceptidx_8770669453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7174;
     Object term7423;

    public PdUnlockRequest_setAcceptidx_8770669453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7174 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest"));
        Object term7261 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7272 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7282 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term7299 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term7300 = (long[]) newLongArray(1);
        Object[] term7302 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term7303 = (long[]) newLongArray(39);
        Object[] term7343 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term7344 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term7345 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term7346 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term7174, term7174.getClass(), "pd_id", 1745276158);
        setIntField(term7174, term7174.getClass(), "accept_idx", 2009020256);
        setField(term7174, term7174.getClass(), "cmd", "PgPzMSEjjX");
        setField(term7174, term7174.getClass(), "req_id", "wzsPSPcRdj");
        setField(term7174, term7174.getClass(), "game_id", "kGMQdqJYyB");
        setField(term7174, term7174.getClass(), "r_ver", "XJJNClzHRf");
        setField(term7174, term7174.getClass(), "kc_serial", "HDaezxQfQR");
        setField(term7174, term7174.getClass(), "b_serial", "iikZEapDlu");
        setField(term7174, term7174.getClass(), "place_id", "nhoHrZfnIN");
        setIntField(term7263, term7263.getClass(), "year", 2017);
        setShortField(term7263, term7263.getClass(), "month", (short) 6);
        setShortField(term7263, term7263.getClass(), "day", (short) 8);
        setField(term7262, term7262.getClass(), "date", term7263);
        setByteField(term7267, term7267.getClass(), "hour", (byte) 0);
        setByteField(term7267, term7267.getClass(), "minute", (byte) 18);
        setByteField(term7267, term7267.getClass(), "second", (byte) 55);
        setIntField(term7267, term7267.getClass(), "nano", 680586717);
        setField(term7262, term7262.getClass(), "time", term7267);
        setField(term7261, term7261.getClass(), "dateTime", term7262);
        setIntField(term7272, term7272.getClass(), "totalSeconds", -10800);
        setField(term7272, term7272.getClass(), "id", "-03:00");
        setField(term7261, term7261.getClass(), "offset", term7272);
        setField(term7282, term7282.getClass(), "id", "America/Recife");
        setLongElement(term7300, 0, -1767217224L);
        setField(term7299, term7299.getClass(), "standardTransitions", term7300);
        setElement(term7302, 1, term7272);
        setField(term7299, term7299.getClass(), "standardOffsets", term7302);
        setLongElement(term7303, 0, -1767217224L);
        setLongElement(term7303, 1, -1206957600L);
        setLongElement(term7303, 2, -1191362400L);
        setLongElement(term7303, 3, -1175374800L);
        setLongElement(term7303, 4, -1159826400L);
        setLongElement(term7303, 5, -633819600L);
        setLongElement(term7303, 6, -622069200L);
        setLongElement(term7303, 7, -602283600L);
        setLongElement(term7303, 8, -591832800L);
        setLongElement(term7303, 9, -570747600L);
        setLongElement(term7303, 10, -560210400L);
        setLongElement(term7303, 11, -539125200L);
        setLongElement(term7303, 12, -531352800L);
        setLongElement(term7303, 13, -191365200L);
        setLongElement(term7303, 14, -184197600L);
        setLongElement(term7303, 15, -155163600L);
        setLongElement(term7303, 16, -150069600L);
        setLongElement(term7303, 17, -128898000L);
        setLongElement(term7303, 18, -121125600L);
        setLongElement(term7303, 19, -99954000L);
        setLongElement(term7303, 20, -89589600L);
        setLongElement(term7303, 21, -68418000L);
        setLongElement(term7303, 22, -57967200L);
        setLongElement(term7303, 23, 499748400L);
        setLongElement(term7303, 24, 511236000L);
        setLongElement(term7303, 25, 530593200L);
        setLongElement(term7303, 26, 540266400L);
        setLongElement(term7303, 27, 562129200L);
        setLongElement(term7303, 28, 571197600L);
        setLongElement(term7303, 29, 592974000L);
        setLongElement(term7303, 30, 602042400L);
        setLongElement(term7303, 31, 624423600L);
        setLongElement(term7303, 32, 634701600L);
        setLongElement(term7303, 33, 938919600L);
        setLongElement(term7303, 34, 951616800L);
        setLongElement(term7303, 35, 970974000L);
        setLongElement(term7303, 36, 971575200L);
        setLongElement(term7303, 37, 1003028400L);
        setLongElement(term7303, 38, 1013911200L);
        setField(term7299, term7299.getClass(), "savingsInstantTransitions", term7303);
        setField(term7299, term7299.getClass(), "savingsLocalTransitions", term7343);
        setElement(term7344, 1, term7272);
        setElement(term7344, 3, term7272);
        setElement(term7344, 5, term7272);
        setElement(term7344, 7, term7272);
        setElement(term7344, 9, term7272);
        setElement(term7344, 11, term7272);
        setElement(term7344, 13, term7272);
        setElement(term7344, 15, term7272);
        setElement(term7344, 17, term7272);
        setElement(term7344, 19, term7272);
        setElement(term7344, 21, term7272);
        setElement(term7344, 23, term7272);
        setElement(term7344, 25, term7272);
        setElement(term7344, 27, term7272);
        setElement(term7344, 29, term7272);
        setElement(term7344, 31, term7272);
        setElement(term7344, 33, term7272);
        setElement(term7344, 35, term7272);
        setElement(term7344, 37, term7272);
        setElement(term7344, 39, term7272);
        setField(term7299, term7299.getClass(), "wallOffsets", term7344);
        setField(term7299, term7299.getClass(), "lastRules", term7345);
        setField(term7346, term7346.getClass(), "table", null);
        setField(term7346, term7346.getClass(), "nextTable", null);
        setLongField(term7346, term7346.getClass(), "baseCount", 0L);
        setIntField(term7346, term7346.getClass(), "sizeCtl", 0);
        setIntField(term7346, term7346.getClass(), "transferIndex", 0);
        setIntField(term7346, term7346.getClass(), "cellsBusy", 0);
        setField(term7346, term7346.getClass(), "counterCells", null);
        setField(term7346, term7346.getClass(), "keySet", null);
        setField(term7346, term7346.getClass(), "values", null);
        setField(term7346, term7346.getClass(), "entrySet", null);
        setField(term7346, term7346.getClass(), "keySet", null);
        setField(term7346, term7346.getClass(), "values", null);
        setField(term7299, term7299.getClass(), "lastRulesCache", term7346);
        setField(term7282, term7282.getClass(), "rules", term7299);
        setField(term7261, term7261.getClass(), "zone", term7282);
        setField(term7174, term7174.getClass(), "time_stamp", term7261);
        setField(term7174, term7174.getClass(), "start_up_mode", "ZkMALXpEAZ");
        setField(term7174, term7174.getClass(), "cmm_dly_mod", "tXfQjSqDzN");
        setField(term7174, term7174.getClass(), "cmm_dly_sec", "BjugTaMcxJ");
        setField(term7174, term7174.getClass(), "cmm_err_mod", "vGiuZVPJNH");
        setField(term7174, term7174.getClass(), "country_code", "tlzpzIjMib");
        setField(term7174, term7174.getClass(), "region_code", "AZdLeSugwv");
        term7423 = new Integer(2049577015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PdUnlockRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7423;
        callMethod(klass, "setAccept_idx", argTypes, term7174, args);
    }

};


