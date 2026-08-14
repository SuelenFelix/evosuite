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
import java.util.LinkedList;

public class TableMetaInfo_setColumns_195103313212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2350;
     Object term2481;

    public TableMetaInfo_setColumns_195103313212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2425 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2425, term2425.getClass(), "family", "");
        setField(term2425, term2425.getClass(), "columnName", "");
        setField(term2425, term2425.getClass(), "comment", "");
        setField(term2425, term2425.getClass(), "type", "");
        setBooleanField(term2425, term2425.getClass(), "rowKey", true);
        Object term2431 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2431, term2431.getClass(), "family", "");
        setField(term2431, term2431.getClass(), "columnName", "");
        setField(term2431, term2431.getClass(), "comment", "");
        setField(term2431, term2431.getClass(), "type", "");
        setBooleanField(term2431, term2431.getClass(), "rowKey", true);
        Object term2437 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2437, term2437.getClass(), "family", "");
        setField(term2437, term2437.getClass(), "columnName", "");
        setField(term2437, term2437.getClass(), "comment", "");
        setField(term2437, term2437.getClass(), "type", "");
        setBooleanField(term2437, term2437.getClass(), "rowKey", true);
        Object term2443 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2443, term2443.getClass(), "family", "");
        setField(term2443, term2443.getClass(), "columnName", "");
        setField(term2443, term2443.getClass(), "comment", "");
        setField(term2443, term2443.getClass(), "type", "");
        setBooleanField(term2443, term2443.getClass(), "rowKey", false);
        Object term2449 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2449, term2449.getClass(), "family", "");
        setField(term2449, term2449.getClass(), "columnName", "");
        setField(term2449, term2449.getClass(), "comment", "");
        setField(term2449, term2449.getClass(), "type", "");
        setBooleanField(term2449, term2449.getClass(), "rowKey", true);
        ArrayList term2423 = new ArrayList();
        ((ArrayList) term2423).add(term2425);
        ((ArrayList) term2423).add(term2431);
        ((ArrayList) term2423).add(term2437);
        ((ArrayList) term2423).add(term2443);
        ((ArrayList) term2423).add(term2449);
        term2350 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term2350, term2350.getClass(), "tableName", "GBOEuByOfr");
        setField(term2350, term2350.getClass(), "schemaName", "NHbOFFjyVK");
        setField(term2350, term2350.getClass(), "rowKeyColName", "zaloBqlrSo");
        setField(term2350, term2350.getClass(), "rowKeyFormat", "vvoLrMGCoN");
        setField(term2350, term2350.getClass(), "rowKeySaltUpperAndLower", "pXdglvyrQe");
        setField(term2350, term2350.getClass(), "describe", "OcfNzHYdki");
        setField(term2350, term2350.getClass(), "columns", term2423);
        setField(term2350, term2350.getClass(), "rowKeySeparator", "yUGCjlqgJE");
        setField(term2350, term2350.getClass(), "rowKeyFirstCharRange", "PXdVZyoJyC");
        term2481 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2481;
        callMethod(klass, "setColumns", argTypes, term2350, args);
    }

};


