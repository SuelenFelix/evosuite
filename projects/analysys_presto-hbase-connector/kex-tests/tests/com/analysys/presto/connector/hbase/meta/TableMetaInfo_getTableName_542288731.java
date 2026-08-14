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

public class TableMetaInfo_getTableName_542288731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TableMetaInfo_getTableName_542288731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term76 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term76, term76.getClass(), "family", "");
        setField(term76, term76.getClass(), "columnName", "");
        setField(term76, term76.getClass(), "comment", "");
        setField(term76, term76.getClass(), "type", "");
        setBooleanField(term76, term76.getClass(), "rowKey", false);
        Object term82 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term82, term82.getClass(), "family", "");
        setField(term82, term82.getClass(), "columnName", "");
        setField(term82, term82.getClass(), "comment", "");
        setField(term82, term82.getClass(), "type", "");
        setBooleanField(term82, term82.getClass(), "rowKey", false);
        Object term88 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term88, term88.getClass(), "family", "");
        setField(term88, term88.getClass(), "columnName", "");
        setField(term88, term88.getClass(), "comment", "");
        setField(term88, term88.getClass(), "type", "");
        setBooleanField(term88, term88.getClass(), "rowKey", false);
        Object term94 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term94, term94.getClass(), "family", "");
        setField(term94, term94.getClass(), "columnName", "");
        setField(term94, term94.getClass(), "comment", "");
        setField(term94, term94.getClass(), "type", "");
        setBooleanField(term94, term94.getClass(), "rowKey", false);
        Object term100 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term100, term100.getClass(), "family", "");
        setField(term100, term100.getClass(), "columnName", "");
        setField(term100, term100.getClass(), "comment", "");
        setField(term100, term100.getClass(), "type", "");
        setBooleanField(term100, term100.getClass(), "rowKey", true);
        ArrayList term74 = new ArrayList();
        ((ArrayList) term74).add(term76);
        ((ArrayList) term74).add(term82);
        ((ArrayList) term74).add(term88);
        ((ArrayList) term74).add(term94);
        ((ArrayList) term74).add(term100);
        term1 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term1, term1.getClass(), "tableName", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "schemaName", "sjlJAEtRrb");
        setField(term1, term1.getClass(), "rowKeyColName", "MuLcgQHgqz");
        setField(term1, term1.getClass(), "rowKeyFormat", "xxtlPwDYFs");
        setField(term1, term1.getClass(), "rowKeySaltUpperAndLower", "jJCZpVmanW");
        setField(term1, term1.getClass(), "describe", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "columns", term74);
        setField(term1, term1.getClass(), "rowKeySeparator", "flxyYxBRtu");
        setField(term1, term1.getClass(), "rowKeyFirstCharRange", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTableName", argTypes, term1, args);
    }

};


