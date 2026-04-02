package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Set_getValueSet_9629584926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term266;

    public Set_getValueSet_9629584926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term266 = (Object[]) newArray("com.iwamih31.Set", 4);
        Object term267 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term281 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term295 = newInstance(Class.forName("com.iwamih31.Set"));
        Object term309 = newInstance(Class.forName("com.iwamih31.Set"));
        setField(term267, term267.getClass(), "name", "uuaPigETmJ");
        setIntField(term267, term267.getClass(), "value", -522618178);
        setElement(term266, 0, term267);
        setField(term281, term281.getClass(), "name", "MxlszYVzRf");
        setIntField(term281, term281.getClass(), "value", 1134449235);
        setElement(term266, 1, term281);
        setField(term295, term295.getClass(), "name", "LQFpaHEwXR");
        setIntField(term295, term295.getClass(), "value", -883034806);
        setElement(term266, 2, term295);
        setField(term309, term309.getClass(), "name", "oVcInYnLWB");
        setIntField(term309, term309.getClass(), "value", 1585847225);
        setElement(term266, 3, term309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Set");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.iwamih31.Set"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term266;
        callMethod(klass, "get_Value_Set", argTypes, null, args);
    }

};


