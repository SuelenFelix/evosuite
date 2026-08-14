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

public class TableMetaInfo_getRowKeyPrefixUpper_194481368610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946;

    public TableMetaInfo_getRowKeyPrefixUpper_194481368610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2021 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2021, term2021.getClass(), "family", "");
        setField(term2021, term2021.getClass(), "columnName", "");
        setField(term2021, term2021.getClass(), "comment", "");
        setField(term2021, term2021.getClass(), "type", "");
        setBooleanField(term2021, term2021.getClass(), "rowKey", true);
        ArrayList term2019 = new ArrayList();
        ((ArrayList) term2019).add(term2021);
        term1946 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1946, term1946.getClass(), "tableName", "gUvcueTURF");
        setField(term1946, term1946.getClass(), "schemaName", "EwQBhZjCIT");
        setField(term1946, term1946.getClass(), "rowKeyColName", "aSkmSwTnEw");
        setField(term1946, term1946.getClass(), "rowKeyFormat", "xvkbvaEGYd");
        setField(term1946, term1946.getClass(), "rowKeySaltUpperAndLower", "HBGNxdNURv");
        setField(term1946, term1946.getClass(), "describe", "mfCpTPPQQm");
        setField(term1946, term1946.getClass(), "columns", term2019);
        setField(term1946, term1946.getClass(), "rowKeySeparator", "IpQuOGMgmj");
        setField(term1946, term1946.getClass(), "rowKeyFirstCharRange", "pJbnHTYrxn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyPrefixUpper", argTypes, term1946, args);
    }

};


