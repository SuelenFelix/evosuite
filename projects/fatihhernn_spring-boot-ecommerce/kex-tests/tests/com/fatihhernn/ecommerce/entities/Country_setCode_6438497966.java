package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Country_setCode_6438497966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5787;

    public Country_setCode_6438497966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term5815 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5818 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5815, term5815.getClass(), "id", 1496340209);
        setField(term5815, term5815.getClass(), "name", "");
        setIntField(term5818, term5818.getClass(), "id", -1748391876);
        setField(term5818, term5818.getClass(), "code", null);
        setField(term5818, term5818.getClass(), "name", null);
        setField(term5818, term5818.getClass(), "states", null);
        setField(term5815, term5815.getClass(), "country", term5818);
        Object term5820 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5823 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5820, term5820.getClass(), "id", 510162332);
        setField(term5820, term5820.getClass(), "name", "");
        setIntField(term5823, term5823.getClass(), "id", 0);
        setField(term5823, term5823.getClass(), "code", null);
        setField(term5823, term5823.getClass(), "name", null);
        setField(term5823, term5823.getClass(), "states", null);
        setField(term5820, term5820.getClass(), "country", term5823);
        Object term5825 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5828 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5825, term5825.getClass(), "id", 43258317);
        setField(term5825, term5825.getClass(), "name", "");
        setIntField(term5828, term5828.getClass(), "id", 1707220033);
        setField(term5828, term5828.getClass(), "code", null);
        setField(term5828, term5828.getClass(), "name", null);
        setField(term5828, term5828.getClass(), "states", null);
        setField(term5825, term5825.getClass(), "country", term5828);
        Object term5830 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5833 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5830, term5830.getClass(), "id", 200252898);
        setField(term5830, term5830.getClass(), "name", "");
        setIntField(term5833, term5833.getClass(), "id", 0);
        setField(term5833, term5833.getClass(), "code", null);
        setField(term5833, term5833.getClass(), "name", null);
        setField(term5833, term5833.getClass(), "states", null);
        setField(term5830, term5830.getClass(), "country", term5833);
        Object term5835 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5838 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5835, term5835.getClass(), "id", 752152965);
        setField(term5835, term5835.getClass(), "name", "");
        setIntField(term5838, term5838.getClass(), "id", -1577069773);
        setField(term5838, term5838.getClass(), "code", null);
        setField(term5838, term5838.getClass(), "name", null);
        setField(term5838, term5838.getClass(), "states", null);
        setField(term5835, term5835.getClass(), "country", term5838);
        Object term5840 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term5840, term5840.getClass(), "id", -266625190);
        setField(term5840, term5840.getClass(), "name", "");
        setField(term5840, term5840.getClass(), "country", term5833);
        Object term5843 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term5846 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5843, term5843.getClass(), "id", -1792504217);
        setField(term5843, term5843.getClass(), "name", "");
        setIntField(term5846, term5846.getClass(), "id", 1824538861);
        setField(term5846, term5846.getClass(), "code", null);
        setField(term5846, term5846.getClass(), "name", null);
        setField(term5846, term5846.getClass(), "states", null);
        setField(term5843, term5843.getClass(), "country", term5846);
        ArrayList term5813 = new ArrayList();
        ((ArrayList) term5813).add(term5815);
        ((ArrayList) term5813).add(term5820);
        ((ArrayList) term5813).add(term5820);
        ((ArrayList) term5813).add(term5825);
        ((ArrayList) term5813).add(term5830);
        ((ArrayList) term5813).add(term5830);
        ((ArrayList) term5813).add(term5835);
        ((ArrayList) term5813).add(term5840);
        ((ArrayList) term5813).add(term5843);
        term5787 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term5787, term5787.getClass(), "id", 947897214);
        setField(term5787, term5787.getClass(), "code", "HvnMmAOZev");
        setField(term5787, term5787.getClass(), "name", "JTPAQsfRtT");
        setField(term5787, term5787.getClass(), "states", term5813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.Country");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YCrgXnhgoK";
        callMethod(klass, "setCode", argTypes, term5787, args);
    }

};


