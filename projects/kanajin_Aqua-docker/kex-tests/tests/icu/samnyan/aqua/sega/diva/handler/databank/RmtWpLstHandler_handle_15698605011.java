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

public class RmtWpLstHandler_handle_15698605011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7879;
     Object term7880;

    public RmtWpLstHandler_handle_15698605011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7879 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.RmtWpLstHandler"));
        setField(term7879, term7879.getClass(), "mapper", null);
        term7880 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term7965 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term7966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7976 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term7986 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term8003 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term8004 = (long[]) newLongArray(1);
        Object[] term8006 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term8007 = (long[]) newLongArray(39);
        Object[] term8047 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term8048 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term8049 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term8050 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term7880, term7880.getClass(), "cmd", "PgPzMSEjjX");
        setField(term7880, term7880.getClass(), "req_id", "wzsPSPcRdj");
        setField(term7880, term7880.getClass(), "game_id", "kGMQdqJYyB");
        setField(term7880, term7880.getClass(), "r_ver", "XJJNClzHRf");
        setField(term7880, term7880.getClass(), "kc_serial", "HDaezxQfQR");
        setField(term7880, term7880.getClass(), "b_serial", "iikZEapDlu");
        setField(term7880, term7880.getClass(), "place_id", "nhoHrZfnIN");
        setIntField(term7967, term7967.getClass(), "year", 2017);
        setShortField(term7967, term7967.getClass(), "month", (short) 6);
        setShortField(term7967, term7967.getClass(), "day", (short) 8);
        setField(term7966, term7966.getClass(), "date", term7967);
        setByteField(term7971, term7971.getClass(), "hour", (byte) 0);
        setByteField(term7971, term7971.getClass(), "minute", (byte) 18);
        setByteField(term7971, term7971.getClass(), "second", (byte) 55);
        setIntField(term7971, term7971.getClass(), "nano", 680586717);
        setField(term7966, term7966.getClass(), "time", term7971);
        setField(term7965, term7965.getClass(), "dateTime", term7966);
        setIntField(term7976, term7976.getClass(), "totalSeconds", -10800);
        setField(term7976, term7976.getClass(), "id", "-03:00");
        setField(term7965, term7965.getClass(), "offset", term7976);
        setField(term7986, term7986.getClass(), "id", "America/Recife");
        setLongElement(term8004, 0, -1767217224L);
        setField(term8003, term8003.getClass(), "standardTransitions", term8004);
        setElement(term8006, 1, term7976);
        setField(term8003, term8003.getClass(), "standardOffsets", term8006);
        setLongElement(term8007, 0, -1767217224L);
        setLongElement(term8007, 1, -1206957600L);
        setLongElement(term8007, 2, -1191362400L);
        setLongElement(term8007, 3, -1175374800L);
        setLongElement(term8007, 4, -1159826400L);
        setLongElement(term8007, 5, -633819600L);
        setLongElement(term8007, 6, -622069200L);
        setLongElement(term8007, 7, -602283600L);
        setLongElement(term8007, 8, -591832800L);
        setLongElement(term8007, 9, -570747600L);
        setLongElement(term8007, 10, -560210400L);
        setLongElement(term8007, 11, -539125200L);
        setLongElement(term8007, 12, -531352800L);
        setLongElement(term8007, 13, -191365200L);
        setLongElement(term8007, 14, -184197600L);
        setLongElement(term8007, 15, -155163600L);
        setLongElement(term8007, 16, -150069600L);
        setLongElement(term8007, 17, -128898000L);
        setLongElement(term8007, 18, -121125600L);
        setLongElement(term8007, 19, -99954000L);
        setLongElement(term8007, 20, -89589600L);
        setLongElement(term8007, 21, -68418000L);
        setLongElement(term8007, 22, -57967200L);
        setLongElement(term8007, 23, 499748400L);
        setLongElement(term8007, 24, 511236000L);
        setLongElement(term8007, 25, 530593200L);
        setLongElement(term8007, 26, 540266400L);
        setLongElement(term8007, 27, 562129200L);
        setLongElement(term8007, 28, 571197600L);
        setLongElement(term8007, 29, 592974000L);
        setLongElement(term8007, 30, 602042400L);
        setLongElement(term8007, 31, 624423600L);
        setLongElement(term8007, 32, 634701600L);
        setLongElement(term8007, 33, 938919600L);
        setLongElement(term8007, 34, 951616800L);
        setLongElement(term8007, 35, 970974000L);
        setLongElement(term8007, 36, 971575200L);
        setLongElement(term8007, 37, 1003028400L);
        setLongElement(term8007, 38, 1013911200L);
        setField(term8003, term8003.getClass(), "savingsInstantTransitions", term8007);
        setField(term8003, term8003.getClass(), "savingsLocalTransitions", term8047);
        setElement(term8048, 1, term7976);
        setElement(term8048, 3, term7976);
        setElement(term8048, 5, term7976);
        setElement(term8048, 7, term7976);
        setElement(term8048, 9, term7976);
        setElement(term8048, 11, term7976);
        setElement(term8048, 13, term7976);
        setElement(term8048, 15, term7976);
        setElement(term8048, 17, term7976);
        setElement(term8048, 19, term7976);
        setElement(term8048, 21, term7976);
        setElement(term8048, 23, term7976);
        setElement(term8048, 25, term7976);
        setElement(term8048, 27, term7976);
        setElement(term8048, 29, term7976);
        setElement(term8048, 31, term7976);
        setElement(term8048, 33, term7976);
        setElement(term8048, 35, term7976);
        setElement(term8048, 37, term7976);
        setElement(term8048, 39, term7976);
        setField(term8003, term8003.getClass(), "wallOffsets", term8048);
        setField(term8003, term8003.getClass(), "lastRules", term8049);
        setField(term8050, term8050.getClass(), "table", null);
        setField(term8050, term8050.getClass(), "nextTable", null);
        setLongField(term8050, term8050.getClass(), "baseCount", 0L);
        setIntField(term8050, term8050.getClass(), "sizeCtl", 0);
        setIntField(term8050, term8050.getClass(), "transferIndex", 0);
        setIntField(term8050, term8050.getClass(), "cellsBusy", 0);
        setField(term8050, term8050.getClass(), "counterCells", null);
        setField(term8050, term8050.getClass(), "keySet", null);
        setField(term8050, term8050.getClass(), "values", null);
        setField(term8050, term8050.getClass(), "entrySet", null);
        setField(term8050, term8050.getClass(), "keySet", null);
        setField(term8050, term8050.getClass(), "values", null);
        setField(term8003, term8003.getClass(), "lastRulesCache", term8050);
        setField(term7986, term7986.getClass(), "rules", term8003);
        setField(term7965, term7965.getClass(), "zone", term7986);
        setField(term7880, term7880.getClass(), "time_stamp", term7965);
        setField(term7880, term7880.getClass(), "start_up_mode", "ZkMALXpEAZ");
        setField(term7880, term7880.getClass(), "cmm_dly_mod", "tXfQjSqDzN");
        setField(term7880, term7880.getClass(), "cmm_dly_sec", "BjugTaMcxJ");
        setField(term7880, term7880.getClass(), "cmm_err_mod", "vGiuZVPJNH");
        setField(term7880, term7880.getClass(), "country_code", "tlzpzIjMib");
        setField(term7880, term7880.getClass(), "region_code", "AZdLeSugwv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.RmtWpLstHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term7880;
        callMethod(klass, "handle", argTypes, term7879, args);
    }

};


