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

public class TableMetaInfo_getRowKeyPrefixLower_17699166519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;

    public TableMetaInfo_getRowKeyPrefixLower_17699166519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1798 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1798, term1798.getClass(), "family", "");
        setField(term1798, term1798.getClass(), "columnName", "");
        setField(term1798, term1798.getClass(), "comment", "");
        setField(term1798, term1798.getClass(), "type", "");
        setBooleanField(term1798, term1798.getClass(), "rowKey", true);
        Object term1804 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1804, term1804.getClass(), "family", "");
        setField(term1804, term1804.getClass(), "columnName", "");
        setField(term1804, term1804.getClass(), "comment", "");
        setField(term1804, term1804.getClass(), "type", "");
        setBooleanField(term1804, term1804.getClass(), "rowKey", true);
        Object term1810 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1810, term1810.getClass(), "family", "");
        setField(term1810, term1810.getClass(), "columnName", "");
        setField(term1810, term1810.getClass(), "comment", "");
        setField(term1810, term1810.getClass(), "type", "");
        setBooleanField(term1810, term1810.getClass(), "rowKey", true);
        Object term1816 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1816, term1816.getClass(), "family", "");
        setField(term1816, term1816.getClass(), "columnName", "");
        setField(term1816, term1816.getClass(), "comment", "");
        setField(term1816, term1816.getClass(), "type", "");
        setBooleanField(term1816, term1816.getClass(), "rowKey", false);
        Object term1822 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1822, term1822.getClass(), "family", "");
        setField(term1822, term1822.getClass(), "columnName", "");
        setField(term1822, term1822.getClass(), "comment", "");
        setField(term1822, term1822.getClass(), "type", "");
        setBooleanField(term1822, term1822.getClass(), "rowKey", true);
        Object term1828 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1828, term1828.getClass(), "family", "");
        setField(term1828, term1828.getClass(), "columnName", "");
        setField(term1828, term1828.getClass(), "comment", "");
        setField(term1828, term1828.getClass(), "type", "");
        setBooleanField(term1828, term1828.getClass(), "rowKey", true);
        Object term1834 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1834, term1834.getClass(), "family", "");
        setField(term1834, term1834.getClass(), "columnName", "");
        setField(term1834, term1834.getClass(), "comment", "");
        setField(term1834, term1834.getClass(), "type", "");
        setBooleanField(term1834, term1834.getClass(), "rowKey", true);
        ArrayList term1796 = new ArrayList();
        ((ArrayList) term1796).add(term1798);
        ((ArrayList) term1796).add(term1804);
        ((ArrayList) term1796).add(term1810);
        ((ArrayList) term1796).add(term1816);
        ((ArrayList) term1796).add(term1822);
        ((ArrayList) term1796).add(term1828);
        ((ArrayList) term1796).add(term1834);
        term1723 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1723, term1723.getClass(), "tableName", "OqbwYQfvAe");
        setField(term1723, term1723.getClass(), "schemaName", "tRxZafjqIx");
        setField(term1723, term1723.getClass(), "rowKeyColName", "DhjNLmRMCu");
        setField(term1723, term1723.getClass(), "rowKeyFormat", "PgPzMSEjjX");
        setField(term1723, term1723.getClass(), "rowKeySaltUpperAndLower", "wzsPSPcRdj");
        setField(term1723, term1723.getClass(), "describe", "kGMQdqJYyB");
        setField(term1723, term1723.getClass(), "columns", term1796);
        setField(term1723, term1723.getClass(), "rowKeySeparator", "AHbZyFOmlo");
        setField(term1723, term1723.getClass(), "rowKeyFirstCharRange", "TwfWVQGiIj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyPrefixLower", argTypes, term1723, args);
    }

};


