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

public class StoreSsRequest_setSsselpvid_151731227811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251643;
     Object term251923;

    public StoreSsRequest_setSsselpvid_151731227811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251643 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest"));
        int[] term251659 = (int[]) newIntArray(2);
        int[] term251662 = (int[]) newIntArray(3);
        int[] term251666 = (int[]) newIntArray(8);
        int[] term251675 = (int[]) newIntArray(1);
        Object term251761 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term251762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term251763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251767 = newInstance(Class.forName("java.time.LocalTime"));
        Object term251772 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term251782 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term251799 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term251800 = (long[]) newLongArray(1);
        Object[] term251802 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term251803 = (long[]) newLongArray(39);
        Object[] term251843 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term251844 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term251845 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term251846 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term251643, term251643.getClass(), "pd_id", -851021058);
        setField(term251643, term251643.getClass(), "ss_dat_id", "wCgQVdppSI");
        setIntField(term251643, term251643.getClass(), "ss_pv_id", -537011852);
        setIntField(term251643, term251643.getClass(), "ss_sel_pv_id", -1340959346);
        setIntElement(term251659, 0, -369457969);
        setIntElement(term251659, 1, 1975299549);
        setField(term251643, term251643.getClass(), "ss_mdl_id", term251659);
        setIntElement(term251662, 0, 1505864902);
        setIntElement(term251662, 1, 676120708);
        setIntElement(term251662, 2, 1784644174);
        setField(term251643, term251643.getClass(), "ss_sel_mdl_id", term251662);
        setIntElement(term251666, 0, 1271130900);
        setIntElement(term251666, 1, -128656491);
        setIntElement(term251666, 2, 1178891777);
        setIntElement(term251666, 3, -591784169);
        setIntElement(term251666, 4, 290554508);
        setIntElement(term251666, 5, 1159265718);
        setIntElement(term251666, 6, 1555256259);
        setIntElement(term251666, 7, -30707747);
        setField(term251643, term251643.getClass(), "ss_c_itm_id", term251666);
        setIntElement(term251675, 0, 556788241);
        setField(term251643, term251643.getClass(), "ss_pxl_sz", term251675);
        setField(term251643, term251643.getClass(), "cmd", "oQWxaFnrYq");
        setField(term251643, term251643.getClass(), "req_id", "uZcUOSgoMp");
        setField(term251643, term251643.getClass(), "game_id", "eMxNpewLIS");
        setField(term251643, term251643.getClass(), "r_ver", "GxNdoXawUZ");
        setField(term251643, term251643.getClass(), "kc_serial", "YAFTYAtere");
        setField(term251643, term251643.getClass(), "b_serial", "EYQnrjiZfX");
        setField(term251643, term251643.getClass(), "place_id", "xydFPTvtMs");
        setIntField(term251763, term251763.getClass(), "year", 2012);
        setShortField(term251763, term251763.getClass(), "month", (short) 2);
        setShortField(term251763, term251763.getClass(), "day", (short) 12);
        setField(term251762, term251762.getClass(), "date", term251763);
        setByteField(term251767, term251767.getClass(), "hour", (byte) 16);
        setByteField(term251767, term251767.getClass(), "minute", (byte) 39);
        setByteField(term251767, term251767.getClass(), "second", (byte) 57);
        setIntField(term251767, term251767.getClass(), "nano", 651756700);
        setField(term251762, term251762.getClass(), "time", term251767);
        setField(term251761, term251761.getClass(), "dateTime", term251762);
        setIntField(term251772, term251772.getClass(), "totalSeconds", -10800);
        setField(term251772, term251772.getClass(), "id", "-03:00");
        setField(term251761, term251761.getClass(), "offset", term251772);
        setField(term251782, term251782.getClass(), "id", "America/Recife");
        setLongElement(term251800, 0, -1767217224L);
        setField(term251799, term251799.getClass(), "standardTransitions", term251800);
        setElement(term251802, 1, term251772);
        setField(term251799, term251799.getClass(), "standardOffsets", term251802);
        setLongElement(term251803, 0, -1767217224L);
        setLongElement(term251803, 1, -1206957600L);
        setLongElement(term251803, 2, -1191362400L);
        setLongElement(term251803, 3, -1175374800L);
        setLongElement(term251803, 4, -1159826400L);
        setLongElement(term251803, 5, -633819600L);
        setLongElement(term251803, 6, -622069200L);
        setLongElement(term251803, 7, -602283600L);
        setLongElement(term251803, 8, -591832800L);
        setLongElement(term251803, 9, -570747600L);
        setLongElement(term251803, 10, -560210400L);
        setLongElement(term251803, 11, -539125200L);
        setLongElement(term251803, 12, -531352800L);
        setLongElement(term251803, 13, -191365200L);
        setLongElement(term251803, 14, -184197600L);
        setLongElement(term251803, 15, -155163600L);
        setLongElement(term251803, 16, -150069600L);
        setLongElement(term251803, 17, -128898000L);
        setLongElement(term251803, 18, -121125600L);
        setLongElement(term251803, 19, -99954000L);
        setLongElement(term251803, 20, -89589600L);
        setLongElement(term251803, 21, -68418000L);
        setLongElement(term251803, 22, -57967200L);
        setLongElement(term251803, 23, 499748400L);
        setLongElement(term251803, 24, 511236000L);
        setLongElement(term251803, 25, 530593200L);
        setLongElement(term251803, 26, 540266400L);
        setLongElement(term251803, 27, 562129200L);
        setLongElement(term251803, 28, 571197600L);
        setLongElement(term251803, 29, 592974000L);
        setLongElement(term251803, 30, 602042400L);
        setLongElement(term251803, 31, 624423600L);
        setLongElement(term251803, 32, 634701600L);
        setLongElement(term251803, 33, 938919600L);
        setLongElement(term251803, 34, 951616800L);
        setLongElement(term251803, 35, 970974000L);
        setLongElement(term251803, 36, 971575200L);
        setLongElement(term251803, 37, 1003028400L);
        setLongElement(term251803, 38, 1013911200L);
        setField(term251799, term251799.getClass(), "savingsInstantTransitions", term251803);
        setField(term251799, term251799.getClass(), "savingsLocalTransitions", term251843);
        setElement(term251844, 1, term251772);
        setElement(term251844, 3, term251772);
        setElement(term251844, 5, term251772);
        setElement(term251844, 7, term251772);
        setElement(term251844, 9, term251772);
        setElement(term251844, 11, term251772);
        setElement(term251844, 13, term251772);
        setElement(term251844, 15, term251772);
        setElement(term251844, 17, term251772);
        setElement(term251844, 19, term251772);
        setElement(term251844, 21, term251772);
        setElement(term251844, 23, term251772);
        setElement(term251844, 25, term251772);
        setElement(term251844, 27, term251772);
        setElement(term251844, 29, term251772);
        setElement(term251844, 31, term251772);
        setElement(term251844, 33, term251772);
        setElement(term251844, 35, term251772);
        setElement(term251844, 37, term251772);
        setElement(term251844, 39, term251772);
        setField(term251799, term251799.getClass(), "wallOffsets", term251844);
        setField(term251799, term251799.getClass(), "lastRules", term251845);
        setField(term251846, term251846.getClass(), "table", null);
        setField(term251846, term251846.getClass(), "nextTable", null);
        setLongField(term251846, term251846.getClass(), "baseCount", 0L);
        setIntField(term251846, term251846.getClass(), "sizeCtl", 0);
        setIntField(term251846, term251846.getClass(), "transferIndex", 0);
        setIntField(term251846, term251846.getClass(), "cellsBusy", 0);
        setField(term251846, term251846.getClass(), "counterCells", null);
        setField(term251846, term251846.getClass(), "keySet", null);
        setField(term251846, term251846.getClass(), "values", null);
        setField(term251846, term251846.getClass(), "entrySet", null);
        setField(term251846, term251846.getClass(), "keySet", null);
        setField(term251846, term251846.getClass(), "values", null);
        setField(term251799, term251799.getClass(), "lastRulesCache", term251846);
        setField(term251782, term251782.getClass(), "rules", term251799);
        setField(term251761, term251761.getClass(), "zone", term251782);
        setField(term251643, term251643.getClass(), "time_stamp", term251761);
        setField(term251643, term251643.getClass(), "start_up_mode", "lopARHjeMT");
        setField(term251643, term251643.getClass(), "cmm_dly_mod", "wizysRLgRr");
        setField(term251643, term251643.getClass(), "cmm_dly_sec", "VbDDltcmiT");
        setField(term251643, term251643.getClass(), "cmm_err_mod", "VWIEojCQCj");
        setField(term251643, term251643.getClass(), "country_code", "jbeRMWjQTQ");
        setField(term251643, term251643.getClass(), "region_code", "YOjmohMpFb");
        term251923 = new Integer(-1757422339);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.StoreSsRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term251923;
        callMethod(klass, "setSs_sel_pv_id", argTypes, term251643, args);
    }

};


