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

public class QueryHistoryEntity_setUpdateTime_194946720823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1686;

    public QueryHistoryEntity_setUpdateTime_194946720823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1686 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity"));
        setField(term1686, term1686.getClass(), "id", null);
        setField(term1686, term1686.getClass(), "queryCommand", null);
        setField(term1686, term1686.getClass(), "queryStr", null);
        setField(term1686, term1686.getClass(), "queryText", null);
        setField(term1686, term1686.getClass(), "updateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpdateTime", argTypes, term1686, args);
    }

};


