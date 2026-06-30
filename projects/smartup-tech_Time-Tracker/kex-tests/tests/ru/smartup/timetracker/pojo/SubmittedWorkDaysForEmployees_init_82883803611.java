package ru.smartup.timetracker.pojo;

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
import static ru.smartup.timetracker.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;

public class SubmittedWorkDaysForEmployees_init_82883803611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56947;
     Object term56949;
     Object term56951;
     Object term56953;
     Object term56955;

    public SubmittedWorkDaysForEmployees_init_82883803611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56947 = new Integer(0);
        term56949 = new Integer(0);
        term56951 = new Long(0L);
        term56953 = new Long(0L);
        term56955 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.SubmittedWorkDaysForEmployees");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.Date");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = long.class;
        argTypes[7] = long.class;
        argTypes[8] = Class.forName("java.lang.String");
        argTypes[9] = float.class;
        Object[] args = new Object[10];
        args[0] = term56947;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term56949;
        args[5] = null;
        args[6] = term56951;
        args[7] = term56953;
        args[8] = null;
        args[9] = term56955;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


