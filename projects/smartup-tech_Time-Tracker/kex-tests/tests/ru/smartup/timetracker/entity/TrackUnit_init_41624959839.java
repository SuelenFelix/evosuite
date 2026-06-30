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

public class TrackUnit_init_41624959839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99755;
     Object term99757;
     Object term99759;
     Object term99761;
     Object term99763;

    public TrackUnit_init_41624959839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99755 = new Long(0L);
        term99757 = new Integer(0);
        term99759 = new Long(0L);
        term99761 = new Float(0.0F);
        term99763 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.TrackUnit");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.util.Date");
        argTypes[7] = float.class;
        argTypes[8] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.TrackUnitStatusEnum");
        argTypes[9] = boolean.class;
        argTypes[10] = Class.forName("java.lang.String");
        Object[] args = new Object[11];
        args[0] = term99755;
        args[1] = term99757;
        args[2] = null;
        args[3] = null;
        args[4] = term99759;
        args[5] = null;
        args[6] = null;
        args[7] = term99761;
        args[8] = null;
        args[9] = term99763;
        args[10] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


