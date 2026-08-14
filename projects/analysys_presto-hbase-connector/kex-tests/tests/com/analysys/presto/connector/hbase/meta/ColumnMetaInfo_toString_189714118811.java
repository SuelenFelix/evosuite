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

public class ColumnMetaInfo_toString_189714118811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5456;

    public ColumnMetaInfo_toString_189714118811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5456 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term5456, term5456.getClass(), "family", "vqnBkkxoIa");
        setField(term5456, term5456.getClass(), "columnName", "bycpZjxXFn");
        setField(term5456, term5456.getClass(), "comment", "jQWttOAiwL");
        setField(term5456, term5456.getClass(), "type", "DzKFxEuEEC");
        setBooleanField(term5456, term5456.getClass(), "rowKey", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5456, args);
    }

};


