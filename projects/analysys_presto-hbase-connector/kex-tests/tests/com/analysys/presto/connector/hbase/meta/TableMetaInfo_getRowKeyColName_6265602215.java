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

public class TableMetaInfo_getRowKeyColName_6265602215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2954;

    public TableMetaInfo_getRowKeyColName_6265602215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3029 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3029, term3029.getClass(), "family", "");
        setField(term3029, term3029.getClass(), "columnName", "");
        setField(term3029, term3029.getClass(), "comment", "");
        setField(term3029, term3029.getClass(), "type", "");
        setBooleanField(term3029, term3029.getClass(), "rowKey", false);
        Object term3035 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3035, term3035.getClass(), "family", "");
        setField(term3035, term3035.getClass(), "columnName", "");
        setField(term3035, term3035.getClass(), "comment", "");
        setField(term3035, term3035.getClass(), "type", "");
        setBooleanField(term3035, term3035.getClass(), "rowKey", true);
        ArrayList term3027 = new ArrayList();
        ((ArrayList) term3027).add(term3029);
        ((ArrayList) term3027).add(term3035);
        term2954 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term2954, term2954.getClass(), "tableName", "BbNeQJpYPr");
        setField(term2954, term2954.getClass(), "schemaName", "riMtzCoxNj");
        setField(term2954, term2954.getClass(), "rowKeyColName", "YAXkVjQZcV");
        setField(term2954, term2954.getClass(), "rowKeyFormat", "pumvwBWvpy");
        setField(term2954, term2954.getClass(), "rowKeySaltUpperAndLower", "HwLHeGLyhe");
        setField(term2954, term2954.getClass(), "describe", "RDnkgWkcbz");
        setField(term2954, term2954.getClass(), "columns", term3027);
        setField(term2954, term2954.getClass(), "rowKeySeparator", "GPSEWEDSTo");
        setField(term2954, term2954.getClass(), "rowKeyFirstCharRange", "RCOqfVsRHt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyColName", argTypes, term2954, args);
    }

};


