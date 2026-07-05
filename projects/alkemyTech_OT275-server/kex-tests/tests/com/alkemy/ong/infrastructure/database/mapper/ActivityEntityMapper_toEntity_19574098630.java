package com.alkemy.ong.infrastructure.database.mapper;

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
import static com.alkemy.ong.infrastructure.database.mapper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class ActivityEntityMapper_toEntity_19574098630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term366;

    public ActivityEntityMapper_toEntity_19574098630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("com.alkemy.ong.infrastructure.database.mapper.ActivityEntityMapper"));
        Long term367 = new Long(6811161968424632369L);
        term366 = newInstance(Class.forName("com.alkemy.ong.domain.Activity"));
        setField(term366, term366.getClass(), "id", term367);
        setField(term366, term366.getClass(), "content", "IoAlmYsBwc");
        setField(term366, term366.getClass(), "imageUrl", "TEParAifyi");
        setField(term366, term366.getClass(), "name", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.database.mapper.ActivityEntityMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.Activity");
        Object[] args = new Object[1];
        args[0] = term366;
        callMethod(klass, "toEntity", argTypes, term365, args);
    }

};


