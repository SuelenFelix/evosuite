package com.analysys.presto.connector.hbase.utils;

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
import static com.analysys.presto.connector.hbase.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeTicker_checkUpdateAndPrint_17597580654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term852;

    public TimeTicker_checkUpdateAndPrint_17597580654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term852 = newInstance(Class.forName("com.analysys.presto.connector.hbase.utils.TimeTicker"));
        setLongField(term852, term852.getClass(), "time", 1786432368273L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.utils.TimeTicker");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkUpdateAndPrint", argTypes, term852, args);
    }

};


