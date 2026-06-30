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

public class RegistrationRequest_setIdm_5034960011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13295;

    public RegistrationRequest_setIdm_5034960011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13295 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest"));
        Object term13489 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term13490 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term13491 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13495 = newInstance(Class.forName("java.time.LocalTime"));
        Object term13500 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term13510 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term13527 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term13528 = (long[]) newLongArray(1);
        Object[] term13530 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term13531 = (long[]) newLongArray(39);
        Object[] term13571 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term13572 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term13573 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term13574 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term13295, term13295.getClass(), "pmm", "aSATgQUpoe");
        setField(term13295, term13295.getClass(), "idm", "VkPSXewZfB");
        setField(term13295, term13295.getClass(), "mmgameid", "ubodzJoMGW");
        setField(term13295, term13295.getClass(), "mmuid", "weddIktxOA");
        setField(term13295, term13295.getClass(), "a_code", "uSlMeISsDD");
        setIntField(term13295, term13295.getClass(), "aime_id", 2055867847);
        setField(term13295, term13295.getClass(), "aime_a_code", "WdCiTDUKqn");
        setField(term13295, term13295.getClass(), "key_obj_type", "PSizQDoxxe");
        setField(term13295, term13295.getClass(), "player_name", "mKaHyMybrK");
        setField(term13295, term13295.getClass(), "passwd", "AyrEXuGrEj");
        setField(term13295, term13295.getClass(), "cmd", "yevIIoVYHq");
        setField(term13295, term13295.getClass(), "req_id", "UuYWMTqWTV");
        setField(term13295, term13295.getClass(), "game_id", "DSFGlcaXUb");
        setField(term13295, term13295.getClass(), "r_ver", "sHMXNUzNeM");
        setField(term13295, term13295.getClass(), "kc_serial", "gPzGDOEPPw");
        setField(term13295, term13295.getClass(), "b_serial", "rwKoAngzCu");
        setField(term13295, term13295.getClass(), "place_id", "VUkRVwROTl");
        setIntField(term13491, term13491.getClass(), "year", 2027);
        setShortField(term13491, term13491.getClass(), "month", (short) 8);
        setShortField(term13491, term13491.getClass(), "day", (short) 26);
        setField(term13490, term13490.getClass(), "date", term13491);
        setByteField(term13495, term13495.getClass(), "hour", (byte) 5);
        setByteField(term13495, term13495.getClass(), "minute", (byte) 11);
        setByteField(term13495, term13495.getClass(), "second", (byte) 9);
        setIntField(term13495, term13495.getClass(), "nano", 219245092);
        setField(term13490, term13490.getClass(), "time", term13495);
        setField(term13489, term13489.getClass(), "dateTime", term13490);
        setIntField(term13500, term13500.getClass(), "totalSeconds", -10800);
        setField(term13500, term13500.getClass(), "id", "-03:00");
        setField(term13489, term13489.getClass(), "offset", term13500);
        setField(term13510, term13510.getClass(), "id", "America/Recife");
        setLongElement(term13528, 0, -1767217224L);
        setField(term13527, term13527.getClass(), "standardTransitions", term13528);
        setElement(term13530, 1, term13500);
        setField(term13527, term13527.getClass(), "standardOffsets", term13530);
        setLongElement(term13531, 0, -1767217224L);
        setLongElement(term13531, 1, -1206957600L);
        setLongElement(term13531, 2, -1191362400L);
        setLongElement(term13531, 3, -1175374800L);
        setLongElement(term13531, 4, -1159826400L);
        setLongElement(term13531, 5, -633819600L);
        setLongElement(term13531, 6, -622069200L);
        setLongElement(term13531, 7, -602283600L);
        setLongElement(term13531, 8, -591832800L);
        setLongElement(term13531, 9, -570747600L);
        setLongElement(term13531, 10, -560210400L);
        setLongElement(term13531, 11, -539125200L);
        setLongElement(term13531, 12, -531352800L);
        setLongElement(term13531, 13, -191365200L);
        setLongElement(term13531, 14, -184197600L);
        setLongElement(term13531, 15, -155163600L);
        setLongElement(term13531, 16, -150069600L);
        setLongElement(term13531, 17, -128898000L);
        setLongElement(term13531, 18, -121125600L);
        setLongElement(term13531, 19, -99954000L);
        setLongElement(term13531, 20, -89589600L);
        setLongElement(term13531, 21, -68418000L);
        setLongElement(term13531, 22, -57967200L);
        setLongElement(term13531, 23, 499748400L);
        setLongElement(term13531, 24, 511236000L);
        setLongElement(term13531, 25, 530593200L);
        setLongElement(term13531, 26, 540266400L);
        setLongElement(term13531, 27, 562129200L);
        setLongElement(term13531, 28, 571197600L);
        setLongElement(term13531, 29, 592974000L);
        setLongElement(term13531, 30, 602042400L);
        setLongElement(term13531, 31, 624423600L);
        setLongElement(term13531, 32, 634701600L);
        setLongElement(term13531, 33, 938919600L);
        setLongElement(term13531, 34, 951616800L);
        setLongElement(term13531, 35, 970974000L);
        setLongElement(term13531, 36, 971575200L);
        setLongElement(term13531, 37, 1003028400L);
        setLongElement(term13531, 38, 1013911200L);
        setField(term13527, term13527.getClass(), "savingsInstantTransitions", term13531);
        setField(term13527, term13527.getClass(), "savingsLocalTransitions", term13571);
        setElement(term13572, 1, term13500);
        setElement(term13572, 3, term13500);
        setElement(term13572, 5, term13500);
        setElement(term13572, 7, term13500);
        setElement(term13572, 9, term13500);
        setElement(term13572, 11, term13500);
        setElement(term13572, 13, term13500);
        setElement(term13572, 15, term13500);
        setElement(term13572, 17, term13500);
        setElement(term13572, 19, term13500);
        setElement(term13572, 21, term13500);
        setElement(term13572, 23, term13500);
        setElement(term13572, 25, term13500);
        setElement(term13572, 27, term13500);
        setElement(term13572, 29, term13500);
        setElement(term13572, 31, term13500);
        setElement(term13572, 33, term13500);
        setElement(term13572, 35, term13500);
        setElement(term13572, 37, term13500);
        setElement(term13572, 39, term13500);
        setField(term13527, term13527.getClass(), "wallOffsets", term13572);
        setField(term13527, term13527.getClass(), "lastRules", term13573);
        setField(term13574, term13574.getClass(), "table", null);
        setField(term13574, term13574.getClass(), "nextTable", null);
        setLongField(term13574, term13574.getClass(), "baseCount", 0L);
        setIntField(term13574, term13574.getClass(), "sizeCtl", 0);
        setIntField(term13574, term13574.getClass(), "transferIndex", 0);
        setIntField(term13574, term13574.getClass(), "cellsBusy", 0);
        setField(term13574, term13574.getClass(), "counterCells", null);
        setField(term13574, term13574.getClass(), "keySet", null);
        setField(term13574, term13574.getClass(), "values", null);
        setField(term13574, term13574.getClass(), "entrySet", null);
        setField(term13574, term13574.getClass(), "keySet", null);
        setField(term13574, term13574.getClass(), "values", null);
        setField(term13527, term13527.getClass(), "lastRulesCache", term13574);
        setField(term13510, term13510.getClass(), "rules", term13527);
        setField(term13489, term13489.getClass(), "zone", term13510);
        setField(term13295, term13295.getClass(), "time_stamp", term13489);
        setField(term13295, term13295.getClass(), "start_up_mode", "UDlkdccCRn");
        setField(term13295, term13295.getClass(), "cmm_dly_mod", "McpzErOcYb");
        setField(term13295, term13295.getClass(), "cmm_dly_sec", "jqrVEUvYEz");
        setField(term13295, term13295.getClass(), "cmm_err_mod", "QITgiBrmfj");
        setField(term13295, term13295.getClass(), "country_code", "pXxkiXgQnq");
        setField(term13295, term13295.getClass(), "region_code", "tKmrUDURku");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.card.RegistrationRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JeZbrwZmsP";
        callMethod(klass, "setIdm", argTypes, term13295, args);
    }

};


