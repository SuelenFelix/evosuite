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

public class QueryHistoryEntity_getQueryText_12042686277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term999;

    public QueryHistoryEntity_getQueryText_12042686277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term1000 = new Integer(-1275173084);
        term999 = newInstance(Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity"));
        setField(term999, term999.getClass(), "id", term1000);
        setField(term999, term999.getClass(), "queryCommand", "TEParAifyi");
        setField(term999, term999.getClass(), "queryStr", "OWDIEULEFu");
        setField(term999, term999.getClass(), "queryText", "dWRymuLBtr");
        setField(term999, term999.getClass(), "updateTime", "2026-06-28 17:29:55");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.sunrise.javbusbot.storege.QueryHistoryEntity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQueryText", argTypes, term999, args);
    }

};


