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

public class CreateSlideRequest_setText_19415231695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;

    public CreateSlideRequest_setText_19415231695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term290 = new Integer(-1922583790);
        term277 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest"));
        setField(term277, term277.getClass(), "text", "MxlszYVzRf");
        setField(term277, term277.getClass(), "order", term290);
        setField(term277, term277.getClass(), "base64FileEncoded", "LQFpaHEwXR");
        setField(term277, term277.getClass(), "contentType", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "aJlieCFVtF";
        callMethod(klass, "setText", argTypes, term277, args);
    }

};


