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

public class TableMetaInfo_toString_192826599820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4023;

    public TableMetaInfo_toString_192826599820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4098 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term4098, term4098.getClass(), "family", "");
        setField(term4098, term4098.getClass(), "columnName", "");
        setField(term4098, term4098.getClass(), "comment", "");
        setField(term4098, term4098.getClass(), "type", "");
        setBooleanField(term4098, term4098.getClass(), "rowKey", false);
        Object term4104 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term4104, term4104.getClass(), "family", "");
        setField(term4104, term4104.getClass(), "columnName", "");
        setField(term4104, term4104.getClass(), "comment", "");
        setField(term4104, term4104.getClass(), "type", "");
        setBooleanField(term4104, term4104.getClass(), "rowKey", false);
        Object term4110 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term4110, term4110.getClass(), "family", "");
        setField(term4110, term4110.getClass(), "columnName", "");
        setField(term4110, term4110.getClass(), "comment", "");
        setField(term4110, term4110.getClass(), "type", "");
        setBooleanField(term4110, term4110.getClass(), "rowKey", false);
        Object term4116 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term4116, term4116.getClass(), "family", "");
        setField(term4116, term4116.getClass(), "columnName", "");
        setField(term4116, term4116.getClass(), "comment", "");
        setField(term4116, term4116.getClass(), "type", "");
        setBooleanField(term4116, term4116.getClass(), "rowKey", false);
        ArrayList term4096 = new ArrayList();
        ((ArrayList) term4096).add(term4098);
        ((ArrayList) term4096).add(term4104);
        ((ArrayList) term4096).add(term4110);
        ((ArrayList) term4096).add(term4116);
        term4023 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term4023, term4023.getClass(), "tableName", "ubodzJoMGW");
        setField(term4023, term4023.getClass(), "schemaName", "weddIktxOA");
        setField(term4023, term4023.getClass(), "rowKeyColName", "uSlMeISsDD");
        setField(term4023, term4023.getClass(), "rowKeyFormat", "WdCiTDUKqn");
        setField(term4023, term4023.getClass(), "rowKeySaltUpperAndLower", "PSizQDoxxe");
        setField(term4023, term4023.getClass(), "describe", "mKaHyMybrK");
        setField(term4023, term4023.getClass(), "columns", term4096);
        setField(term4023, term4023.getClass(), "rowKeySeparator", "vBnWPlsZMk");
        setField(term4023, term4023.getClass(), "rowKeyFirstCharRange", "fIZsWucfXz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4023, args);
    }

};


