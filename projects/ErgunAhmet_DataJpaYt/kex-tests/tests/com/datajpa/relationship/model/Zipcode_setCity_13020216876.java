package com.datajpa.relationship.model;

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
import static com.datajpa.relationship.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Zipcode_setCity_13020216876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1845;
     Object term1875;

    public Zipcode_setCity_13020216876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1846 = new Long(5836128569274066678L);
        Long term1861 = new Long(-2177368829816872572L);
        term1845 = newInstance(Class.forName("com.datajpa.relationship.model.Zipcode"));
        Object term1860 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1845, term1845.getClass(), "id", term1846);
        setField(term1845, term1845.getClass(), "name", "jiKYgYHqIS");
        setField(term1860, term1860.getClass(), "id", term1861);
        setField(term1860, term1860.getClass(), "name", "DfISiziTgG");
        setField(term1845, term1845.getClass(), "city", term1860);
        Long term1876 = new Long(-8463029266761149071L);
        term1875 = newInstance(Class.forName("com.datajpa.relationship.model.City"));
        setField(term1875, term1875.getClass(), "id", term1876);
        setField(term1875, term1875.getClass(), "name", "XqgfKFvPSD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.model.Zipcode");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.datajpa.relationship.model.City");
        Object[] args = new Object[1];
        args[0] = term1875;
        callMethod(klass, "setCity", argTypes, term1845, args);
    }

};


