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

public class StoreSsRequest_getSsdatid_17937292931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term246639;

    public StoreSsRequest_getSsdatid_17937292931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term246639 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term246655 = (int[]) newIntArray(0);
        int[] term246656 = (int[]) newIntArray(3);
        int[] term246660 = (int[]) newIntArray(7);
        int[] term246668 = (int[]) newIntArray(5);
        Object term246758 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term246759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term246764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246769 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term246779 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term246796 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term246797 = (long[]) newLongArray(1);
        Object[] term246799 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term246800 = (long[]) newLongArray(39);
        Object[] term246840 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term246841 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term246842 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term246843 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term246639, term246639.getClass(), "pd_id", 1871538790);
        setField(term246639, term246639.getClass(), "ss_dat_id", "nmebweybpn");
        setIntField(term246639, term246639.getClass(), "ss_pv_id", -861943039);
        setIntField(term246639, term246639.getClass(), "ss_sel_pv_id", 1197112806);
        setField(term246639, term246639.getClass(), "ss_mdl_id", term246655);
        setIntElement(term246656, 0, -1432596771);
        setIntElement(term246656, 1, 2093452670);
        setIntElement(term246656, 2, 665110138);
        setField(term246639, term246639.getClass(), "ss_sel_mdl_id", term246656);
        setIntElement(term246660, 0, -1265798562);
        setIntElement(term246660, 1, 911238993);
        setIntElement(term246660, 2, 427838387);
        setIntElement(term246660, 3, -412463819);
        setIntElement(term246660, 4, 925587803);
        setIntElement(term246660, 5, 397150037);
        setIntElement(term246660, 6, -1342919009);
        setField(term246639, term246639.getClass(), "ss_c_itm_id", term246660);
        setIntElement(term246668, 0, 486514020);
        setIntElement(term246668, 1, -766988044);
        setIntElement(term246668, 2, -849140665);
        setIntElement(term246668, 3, -1630483943);
        setIntElement(term246668, 4, -1072985101);
        setField(term246639, term246639.getClass(), "ss_pxl_sz", term246668);
        setField(term246639, term246639.getClass(), "cmd", "rRiUyNVzoJ");
        setField(term246639, term246639.getClass(), "req_id", "IpeZajjVYM");
        setField(term246639, term246639.getClass(), "game_id", "ZZMugYyPLU");
        setField(term246639, term246639.getClass(), "r_ver", "UknzoUqzIv");
        setField(term246639, term246639.getClass(), "kc_serial", "xctmTnBQin");
        setField(term246639, term246639.getClass(), "b_serial", "MsvgumOnks");
        setField(term246639, term246639.getClass(), "place_id", "YMoZutGBzR");
        setIntField(term246760, term246760.getClass(), "year", 2021);
        setShortField(term246760, term246760.getClass(), "month", (short) 11);
        setShortField(term246760, term246760.getClass(), "day", (short) 12);
        setField(term246759, term246759.getClass(), "date", term246760);
        setByteField(term246764, term246764.getClass(), "hour", (byte) 0);
        setByteField(term246764, term246764.getClass(), "minute", (byte) 51);
        setByteField(term246764, term246764.getClass(), "second", (byte) 55);
        setIntField(term246764, term246764.getClass(), "nano", 745543124);
        setField(term246759, term246759.getClass(), "time", term246764);
        setField(term246758, term246758.getClass(), "dateTime", term246759);
        setIntField(term246769, term246769.getClass(), "totalSeconds", -10800);
        setField(term246769, term246769.getClass(), "id", "-03:00");
        setField(term246758, term246758.getClass(), "offset", term246769);
        setField(term246779, term246779.getClass(), "id", "America/Recife");
        setLongElement(term246797, 0, -1767217224L);
        setField(term246796, term246796.getClass(), "standardTransitions", term246797);
        setElement(term246799, 1, term246769);
        setField(term246796, term246796.getClass(), "standardOffsets", term246799);
        setLongElement(term246800, 0, -1767217224L);
        setLongElement(term246800, 1, -1206957600L);
        setLongElement(term246800, 2, -1191362400L);
        setLongElement(term246800, 3, -1175374800L);
        setLongElement(term246800, 4, -1159826400L);
        setLongElement(term246800, 5, -633819600L);
        setLongElement(term246800, 6, -622069200L);
        setLongElement(term246800, 7, -602283600L);
        setLongElement(term246800, 8, -591832800L);
        setLongElement(term246800, 9, -570747600L);
        setLongElement(term246800, 10, -560210400L);
        setLongElement(term246800, 11, -539125200L);
        setLongElement(term246800, 12, -531352800L);
        setLongElement(term246800, 13, -191365200L);
        setLongElement(term246800, 14, -184197600L);
        setLongElement(term246800, 15, -155163600L);
        setLongElement(term246800, 16, -150069600L);
        setLongElement(term246800, 17, -128898000L);
        setLongElement(term246800, 18, -121125600L);
        setLongElement(term246800, 19, -99954000L);
        setLongElement(term246800, 20, -89589600L);
        setLongElement(term246800, 21, -68418000L);
        setLongElement(term246800, 22, -57967200L);
        setLongElement(term246800, 23, 499748400L);
        setLongElement(term246800, 24, 511236000L);
        setLongElement(term246800, 25, 530593200L);
        setLongElement(term246800, 26, 540266400L);
        setLongElement(term246800, 27, 562129200L);
        setLongElement(term246800, 28, 571197600L);
        setLongElement(term246800, 29, 592974000L);
        setLongElement(term246800, 30, 602042400L);
        setLongElement(term246800, 31, 624423600L);
        setLongElement(term246800, 32, 634701600L);
        setLongElement(term246800, 33, 938919600L);
        setLongElement(term246800, 34, 951616800L);
        setLongElement(term246800, 35, 970974000L);
        setLongElement(term246800, 36, 971575200L);
        setLongElement(term246800, 37, 1003028400L);
        setLongElement(term246800, 38, 1013911200L);
        setField(term246796, term246796.getClass(), "savingsInstantTransitions", term246800);
        setField(term246796, term246796.getClass(), "savingsLocalTransitions", term246840);
        setElement(term246841, 1, term246769);
        setElement(term246841, 3, term246769);
        setElement(term246841, 5, term246769);
        setElement(term246841, 7, term246769);
        setElement(term246841, 9, term246769);
        setElement(term246841, 11, term246769);
        setElement(term246841, 13, term246769);
        setElement(term246841, 15, term246769);
        setElement(term246841, 17, term246769);
        setElement(term246841, 19, term246769);
        setElement(term246841, 21, term246769);
        setElement(term246841, 23, term246769);
        setElement(term246841, 25, term246769);
        setElement(term246841, 27, term246769);
        setElement(term246841, 29, term246769);
        setElement(term246841, 31, term246769);
        setElement(term246841, 33, term246769);
        setElement(term246841, 35, term246769);
        setElement(term246841, 37, term246769);
        setElement(term246841, 39, term246769);
        setField(term246796, term246796.getClass(), "wallOffsets", term246841);
        setField(term246796, term246796.getClass(), "lastRules", term246842);
        setField(term246843, term246843.getClass(), "table", null);
        setField(term246843, term246843.getClass(), "nextTable", null);
        setLongField(term246843, term246843.getClass(), "baseCount", 0L);
        setIntField(term246843, term246843.getClass(), "sizeCtl", 0);
        setIntField(term246843, term246843.getClass(), "transferIndex", 0);
        setIntField(term246843, term246843.getClass(), "cellsBusy", 0);
        setField(term246843, term246843.getClass(), "counterCells", null);
        setField(term246843, term246843.getClass(), "keySet", null);
        setField(term246843, term246843.getClass(), "values", null);
        setField(term246843, term246843.getClass(), "entrySet", null);
        setField(term246843, term246843.getClass(), "keySet", null);
        setField(term246843, term246843.getClass(), "values", null);
        setField(term246796, term246796.getClass(), "lastRulesCache", term246843);
        setField(term246779, term246779.getClass(), "rules", term246796);
        setField(term246758, term246758.getClass(), "zone", term246779);
        setField(term246639, term246639.getClass(), "time_stamp", term246758);
        setField(term246639, term246639.getClass(), "start_up_mode", "BsupMZxOfn");
        setField(term246639, term246639.getClass(), "cmm_dly_mod", "KWWTEtQZKa");
        setField(term246639, term246639.getClass(), "cmm_dly_sec", "QRoYxbbXBu");
        setField(term246639, term246639.getClass(), "cmm_err_mod", "gGVmBWDOsX");
        setField(term246639, term246639.getClass(), "country_code", "NktLacflHU");
        setField(term246639, term246639.getClass(), "region_code", "evgfwrURFw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_dat_id", argTypes, term246639, args);
    }

};


