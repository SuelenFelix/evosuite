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

public class Country_getDates_118275747720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3224;

    public Country_getDates_118275747720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3225 = new Long(8059786003080744426L);
        ArrayList term3287 = new ArrayList();
        term3224 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term3224, term3224.getClass(), "id", term3225);
        setField(term3224, term3224.getClass(), "name", "OJJtVNPyKZ");
        setField(term3224, term3224.getClass(), "RName", "AKNapTAfmD");
        setField(term3224, term3224.getClass(), "Region", "xJgPlLxpgC");
        setField(term3224, term3224.getClass(), "Lat", "EYtfuJaxiM");
        setField(term3224, term3224.getClass(), "Long", "gCWtLVKVVe");
        setField(term3224, term3224.getClass(), "DataSet", term3287);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDates", argTypes, term3224, args);
    }

};


