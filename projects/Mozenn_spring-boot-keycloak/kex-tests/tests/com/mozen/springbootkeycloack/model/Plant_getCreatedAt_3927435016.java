package com.mozen.springbootkeycloack.model;

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
import static com.mozen.springbootkeycloack.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_getCreatedAt_3927435016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;

    public Plant_getCreatedAt_3927435016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term356 = new Long(5270370404989704783L);
        term355 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term394 = newInstance(Class.forName("java.time.Instant"));
        setField(term355, term355.getClass(), "id", term356);
        setField(term355, term355.getClass(), "name", "aJlieCFVtF");
        setField(term355, term355.getClass(), "scientificName", "ZiaGIbnzTs");
        setField(term355, term355.getClass(), "family", "tbcdzjIfER");
        setLongField(term394, term394.getClass(), "seconds", 1786466033L);
        setIntField(term394, term394.getClass(), "nanos", 770352000);
        setField(term355, term355.getClass(), "createdAt", term394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedAt", argTypes, term355, args);
    }

};


