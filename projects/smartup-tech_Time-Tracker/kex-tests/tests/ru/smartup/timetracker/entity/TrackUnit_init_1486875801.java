package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class TrackUnit_init_1486875801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64038;
     Object term64040;
     Object term64054;
     Object term64068;
     Object term64070;
     Object enum146;
     Object term64085;
     Object term64099;

    public TrackUnit_init_1486875801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64038 = new Long(-5892135042702373494L);
        term64040 = new Integer(1272542218);
        term64054 = new Long(5262507301787091109L);
        term64068 = newInstance(Class.forName("java.util.Date"));
        setLongField(term64068, term64068.getClass(), "fastTime", 1480438351369L);
        setField(term64068, term64068.getClass(), "cdate", null);
        term64070 = new Float(0.2707036F);
        Class<? extends Object> term64134 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        Field term64133 = ((Class) term64134).getDeclaredField((String) "SUBMITTED");
        ((Field) term64133).setAccessible(true);
        enum146 = ((Field) term64133).get((Object) null);
        term64085 = new Boolean(false);
        term64099 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = long.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.Date");
        argTypes[6] = float.class;
        argTypes[7] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        argTypes[8] = boolean.class;
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = boolean.class;
        argTypes[11] = Class.forName("java.lang.String");
        Object[] args = new Object[12];
        args[0] = term64038;
        args[1] = term64040;
        args[2] = "avhRaGZaBF";
        args[3] = term64054;
        args[4] = "JkgoRtImdE";
        args[5] = term64068;
        args[6] = term64070;
        args[7] = enum146;
        args[8] = term64085;
        args[9] = "qFGKIJjlmV";
        args[10] = term64099;
        args[11] = "IHqvyhMtuM";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


