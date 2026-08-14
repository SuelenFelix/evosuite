package com.analysys.presto.connector.hbase.meta;

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
import static com.analysys.presto.connector.hbase.meta.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ColumnMetaInfo_getType_95941223219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5558;

    public ColumnMetaInfo_getType_95941223219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5558 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term5558, term5558.getClass(), "family", null);
        setField(term5558, term5558.getClass(), "columnName", null);
        setField(term5558, term5558.getClass(), "comment", null);
        setField(term5558, term5558.getClass(), "type", null);
        setBooleanField(term5558, term5558.getClass(), "rowKey", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term5558, args);
    }

};


