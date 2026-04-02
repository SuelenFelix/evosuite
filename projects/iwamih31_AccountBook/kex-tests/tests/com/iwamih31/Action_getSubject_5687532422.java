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
import java.lang.Integer;
import java.lang.Object;

public class Action_getSubject_5687532422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12873;

    public Action_getSubject_5687532422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12874 = new Integer(1622346318);
        Integer term12904 = new Integer(1048535127);
        Integer term12906 = new Integer(-655067527);
        term12873 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term12876 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term12873, term12873.getClass(), "id", term12874);
        setIntField(term12876, term12876.getClass(), "year", 2024);
        setShortField(term12876, term12876.getClass(), "month", (short) 1);
        setShortField(term12876, term12876.getClass(), "day", (short) 24);
        setField(term12873, term12873.getClass(), "date", term12876);
        setField(term12873, term12873.getClass(), "subject", "JppkknKVOw");
        setField(term12873, term12873.getClass(), "apply", "iljANwuEjk");
        setField(term12873, term12873.getClass(), "income", term12904);
        setField(term12873, term12873.getClass(), "spending", term12906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSubject", argTypes, term12873, args);
    }

};


