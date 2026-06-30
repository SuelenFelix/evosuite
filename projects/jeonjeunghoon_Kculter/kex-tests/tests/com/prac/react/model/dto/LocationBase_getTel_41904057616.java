package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class LocationBase_getTel_41904057616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30027;

    public LocationBase_getTel_41904057616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30027 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term30027, term30027.getClass(), "addr1", "jleFBTYSNb");
        setField(term30027, term30027.getClass(), "addr2", "WmSSWHEELj");
        setField(term30027, term30027.getClass(), "contenttypeid", "ggFhMyQvdw");
        setField(term30027, term30027.getClass(), "firstimage", "vZpMxQNHKu");
        setField(term30027, term30027.getClass(), "firstimage2", "QLMSDWYwBC");
        setField(term30027, term30027.getClass(), "mapx", "feyxNWUenU");
        setField(term30027, term30027.getClass(), "mapy", "qvqwmSUIiP");
        setField(term30027, term30027.getClass(), "tel", "eNOEXYoAtV");
        setField(term30027, term30027.getClass(), "title", "SNqwfZGLFh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTel", argTypes, term30027, args);
    }

};


