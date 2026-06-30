package com.sunrise.javbusbot.storege;

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
import static com.sunrise.javbusbot.storege.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class QueryStaticEntity_getMaxDateTimeBounds_19304011106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;

    public QueryStaticEntity_getMaxDateTimeBounds_19304011106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term30 = new Integer(1134449235);
        Integer term32 = new Integer(-883034806);
        term29 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryStaticEntity"));
        setField(term29, term29.getClass(), "todayQueryCounts", term30);
        setField(term29, term29.getClass(), "totalQueryCounts", term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryStaticEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxDateTimeBounds", argTypes, term29, args);
    }

};


