package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Data_setStat_20403818458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3476;
     Object term3486;

    public Data_setStat_20403818458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3476 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3477 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3477, term3477.getClass(), "year", 2011);
        setShortField(term3477, term3477.getClass(), "month", (short) 5);
        setShortField(term3477, term3477.getClass(), "day", (short) 4);
        setField(term3476, term3476.getClass(), "date", term3477);
        setIntField(term3476, term3476.getClass(), "stat", 1048535127);
        setField(term3476, term3476.getClass(), "NameRef", "");
        setField(term3476, term3476.getClass(), "Region", "");
        term3486 = new Integer(-655067527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3486;
        callMethod(klass, "setStat", argTypes, term3476, args);
    }

};


