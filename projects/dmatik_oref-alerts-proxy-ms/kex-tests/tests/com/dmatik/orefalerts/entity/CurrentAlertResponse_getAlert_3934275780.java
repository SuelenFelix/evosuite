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

public class CurrentAlertResponse_getAlert_3934275780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public CurrentAlertResponse_getAlert_3934275780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term2 = new Boolean(false);
        term1 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term4 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term41 = (Object[]) newArray("java.lang.String", 5);
        setField(term1, term1.getClass(), "alert", term2);
        setField(term4, term4.getClass(), "id", "PAEBtnZtTD");
        setField(term4, term4.getClass(), "cat", "sjlJAEtRrb");
        setField(term4, term4.getClass(), "title", "MuLcgQHgqz");
        setElement(term41, 0, "xxtlPwDYFs");
        setElement(term41, 1, "jJCZpVmanW");
        setElement(term41, 2, "EGtDIRbSSb");
        setElement(term41, 3, "SzjVpOQTyS");
        setElement(term41, 4, "MjGYSRKTNF");
        setField(term4, term4.getClass(), "data", term41);
        setField(term4, term4.getClass(), "desc", "hRNSzYYIrc");
        setField(term1, term1.getClass(), "current", term4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAlert", argTypes, term1, args);
    }

};


