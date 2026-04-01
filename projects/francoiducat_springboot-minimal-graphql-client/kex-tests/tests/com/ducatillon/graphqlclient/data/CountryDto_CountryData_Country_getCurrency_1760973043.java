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

public class CountryDto_CountryData_Country_getCurrency_1760973043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term495;

    public CountryDto_CountryData_Country_getCurrency_1760973043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term495 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term532 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term533 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term570 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term571 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        setField(term495, term495.getClass(), "name", "UiUYnPrcCi");
        setField(term495, term495.getClass(), "capital", "UoYtihxVaS");
        setField(term495, term495.getClass(), "currency", "JDswTTCZHV");
        setField(term533, term533.getClass(), "name", "onpbIeEKoi");
        setField(term533, term533.getClass(), "capital", "YRHGsAkhxb");
        setField(term533, term533.getClass(), "currency", "ffYhPOzlUs");
        setField(term571, term571.getClass(), "name", null);
        setField(term571, term571.getClass(), "capital", null);
        setField(term571, term571.getClass(), "currency", null);
        setField(term571, term571.getClass(), "this$1", null);
        setField(term570, term570.getClass(), "country", term571);
        setField(term570, term570.getClass(), "this$0", null);
        setField(term533, term533.getClass(), "this$1", term570);
        setField(term532, term532.getClass(), "country", term533);
        setField(term532, term532.getClass(), "this$0", null);
        setField(term495, term495.getClass(), "this$1", term532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term495, args);
    }

};


