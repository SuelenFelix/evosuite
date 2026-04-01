package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;

public class Country_getDataSet_2475172305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1287;

    public Country_getDataSet_2475172305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1288 = new Long(4872422362414183754L);
        ArrayList term1350 = new ArrayList();
        term1287 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1287, term1287.getClass(), "id", term1288);
        setField(term1287, term1287.getClass(), "name", "nGKItKLYNC");
        setField(term1287, term1287.getClass(), "RName", "UiUYnPrcCi");
        setField(term1287, term1287.getClass(), "Region", "UoYtihxVaS");
        setField(term1287, term1287.getClass(), "Lat", "JDswTTCZHV");
        setField(term1287, term1287.getClass(), "Long", "onpbIeEKoi");
        setField(term1287, term1287.getClass(), "DataSet", term1350);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataSet", argTypes, term1287, args);
    }

};


