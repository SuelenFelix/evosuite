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

public class Culture_getLikeCount_11767062628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31761;

    public Culture_getLikeCount_11767062628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31761 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31761, term31761.getClass(), "keyNum", 27043781);
        setField(term31761, term31761.getClass(), "keyHash", "qxrRUnjshF");
        setField(term31761, term31761.getClass(), "name", "WmVcapKAeJ");
        setIntField(term31761, term31761.getClass(), "likeCount", -1367122405);
        setIntField(term31761, term31761.getClass(), "status", -1703625118);
        setField(term31761, term31761.getClass(), "explain", "jevOVdQdpc");
        setField(term31761, term31761.getClass(), "fileUrl", "TLLVSGTNsz");
        setIntField(term31761, term31761.getClass(), "spot", 1104108112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLikeCount", argTypes, term31761, args);
    }

};


