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

public class DataService_LoadDataFromSource_20260668194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5653;

    public DataService_LoadDataFromSource_20260668194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5653 = newInstance(Class.forName("com.analytics.covid19.DataService"));
        Object term5654 = newInstance(Class.forName("com.analytics.covid19.parser.CSVParser"));
        Object term5655 = newInstance(Class.forName("com.analytics.covid19.source.URLSource"));
        setField(term5655, term5655.getClass(), "PathtoURL", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        setField(term5654, term5654.getClass(), "csvSource", term5655);
        setField(term5653, term5653.getClass(), "csvParser", term5654);
        setField(term5653, term5653.getClass(), "CSVPath", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.DataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.parser.DataParser");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "LoadDataFromSource", argTypes, term5653, args);
    }

};


