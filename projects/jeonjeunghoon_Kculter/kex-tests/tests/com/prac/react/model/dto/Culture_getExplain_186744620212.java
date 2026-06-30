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

public class Culture_getExplain_186744620212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32137;

    public Culture_getExplain_186744620212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32137 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32137, term32137.getClass(), "keyNum", -47438786);
        setField(term32137, term32137.getClass(), "keyHash", "JpFIuyNEKW");
        setField(term32137, term32137.getClass(), "name", "NksHsgcqDx");
        setIntField(term32137, term32137.getClass(), "likeCount", -1955400589);
        setIntField(term32137, term32137.getClass(), "status", 626179200);
        setField(term32137, term32137.getClass(), "explain", "RjSNvOEvcT");
        setField(term32137, term32137.getClass(), "fileUrl", "HLzuMxigqS");
        setIntField(term32137, term32137.getClass(), "spot", -511077684);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExplain", argTypes, term32137, args);
    }

};


