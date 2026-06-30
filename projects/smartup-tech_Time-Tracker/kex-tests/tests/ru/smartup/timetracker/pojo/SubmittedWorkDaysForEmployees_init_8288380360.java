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

public class SubmittedWorkDaysForEmployees_init_8288380360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55887;
     Object term55913;
     Object term55915;
     Object term55929;
     Object term55931;
     Object term55945;

    public SubmittedWorkDaysForEmployees_init_8288380360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55887 = new Integer(197109649);
        term55913 = newInstance(Class.forName("java.util.Date"));
        setLongField(term55913, term55913.getClass(), "fastTime", 1825608844992L);
        setField(term55913, term55913.getClass(), "cdate", null);
        term55915 = new Integer(-1239406390);
        term55929 = new Long(6273754186658578034L);
        term55931 = new Long(3620247240684476031L);
        term55945 = new Float(0.6687146F);
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
        args[0] = term55887;
        args[1] = "QNjNTLlUaV";
        args[2] = "hIYsRyOZxk";
        args[3] = term55913;
        args[4] = term55915;
        args[5] = "RjNoEywJbC";
        args[6] = term55929;
        args[7] = term55931;
        args[8] = "RTTvrwwhou";
        args[9] = term55945;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


