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
import java.lang.Object;
import java.util.ArrayList;

public class State_toString_69008861410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term828;

    public State_toString_69008861410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term870 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term870, term870.getClass(), "id", 568954359);
        setField(term870, term870.getClass(), "name", null);
        setField(term870, term870.getClass(), "country", null);
        Object term872 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term872, term872.getClass(), "id", -2015854073);
        setField(term872, term872.getClass(), "name", null);
        setField(term872, term872.getClass(), "country", null);
        Object term874 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term874, term874.getClass(), "id", 0);
        setField(term874, term874.getClass(), "name", null);
        setField(term874, term874.getClass(), "country", null);
        Object term876 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term876, term876.getClass(), "id", 0);
        setField(term876, term876.getClass(), "name", null);
        setField(term876, term876.getClass(), "country", null);
        Object term878 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term878, term878.getClass(), "id", 0);
        setField(term878, term878.getClass(), "name", null);
        setField(term878, term878.getClass(), "country", null);
        ArrayList term868 = new ArrayList();
        ((ArrayList) term868).add(term870);
        ((ArrayList) term868).add(term872);
        ((ArrayList) term868).add(term870);
        ((ArrayList) term868).add(term874);
        ((ArrayList) term868).add(term874);
        ((ArrayList) term868).add(term876);
        ((ArrayList) term868).add(term878);
        term828 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term842 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term828, term828.getClass(), "id", 1861318859);
        setField(term828, term828.getClass(), "name", "VGizxZnyHX");
        setIntField(term842, term842.getClass(), "id", 1474524152);
        setField(term842, term842.getClass(), "code", "kVEZMHmRtR");
        setField(term842, term842.getClass(), "name", "ekxGuOYIwi");
        setField(term842, term842.getClass(), "states", term868);
        setField(term828, term828.getClass(), "country", term842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term828, args);
    }

};


