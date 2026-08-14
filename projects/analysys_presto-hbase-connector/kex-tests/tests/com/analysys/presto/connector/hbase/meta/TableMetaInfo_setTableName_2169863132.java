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

public class TableMetaInfo_setTableName_2169863132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212;

    public TableMetaInfo_setTableName_2169863132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term287 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term287, term287.getClass(), "family", "");
        setField(term287, term287.getClass(), "columnName", "");
        setField(term287, term287.getClass(), "comment", "");
        setField(term287, term287.getClass(), "type", "");
        setBooleanField(term287, term287.getClass(), "rowKey", true);
        Object term293 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term293, term293.getClass(), "family", "");
        setField(term293, term293.getClass(), "columnName", "");
        setField(term293, term293.getClass(), "comment", "");
        setField(term293, term293.getClass(), "type", "");
        setBooleanField(term293, term293.getClass(), "rowKey", true);
        Object term299 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term299, term299.getClass(), "family", "");
        setField(term299, term299.getClass(), "columnName", "");
        setField(term299, term299.getClass(), "comment", "");
        setField(term299, term299.getClass(), "type", "");
        setBooleanField(term299, term299.getClass(), "rowKey", true);
        Object term305 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term305, term305.getClass(), "family", "");
        setField(term305, term305.getClass(), "columnName", "");
        setField(term305, term305.getClass(), "comment", "");
        setField(term305, term305.getClass(), "type", "");
        setBooleanField(term305, term305.getClass(), "rowKey", false);
        ArrayList term285 = new ArrayList();
        ((ArrayList) term285).add(term287);
        ((ArrayList) term285).add(term293);
        ((ArrayList) term285).add(term299);
        ((ArrayList) term285).add(term305);
        term212 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term212, term212.getClass(), "tableName", "IoAlmYsBwc");
        setField(term212, term212.getClass(), "schemaName", "TEParAifyi");
        setField(term212, term212.getClass(), "rowKeyColName", "OWDIEULEFu");
        setField(term212, term212.getClass(), "rowKeyFormat", "dWRymuLBtr");
        setField(term212, term212.getClass(), "rowKeySaltUpperAndLower", "AijpHYOFuy");
        setField(term212, term212.getClass(), "describe", "SbAoxhfrkn");
        setField(term212, term212.getClass(), "columns", term285);
        setField(term212, term212.getClass(), "rowKeySeparator", "nGKItKLYNC");
        setField(term212, term212.getClass(), "rowKeyFirstCharRange", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UoYtihxVaS";
        callMethod(klass, "setTableName", argTypes, term212, args);
    }

};


