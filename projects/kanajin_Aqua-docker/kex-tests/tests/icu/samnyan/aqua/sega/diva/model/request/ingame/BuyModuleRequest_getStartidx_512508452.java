package icu.samnyan.aqua.sega.diva.model.request.ingame;

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
import static icu.samnyan.aqua.sega.diva.model.request.ingame.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BuyModuleRequest_getStartidx_512508452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255277;

    public BuyModuleRequest_getStartidx_512508452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255277 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term255367 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term255368 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255369 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255373 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255378 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term255388 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term255405 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term255406 = (long[]) newLongArray(1);
        Object[] term255408 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term255409 = (long[]) newLongArray(39);
        Object[] term255449 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term255450 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term255451 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term255452 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term255277, term255277.getClass(), "pd_id", -455186389);
        setIntField(term255277, term255277.getClass(), "accept_idx", 764298054);
        setIntField(term255277, term255277.getClass(), "start_idx", -1701811159);
        setIntField(term255277, term255277.getClass(), "mdl_id", -1379923468);
        setIntField(term255277, term255277.getClass(), "mdl_price", -1177120430);
        setField(term255277, term255277.getClass(), "cmd", "fANlppmeZc");
        setField(term255277, term255277.getClass(), "req_id", "vwXdXCgQIr");
        setField(term255277, term255277.getClass(), "game_id", "nSnrziJcBE");
        setField(term255277, term255277.getClass(), "r_ver", "xbhJrXUuCP");
        setField(term255277, term255277.getClass(), "kc_serial", "bvjVBhkXQU");
        setField(term255277, term255277.getClass(), "b_serial", "IrOvUMupuD");
        setField(term255277, term255277.getClass(), "place_id", "UgFQTaylqs");
        setIntField(term255369, term255369.getClass(), "year", 2025);
        setShortField(term255369, term255369.getClass(), "month", (short) 1);
        setShortField(term255369, term255369.getClass(), "day", (short) 20);
        setField(term255368, term255368.getClass(), "date", term255369);
        setByteField(term255373, term255373.getClass(), "hour", (byte) 22);
        setByteField(term255373, term255373.getClass(), "minute", (byte) 55);
        setByteField(term255373, term255373.getClass(), "second", (byte) 9);
        setIntField(term255373, term255373.getClass(), "nano", 660955568);
        setField(term255368, term255368.getClass(), "time", term255373);
        setField(term255367, term255367.getClass(), "dateTime", term255368);
        setIntField(term255378, term255378.getClass(), "totalSeconds", -10800);
        setField(term255378, term255378.getClass(), "id", "-03:00");
        setField(term255367, term255367.getClass(), "offset", term255378);
        setField(term255388, term255388.getClass(), "id", "America/Recife");
        setLongElement(term255406, 0, -1767217224L);
        setField(term255405, term255405.getClass(), "standardTransitions", term255406);
        setElement(term255408, 1, term255378);
        setField(term255405, term255405.getClass(), "standardOffsets", term255408);
        setLongElement(term255409, 0, -1767217224L);
        setLongElement(term255409, 1, -1206957600L);
        setLongElement(term255409, 2, -1191362400L);
        setLongElement(term255409, 3, -1175374800L);
        setLongElement(term255409, 4, -1159826400L);
        setLongElement(term255409, 5, -633819600L);
        setLongElement(term255409, 6, -622069200L);
        setLongElement(term255409, 7, -602283600L);
        setLongElement(term255409, 8, -591832800L);
        setLongElement(term255409, 9, -570747600L);
        setLongElement(term255409, 10, -560210400L);
        setLongElement(term255409, 11, -539125200L);
        setLongElement(term255409, 12, -531352800L);
        setLongElement(term255409, 13, -191365200L);
        setLongElement(term255409, 14, -184197600L);
        setLongElement(term255409, 15, -155163600L);
        setLongElement(term255409, 16, -150069600L);
        setLongElement(term255409, 17, -128898000L);
        setLongElement(term255409, 18, -121125600L);
        setLongElement(term255409, 19, -99954000L);
        setLongElement(term255409, 20, -89589600L);
        setLongElement(term255409, 21, -68418000L);
        setLongElement(term255409, 22, -57967200L);
        setLongElement(term255409, 23, 499748400L);
        setLongElement(term255409, 24, 511236000L);
        setLongElement(term255409, 25, 530593200L);
        setLongElement(term255409, 26, 540266400L);
        setLongElement(term255409, 27, 562129200L);
        setLongElement(term255409, 28, 571197600L);
        setLongElement(term255409, 29, 592974000L);
        setLongElement(term255409, 30, 602042400L);
        setLongElement(term255409, 31, 624423600L);
        setLongElement(term255409, 32, 634701600L);
        setLongElement(term255409, 33, 938919600L);
        setLongElement(term255409, 34, 951616800L);
        setLongElement(term255409, 35, 970974000L);
        setLongElement(term255409, 36, 971575200L);
        setLongElement(term255409, 37, 1003028400L);
        setLongElement(term255409, 38, 1013911200L);
        setField(term255405, term255405.getClass(), "savingsInstantTransitions", term255409);
        setField(term255405, term255405.getClass(), "savingsLocalTransitions", term255449);
        setElement(term255450, 1, term255378);
        setElement(term255450, 3, term255378);
        setElement(term255450, 5, term255378);
        setElement(term255450, 7, term255378);
        setElement(term255450, 9, term255378);
        setElement(term255450, 11, term255378);
        setElement(term255450, 13, term255378);
        setElement(term255450, 15, term255378);
        setElement(term255450, 17, term255378);
        setElement(term255450, 19, term255378);
        setElement(term255450, 21, term255378);
        setElement(term255450, 23, term255378);
        setElement(term255450, 25, term255378);
        setElement(term255450, 27, term255378);
        setElement(term255450, 29, term255378);
        setElement(term255450, 31, term255378);
        setElement(term255450, 33, term255378);
        setElement(term255450, 35, term255378);
        setElement(term255450, 37, term255378);
        setElement(term255450, 39, term255378);
        setField(term255405, term255405.getClass(), "wallOffsets", term255450);
        setField(term255405, term255405.getClass(), "lastRules", term255451);
        setField(term255452, term255452.getClass(), "table", null);
        setField(term255452, term255452.getClass(), "nextTable", null);
        setLongField(term255452, term255452.getClass(), "baseCount", 0L);
        setIntField(term255452, term255452.getClass(), "sizeCtl", 0);
        setIntField(term255452, term255452.getClass(), "transferIndex", 0);
        setIntField(term255452, term255452.getClass(), "cellsBusy", 0);
        setField(term255452, term255452.getClass(), "counterCells", null);
        setField(term255452, term255452.getClass(), "keySet", null);
        setField(term255452, term255452.getClass(), "values", null);
        setField(term255452, term255452.getClass(), "entrySet", null);
        setField(term255452, term255452.getClass(), "keySet", null);
        setField(term255452, term255452.getClass(), "values", null);
        setField(term255405, term255405.getClass(), "lastRulesCache", term255452);
        setField(term255388, term255388.getClass(), "rules", term255405);
        setField(term255367, term255367.getClass(), "zone", term255388);
        setField(term255277, term255277.getClass(), "time_stamp", term255367);
        setField(term255277, term255277.getClass(), "start_up_mode", "CZksebZXsC");
        setField(term255277, term255277.getClass(), "cmm_dly_mod", "NDTlULiAEp");
        setField(term255277, term255277.getClass(), "cmm_dly_sec", "KakVHGlMtc");
        setField(term255277, term255277.getClass(), "cmm_err_mod", "XQkRBflDak");
        setField(term255277, term255277.getClass(), "country_code", "UXtNgOITuj");
        setField(term255277, term255277.getClass(), "region_code", "NpmLmrGTHj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_idx", argTypes, term255277, args);
    }

};


