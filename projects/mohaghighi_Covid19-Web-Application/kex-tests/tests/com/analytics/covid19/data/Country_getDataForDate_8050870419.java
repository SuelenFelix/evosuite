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

public class Country_getDataForDate_8050870419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3103;
     Object term3170;

    public Country_getDataForDate_8050870419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3104 = new Long(-2585684163342970173L);
        ArrayList term3166 = new ArrayList();
        term3103 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term3103, term3103.getClass(), "id", term3104);
        setField(term3103, term3103.getClass(), "name", "lHfTrWKMPk");
        setField(term3103, term3103.getClass(), "RName", "JDaAnsVTGV");
        setField(term3103, term3103.getClass(), "Region", "mLUZFTfjle");
        setField(term3103, term3103.getClass(), "Lat", "xIeFjkHkOe");
        setField(term3103, term3103.getClass(), "Long", "SdCKLMIYnX");
        setField(term3103, term3103.getClass(), "DataSet", term3166);
        term3170 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term3170, term3170.getClass(), "year", 2021);
        setShortField(term3170, term3170.getClass(), "month", (short) 9);
        setShortField(term3170, term3170.getClass(), "day", (short) 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term3170;
        callMethod(klass, "getDataForDate", argTypes, term3103, args);
    }

};


