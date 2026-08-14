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

public class ApplicationEntry_getUts_15168803049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8236;

    public ApplicationEntry_getUts_15168803049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8236 = newInstance(Class.forName("com.scaleguard.server.db.ApplicationEntry"));
        setField(term8236, term8236.getClass(), "id", "MeTmRZXErV");
        setField(term8236, term8236.getClass(), "name", "jNxbVmoZgq");
        setField(term8236, term8236.getClass(), "description", "PvmBHIXaMY");
        setLongField(term8236, term8236.getClass(), "mts", 1195529027276497124L);
        setLongField(term8236, term8236.getClass(), "uts", -2783999800714825789L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ApplicationEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUts", argTypes, term8236, args);
    }

};


