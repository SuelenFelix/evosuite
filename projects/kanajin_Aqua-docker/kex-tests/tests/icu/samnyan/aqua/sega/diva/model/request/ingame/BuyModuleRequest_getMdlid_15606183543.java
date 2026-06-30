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

public class BuyModuleRequest_getMdlid_15606183543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255719;

    public BuyModuleRequest_getMdlid_15606183543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255719 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest"));
        Object term255809 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term255810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term255811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term255815 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255820 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term255830 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term255847 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term255848 = (long[]) newLongArray(1);
        Object[] term255850 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term255851 = (long[]) newLongArray(39);
        Object[] term255891 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term255892 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term255893 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term255894 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term255719, term255719.getClass(), "pd_id", 368886920);
        setIntField(term255719, term255719.getClass(), "accept_idx", 1958444096);
        setIntField(term255719, term255719.getClass(), "start_idx", -795311188);
        setIntField(term255719, term255719.getClass(), "mdl_id", -2040186405);
        setIntField(term255719, term255719.getClass(), "mdl_price", 1809222648);
        setField(term255719, term255719.getClass(), "cmd", "BPWhlQnFCE");
        setField(term255719, term255719.getClass(), "req_id", "CPQejCPAgr");
        setField(term255719, term255719.getClass(), "game_id", "epVEZIxJwk");
        setField(term255719, term255719.getClass(), "r_ver", "BXROAUdJLA");
        setField(term255719, term255719.getClass(), "kc_serial", "hGaZkCaPVx");
        setField(term255719, term255719.getClass(), "b_serial", "NuXhRMHMqg");
        setField(term255719, term255719.getClass(), "place_id", "XZoFaqRxkb");
        setIntField(term255811, term255811.getClass(), "year", 2014);
        setShortField(term255811, term255811.getClass(), "month", (short) 2);
        setShortField(term255811, term255811.getClass(), "day", (short) 26);
        setField(term255810, term255810.getClass(), "date", term255811);
        setByteField(term255815, term255815.getClass(), "hour", (byte) 16);
        setByteField(term255815, term255815.getClass(), "minute", (byte) 42);
        setByteField(term255815, term255815.getClass(), "second", (byte) 39);
        setIntField(term255815, term255815.getClass(), "nano", 690212071);
        setField(term255810, term255810.getClass(), "time", term255815);
        setField(term255809, term255809.getClass(), "dateTime", term255810);
        setIntField(term255820, term255820.getClass(), "totalSeconds", -10800);
        setField(term255820, term255820.getClass(), "id", "-03:00");
        setField(term255809, term255809.getClass(), "offset", term255820);
        setField(term255830, term255830.getClass(), "id", "America/Recife");
        setLongElement(term255848, 0, -1767217224L);
        setField(term255847, term255847.getClass(), "standardTransitions", term255848);
        setElement(term255850, 1, term255820);
        setField(term255847, term255847.getClass(), "standardOffsets", term255850);
        setLongElement(term255851, 0, -1767217224L);
        setLongElement(term255851, 1, -1206957600L);
        setLongElement(term255851, 2, -1191362400L);
        setLongElement(term255851, 3, -1175374800L);
        setLongElement(term255851, 4, -1159826400L);
        setLongElement(term255851, 5, -633819600L);
        setLongElement(term255851, 6, -622069200L);
        setLongElement(term255851, 7, -602283600L);
        setLongElement(term255851, 8, -591832800L);
        setLongElement(term255851, 9, -570747600L);
        setLongElement(term255851, 10, -560210400L);
        setLongElement(term255851, 11, -539125200L);
        setLongElement(term255851, 12, -531352800L);
        setLongElement(term255851, 13, -191365200L);
        setLongElement(term255851, 14, -184197600L);
        setLongElement(term255851, 15, -155163600L);
        setLongElement(term255851, 16, -150069600L);
        setLongElement(term255851, 17, -128898000L);
        setLongElement(term255851, 18, -121125600L);
        setLongElement(term255851, 19, -99954000L);
        setLongElement(term255851, 20, -89589600L);
        setLongElement(term255851, 21, -68418000L);
        setLongElement(term255851, 22, -57967200L);
        setLongElement(term255851, 23, 499748400L);
        setLongElement(term255851, 24, 511236000L);
        setLongElement(term255851, 25, 530593200L);
        setLongElement(term255851, 26, 540266400L);
        setLongElement(term255851, 27, 562129200L);
        setLongElement(term255851, 28, 571197600L);
        setLongElement(term255851, 29, 592974000L);
        setLongElement(term255851, 30, 602042400L);
        setLongElement(term255851, 31, 624423600L);
        setLongElement(term255851, 32, 634701600L);
        setLongElement(term255851, 33, 938919600L);
        setLongElement(term255851, 34, 951616800L);
        setLongElement(term255851, 35, 970974000L);
        setLongElement(term255851, 36, 971575200L);
        setLongElement(term255851, 37, 1003028400L);
        setLongElement(term255851, 38, 1013911200L);
        setField(term255847, term255847.getClass(), "savingsInstantTransitions", term255851);
        setField(term255847, term255847.getClass(), "savingsLocalTransitions", term255891);
        setElement(term255892, 1, term255820);
        setElement(term255892, 3, term255820);
        setElement(term255892, 5, term255820);
        setElement(term255892, 7, term255820);
        setElement(term255892, 9, term255820);
        setElement(term255892, 11, term255820);
        setElement(term255892, 13, term255820);
        setElement(term255892, 15, term255820);
        setElement(term255892, 17, term255820);
        setElement(term255892, 19, term255820);
        setElement(term255892, 21, term255820);
        setElement(term255892, 23, term255820);
        setElement(term255892, 25, term255820);
        setElement(term255892, 27, term255820);
        setElement(term255892, 29, term255820);
        setElement(term255892, 31, term255820);
        setElement(term255892, 33, term255820);
        setElement(term255892, 35, term255820);
        setElement(term255892, 37, term255820);
        setElement(term255892, 39, term255820);
        setField(term255847, term255847.getClass(), "wallOffsets", term255892);
        setField(term255847, term255847.getClass(), "lastRules", term255893);
        setField(term255894, term255894.getClass(), "table", null);
        setField(term255894, term255894.getClass(), "nextTable", null);
        setLongField(term255894, term255894.getClass(), "baseCount", 0L);
        setIntField(term255894, term255894.getClass(), "sizeCtl", 0);
        setIntField(term255894, term255894.getClass(), "transferIndex", 0);
        setIntField(term255894, term255894.getClass(), "cellsBusy", 0);
        setField(term255894, term255894.getClass(), "counterCells", null);
        setField(term255894, term255894.getClass(), "keySet", null);
        setField(term255894, term255894.getClass(), "values", null);
        setField(term255894, term255894.getClass(), "entrySet", null);
        setField(term255894, term255894.getClass(), "keySet", null);
        setField(term255894, term255894.getClass(), "values", null);
        setField(term255847, term255847.getClass(), "lastRulesCache", term255894);
        setField(term255830, term255830.getClass(), "rules", term255847);
        setField(term255809, term255809.getClass(), "zone", term255830);
        setField(term255719, term255719.getClass(), "time_stamp", term255809);
        setField(term255719, term255719.getClass(), "start_up_mode", "LpERFmEphm");
        setField(term255719, term255719.getClass(), "cmm_dly_mod", "ZtXtZNcDRU");
        setField(term255719, term255719.getClass(), "cmm_dly_sec", "ZHBibLHikD");
        setField(term255719, term255719.getClass(), "cmm_err_mod", "ytpYllcFQh");
        setField(term255719, term255719.getClass(), "country_code", "VogiBHEnKP");
        setField(term255719, term255719.getClass(), "region_code", "PCeXUuZyQa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyModuleRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMdl_id", argTypes, term255719, args);
    }

};


