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

public class Slide_getFileName_21115437482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12308;

    public Slide_getFileName_21115437482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12309 = new Long(-8211859616692114655L);
        Integer term12323 = new Integer(-1772434990);
        term12308 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12308, term12308.getClass(), "id", term12309);
        setField(term12308, term12308.getClass(), "imageUrl", "hAPmQGaxkI");
        setField(term12308, term12308.getClass(), "order", term12323);
        setField(term12308, term12308.getClass(), "text", "ojrnLnJZjT");
        setField(term12308, term12308.getClass(), "base64FileEncoded", "rtvXSMjOdJ");
        setField(term12308, term12308.getClass(), "contentType", "EDkfjuDpNv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFileName", argTypes, term12308, args);
    }

};


