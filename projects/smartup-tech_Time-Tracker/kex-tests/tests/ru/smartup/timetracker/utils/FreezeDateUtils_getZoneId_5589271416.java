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

public class FreezeDateUtils_getZoneId_5589271416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2181;

    public FreezeDateUtils_getZoneId_5589271416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2181 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term2182 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term2183 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term2203 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term2204 = (long[]) newLongArray(3);
        Object[] term2208 = (Object[]) newArray("java.time.ZoneOffset", 4);
        long[] term2209 = (long[]) newLongArray(83);
        Object[] term2293 = (Object[]) newArray("java.time.LocalDateTime", 166);
        Object[] term2294 = (Object[]) newArray("java.time.ZoneOffset", 84);
        Object[] term2295 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 2);
        Object term2296 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term2301 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2183, term2183.getClass(), "id", "America/Anchorage");
        setLongElement(term2204, 0, -3225223727L);
        setLongElement(term2204, 1, -2188951224L);
        setLongElement(term2204, 2, 436359600L);
        setField(term2203, term2203.getClass(), "standardTransitions", term2204);
        setField(term2203, term2203.getClass(), "standardOffsets", term2208);
        setLongElement(term2209, 0, -3225223727L);
        setLongElement(term2209, 1, -2188951224L);
        setLongElement(term2209, 2, -880200000L);
        setLongElement(term2209, 3, -765378000L);
        setLongElement(term2209, 4, -21470400L);
        setLongElement(term2209, 5, -5749200L);
        setLongElement(term2209, 6, 9979200L);
        setLongElement(term2209, 7, 25700400L);
        setLongElement(term2209, 8, 41428800L);
        setLongElement(term2209, 9, 57754800L);
        setLongElement(term2209, 10, 73483200L);
        setLongElement(term2209, 11, 89204400L);
        setLongElement(term2209, 12, 104932800L);
        setLongElement(term2209, 13, 120654000L);
        setLongElement(term2209, 14, 126705600L);
        setLongElement(term2209, 15, 152103600L);
        setLongElement(term2209, 16, 162388800L);
        setLongElement(term2209, 17, 183553200L);
        setLongElement(term2209, 18, 199281600L);
        setLongElement(term2209, 19, 215607600L);
        setLongElement(term2209, 20, 230731200L);
        setLongElement(term2209, 21, 247057200L);
        setLongElement(term2209, 22, 262785600L);
        setLongElement(term2209, 23, 278506800L);
        setLongElement(term2209, 24, 294235200L);
        setLongElement(term2209, 25, 309956400L);
        setLongElement(term2209, 26, 325684800L);
        setLongElement(term2209, 27, 341406000L);
        setLongElement(term2209, 28, 357134400L);
        setLongElement(term2209, 29, 372855600L);
        setLongElement(term2209, 30, 388584000L);
        setLongElement(term2209, 31, 404910000L);
        setLongElement(term2209, 32, 420033600L);
        setLongElement(term2209, 33, 452084400L);
        setLongElement(term2209, 34, 467805600L);
        setLongElement(term2209, 35, 483534000L);
        setLongElement(term2209, 36, 499255200L);
        setLongElement(term2209, 37, 514983600L);
        setLongElement(term2209, 38, 530704800L);
        setLongElement(term2209, 39, 544618800L);
        setLongElement(term2209, 40, 562154400L);
        setLongElement(term2209, 41, 576068400L);
        setLongElement(term2209, 42, 594208800L);
        setLongElement(term2209, 43, 607518000L);
        setLongElement(term2209, 44, 625658400L);
        setLongElement(term2209, 45, 638967600L);
        setLongElement(term2209, 46, 657108000L);
        setLongElement(term2209, 47, 671022000L);
        setLongElement(term2209, 48, 688557600L);
        setLongElement(term2209, 49, 702471600L);
        setLongElement(term2209, 50, 720007200L);
        setLongElement(term2209, 51, 733921200L);
        setLongElement(term2209, 52, 752061600L);
        setLongElement(term2209, 53, 765370800L);
        setLongElement(term2209, 54, 783511200L);
        setLongElement(term2209, 55, 796820400L);
        setLongElement(term2209, 56, 814960800L);
        setLongElement(term2209, 57, 828874800L);
        setLongElement(term2209, 58, 846410400L);
        setLongElement(term2209, 59, 860324400L);
        setLongElement(term2209, 60, 877860000L);
        setLongElement(term2209, 61, 891774000L);
        setLongElement(term2209, 62, 909309600L);
        setLongElement(term2209, 63, 923223600L);
        setLongElement(term2209, 64, 941364000L);
        setLongElement(term2209, 65, 954673200L);
        setLongElement(term2209, 66, 972813600L);
        setLongElement(term2209, 67, 986122800L);
        setLongElement(term2209, 68, 1004263200L);
        setLongElement(term2209, 69, 1018177200L);
        setLongElement(term2209, 70, 1035712800L);
        setLongElement(term2209, 71, 1049626800L);
        setLongElement(term2209, 72, 1067162400L);
        setLongElement(term2209, 73, 1081076400L);
        setLongElement(term2209, 74, 1099216800L);
        setLongElement(term2209, 75, 1112526000L);
        setLongElement(term2209, 76, 1130666400L);
        setLongElement(term2209, 77, 1143975600L);
        setLongElement(term2209, 78, 1162116000L);
        setLongElement(term2209, 79, 1173610800L);
        setLongElement(term2209, 80, 1194170400L);
        setLongElement(term2209, 81, 1205060400L);
        setLongElement(term2209, 82, 1225620000L);
        setField(term2203, term2203.getClass(), "savingsInstantTransitions", term2209);
        setField(term2203, term2203.getClass(), "savingsLocalTransitions", term2293);
        setField(term2203, term2203.getClass(), "wallOffsets", term2294);
        setField(term2203, term2203.getClass(), "lastRules", term2295);
        setField(term2296, term2296.getClass(), "table", null);
        setField(term2296, term2296.getClass(), "nextTable", null);
        setLongField(term2296, term2296.getClass(), "baseCount", 0L);
        setIntField(term2296, term2296.getClass(), "sizeCtl", 0);
        setIntField(term2296, term2296.getClass(), "transferIndex", 0);
        setIntField(term2296, term2296.getClass(), "cellsBusy", 0);
        setField(term2296, term2296.getClass(), "counterCells", null);
        setField(term2296, term2296.getClass(), "keySet", null);
        setField(term2296, term2296.getClass(), "values", null);
        setField(term2296, term2296.getClass(), "entrySet", null);
        setField(term2296, term2296.getClass(), "keySet", null);
        setField(term2296, term2296.getClass(), "values", null);
        setField(term2203, term2203.getClass(), "lastRulesCache", term2296);
        setField(term2183, term2183.getClass(), "rules", term2203);
        setField(term2182, term2182.getClass(), "timeZone", term2183);
        setByteField(term2301, term2301.getClass(), "hour", (byte) 17);
        setByteField(term2301, term2301.getClass(), "minute", (byte) 34);
        setByteField(term2301, term2301.getClass(), "second", (byte) 22);
        setIntField(term2301, term2301.getClass(), "nano", 134810253);
        setField(term2182, term2182.getClass(), "fixedTimeFreeze", term2301);
        setIntField(term2182, term2182.getClass(), "dayToUnfreeze", -1685132342);
        setField(term2181, term2181.getClass(), "freezeProperties", term2182);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoneId", argTypes, term2181, args);
    }

};


