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

public class SearchData_getDataByCountry_201967023320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354;

    public SearchData_getDataByCountry_201967023320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term355 = new Long(2442117782898005296L);
        ArrayList term417 = new ArrayList();
        term354 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term354, term354.getClass(), "id", term355);
        setField(term354, term354.getClass(), "name", "oVcInYnLWB");
        setField(term354, term354.getClass(), "RName", "aJlieCFVtF");
        setField(term354, term354.getClass(), "Region", "ZiaGIbnzTs");
        setField(term354, term354.getClass(), "Lat", "tbcdzjIfER");
        setField(term354, term354.getClass(), "Long", "HyxfbSQYBe");
        setField(term354, term354.getClass(), "DataSet", term417);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.REST.SearchData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.analytics.covid19.data.Country");
        Object[] args = new Object[1];
        args[0] = term354;
        callMethod(klass, "getDataByCountry", argTypes, null, args);
    }

};


