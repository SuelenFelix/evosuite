package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Place_getPlaceNum_24550562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4333;

    public Place_getPlaceNum_24550562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4333 = newInstance(Class.forName("com.prac.react.model.dto.Place"));
        setIntField(term4333, term4333.getClass(), "placeNum", 391863371);
        setField(term4333, term4333.getClass(), "keyHash", "lFRJFUMVbx");
        setIntField(term4333, term4333.getClass(), "placeType", -1922583790);
        setField(term4333, term4333.getClass(), "culture", "sZdUNdggUW");
        setField(term4333, term4333.getClass(), "kpop", "OqbwYQfvAe");
        setDoubleField(term4333, term4333.getClass(), "lat", 0.7591353014991907);
        setDoubleField(term4333, term4333.getClass(), "lng", 0.791695029600875);
        setIntField(term4333, term4333.getClass(), "status", -616727354);
        setField(term4333, term4333.getClass(), "name", "tRxZafjqIx");
        setField(term4333, term4333.getClass(), "explain", "DhjNLmRMCu");
        setField(term4333, term4333.getClass(), "address", "PgPzMSEjjX");
        setField(term4333, term4333.getClass(), "fileUrl", "wzsPSPcRdj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceNum", argTypes, term4333, args);
    }

};


