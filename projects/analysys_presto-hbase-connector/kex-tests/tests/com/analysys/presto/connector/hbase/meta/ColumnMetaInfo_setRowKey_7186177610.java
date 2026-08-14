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
import java.lang.Boolean;

public class ColumnMetaInfo_setRowKey_7186177610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5364;
     Object term5414;

    public ColumnMetaInfo_setRowKey_7186177610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5364 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term5364, term5364.getClass(), "family", "LrqwfrKKtS");
        setField(term5364, term5364.getClass(), "columnName", "ZUdnQXfzCI");
        setField(term5364, term5364.getClass(), "comment", "EULDrUNQvw");
        setField(term5364, term5364.getClass(), "type", "BtvAvsJSei");
        setBooleanField(term5364, term5364.getClass(), "rowKey", false);
        term5414 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5414;
        callMethod(klass, "setRowKey", argTypes, term5364, args);
    }

};


