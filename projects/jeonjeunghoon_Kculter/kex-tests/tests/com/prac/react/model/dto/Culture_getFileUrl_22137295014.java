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

public class Culture_getFileUrl_22137295014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32345;

    public Culture_getFileUrl_22137295014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32345 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32345, term32345.getClass(), "keyNum", -110837188);
        setField(term32345, term32345.getClass(), "keyHash", "UsCZaSgXzI");
        setField(term32345, term32345.getClass(), "name", "IXZCeVwvBM");
        setIntField(term32345, term32345.getClass(), "likeCount", -271094506);
        setIntField(term32345, term32345.getClass(), "status", 455632030);
        setField(term32345, term32345.getClass(), "explain", "ElTdyUVQYi");
        setField(term32345, term32345.getClass(), "fileUrl", "KkgJnxXxVl");
        setIntField(term32345, term32345.getClass(), "spot", -1632929393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term32345, args);
    }

};


