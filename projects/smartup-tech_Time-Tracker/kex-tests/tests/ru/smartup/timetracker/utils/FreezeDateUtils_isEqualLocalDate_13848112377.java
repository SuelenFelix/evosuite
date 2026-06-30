package ru.smartup.timetracker.utils;

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
import static ru.smartup.timetracker.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeDateUtils_isEqualLocalDate_13848112377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2410;
     Object term2536;
     Object term2540;

    public FreezeDateUtils_isEqualLocalDate_13848112377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2410 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2411 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2412 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2432 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2433 = (long[]) newLongArray(3);
        Object[] term2437 = (Object[]) newArray("java.time.ZoneOffset", 4);
        long[] term2438 = (long[]) newLongArray(83);
        Object[] term2522 = (Object[]) newArray("java.time.LocalDateTime", 166);
        Object[] term2523 = (Object[]) newArray("java.time.ZoneOffset", 84);
        Object[] term2524 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 2);
        Object term2525 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term2530 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2412, term2412.getClass(), "id", "America/Anchorage");
        setLongElement(term2433, 0, -3225223727L);
        setLongElement(term2433, 1, -2188951224L);
        setLongElement(term2433, 2, 436359600L);
        setField(term2432, term2432.getClass(), "standardTransitions", term2433);
        setField(term2432, term2432.getClass(), "standardOffsets", term2437);
        setLongElement(term2438, 0, -3225223727L);
        setLongElement(term2438, 1, -2188951224L);
        setLongElement(term2438, 2, -880200000L);
        setLongElement(term2438, 3, -765378000L);
        setLongElement(term2438, 4, -21470400L);
        setLongElement(term2438, 5, -5749200L);
        setLongElement(term2438, 6, 9979200L);
        setLongElement(term2438, 7, 25700400L);
        setLongElement(term2438, 8, 41428800L);
        setLongElement(term2438, 9, 57754800L);
        setLongElement(term2438, 10, 73483200L);
        setLongElement(term2438, 11, 89204400L);
        setLongElement(term2438, 12, 104932800L);
        setLongElement(term2438, 13, 120654000L);
        setLongElement(term2438, 14, 126705600L);
        setLongElement(term2438, 15, 152103600L);
        setLongElement(term2438, 16, 162388800L);
        setLongElement(term2438, 17, 183553200L);
        setLongElement(term2438, 18, 199281600L);
        setLongElement(term2438, 19, 215607600L);
        setLongElement(term2438, 20, 230731200L);
        setLongElement(term2438, 21, 247057200L);
        setLongElement(term2438, 22, 262785600L);
        setLongElement(term2438, 23, 278506800L);
        setLongElement(term2438, 24, 294235200L);
        setLongElement(term2438, 25, 309956400L);
        setLongElement(term2438, 26, 325684800L);
        setLongElement(term2438, 27, 341406000L);
        setLongElement(term2438, 28, 357134400L);
        setLongElement(term2438, 29, 372855600L);
        setLongElement(term2438, 30, 388584000L);
        setLongElement(term2438, 31, 404910000L);
        setLongElement(term2438, 32, 420033600L);
        setLongElement(term2438, 33, 452084400L);
        setLongElement(term2438, 34, 467805600L);
        setLongElement(term2438, 35, 483534000L);
        setLongElement(term2438, 36, 499255200L);
        setLongElement(term2438, 37, 514983600L);
        setLongElement(term2438, 38, 530704800L);
        setLongElement(term2438, 39, 544618800L);
        setLongElement(term2438, 40, 562154400L);
        setLongElement(term2438, 41, 576068400L);
        setLongElement(term2438, 42, 594208800L);
        setLongElement(term2438, 43, 607518000L);
        setLongElement(term2438, 44, 625658400L);
        setLongElement(term2438, 45, 638967600L);
        setLongElement(term2438, 46, 657108000L);
        setLongElement(term2438, 47, 671022000L);
        setLongElement(term2438, 48, 688557600L);
        setLongElement(term2438, 49, 702471600L);
        setLongElement(term2438, 50, 720007200L);
        setLongElement(term2438, 51, 733921200L);
        setLongElement(term2438, 52, 752061600L);
        setLongElement(term2438, 53, 765370800L);
        setLongElement(term2438, 54, 783511200L);
        setLongElement(term2438, 55, 796820400L);
        setLongElement(term2438, 56, 814960800L);
        setLongElement(term2438, 57, 828874800L);
        setLongElement(term2438, 58, 846410400L);
        setLongElement(term2438, 59, 860324400L);
        setLongElement(term2438, 60, 877860000L);
        setLongElement(term2438, 61, 891774000L);
        setLongElement(term2438, 62, 909309600L);
        setLongElement(term2438, 63, 923223600L);
        setLongElement(term2438, 64, 941364000L);
        setLongElement(term2438, 65, 954673200L);
        setLongElement(term2438, 66, 972813600L);
        setLongElement(term2438, 67, 986122800L);
        setLongElement(term2438, 68, 1004263200L);
        setLongElement(term2438, 69, 1018177200L);
        setLongElement(term2438, 70, 1035712800L);
        setLongElement(term2438, 71, 1049626800L);
        setLongElement(term2438, 72, 1067162400L);
        setLongElement(term2438, 73, 1081076400L);
        setLongElement(term2438, 74, 1099216800L);
        setLongElement(term2438, 75, 1112526000L);
        setLongElement(term2438, 76, 1130666400L);
        setLongElement(term2438, 77, 1143975600L);
        setLongElement(term2438, 78, 1162116000L);
        setLongElement(term2438, 79, 1173610800L);
        setLongElement(term2438, 80, 1194170400L);
        setLongElement(term2438, 81, 1205060400L);
        setLongElement(term2438, 82, 1225620000L);
        setField(term2432, term2432.getClass(), "savingsInstantTransitions", term2438);
        setField(term2432, term2432.getClass(), "savingsLocalTransitions", term2522);
        setField(term2432, term2432.getClass(), "wallOffsets", term2523);
        setField(term2432, term2432.getClass(), "lastRules", term2524);
        setField(term2525, term2525.getClass(), "table", null);
        setField(term2525, term2525.getClass(), "nextTable", null);
        setLongField(term2525, term2525.getClass(), "baseCount", 0L);
        setIntField(term2525, term2525.getClass(), "sizeCtl", 0);
        setIntField(term2525, term2525.getClass(), "transferIndex", 0);
        setIntField(term2525, term2525.getClass(), "cellsBusy", 0);
        setField(term2525, term2525.getClass(), "counterCells", null);
        setField(term2525, term2525.getClass(), "keySet", null);
        setField(term2525, term2525.getClass(), "values", null);
        setField(term2525, term2525.getClass(), "entrySet", null);
        setField(term2525, term2525.getClass(), "keySet", null);
        setField(term2525, term2525.getClass(), "values", null);
        setField(term2432, term2432.getClass(), "lastRulesCache", term2525);
        setField(term2412, term2412.getClass(), "rules", term2432);
        setField(term2411, term2411.getClass(), "timeZone", term2412);
        setByteField(term2530, term2530.getClass(), "hour", (byte) 15);
        setByteField(term2530, term2530.getClass(), "minute", (byte) 21);
        setByteField(term2530, term2530.getClass(), "second", (byte) 6);
        setIntField(term2530, term2530.getClass(), "nano", 106670766);
        setField(term2411, term2411.getClass(), "fixedTimeFreeze", term2530);
        setIntField(term2411, term2411.getClass(), "dayToUnfreeze", -1456670397);
        setField(term2410, term2410.getClass(), "freezeProperties", term2411);
        term2536 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2536, term2536.getClass(), "year", 2020);
        setShortField(term2536, term2536.getClass(), "month", (short) 11);
        setShortField(term2536, term2536.getClass(), "day", (short) 22);
        term2540 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2540, term2540.getClass(), "year", 2015);
        setShortField(term2540, term2540.getClass(), "month", (short) 9);
        setShortField(term2540, term2540.getClass(), "day", (short) 19);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDate");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term2536;
        args[1] = term2540;
        callMethod(klass, "isEqualLocalDate", argTypes, term2410, args);
    }

};


