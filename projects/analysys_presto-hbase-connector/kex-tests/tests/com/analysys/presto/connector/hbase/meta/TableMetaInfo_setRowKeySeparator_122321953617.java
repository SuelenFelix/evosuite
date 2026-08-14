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

public class TableMetaInfo_setRowKeySeparator_122321953617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3370;

    public TableMetaInfo_setRowKeySeparator_122321953617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3445 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3445, term3445.getClass(), "family", "");
        setField(term3445, term3445.getClass(), "columnName", "");
        setField(term3445, term3445.getClass(), "comment", "");
        setField(term3445, term3445.getClass(), "type", "");
        setBooleanField(term3445, term3445.getClass(), "rowKey", false);
        ArrayList term3443 = new ArrayList();
        ((ArrayList) term3443).add(term3445);
        term3370 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term3370, term3370.getClass(), "tableName", "HpZXWDPhlg");
        setField(term3370, term3370.getClass(), "schemaName", "lBOokzEPfe");
        setField(term3370, term3370.getClass(), "rowKeyColName", "dtGZCsKXbW");
        setField(term3370, term3370.getClass(), "rowKeyFormat", "bdyhHbDAmJ");
        setField(term3370, term3370.getClass(), "rowKeySaltUpperAndLower", "BBXiTNHqGE");
        setField(term3370, term3370.getClass(), "describe", "IEYhJmgCVd");
        setField(term3370, term3370.getClass(), "columns", term3443);
        setField(term3370, term3370.getClass(), "rowKeySeparator", "KarbTXFmUU");
        setField(term3370, term3370.getClass(), "rowKeyFirstCharRange", "jiUSjqwSIQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MgLCedQfoj";
        callMethod(klass, "setRowKeySeparator", argTypes, term3370, args);
    }

};


