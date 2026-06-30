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

public class LocationBase_getContenttypeid_3270688136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27927;

    public LocationBase_getContenttypeid_3270688136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27927 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term27927, term27927.getClass(), "addr1", "uQjzusifTg");
        setField(term27927, term27927.getClass(), "addr2", "mOulGkUjOk");
        setField(term27927, term27927.getClass(), "contenttypeid", "hNWRuNEgOf");
        setField(term27927, term27927.getClass(), "firstimage", "CEtjGBplmv");
        setField(term27927, term27927.getClass(), "firstimage2", "XosDTAzIAT");
        setField(term27927, term27927.getClass(), "mapx", "lcCEhCpiZM");
        setField(term27927, term27927.getClass(), "mapy", "OPJlqMJxdq");
        setField(term27927, term27927.getClass(), "tel", "COhzwXcfds");
        setField(term27927, term27927.getClass(), "title", "anncJTnzrg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContenttypeid", argTypes, term27927, args);
    }

};


