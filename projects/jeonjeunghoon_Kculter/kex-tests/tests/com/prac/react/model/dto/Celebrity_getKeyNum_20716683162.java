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

public class Celebrity_getKeyNum_20716683162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15997;

    public Celebrity_getKeyNum_20716683162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15997 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term15997, term15997.getClass(), "keyNum", 1084849225);
        setField(term15997, term15997.getClass(), "name", "FOKfDXQxMM");
        setIntField(term15997, term15997.getClass(), "likeCount", -1702055571);
        setIntField(term15997, term15997.getClass(), "status", -944542900);
        setField(term15997, term15997.getClass(), "explain", "gbxMvhrWpA");
        setField(term15997, term15997.getClass(), "fileUrl", "huNTIobUHx");
        setField(term15997, term15997.getClass(), "keyHash", "MrVeCmRVzF");
        setIntField(term15997, term15997.getClass(), "spot", 2063762142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKeyNum", argTypes, term15997, args);
    }

};


