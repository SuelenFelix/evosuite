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

public class TableMetaInfo_setRowKeySaltUpperAndLower_125693884729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4235;

    public TableMetaInfo_setRowKeySaltUpperAndLower_125693884729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4235 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term4235, term4235.getClass(), "tableName", null);
        setField(term4235, term4235.getClass(), "schemaName", null);
        setField(term4235, term4235.getClass(), "rowKeyColName", null);
        setField(term4235, term4235.getClass(), "rowKeyFormat", null);
        setField(term4235, term4235.getClass(), "rowKeySaltUpperAndLower", null);
        setField(term4235, term4235.getClass(), "describe", null);
        setField(term4235, term4235.getClass(), "columns", null);
        setField(term4235, term4235.getClass(), "rowKeySeparator", null);
        setField(term4235, term4235.getClass(), "rowKeyFirstCharRange", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRowKeySaltUpperAndLower", argTypes, term4235, args);
    }

};


