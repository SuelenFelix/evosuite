package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Slide_setBase64FileEncoded_25600618828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13620;

    public Slide_setBase64FileEncoded_25600618828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13620 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term13620, term13620.getClass(), "id", null);
        setField(term13620, term13620.getClass(), "imageUrl", null);
        setField(term13620, term13620.getClass(), "order", null);
        setField(term13620, term13620.getClass(), "text", null);
        setField(term13620, term13620.getClass(), "base64FileEncoded", null);
        setField(term13620, term13620.getClass(), "contentType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setBase64FileEncoded", argTypes, term13620, args);
    }

};


