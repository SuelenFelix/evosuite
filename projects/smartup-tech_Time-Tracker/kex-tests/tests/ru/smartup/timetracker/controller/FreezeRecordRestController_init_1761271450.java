package ru.smartup.timetracker.controller;

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
import static ru.smartup.timetracker.controller.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FreezeRecordRestController_init_1761271450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public FreezeRecordRestController_init_1761271450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1467 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term1468 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term1469 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1470 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1471 = newInstance(Class.forName("java.time.ZoneOffset"));
        Object term1473 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1479 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term1480 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term1481 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term1483 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term1484 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1468, term1468.getClass(), "crudFreezeService", null);
        setIntField(term1471, term1471.getClass(), "totalSeconds", -25200);
        setField(term1471, term1471.getClass(), "id", null);
        setField(term1470, term1470.getClass(), "timeZone", term1471);
        setByteField(term1473, term1473.getClass(), "hour", (byte) 12);
        setByteField(term1473, term1473.getClass(), "minute", (byte) 32);
        setByteField(term1473, term1473.getClass(), "second", (byte) 20);
        setIntField(term1473, term1473.getClass(), "nano", 132387463);
        setField(term1470, term1470.getClass(), "fixedTimeFreeze", term1473);
        setIntField(term1470, term1470.getClass(), "dayToUnfreeze", 1048535127);
        setField(term1469, term1469.getClass(), "freezeProperties", term1470);
        setField(term1468, term1468.getClass(), "freezeDateUtils", term1469);
        setField(term1468, term1468.getClass(), "freezeScheduler", null);
        setField(term1468, term1468.getClass(), "trackUnitService", null);
        setField(term1467, term1467.getClass(), "freezeSchedulePlanner", term1468);
        setField(term1467, term1467.getClass(), "crudFreezeService", null);
        setField(term1467, term1467.getClass(), "freezeValidator", null);
        setField(term1481, term1481.getClass(), "id", "");
        setField(term1483, term1483.getClass(), "standardTransitions", null);
        setField(term1483, term1483.getClass(), "standardOffsets", null);
        setField(term1483, term1483.getClass(), "savingsInstantTransitions", null);
        setField(term1483, term1483.getClass(), "savingsLocalTransitions", null);
        setField(term1483, term1483.getClass(), "wallOffsets", null);
        setField(term1483, term1483.getClass(), "lastRules", null);
        setField(term1483, term1483.getClass(), "lastRulesCache", null);
        setField(term1481, term1481.getClass(), "rules", term1483);
        setField(term1480, term1480.getClass(), "timeZone", term1481);
        setByteField(term1484, term1484.getClass(), "hour", (byte) 8);
        setByteField(term1484, term1484.getClass(), "minute", (byte) 15);
        setByteField(term1484, term1484.getClass(), "second", (byte) 23);
        setIntField(term1484, term1484.getClass(), "nano", 285707349);
        setField(term1480, term1480.getClass(), "fixedTimeFreeze", term1484);
        setIntField(term1480, term1480.getClass(), "dayToUnfreeze", -655067527);
        setField(term1479, term1479.getClass(), "freezeProperties", term1480);
        setField(term1467, term1467.getClass(), "freezeDateUtils", term1479);
        setField(term1467, term1467.getClass(), "lockManager", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.controller.FreezeRecordRestController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.service.freeze.CRUDFreezeService");
        argTypes[1] = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1467;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


