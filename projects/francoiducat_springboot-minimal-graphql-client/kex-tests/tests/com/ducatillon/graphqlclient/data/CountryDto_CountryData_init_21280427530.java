package com.ducatillon.graphqlclient.data;

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
import static com.ducatillon.graphqlclient.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CountryDto_CountryData_init_21280427530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term707;

    public CountryDto_CountryData_init_21280427530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term707 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto"));
        Object term708 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term709 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term746 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term747 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        setField(term709, term709.getClass(), "name", "OWKQODBLzb");
        setField(term709, term709.getClass(), "capital", "wGmYcqUkgE");
        setField(term709, term709.getClass(), "currency", "idgaQsnJpQ");
        setField(term747, term747.getClass(), "name", null);
        setField(term747, term747.getClass(), "capital", null);
        setField(term747, term747.getClass(), "currency", null);
        setField(term747, term747.getClass(), "this$1", null);
        setField(term746, term746.getClass(), "country", term747);
        setField(term746, term746.getClass(), "this$0", null);
        setField(term709, term709.getClass(), "this$1", term746);
        setField(term708, term708.getClass(), "country", term709);
        setField(term708, term708.getClass(), "this$0", null);
        setField(term707, term707.getClass(), "data", term708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.ducatillon.graphqlclient.data.CountryDto");
        Object[] args = new Object[1];
        args[0] = term707;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


