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

public class Slide_getText_15874688746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12680;

    public Slide_getText_15874688746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12681 = new Long(1278107327214302894L);
        Integer term12695 = new Integer(941650513);
        term12680 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12680, term12680.getClass(), "id", term12681);
        setField(term12680, term12680.getClass(), "imageUrl", "HvSKssbEES");
        setField(term12680, term12680.getClass(), "order", term12695);
        setField(term12680, term12680.getClass(), "text", "UjIAQAHhul");
        setField(term12680, term12680.getClass(), "base64FileEncoded", "oWBXOvjPUT");
        setField(term12680, term12680.getClass(), "contentType", "DcKqrrTdId");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term12680, args);
    }

};


