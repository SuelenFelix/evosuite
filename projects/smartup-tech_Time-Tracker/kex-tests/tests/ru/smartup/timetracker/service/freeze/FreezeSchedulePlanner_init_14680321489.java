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

public class FreezeSchedulePlanner_init_14680321489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6465;

    public FreezeSchedulePlanner_init_14680321489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6465 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term6466 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term6467 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6480 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        long[] term6481 = (long[]) newLongArray(1);
        Object[] term6483 = (Object[]) newArray("java.time.ZoneOffset", 2);
        long[] term6484 = (long[]) newLongArray(9);
        Object[] term6494 = (Object[]) newArray("java.time.LocalDateTime", 18);
        Object[] term6495 = (Object[]) newArray("java.time.ZoneOffset", 10);
        Object[] term6496 = (Object[]) newArray("java.time.zone.ZoneOffsetTransitionRule", 0);
        Object term6497 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        Object term6502 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term6467, term6467.getClass(), "id", "Asia/Tokyo");
        setLongElement(term6481, 0, -2587712400L);
        setField(term6480, term6480.getClass(), "standardTransitions", term6481);
        setField(term6480, term6480.getClass(), "standardOffsets", term6483);
        setLongElement(term6484, 0, -2587712400L);
        setLongElement(term6484, 1, -683802000L);
        setLongElement(term6484, 2, -672310800L);
        setLongElement(term6484, 3, -654771600L);
        setLongElement(term6484, 4, -640861200L);
        setLongElement(term6484, 5, -620298000L);
        setLongElement(term6484, 6, -609411600L);
        setLongElement(term6484, 7, -588848400L);
        setLongElement(term6484, 8, -577962000L);
        setField(term6480, term6480.getClass(), "savingsInstantTransitions", term6484);
        setField(term6480, term6480.getClass(), "savingsLocalTransitions", term6494);
        setField(term6480, term6480.getClass(), "wallOffsets", term6495);
        setField(term6480, term6480.getClass(), "lastRules", term6496);
        setField(term6497, term6497.getClass(), "table", null);
        setField(term6497, term6497.getClass(), "nextTable", null);
        setLongField(term6497, term6497.getClass(), "baseCount", 0L);
        setIntField(term6497, term6497.getClass(), "sizeCtl", 0);
        setIntField(term6497, term6497.getClass(), "transferIndex", 0);
        setIntField(term6497, term6497.getClass(), "cellsBusy", 0);
        setField(term6497, term6497.getClass(), "counterCells", null);
        setField(term6497, term6497.getClass(), "keySet", null);
        setField(term6497, term6497.getClass(), "values", null);
        setField(term6497, term6497.getClass(), "entrySet", null);
        setField(term6497, term6497.getClass(), "keySet", null);
        setField(term6497, term6497.getClass(), "values", null);
        setField(term6480, term6480.getClass(), "lastRulesCache", term6497);
        setField(term6467, term6467.getClass(), "rules", term6480);
        setField(term6466, term6466.getClass(), "timeZone", term6467);
        setByteField(term6502, term6502.getClass(), "hour", (byte) 3);
        setByteField(term6502, term6502.getClass(), "minute", (byte) 14);
        setByteField(term6502, term6502.getClass(), "second", (byte) 8);
        setIntField(term6502, term6502.getClass(), "nano", 530944947);
        setField(term6466, term6466.getClass(), "fixedTimeFreeze", term6502);
        setIntField(term6466, term6466.getClass(), "dayToUnfreeze", 1460722225);
        setField(term6465, term6465.getClass(), "freezeProperties", term6466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        argTypes[2] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeScheduler");
        argTypes[3] = Class.forName("ru.smartup.timetracker.service.TrackUnitService");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term6465;
        args[2] = null;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


