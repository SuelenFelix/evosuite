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

public class Country_setLong_67071837215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2547;

    public Country_setLong_67071837215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2548 = new Long(5127676408959197577L);
        ArrayList term2610 = new ArrayList();
        term2547 = newInstance(Class.forName("com.analytics.covid19.data.Country"));
        setField(term2547, term2547.getClass(), "id", term2548);
        setField(term2547, term2547.getClass(), "name", "QXzGXbEXMu");
        setField(term2547, term2547.getClass(), "RName", "qxSDVejjiY");
        setField(term2547, term2547.getClass(), "Region", "xBsXSDjXYK");
        setField(term2547, term2547.getClass(), "Lat", "sEnIVFtZuQ");
        setField(term2547, term2547.getClass(), "Long", "ZVecLZMLHF");
        setField(term2547, term2547.getClass(), "DataSet", term2610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        callMethod(klass, "setLong", argTypes, term2547, args);
    }

};


