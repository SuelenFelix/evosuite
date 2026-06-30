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

public class BuyCstmzItmRequest_setCstmzitmid_12428782308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term276659;
     Object term276911;

    public BuyCstmzItmRequest_setCstmzitmid_12428782308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term276659 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest"));
        Object term276749 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term276750 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term276751 = newInstance(Class.forName("java.time.LocalDate"));
        Object term276755 = newInstance(Class.forName("java.time.LocalTime"));
        Object term276760 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term276770 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term276787 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term276788 = (long[]) newLongArray(1);
        Object[] term276790 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term276791 = (long[]) newLongArray(39);
        Object[] term276831 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term276832 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term276833 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term276834 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setIntField(term276659, term276659.getClass(), "pd_id", -1998994074);
        setIntField(term276659, term276659.getClass(), "accept_idx", 1695162470);
        setIntField(term276659, term276659.getClass(), "start_idx", 970849679);
        setIntField(term276659, term276659.getClass(), "cstmz_itm_id", 759450810);
        setIntField(term276659, term276659.getClass(), "cstmz_itm_price", -762648947);
        setField(term276659, term276659.getClass(), "cmd", "WUwUHGneAq");
        setField(term276659, term276659.getClass(), "req_id", "zlVKedpZvy");
        setField(term276659, term276659.getClass(), "game_id", "PEUAKKJLwI");
        setField(term276659, term276659.getClass(), "r_ver", "cYvFrvYBOd");
        setField(term276659, term276659.getClass(), "kc_serial", "WfCGsRvHTg");
        setField(term276659, term276659.getClass(), "b_serial", "jsThoorJsk");
        setField(term276659, term276659.getClass(), "place_id", "DiLoLWWibV");
        setIntField(term276751, term276751.getClass(), "year", 2014);
        setShortField(term276751, term276751.getClass(), "month", (short) 5);
        setShortField(term276751, term276751.getClass(), "day", (short) 20);
        setField(term276750, term276750.getClass(), "date", term276751);
        setByteField(term276755, term276755.getClass(), "hour", (byte) 12);
        setByteField(term276755, term276755.getClass(), "minute", (byte) 30);
        setByteField(term276755, term276755.getClass(), "second", (byte) 37);
        setIntField(term276755, term276755.getClass(), "nano", 390283474);
        setField(term276750, term276750.getClass(), "time", term276755);
        setField(term276749, term276749.getClass(), "dateTime", term276750);
        setIntField(term276760, term276760.getClass(), "totalSeconds", -10800);
        setField(term276760, term276760.getClass(), "id", "-03:00");
        setField(term276749, term276749.getClass(), "offset", term276760);
        setField(term276770, term276770.getClass(), "id", "America/Recife");
        setLongElement(term276788, 0, -1767217224L);
        setField(term276787, term276787.getClass(), "standardTransitions", term276788);
        setElement(term276790, 1, term276760);
        setField(term276787, term276787.getClass(), "standardOffsets", term276790);
        setLongElement(term276791, 0, -1767217224L);
        setLongElement(term276791, 1, -1206957600L);
        setLongElement(term276791, 2, -1191362400L);
        setLongElement(term276791, 3, -1175374800L);
        setLongElement(term276791, 4, -1159826400L);
        setLongElement(term276791, 5, -633819600L);
        setLongElement(term276791, 6, -622069200L);
        setLongElement(term276791, 7, -602283600L);
        setLongElement(term276791, 8, -591832800L);
        setLongElement(term276791, 9, -570747600L);
        setLongElement(term276791, 10, -560210400L);
        setLongElement(term276791, 11, -539125200L);
        setLongElement(term276791, 12, -531352800L);
        setLongElement(term276791, 13, -191365200L);
        setLongElement(term276791, 14, -184197600L);
        setLongElement(term276791, 15, -155163600L);
        setLongElement(term276791, 16, -150069600L);
        setLongElement(term276791, 17, -128898000L);
        setLongElement(term276791, 18, -121125600L);
        setLongElement(term276791, 19, -99954000L);
        setLongElement(term276791, 20, -89589600L);
        setLongElement(term276791, 21, -68418000L);
        setLongElement(term276791, 22, -57967200L);
        setLongElement(term276791, 23, 499748400L);
        setLongElement(term276791, 24, 511236000L);
        setLongElement(term276791, 25, 530593200L);
        setLongElement(term276791, 26, 540266400L);
        setLongElement(term276791, 27, 562129200L);
        setLongElement(term276791, 28, 571197600L);
        setLongElement(term276791, 29, 592974000L);
        setLongElement(term276791, 30, 602042400L);
        setLongElement(term276791, 31, 624423600L);
        setLongElement(term276791, 32, 634701600L);
        setLongElement(term276791, 33, 938919600L);
        setLongElement(term276791, 34, 951616800L);
        setLongElement(term276791, 35, 970974000L);
        setLongElement(term276791, 36, 971575200L);
        setLongElement(term276791, 37, 1003028400L);
        setLongElement(term276791, 38, 1013911200L);
        setField(term276787, term276787.getClass(), "savingsInstantTransitions", term276791);
        setField(term276787, term276787.getClass(), "savingsLocalTransitions", term276831);
        setElement(term276832, 1, term276760);
        setElement(term276832, 3, term276760);
        setElement(term276832, 5, term276760);
        setElement(term276832, 7, term276760);
        setElement(term276832, 9, term276760);
        setElement(term276832, 11, term276760);
        setElement(term276832, 13, term276760);
        setElement(term276832, 15, term276760);
        setElement(term276832, 17, term276760);
        setElement(term276832, 19, term276760);
        setElement(term276832, 21, term276760);
        setElement(term276832, 23, term276760);
        setElement(term276832, 25, term276760);
        setElement(term276832, 27, term276760);
        setElement(term276832, 29, term276760);
        setElement(term276832, 31, term276760);
        setElement(term276832, 33, term276760);
        setElement(term276832, 35, term276760);
        setElement(term276832, 37, term276760);
        setElement(term276832, 39, term276760);
        setField(term276787, term276787.getClass(), "wallOffsets", term276832);
        setField(term276787, term276787.getClass(), "lastRules", term276833);
        setField(term276834, term276834.getClass(), "table", null);
        setField(term276834, term276834.getClass(), "nextTable", null);
        setLongField(term276834, term276834.getClass(), "baseCount", 0L);
        setIntField(term276834, term276834.getClass(), "sizeCtl", 0);
        setIntField(term276834, term276834.getClass(), "transferIndex", 0);
        setIntField(term276834, term276834.getClass(), "cellsBusy", 0);
        setField(term276834, term276834.getClass(), "counterCells", null);
        setField(term276834, term276834.getClass(), "keySet", null);
        setField(term276834, term276834.getClass(), "values", null);
        setField(term276834, term276834.getClass(), "entrySet", null);
        setField(term276834, term276834.getClass(), "keySet", null);
        setField(term276834, term276834.getClass(), "values", null);
        setField(term276787, term276787.getClass(), "lastRulesCache", term276834);
        setField(term276770, term276770.getClass(), "rules", term276787);
        setField(term276749, term276749.getClass(), "zone", term276770);
        setField(term276659, term276659.getClass(), "time_stamp", term276749);
        setField(term276659, term276659.getClass(), "start_up_mode", "jLARiCBiTZ");
        setField(term276659, term276659.getClass(), "cmm_dly_mod", "qgloCkfuKr");
        setField(term276659, term276659.getClass(), "cmm_dly_sec", "KKIqUqWzEr");
        setField(term276659, term276659.getClass(), "cmm_err_mod", "ERiiSXCvBM");
        setField(term276659, term276659.getClass(), "country_code", "RgePgJxaiq");
        setField(term276659, term276659.getClass(), "region_code", "wbdTRzpToE");
        term276911 = new Integer(-1045367972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.ingame.BuyCstmzItmRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term276911;
        callMethod(klass, "setCstmz_itm_id", argTypes, term276659, args);
    }

};


