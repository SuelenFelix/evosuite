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

public class Celebrity_setKeyHash_142163987715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17278;

    public Celebrity_setKeyHash_142163987715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17278 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term17278, term17278.getClass(), "keyNum", -423900705);
        setField(term17278, term17278.getClass(), "name", "ORDuSTrpNA");
        setIntField(term17278, term17278.getClass(), "likeCount", -525570815);
        setIntField(term17278, term17278.getClass(), "status", 754055848);
        setField(term17278, term17278.getClass(), "explain", "hysThIPoEJ");
        setField(term17278, term17278.getClass(), "fileUrl", "dfZepHfGwh");
        setField(term17278, term17278.getClass(), "keyHash", "zjfMxUERFZ");
        setIntField(term17278, term17278.getClass(), "spot", -19246901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ooVlhmiOff";
        callMethod(klass, "setKeyHash", argTypes, term17278, args);
    }

};


