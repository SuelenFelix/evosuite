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

public class Celebrity_getFileUrl_38497683331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17736;

    public Celebrity_getFileUrl_38497683331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17736 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17736, term17736.getClass(), "keyNum", 0);
        setField(term17736, term17736.getClass(), "name", null);
        setIntField(term17736, term17736.getClass(), "likeCount", 0);
        setIntField(term17736, term17736.getClass(), "status", 0);
        setField(term17736, term17736.getClass(), "explain", null);
        setField(term17736, term17736.getClass(), "fileUrl", null);
        setField(term17736, term17736.getClass(), "keyHash", null);
        setIntField(term17736, term17736.getClass(), "spot", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term17736, args);
    }

};


