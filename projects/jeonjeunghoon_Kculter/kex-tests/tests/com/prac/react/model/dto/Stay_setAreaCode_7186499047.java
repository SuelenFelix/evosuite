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

public class Stay_setAreaCode_7186499047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1120;

    public Stay_setAreaCode_7186499047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1120 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term1120, term1120.getClass(), "addr1", "nGKItKLYNC");
        setField(term1120, term1120.getClass(), "addr2", "UiUYnPrcCi");
        setField(term1120, term1120.getClass(), "areaCode", "UoYtihxVaS");
        setField(term1120, term1120.getClass(), "sigunguCode", "JDswTTCZHV");
        setField(term1120, term1120.getClass(), "representImg", "onpbIeEKoi");
        setField(term1120, term1120.getClass(), "sumnail", "YRHGsAkhxb");
        setDoubleField(term1120, term1120.getClass(), "lng", 0.7655020693602768);
        setDoubleField(term1120, term1120.getClass(), "lat", 0.1374549299694151);
        setField(term1120, term1120.getClass(), "tel", "ffYhPOzlUs");
        setField(term1120, term1120.getClass(), "title", "MLqYREekMl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ytSBIKXogI";
        callMethod(klass, "setAreaCode", argTypes, term1120, args);
    }

};


