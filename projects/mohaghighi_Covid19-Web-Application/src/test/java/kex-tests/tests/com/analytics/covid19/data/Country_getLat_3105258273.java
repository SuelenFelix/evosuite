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

public class Country_getLat_3105258273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1053;

    public Country_getLat_3105258273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1054 = new Long(5270370404989704783L);
        ArrayList term1116 = new ArrayList();
        term1053 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1053, term1053.getClass(), "id", term1054);
        setField(term1053, term1053.getClass(), "name", "wSQxaModmm");
        setField(term1053, term1053.getClass(), "RName", "UlajhuVLaP");
        setField(term1053, term1053.getClass(), "Region", "gGSMzuGICf");
        setField(term1053, term1053.getClass(), "Lat", "hxCBltsObl");
        setField(term1053, term1053.getClass(), "Long", "BndsHwAFMv");
        setField(term1053, term1053.getClass(), "DataSet", term1116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLat", argTypes, term1053, args);
    }

};


