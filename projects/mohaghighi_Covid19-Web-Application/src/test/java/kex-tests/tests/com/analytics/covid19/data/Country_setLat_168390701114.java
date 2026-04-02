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

public class Country_setLat_168390701114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2408;

    public Country_setLat_168390701114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2409 = new Long(-316468845751588286L);
        ArrayList term2471 = new ArrayList();
        term2408 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2408, term2408.getClass(), "id", term2409);
        setField(term2408, term2408.getClass(), "name", "XPKmummaqg");
        setField(term2408, term2408.getClass(), "RName", "BKLfkLiZTH");
        setField(term2408, term2408.getClass(), "Region", "SPpkrGcPRr");
        setField(term2408, term2408.getClass(), "Lat", "sEccwbJKYE");
        setField(term2408, term2408.getClass(), "Long", "AWRooQKkdW");
        setField(term2408, term2408.getClass(), "DataSet", term2471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setLat", argTypes, term2408, args);
    }

};


