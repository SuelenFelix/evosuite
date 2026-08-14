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

public class TableMetaInfo_getSchemaName_4538252243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public TableMetaInfo_getSchemaName_4538252243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term514 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term514, term514.getClass(), "family", "");
        setField(term514, term514.getClass(), "columnName", "");
        setField(term514, term514.getClass(), "comment", "");
        setField(term514, term514.getClass(), "type", "");
        setBooleanField(term514, term514.getClass(), "rowKey", true);
        Object term520 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term520, term520.getClass(), "family", "");
        setField(term520, term520.getClass(), "columnName", "");
        setField(term520, term520.getClass(), "comment", "");
        setField(term520, term520.getClass(), "type", "");
        setBooleanField(term520, term520.getClass(), "rowKey", false);
        Object term526 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term526, term526.getClass(), "family", "");
        setField(term526, term526.getClass(), "columnName", "");
        setField(term526, term526.getClass(), "comment", "");
        setField(term526, term526.getClass(), "type", "");
        setBooleanField(term526, term526.getClass(), "rowKey", true);
        ArrayList term512 = new ArrayList();
        ((ArrayList) term512).add(term514);
        ((ArrayList) term512).add(term520);
        ((ArrayList) term512).add(term526);
        term439 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term439, term439.getClass(), "tableName", "JDswTTCZHV");
        setField(term439, term439.getClass(), "schemaName", "onpbIeEKoi");
        setField(term439, term439.getClass(), "rowKeyColName", "YRHGsAkhxb");
        setField(term439, term439.getClass(), "rowKeyFormat", "ffYhPOzlUs");
        setField(term439, term439.getClass(), "rowKeySaltUpperAndLower", "MLqYREekMl");
        setField(term439, term439.getClass(), "describe", "ytSBIKXogI");
        setField(term439, term439.getClass(), "columns", term512);
        setField(term439, term439.getClass(), "rowKeySeparator", "IgRJUzaCwW");
        setField(term439, term439.getClass(), "rowKeyFirstCharRange", "JUmudUmaaV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemaName", argTypes, term439, args);
    }

};


