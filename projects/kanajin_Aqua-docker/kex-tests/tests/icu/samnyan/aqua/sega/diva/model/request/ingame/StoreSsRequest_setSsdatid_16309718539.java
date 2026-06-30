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

public class StoreSsRequest_setSsdatid_16309718539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250647;

    public StoreSsRequest_setSsdatid_16309718539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250647 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term250663 = (int[]) newIntArray(4);
        int[] term250668 = (int[]) newIntArray(1);
        int[] term250670 = (int[]) newIntArray(1);
        int[] term250672 = (int[]) newIntArray(1);
        Object term250758 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term250759 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term250760 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250764 = newInstance(Class.forName("java.time.LocalTime"));
        Object term250769 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term250779 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term250796 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term250797 = (long[]) newLongArray(1);
        Object[] term250799 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term250800 = (long[]) newLongArray(39);
        Object[] term250840 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term250841 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term250842 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term250843 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term250647, term250647.getClass(), "pd_id", -1458564348);
        setField(term250647, term250647.getClass(), "ss_dat_id", "hbtKoWkZLU");
        setIntField(term250647, term250647.getClass(), "ss_pv_id", -153811960);
        setIntField(term250647, term250647.getClass(), "ss_sel_pv_id", 1963792870);
        setIntElement(term250663, 0, -1146654041);
        setIntElement(term250663, 1, 1284957354);
        setIntElement(term250663, 2, -191502719);
        setIntElement(term250663, 3, -1906167967);
        setField(term250647, term250647.getClass(), "ss_mdl_id", term250663);
        setIntElement(term250668, 0, -581379047);
        setField(term250647, term250647.getClass(), "ss_sel_mdl_id", term250668);
        setIntElement(term250670, 0, -1276444968);
        setField(term250647, term250647.getClass(), "ss_c_itm_id", term250670);
        setIntElement(term250672, 0, -1954092962);
        setField(term250647, term250647.getClass(), "ss_pxl_sz", term250672);
        setField(term250647, term250647.getClass(), "cmd", "VCWjXeMQGX");
        setField(term250647, term250647.getClass(), "req_id", "KzrkBfSzqK");
        setField(term250647, term250647.getClass(), "game_id", "cFNqeNRwhB");
        setField(term250647, term250647.getClass(), "r_ver", "TQJASDuFUN");
        setField(term250647, term250647.getClass(), "kc_serial", "mOILNTkENv");
        setField(term250647, term250647.getClass(), "b_serial", "xgjvpKAqFv");
        setField(term250647, term250647.getClass(), "place_id", "RspkCWCAFM");
        setIntField(term250760, term250760.getClass(), "year", 2023);
        setShortField(term250760, term250760.getClass(), "month", (short) 1);
        setShortField(term250760, term250760.getClass(), "day", (short) 24);
        setField(term250759, term250759.getClass(), "date", term250760);
        setByteField(term250764, term250764.getClass(), "hour", (byte) 10);
        setByteField(term250764, term250764.getClass(), "minute", (byte) 26);
        setByteField(term250764, term250764.getClass(), "second", (byte) 14);
        setIntField(term250764, term250764.getClass(), "nano", 736807866);
        setField(term250759, term250759.getClass(), "time", term250764);
        setField(term250758, term250758.getClass(), "dateTime", term250759);
        setIntField(term250769, term250769.getClass(), "totalSeconds", -10800);
        setField(term250769, term250769.getClass(), "id", "-03:00");
        setField(term250758, term250758.getClass(), "offset", term250769);
        setField(term250779, term250779.getClass(), "id", "America/Recife");
        setLongElement(term250797, 0, -1767217224L);
        setField(term250796, term250796.getClass(), "standardTransitions", term250797);
        setElement(term250799, 1, term250769);
        setField(term250796, term250796.getClass(), "standardOffsets", term250799);
        setLongElement(term250800, 0, -1767217224L);
        setLongElement(term250800, 1, -1206957600L);
        setLongElement(term250800, 2, -1191362400L);
        setLongElement(term250800, 3, -1175374800L);
        setLongElement(term250800, 4, -1159826400L);
        setLongElement(term250800, 5, -633819600L);
        setLongElement(term250800, 6, -622069200L);
        setLongElement(term250800, 7, -602283600L);
        setLongElement(term250800, 8, -591832800L);
        setLongElement(term250800, 9, -570747600L);
        setLongElement(term250800, 10, -560210400L);
        setLongElement(term250800, 11, -539125200L);
        setLongElement(term250800, 12, -531352800L);
        setLongElement(term250800, 13, -191365200L);
        setLongElement(term250800, 14, -184197600L);
        setLongElement(term250800, 15, -155163600L);
        setLongElement(term250800, 16, -150069600L);
        setLongElement(term250800, 17, -128898000L);
        setLongElement(term250800, 18, -121125600L);
        setLongElement(term250800, 19, -99954000L);
        setLongElement(term250800, 20, -89589600L);
        setLongElement(term250800, 21, -68418000L);
        setLongElement(term250800, 22, -57967200L);
        setLongElement(term250800, 23, 499748400L);
        setLongElement(term250800, 24, 511236000L);
        setLongElement(term250800, 25, 530593200L);
        setLongElement(term250800, 26, 540266400L);
        setLongElement(term250800, 27, 562129200L);
        setLongElement(term250800, 28, 571197600L);
        setLongElement(term250800, 29, 592974000L);
        setLongElement(term250800, 30, 602042400L);
        setLongElement(term250800, 31, 624423600L);
        setLongElement(term250800, 32, 634701600L);
        setLongElement(term250800, 33, 938919600L);
        setLongElement(term250800, 34, 951616800L);
        setLongElement(term250800, 35, 970974000L);
        setLongElement(term250800, 36, 971575200L);
        setLongElement(term250800, 37, 1003028400L);
        setLongElement(term250800, 38, 1013911200L);
        setField(term250796, term250796.getClass(), "savingsInstantTransitions", term250800);
        setField(term250796, term250796.getClass(), "savingsLocalTransitions", term250840);
        setElement(term250841, 1, term250769);
        setElement(term250841, 3, term250769);
        setElement(term250841, 5, term250769);
        setElement(term250841, 7, term250769);
        setElement(term250841, 9, term250769);
        setElement(term250841, 11, term250769);
        setElement(term250841, 13, term250769);
        setElement(term250841, 15, term250769);
        setElement(term250841, 17, term250769);
        setElement(term250841, 19, term250769);
        setElement(term250841, 21, term250769);
        setElement(term250841, 23, term250769);
        setElement(term250841, 25, term250769);
        setElement(term250841, 27, term250769);
        setElement(term250841, 29, term250769);
        setElement(term250841, 31, term250769);
        setElement(term250841, 33, term250769);
        setElement(term250841, 35, term250769);
        setElement(term250841, 37, term250769);
        setElement(term250841, 39, term250769);
        setField(term250796, term250796.getClass(), "wallOffsets", term250841);
        setField(term250796, term250796.getClass(), "lastRules", term250842);
        setField(term250843, term250843.getClass(), "table", null);
        setField(term250843, term250843.getClass(), "nextTable", null);
        setLongField(term250843, term250843.getClass(), "baseCount", 0L);
        setIntField(term250843, term250843.getClass(), "sizeCtl", 0);
        setIntField(term250843, term250843.getClass(), "transferIndex", 0);
        setIntField(term250843, term250843.getClass(), "cellsBusy", 0);
        setField(term250843, term250843.getClass(), "counterCells", null);
        setField(term250843, term250843.getClass(), "keySet", null);
        setField(term250843, term250843.getClass(), "values", null);
        setField(term250843, term250843.getClass(), "entrySet", null);
        setField(term250843, term250843.getClass(), "keySet", null);
        setField(term250843, term250843.getClass(), "values", null);
        setField(term250796, term250796.getClass(), "lastRulesCache", term250843);
        setField(term250779, term250779.getClass(), "rules", term250796);
        setField(term250758, term250758.getClass(), "zone", term250779);
        setField(term250647, term250647.getClass(), "time_stamp", term250758);
        setField(term250647, term250647.getClass(), "start_up_mode", "zAkmDkobmH");
        setField(term250647, term250647.getClass(), "cmm_dly_mod", "FASdrZqBfN");
        setField(term250647, term250647.getClass(), "cmm_dly_sec", "YNwqJgOcWq");
        setField(term250647, term250647.getClass(), "cmm_err_mod", "tUcoJjDoJV");
        setField(term250647, term250647.getClass(), "country_code", "ICNsClDoAn");
        setField(term250647, term250647.getClass(), "region_code", "LACfLkaJjq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OhYEjeUQkK";
        callMethod(klass, "setSs_dat_id", argTypes, term250647, args);
    }

};


