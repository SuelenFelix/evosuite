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

public class CountryDto_CountryData_Country_getName_18542896341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public CountryDto_CountryData_Country_getName_18542896341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term258 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term259 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        Object term296 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData"));
        Object term297 = newInstance(Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country"));
        setField(term221, term221.getClass(), "name", "RkybSrpybU");
        setField(term221, term221.getClass(), "capital", "xOEqzGAmDU");
        setField(term221, term221.getClass(), "currency", "eZFUvlxvGV");
        setField(term259, term259.getClass(), "name", "BYqFIqCKAV");
        setField(term259, term259.getClass(), "capital", "vrQLuWIDJX");
        setField(term259, term259.getClass(), "currency", "flxyYxBRtu");
        setField(term297, term297.getClass(), "name", null);
        setField(term297, term297.getClass(), "capital", null);
        setField(term297, term297.getClass(), "currency", null);
        setField(term297, term297.getClass(), "this$1", null);
        setField(term296, term296.getClass(), "country", term297);
        setField(term296, term296.getClass(), "this$0", null);
        setField(term259, term259.getClass(), "this$1", term296);
        setField(term258, term258.getClass(), "country", term259);
        setField(term258, term258.getClass(), "this$0", null);
        setField(term221, term221.getClass(), "this$1", term258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.ducatillon.graphqlclient.data.CountryDto$CountryData$Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term221, args);
    }

};


