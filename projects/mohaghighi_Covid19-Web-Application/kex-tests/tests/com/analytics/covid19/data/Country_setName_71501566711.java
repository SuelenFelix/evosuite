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

public class Country_setName_71501566711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1991;

    public Country_setName_71501566711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1992 = new Long(2535595959091595249L);
        ArrayList term2054 = new ArrayList();
        term1991 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1991, term1991.getClass(), "id", term1992);
        setField(term1991, term1991.getClass(), "name", "idgaQsnJpQ");
        setField(term1991, term1991.getClass(), "RName", "VgZnGoIFwQ");
        setField(term1991, term1991.getClass(), "Region", "jUbSRrkrYZ");
        setField(term1991, term1991.getClass(), "Lat", "bWWfajKbEX");
        setField(term1991, term1991.getClass(), "Long", "cAPeiZHKGJ");
        setField(term1991, term1991.getClass(), "DataSet", term2054);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LvJFtLBaxj";
        callMethod(klass, "setName", argTypes, term1991, args);
    }

};


