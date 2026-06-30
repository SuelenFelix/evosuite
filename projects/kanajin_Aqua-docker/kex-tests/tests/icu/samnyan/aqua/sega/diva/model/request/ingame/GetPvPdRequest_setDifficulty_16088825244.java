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
import java.lang.Integer;

public class GetPvPdRequest_setDifficulty_16088825244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272165;
     Object term272415;

    public GetPvPdRequest_setDifficulty_16088825244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272165 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term272168 = (int[]) newIntArray(0);
        Object term272253 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term272254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272264 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term272274 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term272291 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term272292 = (long[]) newLongArray(1);
        Object[] term272294 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term272295 = (long[]) newLongArray(39);
        Object[] term272335 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term272336 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term272337 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term272338 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term272165, term272165.getClass(), "pd_id", 1325309111);
        setIntField(term272165, term272165.getClass(), "difficulty", -134252346);
        setField(term272165, term272165.getClass(), "pd_pv_id_lst", term272168);
        setField(term272165, term272165.getClass(), "cmd", "HSQaALDFNu");
        setField(term272165, term272165.getClass(), "req_id", "aOaXBQyJal");
        setField(term272165, term272165.getClass(), "game_id", "vRbigVGnNS");
        setField(term272165, term272165.getClass(), "r_ver", "bVteGrLeFP");
        setField(term272165, term272165.getClass(), "kc_serial", "LLVxzGZuym");
        setField(term272165, term272165.getClass(), "b_serial", "FHWZKmPKlK");
        setField(term272165, term272165.getClass(), "place_id", "MqWvZIWxCr");
        setIntField(term272255, term272255.getClass(), "year", 2015);
        setShortField(term272255, term272255.getClass(), "month", (short) 1);
        setShortField(term272255, term272255.getClass(), "day", (short) 7);
        setField(term272254, term272254.getClass(), "date", term272255);
        setByteField(term272259, term272259.getClass(), "hour", (byte) 10);
        setByteField(term272259, term272259.getClass(), "minute", (byte) 8);
        setByteField(term272259, term272259.getClass(), "second", (byte) 31);
        setIntField(term272259, term272259.getClass(), "nano", 617142943);
        setField(term272254, term272254.getClass(), "time", term272259);
        setField(term272253, term272253.getClass(), "dateTime", term272254);
        setIntField(term272264, term272264.getClass(), "totalSeconds", -10800);
        setField(term272264, term272264.getClass(), "id", "-03:00");
        setField(term272253, term272253.getClass(), "offset", term272264);
        setField(term272274, term272274.getClass(), "id", "America/Recife");
        setLongElement(term272292, 0, -1767217224L);
        setField(term272291, term272291.getClass(), "standardTransitions", term272292);
        setElement(term272294, 1, term272264);
        setField(term272291, term272291.getClass(), "standardOffsets", term272294);
        setLongElement(term272295, 0, -1767217224L);
        setLongElement(term272295, 1, -1206957600L);
        setLongElement(term272295, 2, -1191362400L);
        setLongElement(term272295, 3, -1175374800L);
        setLongElement(term272295, 4, -1159826400L);
        setLongElement(term272295, 5, -633819600L);
        setLongElement(term272295, 6, -622069200L);
        setLongElement(term272295, 7, -602283600L);
        setLongElement(term272295, 8, -591832800L);
        setLongElement(term272295, 9, -570747600L);
        setLongElement(term272295, 10, -560210400L);
        setLongElement(term272295, 11, -539125200L);
        setLongElement(term272295, 12, -531352800L);
        setLongElement(term272295, 13, -191365200L);
        setLongElement(term272295, 14, -184197600L);
        setLongElement(term272295, 15, -155163600L);
        setLongElement(term272295, 16, -150069600L);
        setLongElement(term272295, 17, -128898000L);
        setLongElement(term272295, 18, -121125600L);
        setLongElement(term272295, 19, -99954000L);
        setLongElement(term272295, 20, -89589600L);
        setLongElement(term272295, 21, -68418000L);
        setLongElement(term272295, 22, -57967200L);
        setLongElement(term272295, 23, 499748400L);
        setLongElement(term272295, 24, 511236000L);
        setLongElement(term272295, 25, 530593200L);
        setLongElement(term272295, 26, 540266400L);
        setLongElement(term272295, 27, 562129200L);
        setLongElement(term272295, 28, 571197600L);
        setLongElement(term272295, 29, 592974000L);
        setLongElement(term272295, 30, 602042400L);
        setLongElement(term272295, 31, 624423600L);
        setLongElement(term272295, 32, 634701600L);
        setLongElement(term272295, 33, 938919600L);
        setLongElement(term272295, 34, 951616800L);
        setLongElement(term272295, 35, 970974000L);
        setLongElement(term272295, 36, 971575200L);
        setLongElement(term272295, 37, 1003028400L);
        setLongElement(term272295, 38, 1013911200L);
        setField(term272291, term272291.getClass(), "savingsInstantTransitions", term272295);
        setField(term272291, term272291.getClass(), "savingsLocalTransitions", term272335);
        setElement(term272336, 1, term272264);
        setElement(term272336, 3, term272264);
        setElement(term272336, 5, term272264);
        setElement(term272336, 7, term272264);
        setElement(term272336, 9, term272264);
        setElement(term272336, 11, term272264);
        setElement(term272336, 13, term272264);
        setElement(term272336, 15, term272264);
        setElement(term272336, 17, term272264);
        setElement(term272336, 19, term272264);
        setElement(term272336, 21, term272264);
        setElement(term272336, 23, term272264);
        setElement(term272336, 25, term272264);
        setElement(term272336, 27, term272264);
        setElement(term272336, 29, term272264);
        setElement(term272336, 31, term272264);
        setElement(term272336, 33, term272264);
        setElement(term272336, 35, term272264);
        setElement(term272336, 37, term272264);
        setElement(term272336, 39, term272264);
        setField(term272291, term272291.getClass(), "wallOffsets", term272336);
        setField(term272291, term272291.getClass(), "lastRules", term272337);
        setField(term272338, term272338.getClass(), "table", null);
        setField(term272338, term272338.getClass(), "nextTable", null);
        setLongField(term272338, term272338.getClass(), "baseCount", 0L);
        setIntField(term272338, term272338.getClass(), "sizeCtl", 0);
        setIntField(term272338, term272338.getClass(), "transferIndex", 0);
        setIntField(term272338, term272338.getClass(), "cellsBusy", 0);
        setField(term272338, term272338.getClass(), "counterCells", null);
        setField(term272338, term272338.getClass(), "keySet", null);
        setField(term272338, term272338.getClass(), "values", null);
        setField(term272338, term272338.getClass(), "entrySet", null);
        setField(term272338, term272338.getClass(), "keySet", null);
        setField(term272338, term272338.getClass(), "values", null);
        setField(term272291, term272291.getClass(), "lastRulesCache", term272338);
        setField(term272274, term272274.getClass(), "rules", term272291);
        setField(term272253, term272253.getClass(), "zone", term272274);
        setField(term272165, term272165.getClass(), "time_stamp", term272253);
        setField(term272165, term272165.getClass(), "start_up_mode", "iiMXpaWLIH");
        setField(term272165, term272165.getClass(), "cmm_dly_mod", "MqMDTdIpYR");
        setField(term272165, term272165.getClass(), "cmm_dly_sec", "uuwidsQbSs");
        setField(term272165, term272165.getClass(), "cmm_err_mod", "rXLmNRoJfU");
        setField(term272165, term272165.getClass(), "country_code", "dWaVZloZWE");
        setField(term272165, term272165.getClass(), "region_code", "vgZFgEliKc");
        term272415 = new Integer(1047097529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term272415;
        callMethod(klass, "setDifficulty", argTypes, term272165, args);
    }

};


