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

public class MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_authType_10356375527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3301;
     Object enum6;

    public MskDataSourceConfiguration_MskDataSourceConfigurationBuilder_authType_10356375527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3314 = new ArrayList();
        ((ArrayList) term3314).add("jDtqGUpnZN");
        ((ArrayList) term3314).add("nGKItKLYNC");
        ((ArrayList) term3314).add("UiUYnPrcCi");
        ((ArrayList) term3314).add("UoYtihxVaS");
        ((ArrayList) term3314).add("JDswTTCZHV");
        ((ArrayList) term3314).add("onpbIeEKoi");
        ((ArrayList) term3314).add("YRHGsAkhxb");
        ((ArrayList) term3314).add("ffYhPOzlUs");
        ((ArrayList) term3314).add("MLqYREekMl");
        Class<? extends Object> term3588 = Class.forName((String) "com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Field term3587 = ((Class) term3588).getDeclaredField((String) "IAM");
        ((Field) term3587).setAccessible(true);
        enum6 = ((Field) term3587).get((Object) null);
        term3301 = newInstance(Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder"));
        Object term3450 = newInstance(Class.forName("java.util.Properties"));
        Object term3451 = newInstance(Class.forName("java.util.concurrent.ConcurrentHashMap"));
        setField(term3301, term3301.getClass(), "bootstrapServers", "xLbjWUgOIL");
        setField(term3301, term3301.getClass(), "topicNames", term3314);
        setField(term3301, term3301.getClass(), "topicPattern", "ytSBIKXogI");
        setField(term3301, term3301.getClass(), "groupId", "nHXjMycHlU");
        setField(term3301, term3301.getClass(), "startingOffset", null);
        setField(term3450, term3450.getClass(), "defaults", null);
        setField(term3451, term3451.getClass(), "table", null);
        setField(term3451, term3451.getClass(), "nextTable", null);
        setLongField(term3451, term3451.getClass(), "baseCount", 0L);
        setIntField(term3451, term3451.getClass(), "sizeCtl", 16);
        setIntField(term3451, term3451.getClass(), "transferIndex", 0);
        setIntField(term3451, term3451.getClass(), "cellsBusy", 0);
        setField(term3451, term3451.getClass(), "counterCells", null);
        setField(term3451, term3451.getClass(), "keySet", null);
        setField(term3451, term3451.getClass(), "values", null);
        setField(term3451, term3451.getClass(), "entrySet", null);
        setField(term3451, term3451.getClass(), "keySet", null);
        setField(term3451, term3451.getClass(), "values", null);
        setField(term3450, term3450.getClass(), "map", term3451);
        setField(term3450, term3450.getClass(), "table", null);
        setIntField(term3450, term3450.getClass(), "count", 0);
        setIntField(term3450, term3450.getClass(), "threshold", 0);
        setFloatField(term3450, term3450.getClass(), "loadFactor", 0.0F);
        setIntField(term3450, term3450.getClass(), "modCount", 0);
        setField(term3450, term3450.getClass(), "keySet", null);
        setField(term3450, term3450.getClass(), "entrySet", null);
        setField(term3450, term3450.getClass(), "values", null);
        setField(term3301, term3301.getClass(), "kafkaProperties", term3450);
        setField(term3301, term3301.getClass(), "authType", enum6);
        setField(term3301, term3301.getClass(), "streamDataType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration$MskDataSourceConfigurationBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskAuthType");
        Object[] args = new Object[1];
        args[0] = enum6;
        callMethod(klass, "authType", argTypes, term3301, args);
    }

};


