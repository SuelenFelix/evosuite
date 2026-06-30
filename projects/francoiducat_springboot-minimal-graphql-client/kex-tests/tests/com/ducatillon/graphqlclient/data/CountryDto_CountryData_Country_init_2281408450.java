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

public class CountryDto_CountryData_Country_init_2281408450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;

    public CountryDto_CountryData_Country_init_2281408450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term148 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term185 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term186 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term190 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        setField(term148, term148.getClass(), "name", "SzjVpOQTyS");
        setField(term148, term148.getClass(), "capital", "MjGYSRKTNF");
        setField(term148, term148.getClass(), "currency", "hRNSzYYIrc");
        setField(term186, term186.getClass(), "name", "");
        setField(term186, term186.getClass(), "capital", "");
        setField(term186, term186.getClass(), "currency", "");
        setField(term190, term190.getClass(), "country", null);
        setField(term190, term190.getClass(), "this$0", null);
        setField(term186, term186.getClass(), "this$1", term190);
        setField(term185, term185.getClass(), "country", term186);
        setField(term185, term185.getClass(), "this$0", null);
        setField(term148, term148.getClass(), "this$1", term185);
        setField(term147, term147.getClass(), "country", term148);
        setField(term147, term147.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData");
        Object[] args = new Object[1];
        args[0] = term147;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


