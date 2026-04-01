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

public class Celebrity_getFileUrl_38497683312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16977;

    public Celebrity_getFileUrl_38497683312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16977 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16977, term16977.getClass(), "keyNum", 752152965);
        setField(term16977, term16977.getClass(), "name", "LFZNDELxUZ");
        setIntField(term16977, term16977.getClass(), "likeCount", -1577069773);
        setIntField(term16977, term16977.getClass(), "status", -266625190);
        setField(term16977, term16977.getClass(), "explain", "GNIVsSTglt");
        setField(term16977, term16977.getClass(), "fileUrl", "mzPebFiUSP");
        setField(term16977, term16977.getClass(), "keyHash", "HvbkjsQyDy");
        setIntField(term16977, term16977.getClass(), "spot", 489201218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileUrl", argTypes, term16977, args);
    }

};


