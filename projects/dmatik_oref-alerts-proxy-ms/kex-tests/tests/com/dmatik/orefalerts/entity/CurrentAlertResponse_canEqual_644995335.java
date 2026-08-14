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

public class CurrentAlertResponse_canEqual_644995335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;
     Object term1142;

    public CurrentAlertResponse_canEqual_644995335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term1066 = new Boolean(true);
        term1065 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term1068 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term1105 = (Object[]) newArray("java.lang.String", 2);
        setField(term1065, term1065.getClass(), "alert", term1066);
        setField(term1068, term1068.getClass(), "id", "LvtrsXUliU");
        setField(term1068, term1068.getClass(), "cat", "xLbjWUgOIL");
        setField(term1068, term1068.getClass(), "title", "jDtqGUpnZN");
        setElement(term1105, 0, "nGKItKLYNC");
        setElement(term1105, 1, "UiUYnPrcCi");
        setField(term1068, term1068.getClass(), "data", term1105);
        setField(term1068, term1068.getClass(), "desc", "UoYtihxVaS");
        setField(term1065, term1065.getClass(), "current", term1068);
        term1142 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1142;
        callMethod(klass, "canEqual", argTypes, term1065, args);
    }

};


