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

public class TableMetaInfo_getRowKeyFirstCharRange_200742202418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3579;

    public TableMetaInfo_getRowKeyFirstCharRange_200742202418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3654 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3654, term3654.getClass(), "family", "");
        setField(term3654, term3654.getClass(), "columnName", "");
        setField(term3654, term3654.getClass(), "comment", "");
        setField(term3654, term3654.getClass(), "type", "");
        setBooleanField(term3654, term3654.getClass(), "rowKey", false);
        Object term3660 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3660, term3660.getClass(), "family", "");
        setField(term3660, term3660.getClass(), "columnName", "");
        setField(term3660, term3660.getClass(), "comment", "");
        setField(term3660, term3660.getClass(), "type", "");
        setBooleanField(term3660, term3660.getClass(), "rowKey", true);
        Object term3666 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3666, term3666.getClass(), "family", "");
        setField(term3666, term3666.getClass(), "columnName", "");
        setField(term3666, term3666.getClass(), "comment", "");
        setField(term3666, term3666.getClass(), "type", "");
        setBooleanField(term3666, term3666.getClass(), "rowKey", true);
        Object term3672 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3672, term3672.getClass(), "family", "");
        setField(term3672, term3672.getClass(), "columnName", "");
        setField(term3672, term3672.getClass(), "comment", "");
        setField(term3672, term3672.getClass(), "type", "");
        setBooleanField(term3672, term3672.getClass(), "rowKey", false);
        Object term3678 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term3678, term3678.getClass(), "family", "");
        setField(term3678, term3678.getClass(), "columnName", "");
        setField(term3678, term3678.getClass(), "comment", "");
        setField(term3678, term3678.getClass(), "type", "");
        setBooleanField(term3678, term3678.getClass(), "rowKey", false);
        ArrayList term3652 = new ArrayList();
        ((ArrayList) term3652).add(term3654);
        ((ArrayList) term3652).add(term3660);
        ((ArrayList) term3652).add(term3666);
        ((ArrayList) term3652).add(term3672);
        ((ArrayList) term3652).add(term3678);
        term3579 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term3579, term3579.getClass(), "tableName", "zgKiINdgNu");
        setField(term3579, term3579.getClass(), "schemaName", "zLMTXDQHYH");
        setField(term3579, term3579.getClass(), "rowKeyColName", "PqywFWJlpE");
        setField(term3579, term3579.getClass(), "rowKeyFormat", "OzXRsFGTIp");
        setField(term3579, term3579.getClass(), "rowKeySaltUpperAndLower", "TjWpyghUWN");
        setField(term3579, term3579.getClass(), "describe", "dkZFDZxcde");
        setField(term3579, term3579.getClass(), "columns", term3652);
        setField(term3579, term3579.getClass(), "rowKeySeparator", "uXYcXVYJZM");
        setField(term3579, term3579.getClass(), "rowKeyFirstCharRange", "BJhjdJUhkz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowKeyFirstCharRange", argTypes, term3579, args);
    }

};


