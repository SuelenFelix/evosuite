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

public class Plant_setCreatedAt_140073951511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term783;
     Object term825;

    public Plant_setCreatedAt_140073951511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term784 = new Long(-2813493605142626659L);
        term783 = newInstance(Class.forName("com.mozen.springbootkeycloack.model.Plant"));
        Object term822 = newInstance(Class.forName("java.time.Instant"));
        setField(term783, term783.getClass(), "id", term784);
        setField(term783, term783.getClass(), "name", "SbAoxhfrkn");
        setField(term783, term783.getClass(), "scientificName", "kuTXqwMtDB");
        setField(term783, term783.getClass(), "family", "Ghbwtircqb");
        setLongField(term822, term822.getClass(), "seconds", 1786466034L);
        setIntField(term822, term822.getClass(), "nanos", 111365000);
        setField(term783, term783.getClass(), "createdAt", term822);
        term825 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term825, term825.getClass(), "seconds", 1345871412L);
        setIntField(term825, term825.getClass(), "nanos", 244000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootkeycloack.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term825;
        callMethod(klass, "setCreatedAt", argTypes, term783, args);
    }

};


