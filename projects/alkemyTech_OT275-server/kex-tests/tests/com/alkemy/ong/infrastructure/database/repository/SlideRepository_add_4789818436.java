package com.alkemy.ong.infrastructure.database.repository;

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
import static com.alkemy.ong.infrastructure.database.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Integer;

public class SlideRepository_add_4789818436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817;

    public SlideRepository_add_4789818436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term818 = new Long(-5788180182343976541L);
        Integer term832 = new Integer(568599855);
        term817 = newInstance(Class.forName("com.alkemy.ong.domain.Slide"));
        setField(term817, term817.getClass(), "id", term818);
        setField(term817, term817.getClass(), "imageUrl", "XkIoWJRNwN");
        setField(term817, term817.getClass(), "order", term832);
        setField(term817, term817.getClass(), "text", "aNWLJdrZMq");
        setField(term817, term817.getClass(), "base64FileEncoded", "HHmNoYxIGj");
        setField(term817, term817.getClass(), "contentType", "PtirvZmsGt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.repository.SlideRepository");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Slide");
        Object[] args = new Object[1];
        args[0] = term817;
        callMethod(klass, "add", argTypes, null, args);
    }

};


