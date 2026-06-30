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

public class SearchData_getDataByCountry_66759131716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230;

    public SearchData_getDataByCountry_66759131716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230 = newInstance(Class.forName("com.analytics.covid19.REST.Request"));
        Object term243 = newInstance(Class.forName("java.time.LocalDate"));
        Object term247 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term230, term230.getClass(), "countryName", "NRdvgJlhkX");
        setIntField(term243, term243.getClass(), "year", 2021);
        setShortField(term243, term243.getClass(), "month", (short) 1);
        setShortField(term243, term243.getClass(), "day", (short) 18);
        setField(term230, term230.getClass(), "fromDate", term243);
        setIntField(term247, term247.getClass(), "year", 2020);
        setShortField(term247, term247.getClass(), "month", (short) 11);
        setShortField(term247, term247.getClass(), "day", (short) 22);
        setField(term230, term230.getClass(), "toDate", term247);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.REST.Request");
        Object[] args = new Object[1];
        args[0] = term230;
        callMethod(klass, "getDataByCountry", argTypes, null, args);
    }

};


