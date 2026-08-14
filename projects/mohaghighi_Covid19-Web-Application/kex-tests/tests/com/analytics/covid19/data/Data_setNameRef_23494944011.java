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

public class Data_setNameRef_23494944011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2721;

    public Data_setNameRef_23494944011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2721 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term2722 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term2722, term2722.getClass(), "year", 2027);
        setShortField(term2722, term2722.getClass(), "month", (short) 3);
        setShortField(term2722, term2722.getClass(), "day", (short) 14);
        setField(term2721, term2721.getClass(), "date", term2722);
        setIntField(term2721, term2721.getClass(), "stat", -6029667);
        setField(term2721, term2721.getClass(), "NameRef", "");
        setField(term2721, term2721.getClass(), "Region", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Data");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sEnIVFtZuQ";
        callMethod(klass, "setNameRef", argTypes, term2721, args);
    }

};


