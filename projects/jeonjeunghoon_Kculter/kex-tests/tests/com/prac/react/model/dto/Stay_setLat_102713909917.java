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
import java.lang.Double;

public class Stay_setLat_102713909917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3000;
     Object term3099;

    public Stay_setLat_102713909917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3000 = newInstance(Class.forName("com.prac.react.model.dto.Stay"));
        setField(term3000, term3000.getClass(), "addr1", "gCWtLVKVVe");
        setField(term3000, term3000.getClass(), "addr2", "fWKJoSoCwE");
        setField(term3000, term3000.getClass(), "areaCode", "wfaXBpWAUH");
        setField(term3000, term3000.getClass(), "sigunguCode", "VMeAzAHwZj");
        setField(term3000, term3000.getClass(), "representImg", "PznxWXsZME");
        setField(term3000, term3000.getClass(), "sumnail", "ZzIujlwVsw");
        setDoubleField(term3000, term3000.getClass(), "lng", 0.6300849762307866);
        setDoubleField(term3000, term3000.getClass(), "lat", 0.9737083944266686);
        setField(term3000, term3000.getClass(), "tel", "LWyEaeIyAo");
        setField(term3000, term3000.getClass(), "title", "yVMkkQhvmN");
        term3099 = new Double(0.0668892744806211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Stay");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3099;
        callMethod(klass, "setLat", argTypes, term3000, args);
    }

};


