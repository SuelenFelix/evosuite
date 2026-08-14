package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HistoryItem_getAlertDate_5560235614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2751;

    public HistoryItem_getAlertDate_5560235614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2751 = newInstance(Class.forName("com.dmatik.orefalerts.entity.HistoryItem"));
        setField(term2751, term2751.getClass(), "alertDate", null);
        setField(term2751, term2751.getClass(), "title", null);
        setField(term2751, term2751.getClass(), "data", null);
        setIntField(term2751, term2751.getClass(), "category", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.HistoryItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlertDate", argTypes, term2751, args);
    }

};


