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

public class PreStartRequest_setMmuid_210378866312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16605;

    public PreStartRequest_setMmuid_210378866312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16605 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest"));
        Object term16776 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term16777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16782 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16787 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term16797 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term16814 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term16815 = (long[]) newLongArray(1);
        Object[] term16817 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term16818 = (long[]) newLongArray(39);
        Object[] term16858 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term16859 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term16860 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term16861 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term16605, term16605.getClass(), "pmm", "IlBhdrCvHq");
        setField(term16605, term16605.getClass(), "idm", "OirVUQhauU");
        setField(term16605, term16605.getClass(), "mmgameid", "GLbyDfbNZI");
        setField(term16605, term16605.getClass(), "mmuid", "oNLcCYDAsO");
        setField(term16605, term16605.getClass(), "a_code", "CNqMxLvtcJ");
        setIntField(term16605, term16605.getClass(), "aime_id", -49052672);
        setField(term16605, term16605.getClass(), "aime_a_code", "ktbqerIaKW");
        setField(term16605, term16605.getClass(), "key_obj_type", "VoghngXfsK");
        setBooleanField(term16605, term16605.getClass(), "exec_vu", false);
        setField(term16605, term16605.getClass(), "cmd", "GbahCBMvct");
        setField(term16605, term16605.getClass(), "req_id", "iiHBhsNFgk");
        setField(term16605, term16605.getClass(), "game_id", "HknsTajwxJ");
        setField(term16605, term16605.getClass(), "r_ver", "XtiurrVYKw");
        setField(term16605, term16605.getClass(), "kc_serial", "rsumfoDNHa");
        setField(term16605, term16605.getClass(), "b_serial", "ceCWHUTQUM");
        setField(term16605, term16605.getClass(), "place_id", "LrqwfrKKtS");
        setIntField(term16778, term16778.getClass(), "year", 2012);
        setShortField(term16778, term16778.getClass(), "month", (short) 3);
        setShortField(term16778, term16778.getClass(), "day", (short) 27);
        setField(term16777, term16777.getClass(), "date", term16778);
        setByteField(term16782, term16782.getClass(), "hour", (byte) 17);
        setByteField(term16782, term16782.getClass(), "minute", (byte) 49);
        setByteField(term16782, term16782.getClass(), "second", (byte) 24);
        setIntField(term16782, term16782.getClass(), "nano", 530647398);
        setField(term16777, term16777.getClass(), "time", term16782);
        setField(term16776, term16776.getClass(), "dateTime", term16777);
        setIntField(term16787, term16787.getClass(), "totalSeconds", -10800);
        setField(term16787, term16787.getClass(), "id", "-03:00");
        setField(term16776, term16776.getClass(), "offset", term16787);
        setField(term16797, term16797.getClass(), "id", "America/Recife");
        setLongElement(term16815, 0, -1767217224L);
        setField(term16814, term16814.getClass(), "standardTransitions", term16815);
        setElement(term16817, 1, term16787);
        setField(term16814, term16814.getClass(), "standardOffsets", term16817);
        setLongElement(term16818, 0, -1767217224L);
        setLongElement(term16818, 1, -1206957600L);
        setLongElement(term16818, 2, -1191362400L);
        setLongElement(term16818, 3, -1175374800L);
        setLongElement(term16818, 4, -1159826400L);
        setLongElement(term16818, 5, -633819600L);
        setLongElement(term16818, 6, -622069200L);
        setLongElement(term16818, 7, -602283600L);
        setLongElement(term16818, 8, -591832800L);
        setLongElement(term16818, 9, -570747600L);
        setLongElement(term16818, 10, -560210400L);
        setLongElement(term16818, 11, -539125200L);
        setLongElement(term16818, 12, -531352800L);
        setLongElement(term16818, 13, -191365200L);
        setLongElement(term16818, 14, -184197600L);
        setLongElement(term16818, 15, -155163600L);
        setLongElement(term16818, 16, -150069600L);
        setLongElement(term16818, 17, -128898000L);
        setLongElement(term16818, 18, -121125600L);
        setLongElement(term16818, 19, -99954000L);
        setLongElement(term16818, 20, -89589600L);
        setLongElement(term16818, 21, -68418000L);
        setLongElement(term16818, 22, -57967200L);
        setLongElement(term16818, 23, 499748400L);
        setLongElement(term16818, 24, 511236000L);
        setLongElement(term16818, 25, 530593200L);
        setLongElement(term16818, 26, 540266400L);
        setLongElement(term16818, 27, 562129200L);
        setLongElement(term16818, 28, 571197600L);
        setLongElement(term16818, 29, 592974000L);
        setLongElement(term16818, 30, 602042400L);
        setLongElement(term16818, 31, 624423600L);
        setLongElement(term16818, 32, 634701600L);
        setLongElement(term16818, 33, 938919600L);
        setLongElement(term16818, 34, 951616800L);
        setLongElement(term16818, 35, 970974000L);
        setLongElement(term16818, 36, 971575200L);
        setLongElement(term16818, 37, 1003028400L);
        setLongElement(term16818, 38, 1013911200L);
        setField(term16814, term16814.getClass(), "savingsInstantTransitions", term16818);
        setField(term16814, term16814.getClass(), "savingsLocalTransitions", term16858);
        setElement(term16859, 1, term16787);
        setElement(term16859, 3, term16787);
        setElement(term16859, 5, term16787);
        setElement(term16859, 7, term16787);
        setElement(term16859, 9, term16787);
        setElement(term16859, 11, term16787);
        setElement(term16859, 13, term16787);
        setElement(term16859, 15, term16787);
        setElement(term16859, 17, term16787);
        setElement(term16859, 19, term16787);
        setElement(term16859, 21, term16787);
        setElement(term16859, 23, term16787);
        setElement(term16859, 25, term16787);
        setElement(term16859, 27, term16787);
        setElement(term16859, 29, term16787);
        setElement(term16859, 31, term16787);
        setElement(term16859, 33, term16787);
        setElement(term16859, 35, term16787);
        setElement(term16859, 37, term16787);
        setElement(term16859, 39, term16787);
        setField(term16814, term16814.getClass(), "wallOffsets", term16859);
        setField(term16814, term16814.getClass(), "lastRules", term16860);
        setField(term16861, term16861.getClass(), "table", null);
        setField(term16861, term16861.getClass(), "nextTable", null);
        setLongField(term16861, term16861.getClass(), "baseCount", 0L);
        setIntField(term16861, term16861.getClass(), "sizeCtl", 0);
        setIntField(term16861, term16861.getClass(), "transferIndex", 0);
        setIntField(term16861, term16861.getClass(), "cellsBusy", 0);
        setField(term16861, term16861.getClass(), "counterCells", null);
        setField(term16861, term16861.getClass(), "keySet", null);
        setField(term16861, term16861.getClass(), "values", null);
        setField(term16861, term16861.getClass(), "entrySet", null);
        setField(term16861, term16861.getClass(), "keySet", null);
        setField(term16861, term16861.getClass(), "values", null);
        setField(term16814, term16814.getClass(), "lastRulesCache", term16861);
        setField(term16797, term16797.getClass(), "rules", term16814);
        setField(term16776, term16776.getClass(), "zone", term16797);
        setField(term16605, term16605.getClass(), "time_stamp", term16776);
        setField(term16605, term16605.getClass(), "start_up_mode", "ZUdnQXfzCI");
        setField(term16605, term16605.getClass(), "cmm_dly_mod", "EULDrUNQvw");
        setField(term16605, term16605.getClass(), "cmm_dly_sec", "BtvAvsJSei");
        setField(term16605, term16605.getClass(), "cmm_err_mod", "vqnBkkxoIa");
        setField(term16605, term16605.getClass(), "country_code", "bycpZjxXFn");
        setField(term16605, term16605.getClass(), "region_code", "jQWttOAiwL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.user.PreStartRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DzKFxEuEEC";
        callMethod(klass, "setMmuid", argTypes, term16605, args);
    }

};


