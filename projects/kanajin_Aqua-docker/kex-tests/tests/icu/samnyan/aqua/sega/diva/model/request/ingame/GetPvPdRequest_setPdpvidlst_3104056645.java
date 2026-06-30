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

public class GetPvPdRequest_setPdpvidlst_3104056645 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272607;
     Object term272866;

    public GetPvPdRequest_setPdpvidlst_3104056645() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term272607 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest"));
        int[] term272610 = (int[]) newIntArray(9);
        Object term272704 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term272705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term272706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272710 = newInstance(Class.forName("java.time.LocalTime"));
        Object term272715 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term272725 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term272742 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term272743 = (long[]) newLongArray(1);
        Object[] term272745 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term272746 = (long[]) newLongArray(39);
        Object[] term272786 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term272787 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term272788 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term272789 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term272607, term272607.getClass(), "pd_id", -1093187001);
        setIntField(term272607, term272607.getClass(), "difficulty", 195839161);
        setIntElement(term272610, 0, -2056944805);
        setIntElement(term272610, 1, 293032292);
        setIntElement(term272610, 2, 486654227);
        setIntElement(term272610, 3, 2023814919);
        setIntElement(term272610, 4, 755355673);
        setIntElement(term272610, 5, 763343373);
        setIntElement(term272610, 6, 1401712805);
        setIntElement(term272610, 7, -338154613);
        setIntElement(term272610, 8, -1843178578);
        setField(term272607, term272607.getClass(), "pd_pv_id_lst", term272610);
        setField(term272607, term272607.getClass(), "cmd", "cwNMyoCqHJ");
        setField(term272607, term272607.getClass(), "req_id", "PzUYNYWLsN");
        setField(term272607, term272607.getClass(), "game_id", "rGvXtIHjBI");
        setField(term272607, term272607.getClass(), "r_ver", "PKJkUkzual");
        setField(term272607, term272607.getClass(), "kc_serial", "WYcqisofgT");
        setField(term272607, term272607.getClass(), "b_serial", "vVYrwXQCzi");
        setField(term272607, term272607.getClass(), "place_id", "urqqtlYppy");
        setIntField(term272706, term272706.getClass(), "year", 2024);
        setShortField(term272706, term272706.getClass(), "month", (short) 2);
        setShortField(term272706, term272706.getClass(), "day", (short) 2);
        setField(term272705, term272705.getClass(), "date", term272706);
        setByteField(term272710, term272710.getClass(), "hour", (byte) 5);
        setByteField(term272710, term272710.getClass(), "minute", (byte) 8);
        setByteField(term272710, term272710.getClass(), "second", (byte) 10);
        setIntField(term272710, term272710.getClass(), "nano", 897554578);
        setField(term272705, term272705.getClass(), "time", term272710);
        setField(term272704, term272704.getClass(), "dateTime", term272705);
        setIntField(term272715, term272715.getClass(), "totalSeconds", -10800);
        setField(term272715, term272715.getClass(), "id", "-03:00");
        setField(term272704, term272704.getClass(), "offset", term272715);
        setField(term272725, term272725.getClass(), "id", "America/Recife");
        setLongElement(term272743, 0, -1767217224L);
        setField(term272742, term272742.getClass(), "standardTransitions", term272743);
        setElement(term272745, 1, term272715);
        setField(term272742, term272742.getClass(), "standardOffsets", term272745);
        setLongElement(term272746, 0, -1767217224L);
        setLongElement(term272746, 1, -1206957600L);
        setLongElement(term272746, 2, -1191362400L);
        setLongElement(term272746, 3, -1175374800L);
        setLongElement(term272746, 4, -1159826400L);
        setLongElement(term272746, 5, -633819600L);
        setLongElement(term272746, 6, -622069200L);
        setLongElement(term272746, 7, -602283600L);
        setLongElement(term272746, 8, -591832800L);
        setLongElement(term272746, 9, -570747600L);
        setLongElement(term272746, 10, -560210400L);
        setLongElement(term272746, 11, -539125200L);
        setLongElement(term272746, 12, -531352800L);
        setLongElement(term272746, 13, -191365200L);
        setLongElement(term272746, 14, -184197600L);
        setLongElement(term272746, 15, -155163600L);
        setLongElement(term272746, 16, -150069600L);
        setLongElement(term272746, 17, -128898000L);
        setLongElement(term272746, 18, -121125600L);
        setLongElement(term272746, 19, -99954000L);
        setLongElement(term272746, 20, -89589600L);
        setLongElement(term272746, 21, -68418000L);
        setLongElement(term272746, 22, -57967200L);
        setLongElement(term272746, 23, 499748400L);
        setLongElement(term272746, 24, 511236000L);
        setLongElement(term272746, 25, 530593200L);
        setLongElement(term272746, 26, 540266400L);
        setLongElement(term272746, 27, 562129200L);
        setLongElement(term272746, 28, 571197600L);
        setLongElement(term272746, 29, 592974000L);
        setLongElement(term272746, 30, 602042400L);
        setLongElement(term272746, 31, 624423600L);
        setLongElement(term272746, 32, 634701600L);
        setLongElement(term272746, 33, 938919600L);
        setLongElement(term272746, 34, 951616800L);
        setLongElement(term272746, 35, 970974000L);
        setLongElement(term272746, 36, 971575200L);
        setLongElement(term272746, 37, 1003028400L);
        setLongElement(term272746, 38, 1013911200L);
        setField(term272742, term272742.getClass(), "savingsInstantTransitions", term272746);
        setField(term272742, term272742.getClass(), "savingsLocalTransitions", term272786);
        setElement(term272787, 1, term272715);
        setElement(term272787, 3, term272715);
        setElement(term272787, 5, term272715);
        setElement(term272787, 7, term272715);
        setElement(term272787, 9, term272715);
        setElement(term272787, 11, term272715);
        setElement(term272787, 13, term272715);
        setElement(term272787, 15, term272715);
        setElement(term272787, 17, term272715);
        setElement(term272787, 19, term272715);
        setElement(term272787, 21, term272715);
        setElement(term272787, 23, term272715);
        setElement(term272787, 25, term272715);
        setElement(term272787, 27, term272715);
        setElement(term272787, 29, term272715);
        setElement(term272787, 31, term272715);
        setElement(term272787, 33, term272715);
        setElement(term272787, 35, term272715);
        setElement(term272787, 37, term272715);
        setElement(term272787, 39, term272715);
        setField(term272742, term272742.getClass(), "wallOffsets", term272787);
        setField(term272742, term272742.getClass(), "lastRules", term272788);
        setField(term272789, term272789.getClass(), "table", null);
        setField(term272789, term272789.getClass(), "nextTable", null);
        setLongField(term272789, term272789.getClass(), "baseCount", 0L);
        setIntField(term272789, term272789.getClass(), "sizeCtl", 0);
        setIntField(term272789, term272789.getClass(), "transferIndex", 0);
        setIntField(term272789, term272789.getClass(), "cellsBusy", 0);
        setField(term272789, term272789.getClass(), "counterCells", null);
        setField(term272789, term272789.getClass(), "keySet", null);
        setField(term272789, term272789.getClass(), "values", null);
        setField(term272789, term272789.getClass(), "entrySet", null);
        setField(term272789, term272789.getClass(), "keySet", null);
        setField(term272789, term272789.getClass(), "values", null);
        setField(term272742, term272742.getClass(), "lastRulesCache", term272789);
        setField(term272725, term272725.getClass(), "rules", term272742);
        setField(term272704, term272704.getClass(), "zone", term272725);
        setField(term272607, term272607.getClass(), "time_stamp", term272704);
        setField(term272607, term272607.getClass(), "start_up_mode", "znNUsUuegd");
        setField(term272607, term272607.getClass(), "cmm_dly_mod", "TvOdQLksId");
        setField(term272607, term272607.getClass(), "cmm_dly_sec", "gbrBAjYfeF");
        setField(term272607, term272607.getClass(), "cmm_err_mod", "oQyDIyWghi");
        setField(term272607, term272607.getClass(), "country_code", "VGvITdbKFh");
        setField(term272607, term272607.getClass(), "region_code", "OzwgkolGue");
        term272866 = (int[]) newIntArray(3);
        setIntElement(term272866, 0, -788302141);
        setIntElement(term272866, 1, -1134824410);
        setIntElement(term272866, 2, 507607753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.GetPvPdRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term272866;
        callMethod(klass, "setPd_pv_id_lst", argTypes, term272607, args);
    }

};


