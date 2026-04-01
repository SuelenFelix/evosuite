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

public class QueryHistoryEntity_getId_1959258341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public QueryHistoryEntity_getId_1959258341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term300 = new Integer(-6029667);
        term299 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity"));
        setField(term299, term299.getClass(), "id", term300);
        setField(term299, term299.getClass(), "queryCommand", "RMFIsYGgne");
        setField(term299, term299.getClass(), "queryStr", "NRdvgJlhkX");
        setField(term299, term299.getClass(), "queryText", "uuaPigETmJ");
        setField(term299, term299.getClass(), "updateTime", "2026-04-01 16:01:18");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term299, args);
    }

};


