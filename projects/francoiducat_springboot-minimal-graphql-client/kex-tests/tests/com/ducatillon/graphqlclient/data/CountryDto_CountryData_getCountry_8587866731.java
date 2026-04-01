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

public class CountryDto_CountryData_getCountry_8587866731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778;

    public CountryDto_CountryData_getCountry_8587866731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term779 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term816 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term817 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term821 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        setField(term779, term779.getClass(), "name", "swZVeJAxjt");
        setField(term779, term779.getClass(), "capital", "xOcJIiQQDu");
        setField(term779, term779.getClass(), "currency", "GVizqqzXpy");
        setField(term817, term817.getClass(), "name", "");
        setField(term817, term817.getClass(), "capital", "");
        setField(term817, term817.getClass(), "currency", "");
        setField(term821, term821.getClass(), "country", null);
        setField(term821, term821.getClass(), "this$0", null);
        setField(term817, term817.getClass(), "this$1", term821);
        setField(term816, term816.getClass(), "country", term817);
        setField(term816, term816.getClass(), "this$0", null);
        setField(term779, term779.getClass(), "this$1", term816);
        setField(term778, term778.getClass(), "country", term779);
        setField(term778, term778.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term778, args);
    }

};


