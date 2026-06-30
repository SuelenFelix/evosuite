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

public class PreStartRequest_getMmuid_16801202473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11202;

    public PreStartRequest_getMmuid_16801202473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11202 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term11373 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term11374 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term11375 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11379 = newInstance(Class.forName("java.time.LocalTime"));
        Object term11384 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term11394 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term11411 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term11412 = (long[]) newLongArray(1);
        Object[] term11414 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term11415 = (long[]) newLongArray(39);
        Object[] term11455 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term11456 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term11457 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term11458 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term11202, term11202.getClass(), "pmm", "nRvKihUSPj");
        setField(term11202, term11202.getClass(), "idm", "BbNeQJpYPr");
        setField(term11202, term11202.getClass(), "mmgameid", "riMtzCoxNj");
        setField(term11202, term11202.getClass(), "mmuid", "YAXkVjQZcV");
        setField(term11202, term11202.getClass(), "a_code", "pumvwBWvpy");
        setIntField(term11202, term11202.getClass(), "aime_id", -1070592289);
        setField(term11202, term11202.getClass(), "aime_a_code", "HwLHeGLyhe");
        setField(term11202, term11202.getClass(), "key_obj_type", "RDnkgWkcbz");
        setBooleanField(term11202, term11202.getClass(), "exec_vu", false);
        setField(term11202, term11202.getClass(), "cmd", "IBpaxltauX");
        setField(term11202, term11202.getClass(), "req_id", "hePqROaplw");
        setField(term11202, term11202.getClass(), "game_id", "PJcSNDruWd");
        setField(term11202, term11202.getClass(), "r_ver", "VVNNlAePXF");
        setField(term11202, term11202.getClass(), "kc_serial", "jnwVnmKAFv");
        setField(term11202, term11202.getClass(), "b_serial", "TXyHhqeCjR");
        setField(term11202, term11202.getClass(), "place_id", "lZIgPZPgTu");
        setIntField(term11375, term11375.getClass(), "year", 2027);
        setShortField(term11375, term11375.getClass(), "month", (short) 8);
        setShortField(term11375, term11375.getClass(), "day", (short) 26);
        setField(term11374, term11374.getClass(), "date", term11375);
        setByteField(term11379, term11379.getClass(), "hour", (byte) 5);
        setByteField(term11379, term11379.getClass(), "minute", (byte) 11);
        setByteField(term11379, term11379.getClass(), "second", (byte) 9);
        setIntField(term11379, term11379.getClass(), "nano", 219245092);
        setField(term11374, term11374.getClass(), "time", term11379);
        setField(term11373, term11373.getClass(), "dateTime", term11374);
        setIntField(term11384, term11384.getClass(), "totalSeconds", -10800);
        setField(term11384, term11384.getClass(), "id", "-03:00");
        setField(term11373, term11373.getClass(), "offset", term11384);
        setField(term11394, term11394.getClass(), "id", "America/Recife");
        setLongElement(term11412, 0, -1767217224L);
        setField(term11411, term11411.getClass(), "standardTransitions", term11412);
        setElement(term11414, 1, term11384);
        setField(term11411, term11411.getClass(), "standardOffsets", term11414);
        setLongElement(term11415, 0, -1767217224L);
        setLongElement(term11415, 1, -1206957600L);
        setLongElement(term11415, 2, -1191362400L);
        setLongElement(term11415, 3, -1175374800L);
        setLongElement(term11415, 4, -1159826400L);
        setLongElement(term11415, 5, -633819600L);
        setLongElement(term11415, 6, -622069200L);
        setLongElement(term11415, 7, -602283600L);
        setLongElement(term11415, 8, -591832800L);
        setLongElement(term11415, 9, -570747600L);
        setLongElement(term11415, 10, -560210400L);
        setLongElement(term11415, 11, -539125200L);
        setLongElement(term11415, 12, -531352800L);
        setLongElement(term11415, 13, -191365200L);
        setLongElement(term11415, 14, -184197600L);
        setLongElement(term11415, 15, -155163600L);
        setLongElement(term11415, 16, -150069600L);
        setLongElement(term11415, 17, -128898000L);
        setLongElement(term11415, 18, -121125600L);
        setLongElement(term11415, 19, -99954000L);
        setLongElement(term11415, 20, -89589600L);
        setLongElement(term11415, 21, -68418000L);
        setLongElement(term11415, 22, -57967200L);
        setLongElement(term11415, 23, 499748400L);
        setLongElement(term11415, 24, 511236000L);
        setLongElement(term11415, 25, 530593200L);
        setLongElement(term11415, 26, 540266400L);
        setLongElement(term11415, 27, 562129200L);
        setLongElement(term11415, 28, 571197600L);
        setLongElement(term11415, 29, 592974000L);
        setLongElement(term11415, 30, 602042400L);
        setLongElement(term11415, 31, 624423600L);
        setLongElement(term11415, 32, 634701600L);
        setLongElement(term11415, 33, 938919600L);
        setLongElement(term11415, 34, 951616800L);
        setLongElement(term11415, 35, 970974000L);
        setLongElement(term11415, 36, 971575200L);
        setLongElement(term11415, 37, 1003028400L);
        setLongElement(term11415, 38, 1013911200L);
        setField(term11411, term11411.getClass(), "savingsInstantTransitions", term11415);
        setField(term11411, term11411.getClass(), "savingsLocalTransitions", term11455);
        setElement(term11456, 1, term11384);
        setElement(term11456, 3, term11384);
        setElement(term11456, 5, term11384);
        setElement(term11456, 7, term11384);
        setElement(term11456, 9, term11384);
        setElement(term11456, 11, term11384);
        setElement(term11456, 13, term11384);
        setElement(term11456, 15, term11384);
        setElement(term11456, 17, term11384);
        setElement(term11456, 19, term11384);
        setElement(term11456, 21, term11384);
        setElement(term11456, 23, term11384);
        setElement(term11456, 25, term11384);
        setElement(term11456, 27, term11384);
        setElement(term11456, 29, term11384);
        setElement(term11456, 31, term11384);
        setElement(term11456, 33, term11384);
        setElement(term11456, 35, term11384);
        setElement(term11456, 37, term11384);
        setElement(term11456, 39, term11384);
        setField(term11411, term11411.getClass(), "wallOffsets", term11456);
        setField(term11411, term11411.getClass(), "lastRules", term11457);
        setField(term11458, term11458.getClass(), "table", null);
        setField(term11458, term11458.getClass(), "nextTable", null);
        setLongField(term11458, term11458.getClass(), "baseCount", 0L);
        setIntField(term11458, term11458.getClass(), "sizeCtl", 0);
        setIntField(term11458, term11458.getClass(), "transferIndex", 0);
        setIntField(term11458, term11458.getClass(), "cellsBusy", 0);
        setField(term11458, term11458.getClass(), "counterCells", null);
        setField(term11458, term11458.getClass(), "keySet", null);
        setField(term11458, term11458.getClass(), "values", null);
        setField(term11458, term11458.getClass(), "entrySet", null);
        setField(term11458, term11458.getClass(), "keySet", null);
        setField(term11458, term11458.getClass(), "values", null);
        setField(term11411, term11411.getClass(), "lastRulesCache", term11458);
        setField(term11394, term11394.getClass(), "rules", term11411);
        setField(term11373, term11373.getClass(), "zone", term11394);
        setField(term11202, term11202.getClass(), "time_stamp", term11373);
        setField(term11202, term11202.getClass(), "start_up_mode", "iuCxnHGMoW");
        setField(term11202, term11202.getClass(), "cmm_dly_mod", "GPSEWEDSTo");
        setField(term11202, term11202.getClass(), "cmm_dly_sec", "RCOqfVsRHt");
        setField(term11202, term11202.getClass(), "cmm_err_mod", "TSyCeEZPaT");
        setField(term11202, term11202.getClass(), "country_code", "JeZFtaqkzW");
        setField(term11202, term11202.getClass(), "region_code", "vOVuNSCCLe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMmuid", argTypes, term11202, args);
    }

};


