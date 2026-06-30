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

public class GetPvPdRequest_setPdid_8888573873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271713;
     Object term271968;

    public GetPvPdRequest_setPdid_8888573873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271713 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term271716 = (int[]) newIntArray(5);
        Object term271806 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term271807 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271808 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271812 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271817 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term271827 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term271844 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term271845 = (long[]) newLongArray(1);
        Object[] term271847 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term271848 = (long[]) newLongArray(39);
        Object[] term271888 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term271889 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term271890 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term271891 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term271713, term271713.getClass(), "pd_id", -1902710853);
        setIntField(term271713, term271713.getClass(), "difficulty", -1178649204);
        setIntElement(term271716, 0, -1007879444);
        setIntElement(term271716, 1, 2045542020);
        setIntElement(term271716, 2, -227899706);
        setIntElement(term271716, 3, -103563245);
        setIntElement(term271716, 4, 455606937);
        setField(term271713, term271713.getClass(), "pd_pv_id_lst", term271716);
        setField(term271713, term271713.getClass(), "cmd", "mfxNrcSOVD");
        setField(term271713, term271713.getClass(), "req_id", "jrsTEswExz");
        setField(term271713, term271713.getClass(), "game_id", "ZQJeRspiaW");
        setField(term271713, term271713.getClass(), "r_ver", "ZPHvVTleEx");
        setField(term271713, term271713.getClass(), "kc_serial", "HTaevTdmSx");
        setField(term271713, term271713.getClass(), "b_serial", "fxACzuCTdG");
        setField(term271713, term271713.getClass(), "place_id", "ZbjykDvTqF");
        setIntField(term271808, term271808.getClass(), "year", 2025);
        setShortField(term271808, term271808.getClass(), "month", (short) 6);
        setShortField(term271808, term271808.getClass(), "day", (short) 18);
        setField(term271807, term271807.getClass(), "date", term271808);
        setByteField(term271812, term271812.getClass(), "hour", (byte) 14);
        setByteField(term271812, term271812.getClass(), "minute", (byte) 17);
        setByteField(term271812, term271812.getClass(), "second", (byte) 34);
        setIntField(term271812, term271812.getClass(), "nano", 564527758);
        setField(term271807, term271807.getClass(), "time", term271812);
        setField(term271806, term271806.getClass(), "dateTime", term271807);
        setIntField(term271817, term271817.getClass(), "totalSeconds", -10800);
        setField(term271817, term271817.getClass(), "id", "-03:00");
        setField(term271806, term271806.getClass(), "offset", term271817);
        setField(term271827, term271827.getClass(), "id", "America/Recife");
        setLongElement(term271845, 0, -1767217224L);
        setField(term271844, term271844.getClass(), "standardTransitions", term271845);
        setElement(term271847, 1, term271817);
        setField(term271844, term271844.getClass(), "standardOffsets", term271847);
        setLongElement(term271848, 0, -1767217224L);
        setLongElement(term271848, 1, -1206957600L);
        setLongElement(term271848, 2, -1191362400L);
        setLongElement(term271848, 3, -1175374800L);
        setLongElement(term271848, 4, -1159826400L);
        setLongElement(term271848, 5, -633819600L);
        setLongElement(term271848, 6, -622069200L);
        setLongElement(term271848, 7, -602283600L);
        setLongElement(term271848, 8, -591832800L);
        setLongElement(term271848, 9, -570747600L);
        setLongElement(term271848, 10, -560210400L);
        setLongElement(term271848, 11, -539125200L);
        setLongElement(term271848, 12, -531352800L);
        setLongElement(term271848, 13, -191365200L);
        setLongElement(term271848, 14, -184197600L);
        setLongElement(term271848, 15, -155163600L);
        setLongElement(term271848, 16, -150069600L);
        setLongElement(term271848, 17, -128898000L);
        setLongElement(term271848, 18, -121125600L);
        setLongElement(term271848, 19, -99954000L);
        setLongElement(term271848, 20, -89589600L);
        setLongElement(term271848, 21, -68418000L);
        setLongElement(term271848, 22, -57967200L);
        setLongElement(term271848, 23, 499748400L);
        setLongElement(term271848, 24, 511236000L);
        setLongElement(term271848, 25, 530593200L);
        setLongElement(term271848, 26, 540266400L);
        setLongElement(term271848, 27, 562129200L);
        setLongElement(term271848, 28, 571197600L);
        setLongElement(term271848, 29, 592974000L);
        setLongElement(term271848, 30, 602042400L);
        setLongElement(term271848, 31, 624423600L);
        setLongElement(term271848, 32, 634701600L);
        setLongElement(term271848, 33, 938919600L);
        setLongElement(term271848, 34, 951616800L);
        setLongElement(term271848, 35, 970974000L);
        setLongElement(term271848, 36, 971575200L);
        setLongElement(term271848, 37, 1003028400L);
        setLongElement(term271848, 38, 1013911200L);
        setField(term271844, term271844.getClass(), "savingsInstantTransitions", term271848);
        setField(term271844, term271844.getClass(), "savingsLocalTransitions", term271888);
        setElement(term271889, 1, term271817);
        setElement(term271889, 3, term271817);
        setElement(term271889, 5, term271817);
        setElement(term271889, 7, term271817);
        setElement(term271889, 9, term271817);
        setElement(term271889, 11, term271817);
        setElement(term271889, 13, term271817);
        setElement(term271889, 15, term271817);
        setElement(term271889, 17, term271817);
        setElement(term271889, 19, term271817);
        setElement(term271889, 21, term271817);
        setElement(term271889, 23, term271817);
        setElement(term271889, 25, term271817);
        setElement(term271889, 27, term271817);
        setElement(term271889, 29, term271817);
        setElement(term271889, 31, term271817);
        setElement(term271889, 33, term271817);
        setElement(term271889, 35, term271817);
        setElement(term271889, 37, term271817);
        setElement(term271889, 39, term271817);
        setField(term271844, term271844.getClass(), "wallOffsets", term271889);
        setField(term271844, term271844.getClass(), "lastRules", term271890);
        setField(term271891, term271891.getClass(), "table", null);
        setField(term271891, term271891.getClass(), "nextTable", null);
        setLongField(term271891, term271891.getClass(), "baseCount", 0L);
        setIntField(term271891, term271891.getClass(), "sizeCtl", 0);
        setIntField(term271891, term271891.getClass(), "transferIndex", 0);
        setIntField(term271891, term271891.getClass(), "cellsBusy", 0);
        setField(term271891, term271891.getClass(), "counterCells", null);
        setField(term271891, term271891.getClass(), "keySet", null);
        setField(term271891, term271891.getClass(), "values", null);
        setField(term271891, term271891.getClass(), "entrySet", null);
        setField(term271891, term271891.getClass(), "keySet", null);
        setField(term271891, term271891.getClass(), "values", null);
        setField(term271844, term271844.getClass(), "lastRulesCache", term271891);
        setField(term271827, term271827.getClass(), "rules", term271844);
        setField(term271806, term271806.getClass(), "zone", term271827);
        setField(term271713, term271713.getClass(), "time_stamp", term271806);
        setField(term271713, term271713.getClass(), "start_up_mode", "HmpRVfDNrn");
        setField(term271713, term271713.getClass(), "cmm_dly_mod", "PdGPETcyXN");
        setField(term271713, term271713.getClass(), "cmm_dly_sec", "rWXLyvesHI");
        setField(term271713, term271713.getClass(), "cmm_err_mod", "iRfJJNrMLZ");
        setField(term271713, term271713.getClass(), "country_code", "sYrnlJNHsq");
        setField(term271713, term271713.getClass(), "region_code", "POHTKvZAAU");
        term271968 = new Integer(1204368157);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term271968;
        callMethod(klass, "setPd_id", argTypes, term271713, args);
    }

};


