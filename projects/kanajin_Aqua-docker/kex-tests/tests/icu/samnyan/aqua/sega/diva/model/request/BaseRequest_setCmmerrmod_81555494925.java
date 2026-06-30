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

public class BaseRequest_setCmmerrmod_81555494925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259507;

    public BaseRequest_setCmmerrmod_81555494925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259507 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term259592 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term259593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term259594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term259598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term259603 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term259613 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term259630 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term259631 = (long[]) newLongArray(1);
        Object[] term259633 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term259634 = (long[]) newLongArray(39);
        Object[] term259674 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term259675 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term259676 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term259677 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term259507, term259507.getClass(), "cmd", "Pmajvqueiq");
        setField(term259507, term259507.getClass(), "req_id", "VjCLvZgmuN");
        setField(term259507, term259507.getClass(), "game_id", "tQCalivCMp");
        setField(term259507, term259507.getClass(), "r_ver", "fEiosUzVPM");
        setField(term259507, term259507.getClass(), "kc_serial", "USPyxkJGgn");
        setField(term259507, term259507.getClass(), "b_serial", "VniuLGKjLe");
        setField(term259507, term259507.getClass(), "place_id", "nuzwgdczLX");
        setIntField(term259594, term259594.getClass(), "year", 2010);
        setShortField(term259594, term259594.getClass(), "month", (short) 9);
        setShortField(term259594, term259594.getClass(), "day", (short) 26);
        setField(term259593, term259593.getClass(), "date", term259594);
        setByteField(term259598, term259598.getClass(), "hour", (byte) 17);
        setByteField(term259598, term259598.getClass(), "minute", (byte) 5);
        setByteField(term259598, term259598.getClass(), "second", (byte) 52);
        setIntField(term259598, term259598.getClass(), "nano", 138292575);
        setField(term259593, term259593.getClass(), "time", term259598);
        setField(term259592, term259592.getClass(), "dateTime", term259593);
        setIntField(term259603, term259603.getClass(), "totalSeconds", -10800);
        setField(term259603, term259603.getClass(), "id", "-03:00");
        setField(term259592, term259592.getClass(), "offset", term259603);
        setField(term259613, term259613.getClass(), "id", "America/Recife");
        setLongElement(term259631, 0, -1767217224L);
        setField(term259630, term259630.getClass(), "standardTransitions", term259631);
        setElement(term259633, 1, term259603);
        setField(term259630, term259630.getClass(), "standardOffsets", term259633);
        setLongElement(term259634, 0, -1767217224L);
        setLongElement(term259634, 1, -1206957600L);
        setLongElement(term259634, 2, -1191362400L);
        setLongElement(term259634, 3, -1175374800L);
        setLongElement(term259634, 4, -1159826400L);
        setLongElement(term259634, 5, -633819600L);
        setLongElement(term259634, 6, -622069200L);
        setLongElement(term259634, 7, -602283600L);
        setLongElement(term259634, 8, -591832800L);
        setLongElement(term259634, 9, -570747600L);
        setLongElement(term259634, 10, -560210400L);
        setLongElement(term259634, 11, -539125200L);
        setLongElement(term259634, 12, -531352800L);
        setLongElement(term259634, 13, -191365200L);
        setLongElement(term259634, 14, -184197600L);
        setLongElement(term259634, 15, -155163600L);
        setLongElement(term259634, 16, -150069600L);
        setLongElement(term259634, 17, -128898000L);
        setLongElement(term259634, 18, -121125600L);
        setLongElement(term259634, 19, -99954000L);
        setLongElement(term259634, 20, -89589600L);
        setLongElement(term259634, 21, -68418000L);
        setLongElement(term259634, 22, -57967200L);
        setLongElement(term259634, 23, 499748400L);
        setLongElement(term259634, 24, 511236000L);
        setLongElement(term259634, 25, 530593200L);
        setLongElement(term259634, 26, 540266400L);
        setLongElement(term259634, 27, 562129200L);
        setLongElement(term259634, 28, 571197600L);
        setLongElement(term259634, 29, 592974000L);
        setLongElement(term259634, 30, 602042400L);
        setLongElement(term259634, 31, 624423600L);
        setLongElement(term259634, 32, 634701600L);
        setLongElement(term259634, 33, 938919600L);
        setLongElement(term259634, 34, 951616800L);
        setLongElement(term259634, 35, 970974000L);
        setLongElement(term259634, 36, 971575200L);
        setLongElement(term259634, 37, 1003028400L);
        setLongElement(term259634, 38, 1013911200L);
        setField(term259630, term259630.getClass(), "savingsInstantTransitions", term259634);
        setField(term259630, term259630.getClass(), "savingsLocalTransitions", term259674);
        setElement(term259675, 1, term259603);
        setElement(term259675, 3, term259603);
        setElement(term259675, 5, term259603);
        setElement(term259675, 7, term259603);
        setElement(term259675, 9, term259603);
        setElement(term259675, 11, term259603);
        setElement(term259675, 13, term259603);
        setElement(term259675, 15, term259603);
        setElement(term259675, 17, term259603);
        setElement(term259675, 19, term259603);
        setElement(term259675, 21, term259603);
        setElement(term259675, 23, term259603);
        setElement(term259675, 25, term259603);
        setElement(term259675, 27, term259603);
        setElement(term259675, 29, term259603);
        setElement(term259675, 31, term259603);
        setElement(term259675, 33, term259603);
        setElement(term259675, 35, term259603);
        setElement(term259675, 37, term259603);
        setElement(term259675, 39, term259603);
        setField(term259630, term259630.getClass(), "wallOffsets", term259675);
        setField(term259630, term259630.getClass(), "lastRules", term259676);
        setField(term259677, term259677.getClass(), "table", null);
        setField(term259677, term259677.getClass(), "nextTable", null);
        setLongField(term259677, term259677.getClass(), "baseCount", 0L);
        setIntField(term259677, term259677.getClass(), "sizeCtl", 0);
        setIntField(term259677, term259677.getClass(), "transferIndex", 0);
        setIntField(term259677, term259677.getClass(), "cellsBusy", 0);
        setField(term259677, term259677.getClass(), "counterCells", null);
        setField(term259677, term259677.getClass(), "keySet", null);
        setField(term259677, term259677.getClass(), "values", null);
        setField(term259677, term259677.getClass(), "entrySet", null);
        setField(term259677, term259677.getClass(), "keySet", null);
        setField(term259677, term259677.getClass(), "values", null);
        setField(term259630, term259630.getClass(), "lastRulesCache", term259677);
        setField(term259613, term259613.getClass(), "rules", term259630);
        setField(term259592, term259592.getClass(), "zone", term259613);
        setField(term259507, term259507.getClass(), "time_stamp", term259592);
        setField(term259507, term259507.getClass(), "start_up_mode", "FdFPAsGWZj");
        setField(term259507, term259507.getClass(), "cmm_dly_mod", "sqctDxfcQV");
        setField(term259507, term259507.getClass(), "cmm_dly_sec", "KHXlwfHOLE");
        setField(term259507, term259507.getClass(), "cmm_err_mod", "oxoYdAYVkI");
        setField(term259507, term259507.getClass(), "country_code", "jUYVgbuaNi");
        setField(term259507, term259507.getClass(), "region_code", "IVqaVowLVl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wsWWrTxdcC";
        callMethod(klass, "setCmm_err_mod", argTypes, term259507, args);
    }

};


