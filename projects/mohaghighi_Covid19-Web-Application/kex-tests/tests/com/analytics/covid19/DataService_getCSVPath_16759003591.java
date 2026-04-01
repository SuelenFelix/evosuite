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

public class DataService_getCSVPath_16759003591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3942;

    public DataService_getCSVPath_16759003591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3942 = newInstance(Class.forName("com.analytics.covid19.DataService"));
        Object term3943 = newInstance(Class.forName("com.analytics.covid19.parser.CSVParser"));
        Object term3944 = newInstance(Class.forName("com.analytics.covid19.source.URLSource"));
        setField(term3944, term3944.getClass(), "PathtoURL", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
        setField(term3943, term3943.getClass(), "csvSource", term3944);
        setField(term3942, term3942.getClass(), "csvParser", term3943);
        setField(term3942, term3942.getClass(), "CSVPath", "https://github.com/CSSEGISandData/COVID-19/raw/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.DataService");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCSVPath", argTypes, term3942, args);
    }

};


