package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ApplicationEntry_getName_6292979605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7936;

    public ApplicationEntry_getName_6292979605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7936 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term7936, term7936.getClass(), "id", "RxbhrFBjkO");
        setField(term7936, term7936.getClass(), "name", "aanyiAOJCl");
        setField(term7936, term7936.getClass(), "description", "VDokbsCuqq");
        setLongField(term7936, term7936.getClass(), "mts", -4360569253593381888L);
        setLongField(term7936, term7936.getClass(), "uts", 1457594663983990440L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term7936, args);
    }

};


