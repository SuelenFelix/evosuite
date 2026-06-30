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

public class LocationBase_getAddr2_16579103944 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27507;

    public LocationBase_getAddr2_16579103944() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27507 = newInstance(Class.forName("com.prac.react.model.dto.LocationBase"));
        setField(term27507, term27507.getClass(), "addr1", "nOElYZBeyU");
        setField(term27507, term27507.getClass(), "addr2", "eUXPtGmoNg");
        setField(term27507, term27507.getClass(), "contenttypeid", "ZjqXyUmAJY");
        setField(term27507, term27507.getClass(), "firstimage", "pjEERkBbYo");
        setField(term27507, term27507.getClass(), "firstimage2", "FQPqmjhWog");
        setField(term27507, term27507.getClass(), "mapx", "sYtJsiIiSX");
        setField(term27507, term27507.getClass(), "mapy", "KgfsAwTFFn");
        setField(term27507, term27507.getClass(), "tel", "hFnFlgThhp");
        setField(term27507, term27507.getClass(), "title", "aEZAnHuGSR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.LocationBase");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddr2", argTypes, term27507, args);
    }

};


