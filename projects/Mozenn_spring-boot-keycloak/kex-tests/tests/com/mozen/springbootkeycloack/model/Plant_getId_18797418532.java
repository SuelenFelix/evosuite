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

public class Plant_getId_18797418532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public Plant_getId_18797418532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term68 = new Long(2442117782898005296L);
        term67 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term106 = newInstance(Class.forName("java.time.Instant"));
        setField(term67, term67.getClass(), "id", term68);
        setField(term67, term67.getClass(), "name", "xxtlPwDYFs");
        setField(term67, term67.getClass(), "scientificName", "jJCZpVmanW");
        setField(term67, term67.getClass(), "family", "EGtDIRbSSb");
        setLongField(term106, term106.getClass(), "seconds", 1786466033L);
        setIntField(term106, term106.getClass(), "nanos", 436933000);
        setField(term67, term67.getClass(), "createdAt", term106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term67, args);
    }

};


