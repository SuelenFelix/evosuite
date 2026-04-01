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
import java.util.ArrayList;
import java.lang.Object;

public class Country_init_11632814631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public Country_init_11632814631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term834 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term835 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term835, term835.getClass(), "year", 2029);
        setShortField(term835, term835.getClass(), "month", (short) 1);
        setShortField(term835, term835.getClass(), "day", (short) 20);
        setField(term834, term834.getClass(), "date", term835);
        setIntField(term834, term834.getClass(), "stat", 568599855);
        setField(term834, term834.getClass(), "NameRef", "");
        setField(term834, term834.getClass(), "Region", "");
        Object term844 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term845 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term845, term845.getClass(), "year", 2029);
        setShortField(term845, term845.getClass(), "month", (short) 8);
        setShortField(term845, term845.getClass(), "day", (short) 28);
        setField(term844, term844.getClass(), "date", term845);
        setIntField(term844, term844.getClass(), "stat", 1162663216);
        setField(term844, term844.getClass(), "NameRef", "");
        setField(term844, term844.getClass(), "Region", "");
        Object term854 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term855 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term855, term855.getClass(), "year", 2015);
        setShortField(term855, term855.getClass(), "month", (short) 7);
        setShortField(term855, term855.getClass(), "day", (short) 24);
        setField(term854, term854.getClass(), "date", term855);
        setIntField(term854, term854.getClass(), "stat", 1484323161);
        setField(term854, term854.getClass(), "NameRef", "");
        setField(term854, term854.getClass(), "Region", "");
        Object term864 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term865 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term865, term865.getClass(), "year", 2022);
        setShortField(term865, term865.getClass(), "month", (short) 11);
        setShortField(term865, term865.getClass(), "day", (short) 16);
        setField(term864, term864.getClass(), "date", term865);
        setIntField(term864, term864.getClass(), "stat", 391863371);
        setField(term864, term864.getClass(), "NameRef", "");
        setField(term864, term864.getClass(), "Region", "");
        Object term874 = newInstance(Class.forName("com.analytics.covid19.data.Data"));
        Object term875 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term875, term875.getClass(), "year", 2024);
        setShortField(term875, term875.getClass(), "month", (short) 8);
        setShortField(term875, term875.getClass(), "day", (short) 31);
        setField(term874, term874.getClass(), "date", term875);
        setIntField(term874, term874.getClass(), "stat", -1922583790);
        setField(term874, term874.getClass(), "NameRef", "");
        setField(term874, term874.getClass(), "Region", "");
        term832 = new ArrayList();
        ((ArrayList) term832).add(term834);
        ((ArrayList) term832).add(term844);
        ((ArrayList) term832).add(term854);
        ((ArrayList) term832).add(term864);
        ((ArrayList) term832).add(term874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[6];
        args[0] = "OWDIEULEFu";
        args[1] = "dWRymuLBtr";
        args[2] = "AijpHYOFuy";
        args[3] = "SbAoxhfrkn";
        args[4] = "kuTXqwMtDB";
        args[5] = term832;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


