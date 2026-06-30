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

public class BaseRequest_setGameid_27248438316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255387;

    public BaseRequest_setGameid_27248438316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255387 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term255472 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term255473 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255474 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255478 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255483 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term255493 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term255510 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term255511 = (long[]) newLongArray(1);
        Object[] term255513 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term255514 = (long[]) newLongArray(39);
        Object[] term255554 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term255555 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term255556 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term255557 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term255387, term255387.getClass(), "cmd", "TQAFOeWgvq");
        setField(term255387, term255387.getClass(), "req_id", "AtYIxbvLDg");
        setField(term255387, term255387.getClass(), "game_id", "rQdqhBCIJv");
        setField(term255387, term255387.getClass(), "r_ver", "OWnGgqSmUN");
        setField(term255387, term255387.getClass(), "kc_serial", "BLSUZfTILp");
        setField(term255387, term255387.getClass(), "b_serial", "tlymfAhXiZ");
        setField(term255387, term255387.getClass(), "place_id", "rlLIYBJlxU");
        setIntField(term255474, term255474.getClass(), "year", 2010);
        setShortField(term255474, term255474.getClass(), "month", (short) 5);
        setShortField(term255474, term255474.getClass(), "day", (short) 19);
        setField(term255473, term255473.getClass(), "date", term255474);
        setByteField(term255478, term255478.getClass(), "hour", (byte) 12);
        setByteField(term255478, term255478.getClass(), "minute", (byte) 17);
        setByteField(term255478, term255478.getClass(), "second", (byte) 52);
        setIntField(term255478, term255478.getClass(), "nano", 273610077);
        setField(term255473, term255473.getClass(), "time", term255478);
        setField(term255472, term255472.getClass(), "dateTime", term255473);
        setIntField(term255483, term255483.getClass(), "totalSeconds", -10800);
        setField(term255483, term255483.getClass(), "id", "-03:00");
        setField(term255472, term255472.getClass(), "offset", term255483);
        setField(term255493, term255493.getClass(), "id", "America/Recife");
        setLongElement(term255511, 0, -1767217224L);
        setField(term255510, term255510.getClass(), "standardTransitions", term255511);
        setElement(term255513, 1, term255483);
        setField(term255510, term255510.getClass(), "standardOffsets", term255513);
        setLongElement(term255514, 0, -1767217224L);
        setLongElement(term255514, 1, -1206957600L);
        setLongElement(term255514, 2, -1191362400L);
        setLongElement(term255514, 3, -1175374800L);
        setLongElement(term255514, 4, -1159826400L);
        setLongElement(term255514, 5, -633819600L);
        setLongElement(term255514, 6, -622069200L);
        setLongElement(term255514, 7, -602283600L);
        setLongElement(term255514, 8, -591832800L);
        setLongElement(term255514, 9, -570747600L);
        setLongElement(term255514, 10, -560210400L);
        setLongElement(term255514, 11, -539125200L);
        setLongElement(term255514, 12, -531352800L);
        setLongElement(term255514, 13, -191365200L);
        setLongElement(term255514, 14, -184197600L);
        setLongElement(term255514, 15, -155163600L);
        setLongElement(term255514, 16, -150069600L);
        setLongElement(term255514, 17, -128898000L);
        setLongElement(term255514, 18, -121125600L);
        setLongElement(term255514, 19, -99954000L);
        setLongElement(term255514, 20, -89589600L);
        setLongElement(term255514, 21, -68418000L);
        setLongElement(term255514, 22, -57967200L);
        setLongElement(term255514, 23, 499748400L);
        setLongElement(term255514, 24, 511236000L);
        setLongElement(term255514, 25, 530593200L);
        setLongElement(term255514, 26, 540266400L);
        setLongElement(term255514, 27, 562129200L);
        setLongElement(term255514, 28, 571197600L);
        setLongElement(term255514, 29, 592974000L);
        setLongElement(term255514, 30, 602042400L);
        setLongElement(term255514, 31, 624423600L);
        setLongElement(term255514, 32, 634701600L);
        setLongElement(term255514, 33, 938919600L);
        setLongElement(term255514, 34, 951616800L);
        setLongElement(term255514, 35, 970974000L);
        setLongElement(term255514, 36, 971575200L);
        setLongElement(term255514, 37, 1003028400L);
        setLongElement(term255514, 38, 1013911200L);
        setField(term255510, term255510.getClass(), "savingsInstantTransitions", term255514);
        setField(term255510, term255510.getClass(), "savingsLocalTransitions", term255554);
        setElement(term255555, 1, term255483);
        setElement(term255555, 3, term255483);
        setElement(term255555, 5, term255483);
        setElement(term255555, 7, term255483);
        setElement(term255555, 9, term255483);
        setElement(term255555, 11, term255483);
        setElement(term255555, 13, term255483);
        setElement(term255555, 15, term255483);
        setElement(term255555, 17, term255483);
        setElement(term255555, 19, term255483);
        setElement(term255555, 21, term255483);
        setElement(term255555, 23, term255483);
        setElement(term255555, 25, term255483);
        setElement(term255555, 27, term255483);
        setElement(term255555, 29, term255483);
        setElement(term255555, 31, term255483);
        setElement(term255555, 33, term255483);
        setElement(term255555, 35, term255483);
        setElement(term255555, 37, term255483);
        setElement(term255555, 39, term255483);
        setField(term255510, term255510.getClass(), "wallOffsets", term255555);
        setField(term255510, term255510.getClass(), "lastRules", term255556);
        setField(term255557, term255557.getClass(), "table", null);
        setField(term255557, term255557.getClass(), "nextTable", null);
        setLongField(term255557, term255557.getClass(), "baseCount", 0L);
        setIntField(term255557, term255557.getClass(), "sizeCtl", 0);
        setIntField(term255557, term255557.getClass(), "transferIndex", 0);
        setIntField(term255557, term255557.getClass(), "cellsBusy", 0);
        setField(term255557, term255557.getClass(), "counterCells", null);
        setField(term255557, term255557.getClass(), "keySet", null);
        setField(term255557, term255557.getClass(), "values", null);
        setField(term255557, term255557.getClass(), "entrySet", null);
        setField(term255557, term255557.getClass(), "keySet", null);
        setField(term255557, term255557.getClass(), "values", null);
        setField(term255510, term255510.getClass(), "lastRulesCache", term255557);
        setField(term255493, term255493.getClass(), "rules", term255510);
        setField(term255472, term255472.getClass(), "zone", term255493);
        setField(term255387, term255387.getClass(), "time_stamp", term255472);
        setField(term255387, term255387.getClass(), "start_up_mode", "jtfkxwFefh");
        setField(term255387, term255387.getClass(), "cmm_dly_mod", "ESnYpdjELS");
        setField(term255387, term255387.getClass(), "cmm_dly_sec", "IsOpDBwqZb");
        setField(term255387, term255387.getClass(), "cmm_err_mod", "GBSKSryDNr");
        setField(term255387, term255387.getClass(), "country_code", "lewYJfdwbu");
        setField(term255387, term255387.getClass(), "region_code", "wmCdnKXFIV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OQFYTZSsmT";
        callMethod(klass, "setGame_id", argTypes, term255387, args);
    }

};


