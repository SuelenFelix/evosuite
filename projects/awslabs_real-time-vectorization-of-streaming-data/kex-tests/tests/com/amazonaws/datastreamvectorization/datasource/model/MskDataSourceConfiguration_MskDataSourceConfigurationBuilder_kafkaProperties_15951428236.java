package com.amazonaws.datastreamvectorization.datasource.model;

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
import static com.amazonaws.datastreamvectorization.datasource.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_kafkaProperties_15951428236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2643;
     Object term2809;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_kafkaProperties_15951428236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2656 = new ArrayList();
        ((ArrayList) term2656).add("IDCWpPLRkE");
        ((ArrayList) term2656).add("nyiiPDVjAc");
        ((ArrayList) term2656).add("aKnKipADSo");
        ((ArrayList) term2656).add("wSQxaModmm");
        ((ArrayList) term2656).add("UlajhuVLaP");
        ((ArrayList) term2656).add("gGSMzuGICf");
        ((ArrayList) term2656).add("hxCBltsObl");
        ((ArrayList) term2656).add("BndsHwAFMv");
        ((ArrayList) term2656).add("GzFkzHGYFt");
        Class<? extends Object> term2956 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term2955 = ((Class) term2956).getDeclaredField((String) "IAM");
        ((Field) term2955).setAccessible(true);
        Object enum5 = ((Field) term2955).get((Object) null);
        term2643 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term2792 = newInstance(Class.forName("java.util.Properties"));
        Object term2793 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term2643, term2643.getClass(), "bootstrapServers", "xrwlQZdwCp");
        setField(term2643, term2643.getClass(), "topicNames", term2656);
        setField(term2643, term2643.getClass(), "topicPattern", "tShwQLRGNe");
        setField(term2643, term2643.getClass(), "groupId", "LvtrsXUliU");
        setField(term2643, term2643.getClass(), "startingOffset", null);
        setField(term2792, term2792.getClass(), "defaults", null);
        setField(term2793, term2793.getClass(), "table", null);
        setField(term2793, term2793.getClass(), "nextTable", null);
        setLongField(term2793, term2793.getClass(), "baseCount", 0L);
        setIntField(term2793, term2793.getClass(), "sizeCtl", 16);
        setIntField(term2793, term2793.getClass(), "transferIndex", 0);
        setIntField(term2793, term2793.getClass(), "cellsBusy", 0);
        setField(term2793, term2793.getClass(), "counterCells", null);
        setField(term2793, term2793.getClass(), "keySet", null);
        setField(term2793, term2793.getClass(), "values", null);
        setField(term2793, term2793.getClass(), "entrySet", null);
        setField(term2793, term2793.getClass(), "keySet", null);
        setField(term2793, term2793.getClass(), "values", null);
        setField(term2792, term2792.getClass(), "map", term2793);
        setField(term2792, term2792.getClass(), "table", null);
        setIntField(term2792, term2792.getClass(), "count", 0);
        setIntField(term2792, term2792.getClass(), "threshold", 0);
        setFloatField(term2792, term2792.getClass(), "loadFactor", 0.0F);
        setIntField(term2792, term2792.getClass(), "modCount", 0);
        setField(term2792, term2792.getClass(), "keySet", null);
        setField(term2792, term2792.getClass(), "entrySet", null);
        setField(term2792, term2792.getClass(), "values", null);
        setField(term2643, term2643.getClass(), "kafkaProperties", term2792);
        setField(term2643, term2643.getClass(), "authType", enum5);
        setField(term2643, term2643.getClass(), "streamDataType", null);
        term2809 = new HashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Properties");
        Object[] args = new Object[1];
        args[0] = term2809;
        callMethod(klass, "kafkaProperties", argTypes, term2643, args);
    }

};


