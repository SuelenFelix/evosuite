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

public class FreezeDateUtils_getZoneUnfreezingTimestamp_6768745752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1479;

    public FreezeDateUtils_getZoneUnfreezingTimestamp_6768745752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1479 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1480 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1481 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1491 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1481, term1481.getClass(), "totalSeconds", -25200);
        setField(term1481, term1481.getClass(), "id", "-07:00");
        setField(term1480, term1480.getClass(), "timeZone", term1481);
        setByteField(term1491, term1491.getClass(), "hour", (byte) 11);
        setByteField(term1491, term1491.getClass(), "minute", (byte) 50);
        setByteField(term1491, term1491.getClass(), "second", (byte) 22);
        setIntField(term1491, term1491.getClass(), "nano", 607649559);
        setField(term1480, term1480.getClass(), "fixedTimeFreeze", term1491);
        setIntField(term1480, term1480.getClass(), "dayToUnfreeze", -2038273078);
        setField(term1479, term1479.getClass(), "freezeProperties", term1480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoneUnfreezingTimestamp", argTypes, term1479, args);
    }

};


