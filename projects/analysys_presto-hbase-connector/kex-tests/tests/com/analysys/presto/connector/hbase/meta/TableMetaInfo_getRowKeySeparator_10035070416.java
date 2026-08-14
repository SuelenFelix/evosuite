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

public class TableMetaInfo_getRowKeySeparator_10035070416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3147;

    public TableMetaInfo_getRowKeySeparator_10035070416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3222 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3222, term3222.getClass(), "family", "");
        setField(term3222, term3222.getClass(), "columnName", "");
        setField(term3222, term3222.getClass(), "comment", "");
        setField(term3222, term3222.getClass(), "type", "");
        setBooleanField(term3222, term3222.getClass(), "rowKey", false);
        Object term3228 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3228, term3228.getClass(), "family", "");
        setField(term3228, term3228.getClass(), "columnName", "");
        setField(term3228, term3228.getClass(), "comment", "");
        setField(term3228, term3228.getClass(), "type", "");
        setBooleanField(term3228, term3228.getClass(), "rowKey", true);
        Object term3234 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3234, term3234.getClass(), "family", "");
        setField(term3234, term3234.getClass(), "columnName", "");
        setField(term3234, term3234.getClass(), "comment", "");
        setField(term3234, term3234.getClass(), "type", "");
        setBooleanField(term3234, term3234.getClass(), "rowKey", false);
        Object term3240 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3240, term3240.getClass(), "family", "");
        setField(term3240, term3240.getClass(), "columnName", "");
        setField(term3240, term3240.getClass(), "comment", "");
        setField(term3240, term3240.getClass(), "type", "");
        setBooleanField(term3240, term3240.getClass(), "rowKey", false);
        Object term3246 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3246, term3246.getClass(), "family", "");
        setField(term3246, term3246.getClass(), "columnName", "");
        setField(term3246, term3246.getClass(), "comment", "");
        setField(term3246, term3246.getClass(), "type", "");
        setBooleanField(term3246, term3246.getClass(), "rowKey", true);
        Object term3252 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3252, term3252.getClass(), "family", "");
        setField(term3252, term3252.getClass(), "columnName", "");
        setField(term3252, term3252.getClass(), "comment", "");
        setField(term3252, term3252.getClass(), "type", "");
        setBooleanField(term3252, term3252.getClass(), "rowKey", false);
        Object term3258 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3258, term3258.getClass(), "family", "");
        setField(term3258, term3258.getClass(), "columnName", "");
        setField(term3258, term3258.getClass(), "comment", "");
        setField(term3258, term3258.getClass(), "type", "");
        setBooleanField(term3258, term3258.getClass(), "rowKey", false);
        ArrayList term3220 = new ArrayList();
        ((ArrayList) term3220).add(term3222);
        ((ArrayList) term3220).add(term3228);
        ((ArrayList) term3220).add(term3234);
        ((ArrayList) term3220).add(term3240);
        ((ArrayList) term3220).add(term3246);
        ((ArrayList) term3220).add(term3252);
        ((ArrayList) term3220).add(term3258);
        term3147 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term3147, term3147.getClass(), "tableName", "TSyCeEZPaT");
        setField(term3147, term3147.getClass(), "schemaName", "JeZFtaqkzW");
        setField(term3147, term3147.getClass(), "rowKeyColName", "vOVuNSCCLe");
        setField(term3147, term3147.getClass(), "rowKeyFormat", "fzeqPnzpnt");
        setField(term3147, term3147.getClass(), "rowKeySaltUpperAndLower", "RxbhrFBjkO");
        setField(term3147, term3147.getClass(), "describe", "aanyiAOJCl");
        setField(term3147, term3147.getClass(), "columns", term3220);
        setField(term3147, term3147.getClass(), "rowKeySeparator", "FbSIUZyBXZ");
        setField(term3147, term3147.getClass(), "rowKeyFirstCharRange", "mhQDwIyrRi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeySeparator", argTypes, term3147, args);
    }

};


