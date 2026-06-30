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

public class Country_getLong_10491581964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1170;

    public Country_getLong_10491581964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1171 = new Long(7411271909051562686L);
        ArrayList term1233 = new ArrayList();
        term1170 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1170, term1170.getClass(), "id", term1171);
        setField(term1170, term1170.getClass(), "name", "GzFkzHGYFt");
        setField(term1170, term1170.getClass(), "RName", "tShwQLRGNe");
        setField(term1170, term1170.getClass(), "Region", "LvtrsXUliU");
        setField(term1170, term1170.getClass(), "Lat", "xLbjWUgOIL");
        setField(term1170, term1170.getClass(), "Long", "jDtqGUpnZN");
        setField(term1170, term1170.getClass(), "DataSet", term1233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLong", argTypes, term1170, args);
    }

};


