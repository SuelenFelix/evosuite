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

public class Celebrity_setExplain_121956906111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16862;

    public Celebrity_setExplain_121956906111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16862 = newInstance(Class.forName("com.prac.react.model.dto.Celebrity"));
        setIntField(term16862, term16862.getClass(), "keyNum", 510162332);
        setField(term16862, term16862.getClass(), "name", "tTVbtBVAfo");
        setIntField(term16862, term16862.getClass(), "likeCount", 888506903);
        setIntField(term16862, term16862.getClass(), "status", 200252898);
        setField(term16862, term16862.getClass(), "explain", "cjaaJUnNCR");
        setField(term16862, term16862.getClass(), "fileUrl", "ETbxNuJLii");
        setField(term16862, term16862.getClass(), "keyHash", "YJhnPtWtJR");
        setIntField(term16862, term16862.getClass(), "spot", -1831826725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Celebrity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xzGnrvbExX";
        callMethod(klass, "setExplain", argTypes, term16862, args);
    }

};


