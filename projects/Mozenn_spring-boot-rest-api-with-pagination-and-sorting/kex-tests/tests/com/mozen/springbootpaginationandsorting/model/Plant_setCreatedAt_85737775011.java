package com.mozen.springbootpaginationandsorting.model;

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
import static com.mozen.springbootpaginationandsorting.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Plant_setCreatedAt_85737775011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817;
     Object term859;

    public Plant_setCreatedAt_85737775011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term818 = new Long(-2813493605142626659L);
        term817 = newInstance(Class.forName("com.mozen.springbootpaginationandsorting.model.Plant"));
        Object term856 = newInstance(Class.forName("java.time.Instant"));
        setField(term817, term817.getClass(), "id", term818);
        setField(term817, term817.getClass(), "name", "SbAoxhfrkn");
        setField(term817, term817.getClass(), "scientificName", "kuTXqwMtDB");
        setField(term817, term817.getClass(), "family", "Ghbwtircqb");
        setLongField(term856, term856.getClass(), "seconds", 1786438250L);
        setIntField(term856, term856.getClass(), "nanos", 507228000);
        setField(term817, term817.getClass(), "createdAt", term856);
        term859 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term859, term859.getClass(), "seconds", 1345871412L);
        setIntField(term859, term859.getClass(), "nanos", 244000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.mozen.springbootpaginationandsorting.model.Plant");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term859;
        callMethod(klass, "setCreatedAt", argTypes, term817, args);
    }

};


