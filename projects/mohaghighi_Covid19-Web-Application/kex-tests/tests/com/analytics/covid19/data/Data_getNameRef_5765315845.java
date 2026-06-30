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

public class Data_getNameRef_5765315845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3442;

    public Data_getNameRef_5765315845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3442 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term3443 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3443, term3443.getClass(), "year", 2023);
        setShortField(term3443, term3443.getClass(), "month", (short) 8);
        setShortField(term3443, term3443.getClass(), "day", (short) 12);
        setField(term3442, term3442.getClass(), "date", term3443);
        setIntField(term3442, term3442.getClass(), "stat", -1685132342);
        setField(term3442, term3442.getClass(), "NameRef", "");
        setField(term3442, term3442.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameRef", argTypes, term3442, args);
    }

};


