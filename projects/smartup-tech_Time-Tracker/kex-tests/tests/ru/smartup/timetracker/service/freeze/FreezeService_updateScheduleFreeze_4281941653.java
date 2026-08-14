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
     Object term692;
     Object term714;

    public FreezeService_updateScheduleFreeze_4281941653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term692 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term693 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term694 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term695 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term696 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term697 = newInstance(Class.forName("java.time.LocalTime"));
        Object term703 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term704 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term705 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term707 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term708 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term693, term693.getClass(), "crudFreezeService", null);
        setField(term696, term696.getClass(), "id", null);
        setField(term696, term696.getClass(), "rules", null);
        setField(term695, term695.getClass(), "timeZone", term696);
        setByteField(term697, term697.getClass(), "hour", (byte) 17);
        setByteField(term697, term697.getClass(), "minute", (byte) 34);
        setByteField(term697, term697.getClass(), "second", (byte) 22);
        setIntField(term697, term697.getClass(), "nano", 134810253);
        setField(term695, term695.getClass(), "fixedTimeFreeze", term697);
        setIntField(term695, term695.getClass(), "dayToUnfreeze", 1240914516);
        setField(term694, term694.getClass(), "freezeProperties", term695);
        setField(term693, term693.getClass(), "freezeDateUtils", term694);
        setField(term693, term693.getClass(), "freezeScheduler", null);
        setField(term693, term693.getClass(), "trackUnitService", null);
        setField(term692, term692.getClass(), "freezeSchedulePlanner", term693);
        setField(term692, term692.getClass(), "crudFreezeService", null);
        setField(term692, term692.getClass(), "freezeValidator", null);
        setField(term705, term705.getClass(), "id", "");
        setField(term707, term707.getClass(), "standardTransitions", null);
        setField(term707, term707.getClass(), "standardOffsets", null);
        setField(term707, term707.getClass(), "savingsInstantTransitions", null);
        setField(term707, term707.getClass(), "savingsLocalTransitions", null);
        setField(term707, term707.getClass(), "wallOffsets", null);
        setField(term707, term707.getClass(), "lastRules", null);
        setField(term707, term707.getClass(), "lastRulesCache", null);
        setField(term705, term705.getClass(), "rules", term707);
        setField(term704, term704.getClass(), "timeZone", term705);
        setByteField(term708, term708.getClass(), "hour", (byte) 15);
        setByteField(term708, term708.getClass(), "minute", (byte) 21);
        setByteField(term708, term708.getClass(), "second", (byte) 6);
        setIntField(term708, term708.getClass(), "nano", 106670766);
        setField(term704, term704.getClass(), "fixedTimeFreeze", term708);
        setIntField(term704, term704.getClass(), "dayToUnfreeze", -1465035361);
        setField(term703, term703.getClass(), "freezeProperties", term704);
        setField(term692, term692.getClass(), "freezeDateUtils", term703);
        setField(term692, term692.getClass(), "lockManager", null);
        term714 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term714;
        callMethod(klass, "updateScheduleFreeze", argTypes, term692, args);
    }

};


