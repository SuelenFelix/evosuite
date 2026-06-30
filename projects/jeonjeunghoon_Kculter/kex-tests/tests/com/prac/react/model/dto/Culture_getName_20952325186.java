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

public class Culture_getName_20952325186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31553;

    public Culture_getName_20952325186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31553 = newInstance(Class.forName("com.prac.react.model.dto.Culture"));
        setIntField(term31553, term31553.getClass(), "keyNum", -829088844);
        setField(term31553, term31553.getClass(), "keyHash", "fzzIOVxKdF");
        setField(term31553, term31553.getClass(), "name", "cdvmxZaBEK");
        setIntField(term31553, term31553.getClass(), "likeCount", -31751777);
        setIntField(term31553, term31553.getClass(), "status", -246967963);
        setField(term31553, term31553.getClass(), "explain", "QHYZiyDyPC");
        setField(term31553, term31553.getClass(), "fileUrl", "kcHMyiheuH");
        setIntField(term31553, term31553.getClass(), "spot", -1777140369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Culture");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term31553, args);
    }

};


