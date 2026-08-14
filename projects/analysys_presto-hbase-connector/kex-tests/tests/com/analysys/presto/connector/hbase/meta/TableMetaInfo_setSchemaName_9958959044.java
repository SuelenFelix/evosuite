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

public class TableMetaInfo_setSchemaName_9958959044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638;

    public TableMetaInfo_setSchemaName_9958959044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term713 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term713, term713.getClass(), "family", "");
        setField(term713, term713.getClass(), "columnName", "");
        setField(term713, term713.getClass(), "comment", "");
        setField(term713, term713.getClass(), "type", "");
        setBooleanField(term713, term713.getClass(), "rowKey", false);
        Object term719 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term719, term719.getClass(), "family", "");
        setField(term719, term719.getClass(), "columnName", "");
        setField(term719, term719.getClass(), "comment", "");
        setField(term719, term719.getClass(), "type", "");
        setBooleanField(term719, term719.getClass(), "rowKey", true);
        Object term725 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term725, term725.getClass(), "family", "");
        setField(term725, term725.getClass(), "columnName", "");
        setField(term725, term725.getClass(), "comment", "");
        setField(term725, term725.getClass(), "type", "");
        setBooleanField(term725, term725.getClass(), "rowKey", false);
        Object term731 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term731, term731.getClass(), "family", "");
        setField(term731, term731.getClass(), "columnName", "");
        setField(term731, term731.getClass(), "comment", "");
        setField(term731, term731.getClass(), "type", "");
        setBooleanField(term731, term731.getClass(), "rowKey", false);
        ArrayList term711 = new ArrayList();
        ((ArrayList) term711).add(term713);
        ((ArrayList) term711).add(term719);
        ((ArrayList) term711).add(term725);
        ((ArrayList) term711).add(term731);
        term638 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term638, term638.getClass(), "tableName", "KoyGrUJeJW");
        setField(term638, term638.getClass(), "schemaName", "HqBOwkVqjD");
        setField(term638, term638.getClass(), "rowKeyColName", "MAcUBcBckh");
        setField(term638, term638.getClass(), "rowKeyFormat", "oVgzLbrsFr");
        setField(term638, term638.getClass(), "rowKeySaltUpperAndLower", "vQVyKLdtaz");
        setField(term638, term638.getClass(), "describe", "OWKQODBLzb");
        setField(term638, term638.getClass(), "columns", term711);
        setField(term638, term638.getClass(), "rowKeySeparator", "DfISiziTgG");
        setField(term638, term638.getClass(), "rowKeyFirstCharRange", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        callMethod(klass, "setSchemaName", argTypes, term638, args);
    }

};


