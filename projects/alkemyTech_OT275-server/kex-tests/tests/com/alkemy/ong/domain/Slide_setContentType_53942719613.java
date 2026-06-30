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

public class Slide_setContentType_53942719613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13401;

    public Slide_setContentType_53942719613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13402 = new Long(-3231440836116263235L);
        Integer term13416 = new Integer(683666002);
        term13401 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term13401, term13401.getClass(), "id", term13402);
        setField(term13401, term13401.getClass(), "imageUrl", "DLFXidLbuT");
        setField(term13401, term13401.getClass(), "order", term13416);
        setField(term13401, term13401.getClass(), "text", "FjkxfTXGIH");
        setField(term13401, term13401.getClass(), "base64FileEncoded", "KJkWSFFnmR");
        setField(term13401, term13401.getClass(), "contentType", "FBYRIDZvmW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IyjLfrDZrV";
        callMethod(klass, "setContentType", argTypes, term13401, args);
    }

};


