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

public class Pin_getImageUrl_143246201227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25507;

    public Pin_getImageUrl_143246201227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25507 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term25507, term25507.getClass(), "pinNum", 0);
        setField(term25507, term25507.getClass(), "pinHash", null);
        setIntField(term25507, term25507.getClass(), "pinType", 0);
        setIntField(term25507, term25507.getClass(), "pinKeyNum", 0);
        setField(term25507, term25507.getClass(), "pinKeyHash", null);
        setField(term25507, term25507.getClass(), "imageUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term25507, args);
    }

};


