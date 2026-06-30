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

public class QueryHistoryEntity_getQueryText_120426862720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1683;

    public QueryHistoryEntity_getQueryText_120426862720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1683 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity"));
        setField(term1683, term1683.getClass(), "id", null);
        setField(term1683, term1683.getClass(), "queryCommand", null);
        setField(term1683, term1683.getClass(), "queryStr", null);
        setField(term1683, term1683.getClass(), "queryText", null);
        setField(term1683, term1683.getClass(), "updateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQueryText", argTypes, term1683, args);
    }

};


