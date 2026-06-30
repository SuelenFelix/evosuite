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
import java.lang.Long;
import java.util.ArrayList;

public class SearchData_getDataByCountryByDate_62969070921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term538;

    public SearchData_getDataByCountryByDate_62969070921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term472 = new Long(6375119433582206027L);
        ArrayList term534 = new ArrayList();
        term471 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term471, term471.getClass(), "id", term472);
        setField(term471, term471.getClass(), "name", "pCTimMblYc");
        setField(term471, term471.getClass(), "RName", "hNxWaHcfhY");
        setField(term471, term471.getClass(), "Region", "RkybSrpybU");
        setField(term471, term471.getClass(), "Lat", "xOEqzGAmDU");
        setField(term471, term471.getClass(), "Long", "eZFUvlxvGV");
        setField(term471, term471.getClass(), "DataSet", term534);
        term538 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term538, term538.getClass(), "year", 2026);
        setShortField(term538, term538.getClass(), "month", (short) 12);
        setShortField(term538, term538.getClass(), "day", (short) 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.analytics.covid19.data.Country");
        argTypes[1] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[2];
        args[0] = term471;
        args[1] = term538;
        callMethod(klass, "getDataByCountryByDate", argTypes, null, args);
    }

};


