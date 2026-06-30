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

public class CountryDto_CountryData_Country_getCapital_6565701572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;

    public CountryDto_CountryData_Country_getCapital_6565701572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term395 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term396 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term433 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term434 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        setField(term358, term358.getClass(), "name", "xrwlQZdwCp");
        setField(term358, term358.getClass(), "capital", "IDCWpPLRkE");
        setField(term358, term358.getClass(), "currency", "nyiiPDVjAc");
        setField(term396, term396.getClass(), "name", "aKnKipADSo");
        setField(term396, term396.getClass(), "capital", "wSQxaModmm");
        setField(term396, term396.getClass(), "currency", "UlajhuVLaP");
        setField(term434, term434.getClass(), "name", null);
        setField(term434, term434.getClass(), "capital", null);
        setField(term434, term434.getClass(), "currency", null);
        setField(term434, term434.getClass(), "this$1", null);
        setField(term433, term433.getClass(), "country", term434);
        setField(term433, term433.getClass(), "this$0", null);
        setField(term396, term396.getClass(), "this$1", term433);
        setField(term395, term395.getClass(), "country", term396);
        setField(term395, term395.getClass(), "this$0", null);
        setField(term358, term358.getClass(), "this$1", term395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCapital", argTypes, term358, args);
    }

};


