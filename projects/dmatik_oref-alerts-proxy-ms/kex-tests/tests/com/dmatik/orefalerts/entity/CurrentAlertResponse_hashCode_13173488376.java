package com.dmatik.orefalerts.entity;

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
import static com.dmatik.orefalerts.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class CurrentAlertResponse_hashCode_13173488376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1203;

    public CurrentAlertResponse_hashCode_13173488376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1204 = new Boolean(true);
        term1203 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term1206 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term1243 = (Object[]) newArray("java.lang.String", 6);
        setField(term1203, term1203.getClass(), "alert", term1204);
        setField(term1206, term1206.getClass(), "id", "JDswTTCZHV");
        setField(term1206, term1206.getClass(), "cat", "onpbIeEKoi");
        setField(term1206, term1206.getClass(), "title", "YRHGsAkhxb");
        setElement(term1243, 0, "ffYhPOzlUs");
        setElement(term1243, 1, "MLqYREekMl");
        setElement(term1243, 2, "ytSBIKXogI");
        setElement(term1243, 3, "nHXjMycHlU");
        setElement(term1243, 4, "ieCtQFdkii");
        setElement(term1243, 5, "dEnhdmILtU");
        setField(term1206, term1206.getClass(), "data", term1243);
        setField(term1206, term1206.getClass(), "desc", "hoicvmsovO");
        setField(term1203, term1203.getClass(), "current", term1206);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1203, args);
    }

};


