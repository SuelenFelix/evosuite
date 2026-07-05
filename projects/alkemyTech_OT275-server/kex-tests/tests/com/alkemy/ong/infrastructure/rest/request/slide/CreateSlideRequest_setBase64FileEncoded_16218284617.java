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

public class CreateSlideRequest_setBase64FileEncoded_16218284617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;

    public CreateSlideRequest_setBase64FileEncoded_16218284617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term452 = new Integer(-2038273078);
        term439 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest"));
        setField(term439, term439.getClass(), "text", "pCTimMblYc");
        setField(term439, term439.getClass(), "order", term452);
        setField(term439, term439.getClass(), "base64FileEncoded", "hNxWaHcfhY");
        setField(term439, term439.getClass(), "contentType", "RkybSrpybU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.slide.CreateSlideRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setBase64FileEncoded", argTypes, term439, args);
    }

};


