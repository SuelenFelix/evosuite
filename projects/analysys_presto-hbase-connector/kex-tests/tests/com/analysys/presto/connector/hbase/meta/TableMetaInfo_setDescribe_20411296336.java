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

public class TableMetaInfo_setDescribe_20411296336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1052;

    public TableMetaInfo_setDescribe_20411296336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1127 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1127, term1127.getClass(), "family", "");
        setField(term1127, term1127.getClass(), "columnName", "");
        setField(term1127, term1127.getClass(), "comment", "");
        setField(term1127, term1127.getClass(), "type", "");
        setBooleanField(term1127, term1127.getClass(), "rowKey", true);
        Object term1133 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1133, term1133.getClass(), "family", "");
        setField(term1133, term1133.getClass(), "columnName", "");
        setField(term1133, term1133.getClass(), "comment", "");
        setField(term1133, term1133.getClass(), "type", "");
        setBooleanField(term1133, term1133.getClass(), "rowKey", false);
        Object term1139 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1139, term1139.getClass(), "family", "");
        setField(term1139, term1139.getClass(), "columnName", "");
        setField(term1139, term1139.getClass(), "comment", "");
        setField(term1139, term1139.getClass(), "type", "");
        setBooleanField(term1139, term1139.getClass(), "rowKey", false);
        Object term1145 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1145, term1145.getClass(), "family", "");
        setField(term1145, term1145.getClass(), "columnName", "");
        setField(term1145, term1145.getClass(), "comment", "");
        setField(term1145, term1145.getClass(), "type", "");
        setBooleanField(term1145, term1145.getClass(), "rowKey", true);
        Object term1151 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1151, term1151.getClass(), "family", "");
        setField(term1151, term1151.getClass(), "columnName", "");
        setField(term1151, term1151.getClass(), "comment", "");
        setField(term1151, term1151.getClass(), "type", "");
        setBooleanField(term1151, term1151.getClass(), "rowKey", true);
        Object term1157 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term1157, term1157.getClass(), "family", "");
        setField(term1157, term1157.getClass(), "columnName", "");
        setField(term1157, term1157.getClass(), "comment", "");
        setField(term1157, term1157.getClass(), "type", "");
        setBooleanField(term1157, term1157.getClass(), "rowKey", true);
        ArrayList term1125 = new ArrayList();
        ((ArrayList) term1125).add(term1127);
        ((ArrayList) term1125).add(term1133);
        ((ArrayList) term1125).add(term1139);
        ((ArrayList) term1125).add(term1145);
        ((ArrayList) term1125).add(term1151);
        ((ArrayList) term1125).add(term1157);
        term1052 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1052, term1052.getClass(), "tableName", "eVpkWxjuki");
        setField(term1052, term1052.getClass(), "schemaName", "SJiQaLvSKv");
        setField(term1052, term1052.getClass(), "rowKeyColName", "OEXDRUKcFl");
        setField(term1052, term1052.getClass(), "rowKeyFormat", "RYdKCNNMBR");
        setField(term1052, term1052.getClass(), "rowKeySaltUpperAndLower", "yGtHPyvYiQ");
        setField(term1052, term1052.getClass(), "describe", "MvRIxilFMJ");
        setField(term1052, term1052.getClass(), "columns", term1125);
        setField(term1052, term1052.getClass(), "rowKeySeparator", "LWyEaeIyAo");
        setField(term1052, term1052.getClass(), "rowKeyFirstCharRange", "yVMkkQhvmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mvrkADEgpp";
        callMethod(klass, "setDescribe", argTypes, term1052, args);
    }

};


