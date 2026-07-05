package com.alkemy.ong.infrastructure.rest.mapper.slide;

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
import static com.alkemy.ong.infrastructure.rest.mapper.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideWithTextMapper_toResponse_13049820801 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;
     Object term448;

    public SlideWithTextMapper_toResponse_13049820801() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term447 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper"));
        Long term449 = new Long(-4325723315152823407L);
        Integer term463 = new Integer(1134449235);
        term448 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term448, term448.getClass(), "id", term449);
        setField(term448, term448.getClass(), "imageUrl", "xLbjWUgOIL");
        setField(term448, term448.getClass(), "order", term463);
        setField(term448, term448.getClass(), "text", "jDtqGUpnZN");
        setField(term448, term448.getClass(), "base64FileEncoded", "nGKItKLYNC");
        setField(term448, term448.getClass(), "contentType", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideWithTextMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term448;
        callMethod(klass, "toResponse", argTypes, term447, args);
    }

};


