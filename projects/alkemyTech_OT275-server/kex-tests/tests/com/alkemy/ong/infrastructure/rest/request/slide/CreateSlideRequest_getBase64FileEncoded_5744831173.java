package com.alkemy.ong.infrastructure.rest.request.slide;

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
import static com.alkemy.ong.infrastructure.rest.request.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CreateSlideRequest_getBase64FileEncoded_5744831173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public CreateSlideRequest_getBase64FileEncoded_5744831173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term152 = new Integer(1484323161);
        term139 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest"));
        setField(term139, term139.getClass(), "text", "SzjVpOQTyS");
        setField(term139, term139.getClass(), "order", term152);
        setField(term139, term139.getClass(), "base64FileEncoded", "MjGYSRKTNF");
        setField(term139, term139.getClass(), "contentType", "hRNSzYYIrc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBase64FileEncoded", argTypes, term139, args);
    }

};


