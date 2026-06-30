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
import java.util.LinkedHashMap;

public class FreezeService_updateScheduleFreeze_4281941653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691;
     Object term713;

    public FreezeService_updateScheduleFreeze_4281941653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term692 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term693 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term694 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term695 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term702 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term703 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term704 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term706 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term707 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term692, term692.getClass(), "crudFreezeService", null);
        setField(term695, term695.getClass(), "id", null);
        setField(term695, term695.getClass(), "rules", null);
        setField(term694, term694.getClass(), "timeZone", term695);
        setByteField(term696, term696.getClass(), "hour", (byte) 17);
        setByteField(term696, term696.getClass(), "minute", (byte) 34);
        setByteField(term696, term696.getClass(), "second", (byte) 22);
        setIntField(term696, term696.getClass(), "nano", 134810253);
        setField(term694, term694.getClass(), "fixedTimeFreeze", term696);
        setIntField(term694, term694.getClass(), "dayToUnfreeze", 1240914516);
        setField(term693, term693.getClass(), "freezeProperties", term694);
        setField(term692, term692.getClass(), "freezeDateUtils", term693);
        setField(term692, term692.getClass(), "freezeScheduler", null);
        setField(term692, term692.getClass(), "trackUnitService", null);
        setField(term691, term691.getClass(), "freezeSchedulePlanner", term692);
        setField(term691, term691.getClass(), "crudFreezeService", null);
        setField(term691, term691.getClass(), "freezeValidator", null);
        setField(term704, term704.getClass(), "id", "");
        setField(term706, term706.getClass(), "standardTransitions", null);
        setField(term706, term706.getClass(), "standardOffsets", null);
        setField(term706, term706.getClass(), "savingsInstantTransitions", null);
        setField(term706, term706.getClass(), "savingsLocalTransitions", null);
        setField(term706, term706.getClass(), "wallOffsets", null);
        setField(term706, term706.getClass(), "lastRules", null);
        setField(term706, term706.getClass(), "lastRulesCache", null);
        setField(term704, term704.getClass(), "rules", term706);
        setField(term703, term703.getClass(), "timeZone", term704);
        setByteField(term707, term707.getClass(), "hour", (byte) 15);
        setByteField(term707, term707.getClass(), "minute", (byte) 21);
        setByteField(term707, term707.getClass(), "second", (byte) 6);
        setIntField(term707, term707.getClass(), "nano", 106670766);
        setField(term703, term703.getClass(), "fixedTimeFreeze", term707);
        setIntField(term703, term703.getClass(), "dayToUnfreeze", -1465035361);
        setField(term702, term702.getClass(), "freezeProperties", term703);
        setField(term691, term691.getClass(), "freezeDateUtils", term702);
        setField(term691, term691.getClass(), "lockManager", null);
        term713 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term713;
        callMethod(klass, "updateScheduleFreeze", argTypes, term691, args);
    }

};


