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

public class Slide_getOrder_20739365805 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12587;

    public Slide_getOrder_20739365805() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12588 = new Long(-6771377873268167033L);
        Integer term12602 = new Integer(-344842608);
        term12587 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term12587, term12587.getClass(), "id", term12588);
        setField(term12587, term12587.getClass(), "imageUrl", "GmtlSgqKcI");
        setField(term12587, term12587.getClass(), "order", term12602);
        setField(term12587, term12587.getClass(), "text", "ssSbvPoMjB");
        setField(term12587, term12587.getClass(), "base64FileEncoded", "mhRVADhaKm");
        setField(term12587, term12587.getClass(), "contentType", "rLldJrTAay");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Slide");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrder", argTypes, term12587, args);
    }

};


