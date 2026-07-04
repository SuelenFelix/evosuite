package com.org.model.vo;

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
import static com.org.model.vo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Meeting2VO_getId_80036154916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4881;

    public Meeting2VO_getId_80036154916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4881 = newInstance(Class.forName("com.org.model.vo.Meeting2VO"));
        setField(term4881, term4881.getClass(), "id", null);
        setField(term4881, term4881.getClass(), "username", null);
        setField(term4881, term4881.getClass(), "startTime", null);
        setField(term4881, term4881.getClass(), "state", null);
        setField(term4881, term4881.getClass(), "faceUrl", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.org.model.vo.Meeting2VO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term4881, args);
    }

};


