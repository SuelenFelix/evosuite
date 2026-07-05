package com.alkemy.ong.infrastructure.rest.response.activity;

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
import static com.alkemy.ong.infrastructure.rest.response.activity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class CreateActivityResponse_getName_850616971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;

    public CreateActivityResponse_getName_850616971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term699 = new Long(-2813493605142626659L);
        term698 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse"));
        setField(term698, term698.getClass(), "id", term699);
        setField(term698, term698.getClass(), "name", "OWDIEULEFu");
        setField(term698, term698.getClass(), "content", "dWRymuLBtr");
        setField(term698, term698.getClass(), "imageUrl", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.activity.CreateActivityResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term698, args);
    }

};


