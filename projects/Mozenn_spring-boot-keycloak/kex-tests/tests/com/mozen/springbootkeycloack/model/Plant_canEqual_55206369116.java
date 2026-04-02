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

public class Plant_canEqual_55206369116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1008;
     Object term1050;

    public Plant_canEqual_55206369116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1009 = new Long(2535595959091595249L);
        term1008 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term1047 = newInstance(Class.forName("java.time.Instant"));
        setField(term1008, term1008.getClass(), "id", term1009);
        setField(term1008, term1008.getClass(), "name", "gGSMzuGICf");
        setField(term1008, term1008.getClass(), "scientificName", "hxCBltsObl");
        setField(term1008, term1008.getClass(), "family", "BndsHwAFMv");
        setLongField(term1047, term1047.getClass(), "seconds", 1775105447L);
        setIntField(term1047, term1047.getClass(), "nanos", 83658000);
        setField(term1008, term1008.getClass(), "createdAt", term1047);
        term1050 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1050;
        callMethod(klass, "canEqual", argTypes, term1008, args);
    }

};


