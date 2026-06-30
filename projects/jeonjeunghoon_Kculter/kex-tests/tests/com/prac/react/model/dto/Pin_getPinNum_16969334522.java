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

public class Pin_getPinNum_16969334522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24473;

    public Pin_getPinNum_16969334522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24473 = newInstance(Class.forName("com.prac.react.model.dto.Pin"));
        setIntField(term24473, term24473.getClass(), "pinNum", 1706047059);
        setField(term24473, term24473.getClass(), "pinHash", "yXLTfzOgfX");
        setIntField(term24473, term24473.getClass(), "pinType", 590451710);
        setIntField(term24473, term24473.getClass(), "pinKeyNum", -1999787419);
        setField(term24473, term24473.getClass(), "pinKeyHash", "MANlfBKTPY");
        setField(term24473, term24473.getClass(), "imageUrl", "mRoEmuCJhW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Pin");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPinNum", argTypes, term24473, args);
    }

};


