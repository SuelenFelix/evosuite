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

public class QueryStaticEntity_getTodayQueryCounts_9013742902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;

    public QueryStaticEntity_getTodayQueryCounts_9013742902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6 = new Integer(1484323161);
        Integer term8 = new Integer(391863371);
        term5 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryStaticEntity"));
        setField(term5, term5.getClass(), "todayQueryCounts", term6);
        setField(term5, term5.getClass(), "totalQueryCounts", term8);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryStaticEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTodayQueryCounts", argTypes, term5, args);
    }

};


