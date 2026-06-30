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
import java.lang.Boolean;

public class TrackUnit_init_14868758040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99765;
     Object term99767;
     Object term99769;
     Object term99771;
     Object term99773;
     Object term99775;

    public TrackUnit_init_14868758040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99765 = new Long(0L);
        term99767 = new Integer(0);
        term99769 = new Long(0L);
        term99771 = new Float(0.0F);
        term99773 = new Boolean(false);
        term99775 = new Boolean(false);
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
        args[0] = term99765;
        args[1] = term99767;
        args[2] = null;
        args[3] = term99769;
        args[4] = null;
        args[5] = null;
        args[6] = term99771;
        args[7] = null;
        args[8] = term99773;
        args[9] = null;
        args[10] = term99775;
        args[11] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


