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
import java.lang.Long;
import java.lang.Integer;

public class Slide_setBase64FileEncoded_25600618812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13286;

    public Slide_setBase64FileEncoded_25600618812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13287 = new Long(-1750555031444556464L);
        Integer term13301 = new Integer(-1888585309);
        term13286 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term13286, term13286.getClass(), "id", term13287);
        setField(term13286, term13286.getClass(), "imageUrl", "tYBgGQtkhi");
        setField(term13286, term13286.getClass(), "order", term13301);
        setField(term13286, term13286.getClass(), "text", "PhGPFLIMKH");
        setField(term13286, term13286.getClass(), "base64FileEncoded", "pWCYcLhoms");
        setField(term13286, term13286.getClass(), "contentType", "IWNJVfvTuw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DLpKfwPpvr";
        callMethod(klass, "setBase64FileEncoded", argTypes, term13286, args);
    }

};


