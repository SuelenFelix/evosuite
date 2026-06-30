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

public class CountryDto_getData_14879050191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;

    public CountryDto_getData_14879050191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term635 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto"));
        Object term636 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term637 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term674 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term675 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        setField(term637, term637.getClass(), "name", "kBdSllIBVz");
        setField(term637, term637.getClass(), "capital", "TJmVBGfTML");
        setField(term637, term637.getClass(), "currency", "tPlsykYBqO");
        setField(term675, term675.getClass(), "name", null);
        setField(term675, term675.getClass(), "capital", null);
        setField(term675, term675.getClass(), "currency", null);
        setField(term675, term675.getClass(), "this$1", null);
        setField(term674, term674.getClass(), "country", term675);
        setField(term674, term674.getClass(), "this$0", null);
        setField(term637, term637.getClass(), "this$1", term674);
        setField(term636, term636.getClass(), "country", term637);
        setField(term636, term636.getClass(), "this$0", null);
        setField(term635, term635.getClass(), "data", term636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term635, args);
    }

};


