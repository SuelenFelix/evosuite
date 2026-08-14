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

public class TableMetaInfo_setRowKeyFirstCharRange_77036328019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3790;

    public TableMetaInfo_setRowKeyFirstCharRange_77036328019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3865 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3865, term3865.getClass(), "family", "");
        setField(term3865, term3865.getClass(), "columnName", "");
        setField(term3865, term3865.getClass(), "comment", "");
        setField(term3865, term3865.getClass(), "type", "");
        setBooleanField(term3865, term3865.getClass(), "rowKey", true);
        Object term3871 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3871, term3871.getClass(), "family", "");
        setField(term3871, term3871.getClass(), "columnName", "");
        setField(term3871, term3871.getClass(), "comment", "");
        setField(term3871, term3871.getClass(), "type", "");
        setBooleanField(term3871, term3871.getClass(), "rowKey", true);
        Object term3877 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3877, term3877.getClass(), "family", "");
        setField(term3877, term3877.getClass(), "columnName", "");
        setField(term3877, term3877.getClass(), "comment", "");
        setField(term3877, term3877.getClass(), "type", "");
        setBooleanField(term3877, term3877.getClass(), "rowKey", true);
        Object term3883 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3883, term3883.getClass(), "family", "");
        setField(term3883, term3883.getClass(), "columnName", "");
        setField(term3883, term3883.getClass(), "comment", "");
        setField(term3883, term3883.getClass(), "type", "");
        setBooleanField(term3883, term3883.getClass(), "rowKey", false);
        Object term3889 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3889, term3889.getClass(), "family", "");
        setField(term3889, term3889.getClass(), "columnName", "");
        setField(term3889, term3889.getClass(), "comment", "");
        setField(term3889, term3889.getClass(), "type", "");
        setBooleanField(term3889, term3889.getClass(), "rowKey", false);
        ArrayList term3863 = new ArrayList();
        ((ArrayList) term3863).add(term3865);
        ((ArrayList) term3863).add(term3871);
        ((ArrayList) term3863).add(term3877);
        ((ArrayList) term3863).add(term3883);
        ((ArrayList) term3863).add(term3889);
        term3790 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term3790, term3790.getClass(), "tableName", "cdHYQDgUZR");
        setField(term3790, term3790.getClass(), "schemaName", "KAORSSPSeV");
        setField(term3790, term3790.getClass(), "rowKeyColName", "UimMMORkzd");
        setField(term3790, term3790.getClass(), "rowKeyFormat", "huVIXUWLtI");
        setField(term3790, term3790.getClass(), "rowKeySaltUpperAndLower", "vhKzFyKPOT");
        setField(term3790, term3790.getClass(), "describe", "nQhIgWXdRc");
        setField(term3790, term3790.getClass(), "columns", term3863);
        setField(term3790, term3790.getClass(), "rowKeySeparator", "FlHzxEfFzI");
        setField(term3790, term3790.getClass(), "rowKeyFirstCharRange", "aSATgQUpoe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VkPSXewZfB";
        callMethod(klass, "setRowKeyFirstCharRange", argTypes, term3790, args);
    }

};


