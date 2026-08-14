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

public class TableMetaInfo_getRowKeyPrefixLower_176991665130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4236;

    public TableMetaInfo_getRowKeyPrefixLower_176991665130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4236 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term4236, term4236.getClass(), "tableName", null);
        setField(term4236, term4236.getClass(), "schemaName", null);
        setField(term4236, term4236.getClass(), "rowKeyColName", null);
        setField(term4236, term4236.getClass(), "rowKeyFormat", null);
        setField(term4236, term4236.getClass(), "rowKeySaltUpperAndLower", null);
        setField(term4236, term4236.getClass(), "describe", null);
        setField(term4236, term4236.getClass(), "columns", null);
        setField(term4236, term4236.getClass(), "rowKeySeparator", null);
        setField(term4236, term4236.getClass(), "rowKeyFirstCharRange", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyPrefixLower", argTypes, term4236, args);
    }

};


