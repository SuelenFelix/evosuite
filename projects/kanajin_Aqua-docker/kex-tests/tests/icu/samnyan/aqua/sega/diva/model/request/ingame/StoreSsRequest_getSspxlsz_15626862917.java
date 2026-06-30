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

public class StoreSsRequest_getSspxlsz_15626862917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249663;

    public StoreSsRequest_getSspxlsz_15626862917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249663 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term249679 = (int[]) newIntArray(5);
        int[] term249685 = (int[]) newIntArray(5);
        int[] term249691 = (int[]) newIntArray(2);
        int[] term249694 = (int[]) newIntArray(3);
        Object term249782 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term249783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term249784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term249788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term249793 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term249803 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term249820 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term249821 = (long[]) newLongArray(1);
        Object[] term249823 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term249824 = (long[]) newLongArray(39);
        Object[] term249864 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term249865 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term249866 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term249867 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term249663, term249663.getClass(), "pd_id", 1037681446);
        setField(term249663, term249663.getClass(), "ss_dat_id", "jqfJtiVFaf");
        setIntField(term249663, term249663.getClass(), "ss_pv_id", -1165031207);
        setIntField(term249663, term249663.getClass(), "ss_sel_pv_id", 1748824185);
        setIntElement(term249679, 0, 13207617);
        setIntElement(term249679, 1, -25657566);
        setIntElement(term249679, 2, -989733241);
        setIntElement(term249679, 3, 756595434);
        setIntElement(term249679, 4, 1793262351);
        setField(term249663, term249663.getClass(), "ss_mdl_id", term249679);
        setIntElement(term249685, 0, -171396184);
        setIntElement(term249685, 1, 1733086537);
        setIntElement(term249685, 2, 377360461);
        setIntElement(term249685, 3, -1475549026);
        setIntElement(term249685, 4, 1293733687);
        setField(term249663, term249663.getClass(), "ss_sel_mdl_id", term249685);
        setIntElement(term249691, 0, -1707199597);
        setIntElement(term249691, 1, -76500883);
        setField(term249663, term249663.getClass(), "ss_c_itm_id", term249691);
        setIntElement(term249694, 0, 1769603067);
        setIntElement(term249694, 1, -1110708869);
        setIntElement(term249694, 2, -1119248264);
        setField(term249663, term249663.getClass(), "ss_pxl_sz", term249694);
        setField(term249663, term249663.getClass(), "cmd", "ZvqUprynBE");
        setField(term249663, term249663.getClass(), "req_id", "WFTVkzwtMV");
        setField(term249663, term249663.getClass(), "game_id", "NFhdyebxdy");
        setField(term249663, term249663.getClass(), "r_ver", "tLWbdOibIF");
        setField(term249663, term249663.getClass(), "kc_serial", "SMOAkwbjOJ");
        setField(term249663, term249663.getClass(), "b_serial", "MfaucIGOtB");
        setField(term249663, term249663.getClass(), "place_id", "InUomUyBlU");
        setIntField(term249784, term249784.getClass(), "year", 2019);
        setShortField(term249784, term249784.getClass(), "month", (short) 4);
        setShortField(term249784, term249784.getClass(), "day", (short) 1);
        setField(term249783, term249783.getClass(), "date", term249784);
        setByteField(term249788, term249788.getClass(), "hour", (byte) 8);
        setByteField(term249788, term249788.getClass(), "minute", (byte) 11);
        setByteField(term249788, term249788.getClass(), "second", (byte) 4);
        setIntField(term249788, term249788.getClass(), "nano", 648208624);
        setField(term249783, term249783.getClass(), "time", term249788);
        setField(term249782, term249782.getClass(), "dateTime", term249783);
        setIntField(term249793, term249793.getClass(), "totalSeconds", -10800);
        setField(term249793, term249793.getClass(), "id", "-03:00");
        setField(term249782, term249782.getClass(), "offset", term249793);
        setField(term249803, term249803.getClass(), "id", "America/Recife");
        setLongElement(term249821, 0, -1767217224L);
        setField(term249820, term249820.getClass(), "standardTransitions", term249821);
        setElement(term249823, 1, term249793);
        setField(term249820, term249820.getClass(), "standardOffsets", term249823);
        setLongElement(term249824, 0, -1767217224L);
        setLongElement(term249824, 1, -1206957600L);
        setLongElement(term249824, 2, -1191362400L);
        setLongElement(term249824, 3, -1175374800L);
        setLongElement(term249824, 4, -1159826400L);
        setLongElement(term249824, 5, -633819600L);
        setLongElement(term249824, 6, -622069200L);
        setLongElement(term249824, 7, -602283600L);
        setLongElement(term249824, 8, -591832800L);
        setLongElement(term249824, 9, -570747600L);
        setLongElement(term249824, 10, -560210400L);
        setLongElement(term249824, 11, -539125200L);
        setLongElement(term249824, 12, -531352800L);
        setLongElement(term249824, 13, -191365200L);
        setLongElement(term249824, 14, -184197600L);
        setLongElement(term249824, 15, -155163600L);
        setLongElement(term249824, 16, -150069600L);
        setLongElement(term249824, 17, -128898000L);
        setLongElement(term249824, 18, -121125600L);
        setLongElement(term249824, 19, -99954000L);
        setLongElement(term249824, 20, -89589600L);
        setLongElement(term249824, 21, -68418000L);
        setLongElement(term249824, 22, -57967200L);
        setLongElement(term249824, 23, 499748400L);
        setLongElement(term249824, 24, 511236000L);
        setLongElement(term249824, 25, 530593200L);
        setLongElement(term249824, 26, 540266400L);
        setLongElement(term249824, 27, 562129200L);
        setLongElement(term249824, 28, 571197600L);
        setLongElement(term249824, 29, 592974000L);
        setLongElement(term249824, 30, 602042400L);
        setLongElement(term249824, 31, 624423600L);
        setLongElement(term249824, 32, 634701600L);
        setLongElement(term249824, 33, 938919600L);
        setLongElement(term249824, 34, 951616800L);
        setLongElement(term249824, 35, 970974000L);
        setLongElement(term249824, 36, 971575200L);
        setLongElement(term249824, 37, 1003028400L);
        setLongElement(term249824, 38, 1013911200L);
        setField(term249820, term249820.getClass(), "savingsInstantTransitions", term249824);
        setField(term249820, term249820.getClass(), "savingsLocalTransitions", term249864);
        setElement(term249865, 1, term249793);
        setElement(term249865, 3, term249793);
        setElement(term249865, 5, term249793);
        setElement(term249865, 7, term249793);
        setElement(term249865, 9, term249793);
        setElement(term249865, 11, term249793);
        setElement(term249865, 13, term249793);
        setElement(term249865, 15, term249793);
        setElement(term249865, 17, term249793);
        setElement(term249865, 19, term249793);
        setElement(term249865, 21, term249793);
        setElement(term249865, 23, term249793);
        setElement(term249865, 25, term249793);
        setElement(term249865, 27, term249793);
        setElement(term249865, 29, term249793);
        setElement(term249865, 31, term249793);
        setElement(term249865, 33, term249793);
        setElement(term249865, 35, term249793);
        setElement(term249865, 37, term249793);
        setElement(term249865, 39, term249793);
        setField(term249820, term249820.getClass(), "wallOffsets", term249865);
        setField(term249820, term249820.getClass(), "lastRules", term249866);
        setField(term249867, term249867.getClass(), "table", null);
        setField(term249867, term249867.getClass(), "nextTable", null);
        setLongField(term249867, term249867.getClass(), "baseCount", 0L);
        setIntField(term249867, term249867.getClass(), "sizeCtl", 0);
        setIntField(term249867, term249867.getClass(), "transferIndex", 0);
        setIntField(term249867, term249867.getClass(), "cellsBusy", 0);
        setField(term249867, term249867.getClass(), "counterCells", null);
        setField(term249867, term249867.getClass(), "keySet", null);
        setField(term249867, term249867.getClass(), "values", null);
        setField(term249867, term249867.getClass(), "entrySet", null);
        setField(term249867, term249867.getClass(), "keySet", null);
        setField(term249867, term249867.getClass(), "values", null);
        setField(term249820, term249820.getClass(), "lastRulesCache", term249867);
        setField(term249803, term249803.getClass(), "rules", term249820);
        setField(term249782, term249782.getClass(), "zone", term249803);
        setField(term249663, term249663.getClass(), "time_stamp", term249782);
        setField(term249663, term249663.getClass(), "start_up_mode", "JeDxEhXsPC");
        setField(term249663, term249663.getClass(), "cmm_dly_mod", "VAGxXrcAsi");
        setField(term249663, term249663.getClass(), "cmm_dly_sec", "ApYkVuFRIL");
        setField(term249663, term249663.getClass(), "cmm_err_mod", "diuhMpMKFr");
        setField(term249663, term249663.getClass(), "country_code", "jYgdYPEnbw");
        setField(term249663, term249663.getClass(), "region_code", "MaWPQSNeis");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSs_pxl_sz", argTypes, term249663, args);
    }

};


