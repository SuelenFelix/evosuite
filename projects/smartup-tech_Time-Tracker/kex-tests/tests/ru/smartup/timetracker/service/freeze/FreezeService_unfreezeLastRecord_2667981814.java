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

public class FreezeService_unfreezeLastRecord_2667981814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term768;

    public FreezeService_unfreezeLastRecord_2667981814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term768 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term769 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term770 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term771 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term772 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term773 = newInstance(Class.forName("java.time.LocalTime"));
        Object term779 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term780 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term781 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term783 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term784 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term769, term769.getClass(), "crudFreezeService", null);
        setField(term772, term772.getClass(), "id", null);
        setField(term772, term772.getClass(), "rules", null);
        setField(term771, term771.getClass(), "timeZone", term772);
        setByteField(term773, term773.getClass(), "hour", (byte) 1);
        setByteField(term773, term773.getClass(), "minute", (byte) 57);
        setByteField(term773, term773.getClass(), "second", (byte) 37);
        setIntField(term773, term773.getClass(), "nano", 285281096);
        setField(term771, term771.getClass(), "fixedTimeFreeze", term773);
        setIntField(term771, term771.getClass(), "dayToUnfreeze", -1310015129);
        setField(term770, term770.getClass(), "freezeProperties", term771);
        setField(term769, term769.getClass(), "freezeDateUtils", term770);
        setField(term769, term769.getClass(), "freezeScheduler", null);
        setField(term769, term769.getClass(), "trackUnitService", null);
        setField(term768, term768.getClass(), "freezeSchedulePlanner", term769);
        setField(term768, term768.getClass(), "crudFreezeService", null);
        setField(term768, term768.getClass(), "freezeValidator", null);
        setField(term781, term781.getClass(), "id", "");
        setField(term783, term783.getClass(), "standardTransitions", null);
        setField(term783, term783.getClass(), "standardOffsets", null);
        setField(term783, term783.getClass(), "savingsInstantTransitions", null);
        setField(term783, term783.getClass(), "savingsLocalTransitions", null);
        setField(term783, term783.getClass(), "wallOffsets", null);
        setField(term783, term783.getClass(), "lastRules", null);
        setField(term783, term783.getClass(), "lastRulesCache", null);
        setField(term781, term781.getClass(), "rules", term783);
        setField(term780, term780.getClass(), "timeZone", term781);
        setByteField(term784, term784.getClass(), "hour", (byte) 7);
        setByteField(term784, term784.getClass(), "minute", (byte) 31);
        setByteField(term784, term784.getClass(), "second", (byte) 4);
        setIntField(term784, term784.getClass(), "nano", 358726743);
        setField(term780, term780.getClass(), "fixedTimeFreeze", term784);
        setIntField(term780, term780.getClass(), "dayToUnfreeze", -2104981311);
        setField(term779, term779.getClass(), "freezeProperties", term780);
        setField(term768, term768.getClass(), "freezeDateUtils", term779);
        setField(term768, term768.getClass(), "lockManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unfreezeLastRecord", argTypes, term768, args);
    }

};


