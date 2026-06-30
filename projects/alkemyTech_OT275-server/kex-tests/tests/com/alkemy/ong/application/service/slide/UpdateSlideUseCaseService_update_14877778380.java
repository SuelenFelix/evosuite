package com.alkemy.ong.application.service.slide;

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
import static com.alkemy.ong.application.service.slide.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class UpdateSlideUseCaseService_update_14877778380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term103;

    public UpdateSlideUseCaseService_update_14877778380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService"));
        setField(term102, term102.getClass(), "slideRepository", null);
        Long term104 = new Long(6375119433582206027L);
        Integer term118 = new Integer(1162663216);
        term103 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term103, term103.getClass(), "id", term104);
        setField(term103, term103.getClass(), "imageUrl", "jJCZpVmanW");
        setField(term103, term103.getClass(), "order", term118);
        setField(term103, term103.getClass(), "text", "EGtDIRbSSb");
        setField(term103, term103.getClass(), "base64FileEncoded", "SzjVpOQTyS");
        setField(term103, term103.getClass(), "contentType", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.application.service.slide.UpdateSlideUseCaseService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term103;
        callMethod(klass, "update", argTypes, term102, args);
    }

};


