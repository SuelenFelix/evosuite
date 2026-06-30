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

public class TrackUnitProjectTask_init_28317406415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55747;
     Object term55749;
     Object term55751;
     Object term55753;
     Object term55767;

    public TrackUnitProjectTask_init_28317406415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55747 = new Integer(-2066804303);
        term55749 = new Long(-900457279156388404L);
        term55751 = newInstance(Class.forName("java.util.Date"));
        setLongField(term55751, term55751.getClass(), "fastTime", 1467783054847L);
        setField(term55751, term55751.getClass(), "cdate", null);
        term55753 = new Integer(-1731761810);
        term55767 = new Long(1084801489398441516L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.pojo.TrackUnitProjectTask");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = long.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term55747;
        args[1] = term55749;
        args[2] = term55751;
        args[3] = term55753;
        args[4] = "IApvtmfhnq";
        args[5] = term55767;
        args[6] = "VSaNnhMpRc";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


