package com.analytics.covid19;

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
import static com.analytics.covid19.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DataService_setCSVPath_8644193352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4505;

    public DataService_setCSVPath_8644193352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4505 = newInstance(Class.forName("com.analytics.covid19.DataService"));
        Object term4506 = newInstance(Class.forName("com.analytics.covid19.parser.CSVParser"));
        Object term4507 = newInstance(Class.forName("com.analytics.covid19.source.URLSource"));
        setField(term4507, term4507.getClass(), "PathtoURL", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        setField(term4506, term4506.getClass(), "csvSource", term4507);
        setField(term4505, term4505.getClass(), "csvParser", term4506);
        setField(term4505, term4505.getClass(), "CSVPath", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.DataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkIoWJRNwN";
        callMethod(klass, "setCSVPath", argTypes, term4505, args);
    }

};


