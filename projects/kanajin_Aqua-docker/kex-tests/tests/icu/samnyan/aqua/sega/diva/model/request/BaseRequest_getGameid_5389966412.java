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

public class BaseRequest_getGameid_5389966412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249225;

    public BaseRequest_getGameid_5389966412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249225 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term249310 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term249311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249316 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249321 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term249331 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term249348 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term249349 = (long[]) newLongArray(1);
        Object[] term249351 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term249352 = (long[]) newLongArray(39);
        Object[] term249392 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term249393 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term249394 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term249395 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term249225, term249225.getClass(), "cmd", "lIKlxUmvSr");
        setField(term249225, term249225.getClass(), "req_id", "maygNVZYRz");
        setField(term249225, term249225.getClass(), "game_id", "DSgAYHcbQe");
        setField(term249225, term249225.getClass(), "r_ver", "zEXmuuorCI");
        setField(term249225, term249225.getClass(), "kc_serial", "NEjergWRnM");
        setField(term249225, term249225.getClass(), "b_serial", "hDGENUWiHc");
        setField(term249225, term249225.getClass(), "place_id", "PLPXyBztQB");
        setIntField(term249312, term249312.getClass(), "year", 2024);
        setShortField(term249312, term249312.getClass(), "month", (short) 9);
        setShortField(term249312, term249312.getClass(), "day", (short) 7);
        setField(term249311, term249311.getClass(), "date", term249312);
        setByteField(term249316, term249316.getClass(), "hour", (byte) 2);
        setByteField(term249316, term249316.getClass(), "minute", (byte) 37);
        setByteField(term249316, term249316.getClass(), "second", (byte) 4);
        setIntField(term249316, term249316.getClass(), "nano", 236043949);
        setField(term249311, term249311.getClass(), "time", term249316);
        setField(term249310, term249310.getClass(), "dateTime", term249311);
        setIntField(term249321, term249321.getClass(), "totalSeconds", -10800);
        setField(term249321, term249321.getClass(), "id", "-03:00");
        setField(term249310, term249310.getClass(), "offset", term249321);
        setField(term249331, term249331.getClass(), "id", "America/Recife");
        setLongElement(term249349, 0, -1767217224L);
        setField(term249348, term249348.getClass(), "standardTransitions", term249349);
        setElement(term249351, 1, term249321);
        setField(term249348, term249348.getClass(), "standardOffsets", term249351);
        setLongElement(term249352, 0, -1767217224L);
        setLongElement(term249352, 1, -1206957600L);
        setLongElement(term249352, 2, -1191362400L);
        setLongElement(term249352, 3, -1175374800L);
        setLongElement(term249352, 4, -1159826400L);
        setLongElement(term249352, 5, -633819600L);
        setLongElement(term249352, 6, -622069200L);
        setLongElement(term249352, 7, -602283600L);
        setLongElement(term249352, 8, -591832800L);
        setLongElement(term249352, 9, -570747600L);
        setLongElement(term249352, 10, -560210400L);
        setLongElement(term249352, 11, -539125200L);
        setLongElement(term249352, 12, -531352800L);
        setLongElement(term249352, 13, -191365200L);
        setLongElement(term249352, 14, -184197600L);
        setLongElement(term249352, 15, -155163600L);
        setLongElement(term249352, 16, -150069600L);
        setLongElement(term249352, 17, -128898000L);
        setLongElement(term249352, 18, -121125600L);
        setLongElement(term249352, 19, -99954000L);
        setLongElement(term249352, 20, -89589600L);
        setLongElement(term249352, 21, -68418000L);
        setLongElement(term249352, 22, -57967200L);
        setLongElement(term249352, 23, 499748400L);
        setLongElement(term249352, 24, 511236000L);
        setLongElement(term249352, 25, 530593200L);
        setLongElement(term249352, 26, 540266400L);
        setLongElement(term249352, 27, 562129200L);
        setLongElement(term249352, 28, 571197600L);
        setLongElement(term249352, 29, 592974000L);
        setLongElement(term249352, 30, 602042400L);
        setLongElement(term249352, 31, 624423600L);
        setLongElement(term249352, 32, 634701600L);
        setLongElement(term249352, 33, 938919600L);
        setLongElement(term249352, 34, 951616800L);
        setLongElement(term249352, 35, 970974000L);
        setLongElement(term249352, 36, 971575200L);
        setLongElement(term249352, 37, 1003028400L);
        setLongElement(term249352, 38, 1013911200L);
        setField(term249348, term249348.getClass(), "savingsInstantTransitions", term249352);
        setField(term249348, term249348.getClass(), "savingsLocalTransitions", term249392);
        setElement(term249393, 1, term249321);
        setElement(term249393, 3, term249321);
        setElement(term249393, 5, term249321);
        setElement(term249393, 7, term249321);
        setElement(term249393, 9, term249321);
        setElement(term249393, 11, term249321);
        setElement(term249393, 13, term249321);
        setElement(term249393, 15, term249321);
        setElement(term249393, 17, term249321);
        setElement(term249393, 19, term249321);
        setElement(term249393, 21, term249321);
        setElement(term249393, 23, term249321);
        setElement(term249393, 25, term249321);
        setElement(term249393, 27, term249321);
        setElement(term249393, 29, term249321);
        setElement(term249393, 31, term249321);
        setElement(term249393, 33, term249321);
        setElement(term249393, 35, term249321);
        setElement(term249393, 37, term249321);
        setElement(term249393, 39, term249321);
        setField(term249348, term249348.getClass(), "wallOffsets", term249393);
        setField(term249348, term249348.getClass(), "lastRules", term249394);
        setField(term249395, term249395.getClass(), "table", null);
        setField(term249395, term249395.getClass(), "nextTable", null);
        setLongField(term249395, term249395.getClass(), "baseCount", 0L);
        setIntField(term249395, term249395.getClass(), "sizeCtl", 0);
        setIntField(term249395, term249395.getClass(), "transferIndex", 0);
        setIntField(term249395, term249395.getClass(), "cellsBusy", 0);
        setField(term249395, term249395.getClass(), "counterCells", null);
        setField(term249395, term249395.getClass(), "keySet", null);
        setField(term249395, term249395.getClass(), "values", null);
        setField(term249395, term249395.getClass(), "entrySet", null);
        setField(term249395, term249395.getClass(), "keySet", null);
        setField(term249395, term249395.getClass(), "values", null);
        setField(term249348, term249348.getClass(), "lastRulesCache", term249395);
        setField(term249331, term249331.getClass(), "rules", term249348);
        setField(term249310, term249310.getClass(), "zone", term249331);
        setField(term249225, term249225.getClass(), "time_stamp", term249310);
        setField(term249225, term249225.getClass(), "start_up_mode", "hESiinBBOz");
        setField(term249225, term249225.getClass(), "cmm_dly_mod", "llUdMgKbEf");
        setField(term249225, term249225.getClass(), "cmm_dly_sec", "BqtmlODLQw");
        setField(term249225, term249225.getClass(), "cmm_err_mod", "MYesfpduIU");
        setField(term249225, term249225.getClass(), "country_code", "KHmFMOciUu");
        setField(term249225, term249225.getClass(), "region_code", "kUHQbcpRuo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGame_id", argTypes, term249225, args);
    }

};


