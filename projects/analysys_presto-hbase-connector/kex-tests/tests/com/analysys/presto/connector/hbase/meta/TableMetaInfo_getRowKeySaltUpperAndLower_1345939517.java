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
import java.util.ArrayList;
import java.lang.Object;

public class TableMetaInfo_getRowKeySaltUpperAndLower_1345939517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1291;

    public TableMetaInfo_getRowKeySaltUpperAndLower_1345939517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1366 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1366, term1366.getClass(), "family", "");
        setField(term1366, term1366.getClass(), "columnName", "");
        setField(term1366, term1366.getClass(), "comment", "");
        setField(term1366, term1366.getClass(), "type", "");
        setBooleanField(term1366, term1366.getClass(), "rowKey", true);
        Object term1372 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1372, term1372.getClass(), "family", "");
        setField(term1372, term1372.getClass(), "columnName", "");
        setField(term1372, term1372.getClass(), "comment", "");
        setField(term1372, term1372.getClass(), "type", "");
        setBooleanField(term1372, term1372.getClass(), "rowKey", true);
        ArrayList term1364 = new ArrayList();
        ((ArrayList) term1364).add(term1366);
        ((ArrayList) term1364).add(term1372);
        term1291 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1291, term1291.getClass(), "tableName", "pXOkjyeIRb");
        setField(term1291, term1291.getClass(), "schemaName", "GgZWSjxjyE");
        setField(term1291, term1291.getClass(), "rowKeyColName", "EeBVbzjcCI");
        setField(term1291, term1291.getClass(), "rowKeyFormat", "UfQtPRyWRC");
        setField(term1291, term1291.getClass(), "rowKeySaltUpperAndLower", "FPvxVzzSvD");
        setField(term1291, term1291.getClass(), "describe", "WHcwFgsGFC");
        setField(term1291, term1291.getClass(), "columns", term1364);
        setField(term1291, term1291.getClass(), "rowKeySeparator", "PtirvZmsGt");
        setField(term1291, term1291.getClass(), "rowKeyFirstCharRange", "HWkpTmtlrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeySaltUpperAndLower", argTypes, term1291, args);
    }

};


