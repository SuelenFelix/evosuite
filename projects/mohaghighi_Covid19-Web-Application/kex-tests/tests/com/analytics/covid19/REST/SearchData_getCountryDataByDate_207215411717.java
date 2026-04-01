package com.analytics.covid19.REST;

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
import static com.analytics.covid19.REST.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SearchData_getCountryDataByDate_207215411717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261;

    public SearchData_getCountryDataByDate_207215411717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term261, term261.getClass(), "countryName", "uuaPigETmJ");
        setIntField(term274, term274.getClass(), "year", 2015);
        setShortField(term274, term274.getClass(), "month", (short) 9);
        setShortField(term274, term274.getClass(), "day", (short) 19);
        setField(term261, term261.getClass(), "fromDate", term274);
        setIntField(term278, term278.getClass(), "year", 2018);
        setShortField(term278, term278.getClass(), "month", (short) 1);
        setShortField(term278, term278.getClass(), "day", (short) 13);
        setField(term261, term261.getClass(), "toDate", term278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.REST.Request");
        Object[] args = new Object[1];
        args[0] = term261;
        callMethod(klass, "getCountryDataByDate", argTypes, null, args);
    }

};


