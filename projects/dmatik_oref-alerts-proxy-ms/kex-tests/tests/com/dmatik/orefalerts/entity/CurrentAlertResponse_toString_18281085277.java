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

public class CurrentAlertResponse_toString_18281085277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1428;

    public CurrentAlertResponse_toString_18281085277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1429 = new Boolean(false);
        term1428 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term1431 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term1468 = (Object[]) newArray("java.lang.String", 7);
        setField(term1428, term1428.getClass(), "alert", term1429);
        setField(term1431, term1431.getClass(), "id", "eqJfYWRaEL");
        setField(term1431, term1431.getClass(), "cat", "fhkbdRViHi");
        setField(term1431, term1431.getClass(), "title", "uWHnvSvaPl");
        setElement(term1468, 0, "kBdSllIBVz");
        setElement(term1468, 1, "TJmVBGfTML");
        setElement(term1468, 2, "tPlsykYBqO");
        setElement(term1468, 3, "bLPjGVBhlX");
        setElement(term1468, 4, "whBvTVIIlC");
        setElement(term1468, 5, "IgRJUzaCwW");
        setElement(term1468, 6, "JUmudUmaaV");
        setField(term1431, term1431.getClass(), "data", term1468);
        setField(term1431, term1431.getClass(), "desc", "KoyGrUJeJW");
        setField(term1428, term1428.getClass(), "current", term1431);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1428, args);
    }

};


