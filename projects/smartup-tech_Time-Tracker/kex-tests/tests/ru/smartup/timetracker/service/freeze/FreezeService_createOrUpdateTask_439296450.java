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
import java.util.ArrayList;
import java.lang.Integer;

public class FreezeService_createOrUpdateTask_439296450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term23;
     Object term48;

    public FreezeService_createOrUpdateTask_439296450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeService"));
        Object term2 = newInstance(Class.forName("ru.smartup.timetracker.service.freeze.FreezeSchedulePlanner"));
        Object term3 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term4 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term5 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term6 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12 = newInstance(Class.forName("ru.smartup.timetracker.utils.FreezeDateUtils"));
        Object term13 = newInstance(Class.forName("ru.smartup.timetracker.core.freeze.ScheduleFreezeProperties"));
        Object term14 = newInstance(Class.forName("java.time.ZoneRegion"));
        Object term16 = newInstance(Class.forName("java.time.zone.ZoneRules"));
        Object term17 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2, term2.getClass(), "crudFreezeService", null);
        setField(term5, term5.getClass(), "id", null);
        setField(term5, term5.getClass(), "rules", null);
        setField(term4, term4.getClass(), "timeZone", term5);
        setByteField(term6, term6.getClass(), "hour", (byte) 12);
        setByteField(term6, term6.getClass(), "minute", (byte) 32);
        setByteField(term6, term6.getClass(), "second", (byte) 20);
        setIntField(term6, term6.getClass(), "nano", 132387463);
        setField(term4, term4.getClass(), "fixedTimeFreeze", term6);
        setIntField(term4, term4.getClass(), "dayToUnfreeze", 568599855);
        setField(term3, term3.getClass(), "freezeProperties", term4);
        setField(term2, term2.getClass(), "freezeDateUtils", term3);
        setField(term2, term2.getClass(), "freezeScheduler", null);
        setField(term2, term2.getClass(), "trackUnitService", null);
        setField(term1, term1.getClass(), "freezeSchedulePlanner", term2);
        setField(term1, term1.getClass(), "crudFreezeService", null);
        setField(term1, term1.getClass(), "freezeValidator", null);
        setField(term14, term14.getClass(), "id", "");
        setField(term16, term16.getClass(), "standardTransitions", null);
        setField(term16, term16.getClass(), "standardOffsets", null);
        setField(term16, term16.getClass(), "savingsInstantTransitions", null);
        setField(term16, term16.getClass(), "savingsLocalTransitions", null);
        setField(term16, term16.getClass(), "wallOffsets", null);
        setField(term16, term16.getClass(), "lastRules", null);
        setField(term16, term16.getClass(), "lastRulesCache", null);
        setField(term14, term14.getClass(), "rules", term16);
        setField(term13, term13.getClass(), "timeZone", term14);
        setByteField(term17, term17.getClass(), "hour", (byte) 8);
        setByteField(term17, term17.getClass(), "minute", (byte) 15);
        setByteField(term17, term17.getClass(), "second", (byte) 23);
        setIntField(term17, term17.getClass(), "nano", 285707349);
        setField(term13, term13.getClass(), "fixedTimeFreeze", term17);
        setIntField(term13, term13.getClass(), "dayToUnfreeze", 1162663216);
        setField(term12, term12.getClass(), "freezeProperties", term13);
        setField(term1, term1.getClass(), "freezeDateUtils", term12);
        setField(term1, term1.getClass(), "lockManager", null);
        Object term26 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term26, term26.getClass(), "year", 2012);
        setShortField(term26, term26.getClass(), "month", (short) 8);
        setShortField(term26, term26.getClass(), "day", (short) 25);
        Object term30 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term30, term30.getClass(), "year", 2016);
        setShortField(term30, term30.getClass(), "month", (short) 11);
        setShortField(term30, term30.getClass(), "day", (short) 29);
        Object term34 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term34, term34.getClass(), "year", 2021);
        setShortField(term34, term34.getClass(), "month", (short) 1);
        setShortField(term34, term34.getClass(), "day", (short) 18);
        Object term38 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term38, term38.getClass(), "year", 2020);
        setShortField(term38, term38.getClass(), "month", (short) 11);
        setShortField(term38, term38.getClass(), "day", (short) 22);
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term42, term42.getClass(), "year", 2015);
        setShortField(term42, term42.getClass(), "month", (short) 9);
        setShortField(term42, term42.getClass(), "day", (short) 19);
        ArrayList term24 = new ArrayList();
        ((ArrayList) term24).add(term26);
        ((ArrayList) term24).add(term30);
        ((ArrayList) term24).add(term34);
        ((ArrayList) term24).add(term38);
        ((ArrayList) term24).add(term42);
        term23 = newInstance(Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest"));
        setField(term23, term23.getClass(), "dates", term24);
        term48 = new Integer(1484323161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.freeze.FreezeService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("ru.smartup.timetracker.dto.freeze.request.FreezeDateDtoRequest");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23;
        args[1] = term48;
        callMethod(klass, "createOrUpdateTask", argTypes, term1, args);
    }

};


