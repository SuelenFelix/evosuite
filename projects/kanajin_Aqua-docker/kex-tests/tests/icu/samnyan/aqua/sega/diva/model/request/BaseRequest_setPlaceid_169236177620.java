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

public class BaseRequest_setPlaceid_169236177620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257223;

    public BaseRequest_setPlaceid_169236177620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257223 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term257308 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term257309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term257310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term257314 = newInstance(Class.forName("java.time.LocalTime"));
        Object term257319 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term257329 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term257346 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term257347 = (long[]) newLongArray(1);
        Object[] term257349 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term257350 = (long[]) newLongArray(39);
        Object[] term257390 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term257391 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term257392 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term257393 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term257223, term257223.getClass(), "cmd", "OzwgkolGue");
        setField(term257223, term257223.getClass(), "req_id", "wqwrSGuByQ");
        setField(term257223, term257223.getClass(), "game_id", "KJOrIBIJCp");
        setField(term257223, term257223.getClass(), "r_ver", "LHDRljWYoi");
        setField(term257223, term257223.getClass(), "kc_serial", "buQOGnBPlD");
        setField(term257223, term257223.getClass(), "b_serial", "ofiucEZNjp");
        setField(term257223, term257223.getClass(), "place_id", "kbQZxTtvgH");
        setIntField(term257310, term257310.getClass(), "year", 2027);
        setShortField(term257310, term257310.getClass(), "month", (short) 11);
        setShortField(term257310, term257310.getClass(), "day", (short) 10);
        setField(term257309, term257309.getClass(), "date", term257310);
        setByteField(term257314, term257314.getClass(), "hour", (byte) 9);
        setByteField(term257314, term257314.getClass(), "minute", (byte) 27);
        setByteField(term257314, term257314.getClass(), "second", (byte) 5);
        setIntField(term257314, term257314.getClass(), "nano", 574938581);
        setField(term257309, term257309.getClass(), "time", term257314);
        setField(term257308, term257308.getClass(), "dateTime", term257309);
        setIntField(term257319, term257319.getClass(), "totalSeconds", -10800);
        setField(term257319, term257319.getClass(), "id", "-03:00");
        setField(term257308, term257308.getClass(), "offset", term257319);
        setField(term257329, term257329.getClass(), "id", "America/Recife");
        setLongElement(term257347, 0, -1767217224L);
        setField(term257346, term257346.getClass(), "standardTransitions", term257347);
        setElement(term257349, 1, term257319);
        setField(term257346, term257346.getClass(), "standardOffsets", term257349);
        setLongElement(term257350, 0, -1767217224L);
        setLongElement(term257350, 1, -1206957600L);
        setLongElement(term257350, 2, -1191362400L);
        setLongElement(term257350, 3, -1175374800L);
        setLongElement(term257350, 4, -1159826400L);
        setLongElement(term257350, 5, -633819600L);
        setLongElement(term257350, 6, -622069200L);
        setLongElement(term257350, 7, -602283600L);
        setLongElement(term257350, 8, -591832800L);
        setLongElement(term257350, 9, -570747600L);
        setLongElement(term257350, 10, -560210400L);
        setLongElement(term257350, 11, -539125200L);
        setLongElement(term257350, 12, -531352800L);
        setLongElement(term257350, 13, -191365200L);
        setLongElement(term257350, 14, -184197600L);
        setLongElement(term257350, 15, -155163600L);
        setLongElement(term257350, 16, -150069600L);
        setLongElement(term257350, 17, -128898000L);
        setLongElement(term257350, 18, -121125600L);
        setLongElement(term257350, 19, -99954000L);
        setLongElement(term257350, 20, -89589600L);
        setLongElement(term257350, 21, -68418000L);
        setLongElement(term257350, 22, -57967200L);
        setLongElement(term257350, 23, 499748400L);
        setLongElement(term257350, 24, 511236000L);
        setLongElement(term257350, 25, 530593200L);
        setLongElement(term257350, 26, 540266400L);
        setLongElement(term257350, 27, 562129200L);
        setLongElement(term257350, 28, 571197600L);
        setLongElement(term257350, 29, 592974000L);
        setLongElement(term257350, 30, 602042400L);
        setLongElement(term257350, 31, 624423600L);
        setLongElement(term257350, 32, 634701600L);
        setLongElement(term257350, 33, 938919600L);
        setLongElement(term257350, 34, 951616800L);
        setLongElement(term257350, 35, 970974000L);
        setLongElement(term257350, 36, 971575200L);
        setLongElement(term257350, 37, 1003028400L);
        setLongElement(term257350, 38, 1013911200L);
        setField(term257346, term257346.getClass(), "savingsInstantTransitions", term257350);
        setField(term257346, term257346.getClass(), "savingsLocalTransitions", term257390);
        setElement(term257391, 1, term257319);
        setElement(term257391, 3, term257319);
        setElement(term257391, 5, term257319);
        setElement(term257391, 7, term257319);
        setElement(term257391, 9, term257319);
        setElement(term257391, 11, term257319);
        setElement(term257391, 13, term257319);
        setElement(term257391, 15, term257319);
        setElement(term257391, 17, term257319);
        setElement(term257391, 19, term257319);
        setElement(term257391, 21, term257319);
        setElement(term257391, 23, term257319);
        setElement(term257391, 25, term257319);
        setElement(term257391, 27, term257319);
        setElement(term257391, 29, term257319);
        setElement(term257391, 31, term257319);
        setElement(term257391, 33, term257319);
        setElement(term257391, 35, term257319);
        setElement(term257391, 37, term257319);
        setElement(term257391, 39, term257319);
        setField(term257346, term257346.getClass(), "wallOffsets", term257391);
        setField(term257346, term257346.getClass(), "lastRules", term257392);
        setField(term257393, term257393.getClass(), "table", null);
        setField(term257393, term257393.getClass(), "nextTable", null);
        setLongField(term257393, term257393.getClass(), "baseCount", 0L);
        setIntField(term257393, term257393.getClass(), "sizeCtl", 0);
        setIntField(term257393, term257393.getClass(), "transferIndex", 0);
        setIntField(term257393, term257393.getClass(), "cellsBusy", 0);
        setField(term257393, term257393.getClass(), "counterCells", null);
        setField(term257393, term257393.getClass(), "keySet", null);
        setField(term257393, term257393.getClass(), "values", null);
        setField(term257393, term257393.getClass(), "entrySet", null);
        setField(term257393, term257393.getClass(), "keySet", null);
        setField(term257393, term257393.getClass(), "values", null);
        setField(term257346, term257346.getClass(), "lastRulesCache", term257393);
        setField(term257329, term257329.getClass(), "rules", term257346);
        setField(term257308, term257308.getClass(), "zone", term257329);
        setField(term257223, term257223.getClass(), "time_stamp", term257308);
        setField(term257223, term257223.getClass(), "start_up_mode", "aYWilzmMDP");
        setField(term257223, term257223.getClass(), "cmm_dly_mod", "AaQIoxTkkz");
        setField(term257223, term257223.getClass(), "cmm_dly_sec", "utuhuXZwKw");
        setField(term257223, term257223.getClass(), "cmm_err_mod", "HDmUBvnTDS");
        setField(term257223, term257223.getClass(), "country_code", "JySfuJQGCc");
        setField(term257223, term257223.getClass(), "region_code", "EYFlXZZTDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DRGzFlWxaV";
        callMethod(klass, "setPlace_id", argTypes, term257223, args);
    }

};


