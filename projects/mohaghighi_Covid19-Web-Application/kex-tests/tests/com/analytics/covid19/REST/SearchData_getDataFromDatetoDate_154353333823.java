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

public class SearchData_getDataFromDatetoDate_154353333823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term596;
     Object term663;
     Object term667;

    public SearchData_getDataFromDatetoDate_154353333823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term597 = new Long(-8257434502486459194L);
        ArrayList term659 = new ArrayList();
        term596 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term596, term596.getClass(), "id", term597);
        setField(term596, term596.getClass(), "name", "BYqFIqCKAV");
        setField(term596, term596.getClass(), "RName", "vrQLuWIDJX");
        setField(term596, term596.getClass(), "Region", "flxyYxBRtu");
        setField(term596, term596.getClass(), "Lat", "OclPbYPkcH");
        setField(term596, term596.getClass(), "Long", "IoAlmYsBwc");
        setField(term596, term596.getClass(), "DataSet", term659);
        term663 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term663, term663.getClass(), "year", 2025);
        setShortField(term663, term663.getClass(), "month", (short) 4);
        setShortField(term663, term663.getClass(), "day", (short) 23);
        term667 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term667, term667.getClass(), "year", 2012);
        setShortField(term667, term667.getClass(), "month", (short) 10);
        setShortField(term667, term667.getClass(), "day", (short) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.analytics.covid19.data.Country");
        argTypes[1] = Class.forName("java.time.LocalDate");
        argTypes[2] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[3];
        args[0] = term596;
        args[1] = term663;
        args[2] = term667;
        callMethod(klass, "getDataFromDatetoDate", argTypes, null, args);
    }

};


