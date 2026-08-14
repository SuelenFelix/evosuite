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

public class TableMetaInfo_getDescribe_4547871935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term865;

    public TableMetaInfo_getDescribe_4547871935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term940 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.ColumnMetaInfo"));
        setField(term940, term940.getClass(), "family", "");
        setField(term940, term940.getClass(), "columnName", "");
        setField(term940, term940.getClass(), "comment", "");
        setField(term940, term940.getClass(), "type", "");
        setBooleanField(term940, term940.getClass(), "rowKey", true);
        ArrayList term938 = new ArrayList();
        ((ArrayList) term938).add(term940);
        term865 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term865, term865.getClass(), "tableName", "XPKmummaqg");
        setField(term865, term865.getClass(), "schemaName", "BKLfkLiZTH");
        setField(term865, term865.getClass(), "rowKeyColName", "SPpkrGcPRr");
        setField(term865, term865.getClass(), "rowKeyFormat", "sEccwbJKYE");
        setField(term865, term865.getClass(), "rowKeySaltUpperAndLower", "AWRooQKkdW");
        setField(term865, term865.getClass(), "describe", "vjxIhXHxGR");
        setField(term865, term865.getClass(), "columns", term938);
        setField(term865, term865.getClass(), "rowKeySeparator", "ZVecLZMLHF");
        setField(term865, term865.getClass(), "rowKeyFirstCharRange", "fztQhjqwdP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescribe", argTypes, term865, args);
    }

};


