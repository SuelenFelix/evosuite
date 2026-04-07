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

public class Country_getId_5628276709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1755;

    public Country_getId_5628276709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1756 = new Long(-2813493605142626659L);
        ArrayList term1818 = new ArrayList();
        term1755 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term1755, term1755.getClass(), "id", term1756);
        setField(term1755, term1755.getClass(), "name", "whBvTVIIlC");
        setField(term1755, term1755.getClass(), "RName", "IgRJUzaCwW");
        setField(term1755, term1755.getClass(), "Region", "JUmudUmaaV");
        setField(term1755, term1755.getClass(), "Lat", "KoyGrUJeJW");
        setField(term1755, term1755.getClass(), "Long", "HqBOwkVqjD");
        setField(term1755, term1755.getClass(), "DataSet", term1818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1755, args);
    }

};


