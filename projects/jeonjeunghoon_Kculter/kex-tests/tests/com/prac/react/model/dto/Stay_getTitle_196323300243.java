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

public class Stay_getTitle_196323300243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4182;

    public Stay_getTitle_196323300243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4182 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term4182, term4182.getClass(), "addr1", null);
        setField(term4182, term4182.getClass(), "addr2", null);
        setField(term4182, term4182.getClass(), "areaCode", null);
        setField(term4182, term4182.getClass(), "sigunguCode", null);
        setField(term4182, term4182.getClass(), "representImg", null);
        setField(term4182, term4182.getClass(), "sumnail", null);
        setDoubleField(term4182, term4182.getClass(), "lng", 0.0);
        setDoubleField(term4182, term4182.getClass(), "lat", 0.0);
        setField(term4182, term4182.getClass(), "tel", null);
        setField(term4182, term4182.getClass(), "title", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term4182, args);
    }

};


