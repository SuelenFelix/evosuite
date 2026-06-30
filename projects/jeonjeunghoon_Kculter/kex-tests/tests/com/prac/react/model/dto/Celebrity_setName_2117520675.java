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

public class Celebrity_setName_2117520675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16278;

    public Celebrity_setName_2117520675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16278 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16278, term16278.getClass(), "keyNum", -439048495);
        setField(term16278, term16278.getClass(), "name", "DvRdOzzihn");
        setIntField(term16278, term16278.getClass(), "likeCount", -1849105286);
        setIntField(term16278, term16278.getClass(), "status", 1334483645);
        setField(term16278, term16278.getClass(), "explain", "wIygCdQAKO");
        setField(term16278, term16278.getClass(), "fileUrl", "JsXroBYqwr");
        setField(term16278, term16278.getClass(), "keyHash", "YciMAObLwl");
        setIntField(term16278, term16278.getClass(), "spot", 917513193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qAmVqwwdyf";
        callMethod(klass, "setName", argTypes, term16278, args);
    }

};


