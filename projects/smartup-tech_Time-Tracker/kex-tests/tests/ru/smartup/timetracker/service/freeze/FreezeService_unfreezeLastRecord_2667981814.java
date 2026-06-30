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
     Object term767;

    public FreezeService_unfreezeLastRecord_2667981814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term767 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term768 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term769 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term770 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term771 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term778 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term779 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term780 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term782 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term783 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term768, term768.getClass(), "crudFreezeService", null);
        setField(term771, term771.getClass(), "id", null);
        setField(term771, term771.getClass(), "rules", null);
        setField(term770, term770.getClass(), "timeZone", term771);
        setByteField(term772, term772.getClass(), "hour", (byte) 1);
        setByteField(term772, term772.getClass(), "minute", (byte) 57);
        setByteField(term772, term772.getClass(), "second", (byte) 37);
        setIntField(term772, term772.getClass(), "nano", 285281096);
        setField(term770, term770.getClass(), "fixedTimeFreeze", term772);
        setIntField(term770, term770.getClass(), "dayToUnfreeze", -1310015129);
        setField(term769, term769.getClass(), "freezeProperties", term770);
        setField(term768, term768.getClass(), "freezeDateUtils", term769);
        setField(term768, term768.getClass(), "freezeScheduler", null);
        setField(term768, term768.getClass(), "trackUnitService", null);
        setField(term767, term767.getClass(), "freezeSchedulePlanner", term768);
        setField(term767, term767.getClass(), "crudFreezeService", null);
        setField(term767, term767.getClass(), "freezeValidator", null);
        setField(term780, term780.getClass(), "id", "");
        setField(term782, term782.getClass(), "standardTransitions", null);
        setField(term782, term782.getClass(), "standardOffsets", null);
        setField(term782, term782.getClass(), "savingsInstantTransitions", null);
        setField(term782, term782.getClass(), "savingsLocalTransitions", null);
        setField(term782, term782.getClass(), "wallOffsets", null);
        setField(term782, term782.getClass(), "lastRules", null);
        setField(term782, term782.getClass(), "lastRulesCache", null);
        setField(term780, term780.getClass(), "rules", term782);
        setField(term779, term779.getClass(), "timeZone", term780);
        setByteField(term783, term783.getClass(), "hour", (byte) 7);
        setByteField(term783, term783.getClass(), "minute", (byte) 31);
        setByteField(term783, term783.getClass(), "second", (byte) 4);
        setIntField(term783, term783.getClass(), "nano", 358726743);
        setField(term779, term779.getClass(), "fixedTimeFreeze", term783);
        setIntField(term779, term779.getClass(), "dayToUnfreeze", -2104981311);
        setField(term778, term778.getClass(), "freezeProperties", term779);
        setField(term767, term767.getClass(), "freezeDateUtils", term778);
        setField(term767, term767.getClass(), "lockManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unfreezeLastRecord", argTypes, term767, args);
    }

};


