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

public class Culture_getStatus_155366880410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31949;

    public Culture_getStatus_155366880410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31949 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31949, term31949.getClass(), "keyNum", 34167717);
        setField(term31949, term31949.getClass(), "keyHash", "frPMFqGmrE");
        setField(term31949, term31949.getClass(), "name", "DvfOYWcNBN");
        setIntField(term31949, term31949.getClass(), "likeCount", -514195141);
        setIntField(term31949, term31949.getClass(), "status", -297946422);
        setField(term31949, term31949.getClass(), "explain", "cvbvwpPlNk");
        setField(term31949, term31949.getClass(), "fileUrl", "uCdLbhvYeG");
        setIntField(term31949, term31949.getClass(), "spot", 385463636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term31949, args);
    }

};


