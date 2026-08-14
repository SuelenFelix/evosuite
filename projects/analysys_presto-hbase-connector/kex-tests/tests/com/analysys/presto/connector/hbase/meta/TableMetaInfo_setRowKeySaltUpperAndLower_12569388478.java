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

public class TableMetaInfo_setRowKeySaltUpperAndLower_12569388478 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1484;

    public TableMetaInfo_setRowKeySaltUpperAndLower_12569388478() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1559 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1559, term1559.getClass(), "family", "");
        setField(term1559, term1559.getClass(), "columnName", "");
        setField(term1559, term1559.getClass(), "comment", "");
        setField(term1559, term1559.getClass(), "type", "");
        setBooleanField(term1559, term1559.getClass(), "rowKey", false);
        Object term1565 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1565, term1565.getClass(), "family", "");
        setField(term1565, term1565.getClass(), "columnName", "");
        setField(term1565, term1565.getClass(), "comment", "");
        setField(term1565, term1565.getClass(), "type", "");
        setBooleanField(term1565, term1565.getClass(), "rowKey", false);
        Object term1571 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1571, term1571.getClass(), "family", "");
        setField(term1571, term1571.getClass(), "columnName", "");
        setField(term1571, term1571.getClass(), "comment", "");
        setField(term1571, term1571.getClass(), "type", "");
        setBooleanField(term1571, term1571.getClass(), "rowKey", false);
        Object term1577 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1577, term1577.getClass(), "family", "");
        setField(term1577, term1577.getClass(), "columnName", "");
        setField(term1577, term1577.getClass(), "comment", "");
        setField(term1577, term1577.getClass(), "type", "");
        setBooleanField(term1577, term1577.getClass(), "rowKey", true);
        Object term1583 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1583, term1583.getClass(), "family", "");
        setField(term1583, term1583.getClass(), "columnName", "");
        setField(term1583, term1583.getClass(), "comment", "");
        setField(term1583, term1583.getClass(), "type", "");
        setBooleanField(term1583, term1583.getClass(), "rowKey", true);
        Object term1589 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1589, term1589.getClass(), "family", "");
        setField(term1589, term1589.getClass(), "columnName", "");
        setField(term1589, term1589.getClass(), "comment", "");
        setField(term1589, term1589.getClass(), "type", "");
        setBooleanField(term1589, term1589.getClass(), "rowKey", true);
        ArrayList term1557 = new ArrayList();
        ((ArrayList) term1557).add(term1559);
        ((ArrayList) term1557).add(term1565);
        ((ArrayList) term1557).add(term1571);
        ((ArrayList) term1557).add(term1577);
        ((ArrayList) term1557).add(term1583);
        ((ArrayList) term1557).add(term1589);
        term1484 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1484, term1484.getClass(), "tableName", "hMmaoREuCK");
        setField(term1484, term1484.getClass(), "schemaName", "VeDtgDzGAN");
        setField(term1484, term1484.getClass(), "rowKeyColName", "aWYOWZFyaX");
        setField(term1484, term1484.getClass(), "rowKeyFormat", "BRIVNtfUWU");
        setField(term1484, term1484.getClass(), "rowKeySaltUpperAndLower", "DbiCVtPPCT");
        setField(term1484, term1484.getClass(), "describe", "WzFopsaDuG");
        setField(term1484, term1484.getClass(), "columns", term1557);
        setField(term1484, term1484.getClass(), "rowKeySeparator", "vKQukfbJUd");
        setField(term1484, term1484.getClass(), "rowKeyFirstCharRange", "lFRJFUMVbx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sZdUNdggUW";
        callMethod(klass, "setRowKeySaltUpperAndLower", argTypes, term1484, args);
    }

};


