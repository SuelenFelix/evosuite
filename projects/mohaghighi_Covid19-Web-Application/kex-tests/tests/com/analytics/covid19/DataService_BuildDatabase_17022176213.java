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

public class DataService_BuildDatabase_17022176213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5090;

    public DataService_BuildDatabase_17022176213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5090 = newInstance(Class.forName("com.analytics.covid19.DataService"));
        Object term5091 = newInstance(Class.forName("com.analytics.covid19.parser.CSVParser"));
        Object term5092 = newInstance(Class.forName("com.analytics.covid19.source.URLSource"));
        setField(term5092, term5092.getClass(), "PathtoURL", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        setField(term5091, term5091.getClass(), "csvSource", term5092);
        setField(term5090, term5090.getClass(), "csvParser", term5091);
        setField(term5090, term5090.getClass(), "CSVPath", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.DataService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "BuildDatabase", argTypes, term5090, args);
    }

};


