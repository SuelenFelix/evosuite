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

public class UpdateSlideResponse_setId_8851462071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term737;
     Object term766;

    public UpdateSlideResponse_setId_8851462071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term738 = new Long(-2813493605142626659L);
        Integer term752 = new Integer(-1685132342);
        term737 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.UpdateSlideResponse"));
        setField(term737, term737.getClass(), "id", term738);
        setField(term737, term737.getClass(), "text", "OWDIEULEFu");
        setField(term737, term737.getClass(), "order", term752);
        setField(term737, term737.getClass(), "imageUrl", "dWRymuLBtr");
        term766 = new Long(-8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.slide.UpdateSlideResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term766;
        callMethod(klass, "setId", argTypes, term737, args);
    }

};


