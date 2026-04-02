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

public class Plant_toString_197929461113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term862;

    public Plant_toString_197929461113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term863 = new Long(-8885298608300233488L);
        term862 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term901 = newInstance(Class.forName("java.time.Instant"));
        setField(term862, term862.getClass(), "id", term863);
        setField(term862, term862.getClass(), "name", "xrwlQZdwCp");
        setField(term862, term862.getClass(), "scientificName", "IDCWpPLRkE");
        setField(term862, term862.getClass(), "family", "nyiiPDVjAc");
        setLongField(term901, term901.getClass(), "seconds", 1775105446L);
        setIntField(term901, term901.getClass(), "nanos", 803154000);
        setField(term862, term862.getClass(), "createdAt", term901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term862, args);
    }

};


