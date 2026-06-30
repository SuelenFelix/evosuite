package com.alkemy.ong.infrastructure.rest.response.slide;

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
import static com.alkemy.ong.infrastructure.rest.response.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class GetSlideResponse_setImageUrl_5812369007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;

    public GetSlideResponse_setImageUrl_5812369007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term537 = new Long(6811161968424632369L);
        Integer term563 = new Integer(1134449235);
        term536 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse"));
        setField(term536, term536.getClass(), "id", term537);
        setField(term536, term536.getClass(), "imageUrl", "xOEqzGAmDU");
        setField(term536, term536.getClass(), "text", "eZFUvlxvGV");
        setField(term536, term536.getClass(), "position", term563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.GetSlideResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BYqFIqCKAV";
        callMethod(klass, "setImageUrl", argTypes, term536, args);
    }

};


