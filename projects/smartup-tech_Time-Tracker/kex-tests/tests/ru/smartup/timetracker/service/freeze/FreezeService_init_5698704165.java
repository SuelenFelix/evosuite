package ru.smartup.timetracker.service.freeze;

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
import static ru.smartup.timetracker.service.freeze.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeService_init_5698704165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term789;
     Object term801;

    public FreezeService_init_5698704165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term789 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term790 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term791 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term792 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term794 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term795 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term789, term789.getClass(), "crudFreezeService", null);
        setField(term792, term792.getClass(), "id", "");
        setField(term794, term794.getClass(), "standardTransitions", null);
        setField(term794, term794.getClass(), "standardOffsets", null);
        setField(term794, term794.getClass(), "savingsInstantTransitions", null);
        setField(term794, term794.getClass(), "savingsLocalTransitions", null);
        setField(term794, term794.getClass(), "wallOffsets", null);
        setField(term794, term794.getClass(), "lastRules", null);
        setField(term794, term794.getClass(), "lastRulesCache", null);
        setField(term792, term792.getClass(), "rules", term794);
        setField(term791, term791.getClass(), "timeZone", term792);
        setByteField(term795, term795.getClass(), "hour", (byte) 14);
        setByteField(term795, term795.getClass(), "minute", (byte) 38);
        setByteField(term795, term795.getClass(), "second", (byte) 52);
        setIntField(term795, term795.getClass(), "nano", 226513406);
        setField(term791, term791.getClass(), "fixedTimeFreeze", term795);
        setIntField(term791, term791.getClass(), "dayToUnfreeze", -571169753);
        setField(term790, term790.getClass(), "freezeProperties", term791);
        setField(term789, term789.getClass(), "freezeDateUtils", term790);
        setField(term789, term789.getClass(), "freezeScheduler", null);
        setField(term789, term789.getClass(), "trackUnitService", null);
        term801 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term802 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term803 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term821 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term822 = (long[]) newLongArray(1);
        Object[] term824 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term825 = (long[]) newLongArray(11);
        Object[] term837 = (Object[]) newArray("java.time.LocalDateTime", 22);
        Object[] term838 = (Object[]) newArray("java.time.ZoneOffset", 12);
        Object[] term839 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term840 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term845 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term803, term803.getClass(), "id", "America/Phoenix");
        setLongElement(term822, 0, -2717643600L);
        setField(term821, term821.getClass(), "standardTransitions", term822);
        setField(term821, term821.getClass(), "standardOffsets", term824);
        setLongElement(term825, 0, -2717643600L);
        setLongElement(term825, 1, -1633273200L);
        setLongElement(term825, 2, -1615132800L);
        setLongElement(term825, 3, -1601823600L);
        setLongElement(term825, 4, -1583683200L);
        setLongElement(term825, 5, -880210800L);
        setLongElement(term825, 6, -820519140L);
        setLongElement(term825, 7, -812653140L);
        setLongElement(term825, 8, -796845540L);
        setLongElement(term825, 9, -84380400L);
        setLongElement(term825, 10, -68659200L);
        setField(term821, term821.getClass(), "savingsInstantTransitions", term825);
        setField(term821, term821.getClass(), "savingsLocalTransitions", term837);
        setField(term821, term821.getClass(), "wallOffsets", term838);
        setField(term821, term821.getClass(), "lastRules", term839);
        setField(term840, term840.getClass(), "table", null);
        setField(term840, term840.getClass(), "nextTable", null);
        setLongField(term840, term840.getClass(), "baseCount", 0L);
        setIntField(term840, term840.getClass(), "sizeCtl", 0);
        setIntField(term840, term840.getClass(), "transferIndex", 0);
        setIntField(term840, term840.getClass(), "cellsBusy", 0);
        setField(term840, term840.getClass(), "counterCells", null);
        setField(term840, term840.getClass(), "keySet", null);
        setField(term840, term840.getClass(), "values", null);
        setField(term840, term840.getClass(), "entrySet", null);
        setField(term840, term840.getClass(), "keySet", null);
        setField(term840, term840.getClass(), "values", null);
        setField(term821, term821.getClass(), "lastRulesCache", term840);
        setField(term803, term803.getClass(), "rules", term821);
        setField(term802, term802.getClass(), "timeZone", term803);
        setByteField(term845, term845.getClass(), "hour", (byte) 5);
        setByteField(term845, term845.getClass(), "minute", (byte) 52);
        setByteField(term845, term845.getClass(), "second", (byte) 34);
        setIntField(term845, term845.getClass(), "nano", 259373454);
        setField(term802, term802.getClass(), "fixedTimeFreeze", term845);
        setIntField(term802, term802.getClass(), "dayToUnfreeze", 318591690);
        setField(term801, term801.getClass(), "freezeProperties", term802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeValidator");
        argTypes[3] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        argTypes[4] = Class.forName("ru.smartup.timetracker.core.lock.LockManager");
        Object[] args = new Object[5];
        args[0] = term789;
        args[1] = null;
        args[2] = null;
        args[3] = term801;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


