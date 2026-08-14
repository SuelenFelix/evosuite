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

public class TableMetaInfo_getColumns_38940912611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2133;

    public TableMetaInfo_getColumns_38940912611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2208 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2208, term2208.getClass(), "family", "");
        setField(term2208, term2208.getClass(), "columnName", "");
        setField(term2208, term2208.getClass(), "comment", "");
        setField(term2208, term2208.getClass(), "type", "");
        setBooleanField(term2208, term2208.getClass(), "rowKey", false);
        Object term2214 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2214, term2214.getClass(), "family", "");
        setField(term2214, term2214.getClass(), "columnName", "");
        setField(term2214, term2214.getClass(), "comment", "");
        setField(term2214, term2214.getClass(), "type", "");
        setBooleanField(term2214, term2214.getClass(), "rowKey", false);
        Object term2220 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2220, term2220.getClass(), "family", "");
        setField(term2220, term2220.getClass(), "columnName", "");
        setField(term2220, term2220.getClass(), "comment", "");
        setField(term2220, term2220.getClass(), "type", "");
        setBooleanField(term2220, term2220.getClass(), "rowKey", false);
        Object term2226 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2226, term2226.getClass(), "family", "");
        setField(term2226, term2226.getClass(), "columnName", "");
        setField(term2226, term2226.getClass(), "comment", "");
        setField(term2226, term2226.getClass(), "type", "");
        setBooleanField(term2226, term2226.getClass(), "rowKey", true);
        Object term2232 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2232, term2232.getClass(), "family", "");
        setField(term2232, term2232.getClass(), "columnName", "");
        setField(term2232, term2232.getClass(), "comment", "");
        setField(term2232, term2232.getClass(), "type", "");
        setBooleanField(term2232, term2232.getClass(), "rowKey", true);
        Object term2238 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2238, term2238.getClass(), "family", "");
        setField(term2238, term2238.getClass(), "columnName", "");
        setField(term2238, term2238.getClass(), "comment", "");
        setField(term2238, term2238.getClass(), "type", "");
        setBooleanField(term2238, term2238.getClass(), "rowKey", false);
        ArrayList term2206 = new ArrayList();
        ((ArrayList) term2206).add(term2208);
        ((ArrayList) term2206).add(term2214);
        ((ArrayList) term2206).add(term2220);
        ((ArrayList) term2206).add(term2226);
        ((ArrayList) term2206).add(term2232);
        ((ArrayList) term2206).add(term2238);
        term2133 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term2133, term2133.getClass(), "tableName", "iIRsCSYqXH");
        setField(term2133, term2133.getClass(), "schemaName", "nghfqDXyCG");
        setField(term2133, term2133.getClass(), "rowKeyColName", "WBAOTqErtm");
        setField(term2133, term2133.getClass(), "rowKeyFormat", "PqtVXXZMqK");
        setField(term2133, term2133.getClass(), "rowKeySaltUpperAndLower", "rYbtIDVdnd");
        setField(term2133, term2133.getClass(), "describe", "UKAReurpHG");
        setField(term2133, term2133.getClass(), "columns", term2206);
        setField(term2133, term2133.getClass(), "rowKeySeparator", "SPtPatHeOm");
        setField(term2133, term2133.getClass(), "rowKeyFirstCharRange", "ywmcuThdfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumns", argTypes, term2133, args);
    }

};


