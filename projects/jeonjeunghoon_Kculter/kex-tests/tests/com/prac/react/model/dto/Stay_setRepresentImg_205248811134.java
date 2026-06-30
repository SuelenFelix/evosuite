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

public class Stay_setRepresentImg_205248811134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4151;

    public Stay_setRepresentImg_205248811134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4151 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4151, term4151.getClass(), "addr1", null);
        setField(term4151, term4151.getClass(), "addr2", null);
        setField(term4151, term4151.getClass(), "areaCode", null);
        setField(term4151, term4151.getClass(), "sigunguCode", null);
        setField(term4151, term4151.getClass(), "representImg", null);
        setField(term4151, term4151.getClass(), "sumnail", null);
        setDoubleField(term4151, term4151.getClass(), "lng", 0.0);
        setDoubleField(term4151, term4151.getClass(), "lat", 0.0);
        setField(term4151, term4151.getClass(), "tel", null);
        setField(term4151, term4151.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRepresentImg", argTypes, term4151, args);
    }

};


