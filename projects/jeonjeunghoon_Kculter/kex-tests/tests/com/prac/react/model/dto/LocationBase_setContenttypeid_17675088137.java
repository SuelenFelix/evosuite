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

public class LocationBase_setContenttypeid_17675088137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28126;

    public LocationBase_setContenttypeid_17675088137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28126 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term28126, term28126.getClass(), "addr1", "GMylOocLnB");
        setField(term28126, term28126.getClass(), "addr2", "spOehuHwSl");
        setField(term28126, term28126.getClass(), "contenttypeid", "cyobgydTWP");
        setField(term28126, term28126.getClass(), "firstimage", "moHYQFfLnp");
        setField(term28126, term28126.getClass(), "firstimage2", "BrPqlvIbEQ");
        setField(term28126, term28126.getClass(), "mapx", "JDTrhGRsDT");
        setField(term28126, term28126.getClass(), "mapy", "vHxsVQImjS");
        setField(term28126, term28126.getClass(), "tel", "jkVaRrZHQX");
        setField(term28126, term28126.getClass(), "title", "gSFFUuJipG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bQWfIFvxkQ";
        callMethod(klass, "setContenttypeid", argTypes, term28126, args);
    }

};


