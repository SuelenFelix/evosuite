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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class SlideMapper_toResponse_9165867351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614;
     Object term615;

    public SlideMapper_toResponse_9165867351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideMapper"));
        Long term619 = new Long(2535595959091595249L);
        Integer term633 = new Integer(1585847225);
        Object term618 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term618, term618.getClass(), "id", term619);
        setField(term618, term618.getClass(), "imageUrl", "YRHGsAkhxb");
        setField(term618, term618.getClass(), "order", term633);
        setField(term618, term618.getClass(), "text", "ffYhPOzlUs");
        setField(term618, term618.getClass(), "base64FileEncoded", "MLqYREekMl");
        setField(term618, term618.getClass(), "contentType", "ytSBIKXogI");
        term615 = new LinkedList();
        ((LinkedList) term615).add(term618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.slide.SlideMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term615;
        callMethod(klass, "toResponse", argTypes, term614, args);
    }

};


