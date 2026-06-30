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

public class Data_setNameRef_2349494409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3488;

    public Data_setNameRef_2349494409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3488 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3489 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3489, term3489.getClass(), "year", 2017);
        setShortField(term3489, term3489.getClass(), "month", (short) 3);
        setShortField(term3489, term3489.getClass(), "day", (short) 5);
        setField(term3488, term3488.getClass(), "date", term3489);
        setIntField(term3488, term3488.getClass(), "stat", -6029667);
        setField(term3488, term3488.getClass(), "NameRef", "");
        setField(term3488, term3488.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VMeAzAHwZj";
        callMethod(klass, "setNameRef", argTypes, term3488, args);
    }

};


