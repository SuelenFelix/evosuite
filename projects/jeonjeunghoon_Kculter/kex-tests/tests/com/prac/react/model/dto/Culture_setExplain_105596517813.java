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

public class Culture_setExplain_105596517813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32230;

    public Culture_setExplain_105596517813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32230 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term32230, term32230.getClass(), "keyNum", -711507760);
        setField(term32230, term32230.getClass(), "keyHash", "wiBOoDCyzd");
        setField(term32230, term32230.getClass(), "name", "TIaFKUJELS");
        setIntField(term32230, term32230.getClass(), "likeCount", 1053773809);
        setIntField(term32230, term32230.getClass(), "status", 924127883);
        setField(term32230, term32230.getClass(), "explain", "IPmndzGjtG");
        setField(term32230, term32230.getClass(), "fileUrl", "pkQiBgYrkQ");
        setIntField(term32230, term32230.getClass(), "spot", -751079123);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SJLRFsNagf";
        callMethod(klass, "setExplain", argTypes, term32230, args);
    }

};


