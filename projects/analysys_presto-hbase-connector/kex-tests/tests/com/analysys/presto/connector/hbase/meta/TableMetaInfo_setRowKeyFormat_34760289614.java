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

public class TableMetaInfo_setRowKeyFormat_34760289614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2751;

    public TableMetaInfo_setRowKeyFormat_34760289614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2824 = new ArrayList();
        term2751 = newInstance(Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo"));
        setField(term2751, term2751.getClass(), "tableName", "IlvgFINwIa");
        setField(term2751, term2751.getClass(), "schemaName", "GEJABPlHSI");
        setField(term2751, term2751.getClass(), "rowKeyColName", "aQFUvuaYxd");
        setField(term2751, term2751.getClass(), "rowKeyFormat", "zNFLXMifnS");
        setField(term2751, term2751.getClass(), "rowKeySaltUpperAndLower", "HHQcYMSBVc");
        setField(term2751, term2751.getClass(), "describe", "wdoqITnaAP");
        setField(term2751, term2751.getClass(), "columns", term2824);
        setField(term2751, term2751.getClass(), "rowKeySeparator", "rIPMBcrNqB");
        setField(term2751, term2751.getClass(), "rowKeyFirstCharRange", "UDaboHZHhz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analysys.presto.connector.hbase.meta.TableMetaInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "nRvKihUSPj";
        callMethod(klass, "setRowKeyFormat", argTypes, term2751, args);
    }

};


