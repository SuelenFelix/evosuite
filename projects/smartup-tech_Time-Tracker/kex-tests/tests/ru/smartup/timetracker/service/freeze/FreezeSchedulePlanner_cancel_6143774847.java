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

public class FreezeSchedulePlanner_cancel_6143774847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71980;

    public FreezeSchedulePlanner_cancel_6143774847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71980 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term71981 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term71982 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term71983 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term71985 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term71986 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term71980, term71980.getClass(), "crudFreezeService", null);
        setField(term71983, term71983.getClass(), "id", "");
        setField(term71985, term71985.getClass(), "standardTransitions", null);
        setField(term71985, term71985.getClass(), "standardOffsets", null);
        setField(term71985, term71985.getClass(), "savingsInstantTransitions", null);
        setField(term71985, term71985.getClass(), "savingsLocalTransitions", null);
        setField(term71985, term71985.getClass(), "wallOffsets", null);
        setField(term71985, term71985.getClass(), "lastRules", null);
        setField(term71985, term71985.getClass(), "lastRulesCache", null);
        setField(term71983, term71983.getClass(), "rules", term71985);
        setField(term71982, term71982.getClass(), "timeZone", term71983);
        setByteField(term71986, term71986.getClass(), "hour", (byte) 13);
        setByteField(term71986, term71986.getClass(), "minute", (byte) 2);
        setByteField(term71986, term71986.getClass(), "second", (byte) 21);
        setIntField(term71986, term71986.getClass(), "nano", 2264678);
        setField(term71982, term71982.getClass(), "fixedTimeFreeze", term71986);
        setIntField(term71982, term71982.getClass(), "dayToUnfreeze", 1706047059);
        setField(term71981, term71981.getClass(), "freezeProperties", term71982);
        setField(term71980, term71980.getClass(), "freezeDateUtils", term71981);
        setField(term71980, term71980.getClass(), "freezeScheduler", null);
        setField(term71980, term71980.getClass(), "trackUnitService", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cancel", argTypes, term71980, args);
    }

};


