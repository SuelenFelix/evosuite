package icu.samnyan.aqua.sega.diva.handler.databank;

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
import static icu.samnyan.aqua.sega.diva.handler.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PvNgMdlLstHandler_handle_8217863291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3083;
     Object term3084;

    public PvNgMdlLstHandler_handle_8217863291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3083 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvNgMdlLstHandler"));
        setField(term3083, term3083.getClass(), "mapper", null);
        term3084 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest"));
        Object term3169 = newInstance(Class.forName("java.time.ZonedDateTime"));
        Object term3170 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term3171 = newInstance(Class.forName("java.time.LocalDate"));
        Object term3175 = newInstance(Class.forName("java.time.LocalTime"));
        Object term3180 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term3190 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term3207 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term3208 = (long[]) newLongArray(1);
        Object[] term3210 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term3211 = (long[]) newLongArray(39);
        Object[] term3251 = (Object[]) newArray("java.time.LocalDateTime", 78);
        Object[] term3252 = (Object[]) newArray("java.time.ZoneOffset", 40);
        Object[] term3253 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term3254 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3084, term3084.getClass(), "cmd", "xOcJIiQQDu");
        setField(term3084, term3084.getClass(), "req_id", "GVizqqzXpy");
        setField(term3084, term3084.getClass(), "game_id", "JqXGgAhZPl");
        setField(term3084, term3084.getClass(), "r_ver", "jiKYgYHqIS");
        setField(term3084, term3084.getClass(), "kc_serial", "DfISiziTgG");
        setField(term3084, term3084.getClass(), "b_serial", "XqgfKFvPSD");
        setField(term3084, term3084.getClass(), "place_id", "JiVRgTZvKc");
        setIntField(term3171, term3171.getClass(), "year", 2024);
        setShortField(term3171, term3171.getClass(), "month", (short) 1);
        setShortField(term3171, term3171.getClass(), "day", (short) 24);
        setField(term3170, term3170.getClass(), "date", term3171);
        setByteField(term3175, term3175.getClass(), "hour", (byte) 20);
        setByteField(term3175, term3175.getClass(), "minute", (byte) 28);
        setByteField(term3175, term3175.getClass(), "second", (byte) 39);
        setIntField(term3175, term3175.getClass(), "nano", 952728177);
        setField(term3170, term3170.getClass(), "time", term3175);
        setField(term3169, term3169.getClass(), "dateTime", term3170);
        setIntField(term3180, term3180.getClass(), "totalSeconds", -10800);
        setField(term3180, term3180.getClass(), "id", "-03:00");
        setField(term3169, term3169.getClass(), "offset", term3180);
        setField(term3190, term3190.getClass(), "id", "America/Recife");
        setLongElement(term3208, 0, -1767217224L);
        setField(term3207, term3207.getClass(), "standardTransitions", term3208);
        setElement(term3210, 1, term3180);
        setField(term3207, term3207.getClass(), "standardOffsets", term3210);
        setLongElement(term3211, 0, -1767217224L);
        setLongElement(term3211, 1, -1206957600L);
        setLongElement(term3211, 2, -1191362400L);
        setLongElement(term3211, 3, -1175374800L);
        setLongElement(term3211, 4, -1159826400L);
        setLongElement(term3211, 5, -633819600L);
        setLongElement(term3211, 6, -622069200L);
        setLongElement(term3211, 7, -602283600L);
        setLongElement(term3211, 8, -591832800L);
        setLongElement(term3211, 9, -570747600L);
        setLongElement(term3211, 10, -560210400L);
        setLongElement(term3211, 11, -539125200L);
        setLongElement(term3211, 12, -531352800L);
        setLongElement(term3211, 13, -191365200L);
        setLongElement(term3211, 14, -184197600L);
        setLongElement(term3211, 15, -155163600L);
        setLongElement(term3211, 16, -150069600L);
        setLongElement(term3211, 17, -128898000L);
        setLongElement(term3211, 18, -121125600L);
        setLongElement(term3211, 19, -99954000L);
        setLongElement(term3211, 20, -89589600L);
        setLongElement(term3211, 21, -68418000L);
        setLongElement(term3211, 22, -57967200L);
        setLongElement(term3211, 23, 499748400L);
        setLongElement(term3211, 24, 511236000L);
        setLongElement(term3211, 25, 530593200L);
        setLongElement(term3211, 26, 540266400L);
        setLongElement(term3211, 27, 562129200L);
        setLongElement(term3211, 28, 571197600L);
        setLongElement(term3211, 29, 592974000L);
        setLongElement(term3211, 30, 602042400L);
        setLongElement(term3211, 31, 624423600L);
        setLongElement(term3211, 32, 634701600L);
        setLongElement(term3211, 33, 938919600L);
        setLongElement(term3211, 34, 951616800L);
        setLongElement(term3211, 35, 970974000L);
        setLongElement(term3211, 36, 971575200L);
        setLongElement(term3211, 37, 1003028400L);
        setLongElement(term3211, 38, 1013911200L);
        setField(term3207, term3207.getClass(), "savingsInstantTransitions", term3211);
        setField(term3207, term3207.getClass(), "savingsLocalTransitions", term3251);
        setElement(term3252, 1, term3180);
        setElement(term3252, 3, term3180);
        setElement(term3252, 5, term3180);
        setElement(term3252, 7, term3180);
        setElement(term3252, 9, term3180);
        setElement(term3252, 11, term3180);
        setElement(term3252, 13, term3180);
        setElement(term3252, 15, term3180);
        setElement(term3252, 17, term3180);
        setElement(term3252, 19, term3180);
        setElement(term3252, 21, term3180);
        setElement(term3252, 23, term3180);
        setElement(term3252, 25, term3180);
        setElement(term3252, 27, term3180);
        setElement(term3252, 29, term3180);
        setElement(term3252, 31, term3180);
        setElement(term3252, 33, term3180);
        setElement(term3252, 35, term3180);
        setElement(term3252, 37, term3180);
        setElement(term3252, 39, term3180);
        setField(term3207, term3207.getClass(), "wallOffsets", term3252);
        setField(term3207, term3207.getClass(), "lastRules", term3253);
        setField(term3254, term3254.getClass(), "table", null);
        setField(term3254, term3254.getClass(), "nextTable", null);
        setLongField(term3254, term3254.getClass(), "baseCount", 0L);
        setIntField(term3254, term3254.getClass(), "sizeCtl", 0);
        setIntField(term3254, term3254.getClass(), "transferIndex", 0);
        setIntField(term3254, term3254.getClass(), "cellsBusy", 0);
        setField(term3254, term3254.getClass(), "counterCells", null);
        setField(term3254, term3254.getClass(), "keySet", null);
        setField(term3254, term3254.getClass(), "values", null);
        setField(term3254, term3254.getClass(), "entrySet", null);
        setField(term3254, term3254.getClass(), "keySet", null);
        setField(term3254, term3254.getClass(), "values", null);
        setField(term3207, term3207.getClass(), "lastRulesCache", term3254);
        setField(term3190, term3190.getClass(), "rules", term3207);
        setField(term3169, term3169.getClass(), "zone", term3190);
        setField(term3084, term3084.getClass(), "time_stamp", term3169);
        setField(term3084, term3084.getClass(), "start_up_mode", "XPKmummaqg");
        setField(term3084, term3084.getClass(), "cmm_dly_mod", "BKLfkLiZTH");
        setField(term3084, term3084.getClass(), "cmm_dly_sec", "SPpkrGcPRr");
        setField(term3084, term3084.getClass(), "cmm_err_mod", "sEccwbJKYE");
        setField(term3084, term3084.getClass(), "country_code", "AWRooQKkdW");
        setField(term3084, term3084.getClass(), "region_code", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.handler.databank.PvNgMdlLstHandler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.request.BaseRequest");
        Object[] args = new Object[1];
        args[0] = term3084;
        callMethod(klass, "handle", argTypes, term3083, args);
    }

};


