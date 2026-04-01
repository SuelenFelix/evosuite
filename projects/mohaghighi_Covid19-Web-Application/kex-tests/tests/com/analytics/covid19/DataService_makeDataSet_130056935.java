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
import java.util.ArrayList;

public class DataService_makeDataSet_130056935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6216;
     Object term6513;

    public DataService_makeDataSet_130056935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6216 = newInstance(Class.forName("com.analytics.covid19.DataService"));
        Object term6217 = newInstance(Class.forName("com.analytics.covid19.parser.CSVParser"));
        Object term6218 = newInstance(Class.forName("com.analytics.covid19.source.URLSource"));
        setField(term6218, term6218.getClass(), "PathtoURL", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        setField(term6217, term6217.getClass(), "csvSource", term6218);
        setField(term6216, term6216.getClass(), "csvParser", term6217);
        setField(term6216, term6216.getClass(), "CSVPath", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        term6513 = new ArrayList();
        ((ArrayList) term6513).add("HHmNoYxIGj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.DataService");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "aNWLJdrZMq";
        args[1] = term6513;
        args[2] = "PtirvZmsGt";
        callMethod(klass, "makeDataSet", argTypes, term6216, args);
    }

};


