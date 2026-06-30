package icu.samnyan.aqua.sega.diva.model.request.card;

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
import static icu.samnyan.aqua.sega.diva.model.request.card.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CardProcedureRequest_setAcode_324396755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21858;

    public CardProcedureRequest_setAcode_324396755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21858 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest"));
        Object term21969 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term21970 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21971 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21975 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21980 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term21990 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term22007 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term22008 = (long[]) newLongArray(1);
        Object[] term22010 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term22011 = (long[]) newLongArray(39);
        Object[] term22051 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term22052 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term22053 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term22054 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term21858, term21858.getClass(), "cd_adm_cmd", 1551099402);
        setField(term21858, term21858.getClass(), "a_code", "FrTZLybkKk");
        setIntField(term21858, term21858.getClass(), "aime_id", -2027534003);
        setField(term21858, term21858.getClass(), "aime_a_code", "FlxVmiMYKP");
        setField(term21858, term21858.getClass(), "cmd", "fgOpAWlGYN");
        setField(term21858, term21858.getClass(), "req_id", "PNzNzzjSXM");
        setField(term21858, term21858.getClass(), "game_id", "ktKcSZiuGM");
        setField(term21858, term21858.getClass(), "r_ver", "PSOttyUeqv");
        setField(term21858, term21858.getClass(), "kc_serial", "HmEvTlmzXo");
        setField(term21858, term21858.getClass(), "b_serial", "BMMonTIZgJ");
        setField(term21858, term21858.getClass(), "place_id", "QXyFXBjFde");
        setIntField(term21971, term21971.getClass(), "year", 2010);
        setShortField(term21971, term21971.getClass(), "month", (short) 9);
        setShortField(term21971, term21971.getClass(), "day", (short) 28);
        setField(term21970, term21970.getClass(), "date", term21971);
        setByteField(term21975, term21975.getClass(), "hour", (byte) 6);
        setByteField(term21975, term21975.getClass(), "minute", (byte) 4);
        setByteField(term21975, term21975.getClass(), "second", (byte) 54);
        setIntField(term21975, term21975.getClass(), "nano", 604713782);
        setField(term21970, term21970.getClass(), "time", term21975);
        setField(term21969, term21969.getClass(), "dateTime", term21970);
        setIntField(term21980, term21980.getClass(), "totalSeconds", -10800);
        setField(term21980, term21980.getClass(), "id", "-03:00");
        setField(term21969, term21969.getClass(), "offset", term21980);
        setField(term21990, term21990.getClass(), "id", "America/Recife");
        setLongElement(term22008, 0, -1767217224L);
        setField(term22007, term22007.getClass(), "standardTransitions", term22008);
        setElement(term22010, 1, term21980);
        setField(term22007, term22007.getClass(), "standardOffsets", term22010);
        setLongElement(term22011, 0, -1767217224L);
        setLongElement(term22011, 1, -1206957600L);
        setLongElement(term22011, 2, -1191362400L);
        setLongElement(term22011, 3, -1175374800L);
        setLongElement(term22011, 4, -1159826400L);
        setLongElement(term22011, 5, -633819600L);
        setLongElement(term22011, 6, -622069200L);
        setLongElement(term22011, 7, -602283600L);
        setLongElement(term22011, 8, -591832800L);
        setLongElement(term22011, 9, -570747600L);
        setLongElement(term22011, 10, -560210400L);
        setLongElement(term22011, 11, -539125200L);
        setLongElement(term22011, 12, -531352800L);
        setLongElement(term22011, 13, -191365200L);
        setLongElement(term22011, 14, -184197600L);
        setLongElement(term22011, 15, -155163600L);
        setLongElement(term22011, 16, -150069600L);
        setLongElement(term22011, 17, -128898000L);
        setLongElement(term22011, 18, -121125600L);
        setLongElement(term22011, 19, -99954000L);
        setLongElement(term22011, 20, -89589600L);
        setLongElement(term22011, 21, -68418000L);
        setLongElement(term22011, 22, -57967200L);
        setLongElement(term22011, 23, 499748400L);
        setLongElement(term22011, 24, 511236000L);
        setLongElement(term22011, 25, 530593200L);
        setLongElement(term22011, 26, 540266400L);
        setLongElement(term22011, 27, 562129200L);
        setLongElement(term22011, 28, 571197600L);
        setLongElement(term22011, 29, 592974000L);
        setLongElement(term22011, 30, 602042400L);
        setLongElement(term22011, 31, 624423600L);
        setLongElement(term22011, 32, 634701600L);
        setLongElement(term22011, 33, 938919600L);
        setLongElement(term22011, 34, 951616800L);
        setLongElement(term22011, 35, 970974000L);
        setLongElement(term22011, 36, 971575200L);
        setLongElement(term22011, 37, 1003028400L);
        setLongElement(term22011, 38, 1013911200L);
        setField(term22007, term22007.getClass(), "savingsInstantTransitions", term22011);
        setField(term22007, term22007.getClass(), "savingsLocalTransitions", term22051);
        setElement(term22052, 1, term21980);
        setElement(term22052, 3, term21980);
        setElement(term22052, 5, term21980);
        setElement(term22052, 7, term21980);
        setElement(term22052, 9, term21980);
        setElement(term22052, 11, term21980);
        setElement(term22052, 13, term21980);
        setElement(term22052, 15, term21980);
        setElement(term22052, 17, term21980);
        setElement(term22052, 19, term21980);
        setElement(term22052, 21, term21980);
        setElement(term22052, 23, term21980);
        setElement(term22052, 25, term21980);
        setElement(term22052, 27, term21980);
        setElement(term22052, 29, term21980);
        setElement(term22052, 31, term21980);
        setElement(term22052, 33, term21980);
        setElement(term22052, 35, term21980);
        setElement(term22052, 37, term21980);
        setElement(term22052, 39, term21980);
        setField(term22007, term22007.getClass(), "wallOffsets", term22052);
        setField(term22007, term22007.getClass(), "lastRules", term22053);
        setField(term22054, term22054.getClass(), "table", null);
        setField(term22054, term22054.getClass(), "nextTable", null);
        setLongField(term22054, term22054.getClass(), "baseCount", 0L);
        setIntField(term22054, term22054.getClass(), "sizeCtl", 0);
        setIntField(term22054, term22054.getClass(), "transferIndex", 0);
        setIntField(term22054, term22054.getClass(), "cellsBusy", 0);
        setField(term22054, term22054.getClass(), "counterCells", null);
        setField(term22054, term22054.getClass(), "keySet", null);
        setField(term22054, term22054.getClass(), "values", null);
        setField(term22054, term22054.getClass(), "entrySet", null);
        setField(term22054, term22054.getClass(), "keySet", null);
        setField(term22054, term22054.getClass(), "values", null);
        setField(term22007, term22007.getClass(), "lastRulesCache", term22054);
        setField(term21990, term21990.getClass(), "rules", term22007);
        setField(term21969, term21969.getClass(), "zone", term21990);
        setField(term21858, term21858.getClass(), "time_stamp", term21969);
        setField(term21858, term21858.getClass(), "start_up_mode", "xVFgeyYxZS");
        setField(term21858, term21858.getClass(), "cmm_dly_mod", "iQiGTulJiH");
        setField(term21858, term21858.getClass(), "cmm_dly_sec", "utCuuVCKqE");
        setField(term21858, term21858.getClass(), "cmm_err_mod", "zSfoqzJbPT");
        setField(term21858, term21858.getClass(), "country_code", "QUymMnsCIj");
        setField(term21858, term21858.getClass(), "region_code", "ikTtOgdVYS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.CardProcedureRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JptuwlirlS";
        callMethod(klass, "setA_code", argTypes, term21858, args);
    }

};


