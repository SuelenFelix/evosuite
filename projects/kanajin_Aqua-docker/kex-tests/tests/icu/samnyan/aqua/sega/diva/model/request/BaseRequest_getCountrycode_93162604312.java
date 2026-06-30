package icu.samnyan.aqua.sega.diva.model.request;

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
import static icu.samnyan.aqua.sega.diva.model.request.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BaseRequest_getCountrycode_93162604312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253595;

    public BaseRequest_getCountrycode_93162604312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253595 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term253680 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term253681 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term253682 = newInstance(Class.forName("java.time.LocalDate"));
        Object term253686 = newInstance(Class.forName("java.time.LocalTime"));
        Object term253691 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term253701 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term253718 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term253719 = (long[]) newLongArray(1);
        Object[] term253721 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term253722 = (long[]) newLongArray(39);
        Object[] term253762 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term253763 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term253764 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term253765 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term253595, term253595.getClass(), "cmd", "fSsmODkNFb");
        setField(term253595, term253595.getClass(), "req_id", "jXaYbKgogd");
        setField(term253595, term253595.getClass(), "game_id", "MxPRraPVdF");
        setField(term253595, term253595.getClass(), "r_ver", "dnWHLTYWVU");
        setField(term253595, term253595.getClass(), "kc_serial", "AOSOeWGCwi");
        setField(term253595, term253595.getClass(), "b_serial", "pBmevrFCmp");
        setField(term253595, term253595.getClass(), "place_id", "DOCvwqbYDn");
        setIntField(term253682, term253682.getClass(), "year", 2011);
        setShortField(term253682, term253682.getClass(), "month", (short) 9);
        setShortField(term253682, term253682.getClass(), "day", (short) 7);
        setField(term253681, term253681.getClass(), "date", term253682);
        setByteField(term253686, term253686.getClass(), "hour", (byte) 0);
        setByteField(term253686, term253686.getClass(), "minute", (byte) 51);
        setByteField(term253686, term253686.getClass(), "second", (byte) 44);
        setIntField(term253686, term253686.getClass(), "nano", 245610060);
        setField(term253681, term253681.getClass(), "time", term253686);
        setField(term253680, term253680.getClass(), "dateTime", term253681);
        setIntField(term253691, term253691.getClass(), "totalSeconds", -10800);
        setField(term253691, term253691.getClass(), "id", "-03:00");
        setField(term253680, term253680.getClass(), "offset", term253691);
        setField(term253701, term253701.getClass(), "id", "America/Recife");
        setLongElement(term253719, 0, -1767217224L);
        setField(term253718, term253718.getClass(), "standardTransitions", term253719);
        setElement(term253721, 1, term253691);
        setField(term253718, term253718.getClass(), "standardOffsets", term253721);
        setLongElement(term253722, 0, -1767217224L);
        setLongElement(term253722, 1, -1206957600L);
        setLongElement(term253722, 2, -1191362400L);
        setLongElement(term253722, 3, -1175374800L);
        setLongElement(term253722, 4, -1159826400L);
        setLongElement(term253722, 5, -633819600L);
        setLongElement(term253722, 6, -622069200L);
        setLongElement(term253722, 7, -602283600L);
        setLongElement(term253722, 8, -591832800L);
        setLongElement(term253722, 9, -570747600L);
        setLongElement(term253722, 10, -560210400L);
        setLongElement(term253722, 11, -539125200L);
        setLongElement(term253722, 12, -531352800L);
        setLongElement(term253722, 13, -191365200L);
        setLongElement(term253722, 14, -184197600L);
        setLongElement(term253722, 15, -155163600L);
        setLongElement(term253722, 16, -150069600L);
        setLongElement(term253722, 17, -128898000L);
        setLongElement(term253722, 18, -121125600L);
        setLongElement(term253722, 19, -99954000L);
        setLongElement(term253722, 20, -89589600L);
        setLongElement(term253722, 21, -68418000L);
        setLongElement(term253722, 22, -57967200L);
        setLongElement(term253722, 23, 499748400L);
        setLongElement(term253722, 24, 511236000L);
        setLongElement(term253722, 25, 530593200L);
        setLongElement(term253722, 26, 540266400L);
        setLongElement(term253722, 27, 562129200L);
        setLongElement(term253722, 28, 571197600L);
        setLongElement(term253722, 29, 592974000L);
        setLongElement(term253722, 30, 602042400L);
        setLongElement(term253722, 31, 624423600L);
        setLongElement(term253722, 32, 634701600L);
        setLongElement(term253722, 33, 938919600L);
        setLongElement(term253722, 34, 951616800L);
        setLongElement(term253722, 35, 970974000L);
        setLongElement(term253722, 36, 971575200L);
        setLongElement(term253722, 37, 1003028400L);
        setLongElement(term253722, 38, 1013911200L);
        setField(term253718, term253718.getClass(), "savingsInstantTransitions", term253722);
        setField(term253718, term253718.getClass(), "savingsLocalTransitions", term253762);
        setElement(term253763, 1, term253691);
        setElement(term253763, 3, term253691);
        setElement(term253763, 5, term253691);
        setElement(term253763, 7, term253691);
        setElement(term253763, 9, term253691);
        setElement(term253763, 11, term253691);
        setElement(term253763, 13, term253691);
        setElement(term253763, 15, term253691);
        setElement(term253763, 17, term253691);
        setElement(term253763, 19, term253691);
        setElement(term253763, 21, term253691);
        setElement(term253763, 23, term253691);
        setElement(term253763, 25, term253691);
        setElement(term253763, 27, term253691);
        setElement(term253763, 29, term253691);
        setElement(term253763, 31, term253691);
        setElement(term253763, 33, term253691);
        setElement(term253763, 35, term253691);
        setElement(term253763, 37, term253691);
        setElement(term253763, 39, term253691);
        setField(term253718, term253718.getClass(), "wallOffsets", term253763);
        setField(term253718, term253718.getClass(), "lastRules", term253764);
        setField(term253765, term253765.getClass(), "table", null);
        setField(term253765, term253765.getClass(), "nextTable", null);
        setLongField(term253765, term253765.getClass(), "baseCount", 0L);
        setIntField(term253765, term253765.getClass(), "sizeCtl", 0);
        setIntField(term253765, term253765.getClass(), "transferIndex", 0);
        setIntField(term253765, term253765.getClass(), "cellsBusy", 0);
        setField(term253765, term253765.getClass(), "counterCells", null);
        setField(term253765, term253765.getClass(), "keySet", null);
        setField(term253765, term253765.getClass(), "values", null);
        setField(term253765, term253765.getClass(), "entrySet", null);
        setField(term253765, term253765.getClass(), "keySet", null);
        setField(term253765, term253765.getClass(), "values", null);
        setField(term253718, term253718.getClass(), "lastRulesCache", term253765);
        setField(term253701, term253701.getClass(), "rules", term253718);
        setField(term253680, term253680.getClass(), "zone", term253701);
        setField(term253595, term253595.getClass(), "time_stamp", term253680);
        setField(term253595, term253595.getClass(), "start_up_mode", "mnqceiHjKv");
        setField(term253595, term253595.getClass(), "cmm_dly_mod", "AsVDXoZoBU");
        setField(term253595, term253595.getClass(), "cmm_dly_sec", "cPxpxZMgIo");
        setField(term253595, term253595.getClass(), "cmm_err_mod", "uWtOISrfeA");
        setField(term253595, term253595.getClass(), "country_code", "tYlSzqLqvb");
        setField(term253595, term253595.getClass(), "region_code", "GzeLmNKDuY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry_code", argTypes, term253595, args);
    }

};


