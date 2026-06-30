package ru.smartup.timetracker.core;

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
import static ru.smartup.timetracker.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SchedulerConfig_init_16949518770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;

    public SchedulerConfig_init_16949518770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term67 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term80 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term81 = (long[]) newLongArray(1);
        Object[] term83 = (Object[]) newArray("java.time.ZoneOffset", 2);
        Object term84 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term86 = newInstance(Class.forName("java.time.ZoneOffset"));
        long[] term88 = (long[]) newLongArray(9);
        Object[] term98 = (Object[]) newArray("java.time.LocalDateTime", 18);
        Object term99 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term100 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term105 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term108 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term109 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term115 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object[] term117 = (Object[]) newArray("java.time.ZoneOffset", 10);
        Object term118 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term120 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object[] term122 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term123 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term128 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term67, term67.getClass(), "id", "Asia/Tokyo");
        setLongElement(term81, 0, -2587712400L);
        setField(term80, term80.getClass(), "standardTransitions", term81);
        setIntField(term84, term84.getClass(), "totalSeconds", 33539);
        setField(term84, term84.getClass(), "id", null);
        setElement(term83, 0, term84);
        setIntField(term86, term86.getClass(), "totalSeconds", 32400);
        setField(term86, term86.getClass(), "id", null);
        setElement(term83, 1, term86);
        setField(term80, term80.getClass(), "standardOffsets", term83);
        setLongElement(term88, 0, -2587712400L);
        setLongElement(term88, 1, -683802000L);
        setLongElement(term88, 2, -672310800L);
        setLongElement(term88, 3, -654771600L);
        setLongElement(term88, 4, -640861200L);
        setLongElement(term88, 5, -620298000L);
        setLongElement(term88, 6, -609411600L);
        setLongElement(term88, 7, -588848400L);
        setLongElement(term88, 8, -577962000L);
        setField(term80, term80.getClass(), "savingsInstantTransitions", term88);
        setField(term99, term99.getClass(), "date", null);
        setField(term99, term99.getClass(), "time", null);
        setElement(term98, 0, term99);
        setField(term100, term100.getClass(), "date", null);
        setField(term100, term100.getClass(), "time", null);
        setElement(term98, 1, term100);
        setField(term101, term101.getClass(), "date", null);
        setField(term101, term101.getClass(), "time", null);
        setElement(term98, 2, term101);
        setField(term102, term102.getClass(), "date", null);
        setField(term102, term102.getClass(), "time", null);
        setElement(term98, 3, term102);
        setField(term103, term103.getClass(), "date", null);
        setField(term103, term103.getClass(), "time", null);
        setElement(term98, 4, term103);
        setField(term104, term104.getClass(), "date", null);
        setField(term104, term104.getClass(), "time", null);
        setElement(term98, 5, term104);
        setField(term105, term105.getClass(), "date", null);
        setField(term105, term105.getClass(), "time", null);
        setElement(term98, 6, term105);
        setField(term106, term106.getClass(), "date", null);
        setField(term106, term106.getClass(), "time", null);
        setElement(term98, 7, term106);
        setField(term107, term107.getClass(), "date", null);
        setField(term107, term107.getClass(), "time", null);
        setElement(term98, 8, term107);
        setField(term108, term108.getClass(), "date", null);
        setField(term108, term108.getClass(), "time", null);
        setElement(term98, 9, term108);
        setField(term109, term109.getClass(), "date", null);
        setField(term109, term109.getClass(), "time", null);
        setElement(term98, 10, term109);
        setField(term110, term110.getClass(), "date", null);
        setField(term110, term110.getClass(), "time", null);
        setElement(term98, 11, term110);
        setField(term111, term111.getClass(), "date", null);
        setField(term111, term111.getClass(), "time", null);
        setElement(term98, 12, term111);
        setField(term112, term112.getClass(), "date", null);
        setField(term112, term112.getClass(), "time", null);
        setElement(term98, 13, term112);
        setField(term113, term113.getClass(), "date", null);
        setField(term113, term113.getClass(), "time", null);
        setElement(term98, 14, term113);
        setField(term114, term114.getClass(), "date", null);
        setField(term114, term114.getClass(), "time", null);
        setElement(term98, 15, term114);
        setField(term115, term115.getClass(), "date", null);
        setField(term115, term115.getClass(), "time", null);
        setElement(term98, 16, term115);
        setField(term116, term116.getClass(), "date", null);
        setField(term116, term116.getClass(), "time", null);
        setElement(term98, 17, term116);
        setField(term80, term80.getClass(), "savingsLocalTransitions", term98);
        setIntField(term118, term118.getClass(), "totalSeconds", 33539);
        setField(term118, term118.getClass(), "id", null);
        setElement(term117, 0, term118);
        setElement(term117, 1, term86);
        setIntField(term120, term120.getClass(), "totalSeconds", 36000);
        setField(term120, term120.getClass(), "id", null);
        setElement(term117, 2, term120);
        setElement(term117, 3, term86);
        setElement(term117, 4, term120);
        setElement(term117, 5, term86);
        setElement(term117, 6, term120);
        setElement(term117, 7, term86);
        setElement(term117, 8, term120);
        setElement(term117, 9, term86);
        setField(term80, term80.getClass(), "wallOffsets", term117);
        setField(term80, term80.getClass(), "lastRules", term122);
        setField(term123, term123.getClass(), "table", null);
        setField(term123, term123.getClass(), "nextTable", null);
        setLongField(term123, term123.getClass(), "baseCount", 0L);
        setIntField(term123, term123.getClass(), "sizeCtl", 0);
        setIntField(term123, term123.getClass(), "transferIndex", 0);
        setIntField(term123, term123.getClass(), "cellsBusy", 0);
        setField(term123, term123.getClass(), "counterCells", null);
        setField(term123, term123.getClass(), "keySet", null);
        setField(term123, term123.getClass(), "values", null);
        setField(term123, term123.getClass(), "entrySet", null);
        setField(term123, term123.getClass(), "keySet", null);
        setField(term123, term123.getClass(), "values", null);
        setField(term80, term80.getClass(), "lastRulesCache", term123);
        setField(term67, term67.getClass(), "rules", term80);
        setField(term66, term66.getClass(), "timeZone", term67);
        setByteField(term128, term128.getClass(), "hour", (byte) 12);
        setByteField(term128, term128.getClass(), "minute", (byte) 32);
        setByteField(term128, term128.getClass(), "second", (byte) 20);
        setIntField(term128, term128.getClass(), "nano", 132387463);
        setField(term66, term66.getClass(), "fixedTimeFreeze", term128);
        setIntField(term66, term66.getClass(), "dayToUnfreeze", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.core.SchedulerConfig");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties");
        Object[] args = new Object[1];
        args[0] = term66;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


