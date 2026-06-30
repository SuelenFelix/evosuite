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
import java.lang.Integer;

public class Culture_setStatus_163862137830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32889;
     Object term32894;

    public Culture_setStatus_163862137830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32889 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32889, term32889.getClass(), "keyNum", 0);
        setField(term32889, term32889.getClass(), "keyHash", null);
        setField(term32889, term32889.getClass(), "name", null);
        setIntField(term32889, term32889.getClass(), "likeCount", 0);
        setIntField(term32889, term32889.getClass(), "status", 0);
        setField(term32889, term32889.getClass(), "explain", null);
        setField(term32889, term32889.getClass(), "fileUrl", null);
        setIntField(term32889, term32889.getClass(), "spot", 0);
        term32894 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32894;
        callMethod(klass, "setStatus", argTypes, term32889, args);
    }

};


