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

public class StoreSsRequest_getSsselpvid_5807867123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247647;

    public StoreSsRequest_getSsselpvid_5807867123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247647 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term247663 = (int[]) newIntArray(1);
        int[] term247665 = (int[]) newIntArray(5);
        int[] term247671 = (int[]) newIntArray(1);
        int[] term247673 = (int[]) newIntArray(6);
        Object term247764 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term247765 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247770 = newInstance(Class.forName("java.time.LocalTime"));
        Object term247775 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term247785 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term247802 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term247803 = (long[]) newLongArray(1);
        Object[] term247805 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term247806 = (long[]) newLongArray(39);
        Object[] term247846 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term247847 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term247848 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term247849 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term247647, term247647.getClass(), "pd_id", 1184348067);
        setField(term247647, term247647.getClass(), "ss_dat_id", "RKrTOHCtIL");
        setIntField(term247647, term247647.getClass(), "ss_pv_id", 1496887439);
        setIntField(term247647, term247647.getClass(), "ss_sel_pv_id", -1194342123);
        setIntElement(term247663, 0, -909951361);
        setField(term247647, term247647.getClass(), "ss_mdl_id", term247663);
        setIntElement(term247665, 0, 2023331958);
        setIntElement(term247665, 1, -2067993337);
        setIntElement(term247665, 2, -670710633);
        setIntElement(term247665, 3, 172079406);
        setIntElement(term247665, 4, -1127103475);
        setField(term247647, term247647.getClass(), "ss_sel_mdl_id", term247665);
        setIntElement(term247671, 0, -449114402);
        setField(term247647, term247647.getClass(), "ss_c_itm_id", term247671);
        setIntElement(term247673, 0, -876558706);
        setIntElement(term247673, 1, -1567142246);
        setIntElement(term247673, 2, -724984389);
        setIntElement(term247673, 3, 499424769);
        setIntElement(term247673, 4, 953108205);
        setIntElement(term247673, 5, 1762759179);
        setField(term247647, term247647.getClass(), "ss_pxl_sz", term247673);
        setField(term247647, term247647.getClass(), "cmd", "weKhJGqEfg");
        setField(term247647, term247647.getClass(), "req_id", "TLUMeWJCRR");
        setField(term247647, term247647.getClass(), "game_id", "TuVnFrfwDO");
        setField(term247647, term247647.getClass(), "r_ver", "HLaksjKQLu");
        setField(term247647, term247647.getClass(), "kc_serial", "tUmAYoRjRt");
        setField(term247647, term247647.getClass(), "b_serial", "BAADpSzVyH");
        setField(term247647, term247647.getClass(), "place_id", "PWiSQlucVO");
        setIntField(term247766, term247766.getClass(), "year", 2018);
        setShortField(term247766, term247766.getClass(), "month", (short) 11);
        setShortField(term247766, term247766.getClass(), "day", (short) 11);
        setField(term247765, term247765.getClass(), "date", term247766);
        setByteField(term247770, term247770.getClass(), "hour", (byte) 11);
        setByteField(term247770, term247770.getClass(), "minute", (byte) 30);
        setByteField(term247770, term247770.getClass(), "second", (byte) 33);
        setIntField(term247770, term247770.getClass(), "nano", 101261443);
        setField(term247765, term247765.getClass(), "time", term247770);
        setField(term247764, term247764.getClass(), "dateTime", term247765);
        setIntField(term247775, term247775.getClass(), "totalSeconds", -10800);
        setField(term247775, term247775.getClass(), "id", "-03:00");
        setField(term247764, term247764.getClass(), "offset", term247775);
        setField(term247785, term247785.getClass(), "id", "America/Recife");
        setLongElement(term247803, 0, -1767217224L);
        setField(term247802, term247802.getClass(), "standardTransitions", term247803);
        setElement(term247805, 1, term247775);
        setField(term247802, term247802.getClass(), "standardOffsets", term247805);
        setLongElement(term247806, 0, -1767217224L);
        setLongElement(term247806, 1, -1206957600L);
        setLongElement(term247806, 2, -1191362400L);
        setLongElement(term247806, 3, -1175374800L);
        setLongElement(term247806, 4, -1159826400L);
        setLongElement(term247806, 5, -633819600L);
        setLongElement(term247806, 6, -622069200L);
        setLongElement(term247806, 7, -602283600L);
        setLongElement(term247806, 8, -591832800L);
        setLongElement(term247806, 9, -570747600L);
        setLongElement(term247806, 10, -560210400L);
        setLongElement(term247806, 11, -539125200L);
        setLongElement(term247806, 12, -531352800L);
        setLongElement(term247806, 13, -191365200L);
        setLongElement(term247806, 14, -184197600L);
        setLongElement(term247806, 15, -155163600L);
        setLongElement(term247806, 16, -150069600L);
        setLongElement(term247806, 17, -128898000L);
        setLongElement(term247806, 18, -121125600L);
        setLongElement(term247806, 19, -99954000L);
        setLongElement(term247806, 20, -89589600L);
        setLongElement(term247806, 21, -68418000L);
        setLongElement(term247806, 22, -57967200L);
        setLongElement(term247806, 23, 499748400L);
        setLongElement(term247806, 24, 511236000L);
        setLongElement(term247806, 25, 530593200L);
        setLongElement(term247806, 26, 540266400L);
        setLongElement(term247806, 27, 562129200L);
        setLongElement(term247806, 28, 571197600L);
        setLongElement(term247806, 29, 592974000L);
        setLongElement(term247806, 30, 602042400L);
        setLongElement(term247806, 31, 624423600L);
        setLongElement(term247806, 32, 634701600L);
        setLongElement(term247806, 33, 938919600L);
        setLongElement(term247806, 34, 951616800L);
        setLongElement(term247806, 35, 970974000L);
        setLongElement(term247806, 36, 971575200L);
        setLongElement(term247806, 37, 1003028400L);
        setLongElement(term247806, 38, 1013911200L);
        setField(term247802, term247802.getClass(), "savingsInstantTransitions", term247806);
        setField(term247802, term247802.getClass(), "savingsLocalTransitions", term247846);
        setElement(term247847, 1, term247775);
        setElement(term247847, 3, term247775);
        setElement(term247847, 5, term247775);
        setElement(term247847, 7, term247775);
        setElement(term247847, 9, term247775);
        setElement(term247847, 11, term247775);
        setElement(term247847, 13, term247775);
        setElement(term247847, 15, term247775);
        setElement(term247847, 17, term247775);
        setElement(term247847, 19, term247775);
        setElement(term247847, 21, term247775);
        setElement(term247847, 23, term247775);
        setElement(term247847, 25, term247775);
        setElement(term247847, 27, term247775);
        setElement(term247847, 29, term247775);
        setElement(term247847, 31, term247775);
        setElement(term247847, 33, term247775);
        setElement(term247847, 35, term247775);
        setElement(term247847, 37, term247775);
        setElement(term247847, 39, term247775);
        setField(term247802, term247802.getClass(), "wallOffsets", term247847);
        setField(term247802, term247802.getClass(), "lastRules", term247848);
        setField(term247849, term247849.getClass(), "table", null);
        setField(term247849, term247849.getClass(), "nextTable", null);
        setLongField(term247849, term247849.getClass(), "baseCount", 0L);
        setIntField(term247849, term247849.getClass(), "sizeCtl", 0);
        setIntField(term247849, term247849.getClass(), "transferIndex", 0);
        setIntField(term247849, term247849.getClass(), "cellsBusy", 0);
        setField(term247849, term247849.getClass(), "counterCells", null);
        setField(term247849, term247849.getClass(), "keySet", null);
        setField(term247849, term247849.getClass(), "values", null);
        setField(term247849, term247849.getClass(), "entrySet", null);
        setField(term247849, term247849.getClass(), "keySet", null);
        setField(term247849, term247849.getClass(), "values", null);
        setField(term247802, term247802.getClass(), "lastRulesCache", term247849);
        setField(term247785, term247785.getClass(), "rules", term247802);
        setField(term247764, term247764.getClass(), "zone", term247785);
        setField(term247647, term247647.getClass(), "time_stamp", term247764);
        setField(term247647, term247647.getClass(), "start_up_mode", "SkAkmjxoiu");
        setField(term247647, term247647.getClass(), "cmm_dly_mod", "nQyRXiYkyU");
        setField(term247647, term247647.getClass(), "cmm_dly_sec", "kpNIadQEnq");
        setField(term247647, term247647.getClass(), "cmm_err_mod", "sLWXiUGWKR");
        setField(term247647, term247647.getClass(), "country_code", "aSBloErOPY");
        setField(term247647, term247647.getClass(), "region_code", "ItfmeAXEYy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_sel_pv_id", argTypes, term247647, args);
    }

};


