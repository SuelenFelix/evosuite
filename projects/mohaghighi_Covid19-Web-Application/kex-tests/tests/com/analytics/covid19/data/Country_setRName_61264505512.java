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

public class Country_setRName_61264505512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2130;

    public Country_setRName_61264505512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2131 = new Long(-5476826692763582090L);
        ArrayList term2193 = new ArrayList();
        term2130 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2130, term2130.getClass(), "id", term2131);
        setField(term2130, term2130.getClass(), "name", "PHvxnGHptP");
        setField(term2130, term2130.getClass(), "RName", "TimdotUuNC");
        setField(term2130, term2130.getClass(), "Region", "PkWMRdJcBb");
        setField(term2130, term2130.getClass(), "Lat", "jSpAteRute");
        setField(term2130, term2130.getClass(), "Long", "swZVeJAxjt");
        setField(term2130, term2130.getClass(), "DataSet", term2193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOcJIiQQDu";
        callMethod(klass, "setRName", argTypes, term2130, args);
    }

};


