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

public class Stay_setRepresentImg_205248811111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1880;

    public Stay_setRepresentImg_205248811111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1880 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term1880, term1880.getClass(), "addr1", "cAPeiZHKGJ");
        setField(term1880, term1880.getClass(), "addr2", "LvJFtLBaxj");
        setField(term1880, term1880.getClass(), "areaCode", "PHvxnGHptP");
        setField(term1880, term1880.getClass(), "sigunguCode", "TimdotUuNC");
        setField(term1880, term1880.getClass(), "representImg", "PkWMRdJcBb");
        setField(term1880, term1880.getClass(), "sumnail", "jSpAteRute");
        setDoubleField(term1880, term1880.getClass(), "lng", 0.4569171842750229);
        setDoubleField(term1880, term1880.getClass(), "lat", 0.8598297828918529);
        setField(term1880, term1880.getClass(), "tel", "swZVeJAxjt");
        setField(term1880, term1880.getClass(), "title", "xOcJIiQQDu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GVizqqzXpy";
        callMethod(klass, "setRepresentImg", argTypes, term1880, args);
    }

};


