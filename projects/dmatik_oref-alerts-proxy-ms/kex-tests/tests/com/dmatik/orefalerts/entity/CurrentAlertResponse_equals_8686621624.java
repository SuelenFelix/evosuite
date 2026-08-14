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

public class CurrentAlertResponse_equals_8686621624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839;
     Object term964;

    public CurrentAlertResponse_equals_8686621624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term840 = new Boolean(true);
        term839 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse"));
        Object term842 = newInstance(Class.forName("com.dmatik.orefalerts.entity.CurrentAlert"));
        Object[] term879 = (Object[]) newArray("java.lang.String", 6);
        setField(term839, term839.getClass(), "alert", term840);
        setField(term842, term842.getClass(), "id", "IDCWpPLRkE");
        setField(term842, term842.getClass(), "cat", "nyiiPDVjAc");
        setField(term842, term842.getClass(), "title", "aKnKipADSo");
        setElement(term879, 0, "wSQxaModmm");
        setElement(term879, 1, "UlajhuVLaP");
        setElement(term879, 2, "gGSMzuGICf");
        setElement(term879, 3, "hxCBltsObl");
        setElement(term879, 4, "BndsHwAFMv");
        setElement(term879, 5, "GzFkzHGYFt");
        setField(term842, term842.getClass(), "data", term879);
        setField(term842, term842.getClass(), "desc", "tShwQLRGNe");
        setField(term839, term839.getClass(), "current", term842);
        term964 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.dmatik.orefalerts.entity.CurrentAlertResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term964;
        callMethod(klass, "equals", argTypes, term839, args);
    }

};


