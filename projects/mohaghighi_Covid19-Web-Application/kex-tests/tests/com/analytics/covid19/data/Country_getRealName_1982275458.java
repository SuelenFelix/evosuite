package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Country_getRealName_1982275458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1638;

    public Country_getRealName_1982275458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1639 = new Long(6967924379644551255L);
        ArrayList term1701 = new ArrayList();
        term1638 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1638, term1638.getClass(), "id", term1639);
        setField(term1638, term1638.getClass(), "name", "uWHnvSvaPl");
        setField(term1638, term1638.getClass(), "RName", "kBdSllIBVz");
        setField(term1638, term1638.getClass(), "Region", "TJmVBGfTML");
        setField(term1638, term1638.getClass(), "Lat", "tPlsykYBqO");
        setField(term1638, term1638.getClass(), "Long", "bLPjGVBhlX");
        setField(term1638, term1638.getClass(), "DataSet", term1701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealName", argTypes, term1638, args);
    }

};


