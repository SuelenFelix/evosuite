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

public class TableMetaInfo_getRowKeyFormat_64673792813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2564;

    public TableMetaInfo_getRowKeyFormat_64673792813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term2639 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term2639, term2639.getClass(), "family", "");
        setField(term2639, term2639.getClass(), "columnName", "");
        setField(term2639, term2639.getClass(), "comment", "");
        setField(term2639, term2639.getClass(), "type", "");
        setBooleanField(term2639, term2639.getClass(), "rowKey", false);
        ArrayList term2637 = new ArrayList();
        ((ArrayList) term2637).add(term2639);
        term2564 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term2564, term2564.getClass(), "tableName", "vLerpqavFM");
        setField(term2564, term2564.getClass(), "schemaName", "qnvxzwuGKX");
        setField(term2564, term2564.getClass(), "rowKeyColName", "EdPAvpluZg");
        setField(term2564, term2564.getClass(), "rowKeyFormat", "DzHVBMqWtE");
        setField(term2564, term2564.getClass(), "rowKeySaltUpperAndLower", "THZSpzBRYP");
        setField(term2564, term2564.getClass(), "describe", "ZfBIVGBQOE");
        setField(term2564, term2564.getClass(), "columns", term2637);
        setField(term2564, term2564.getClass(), "rowKeySeparator", "WxYUTuqmIq");
        setField(term2564, term2564.getClass(), "rowKeyFirstCharRange", "OeQLvhVERT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyFormat", argTypes, term2564, args);
    }

};


