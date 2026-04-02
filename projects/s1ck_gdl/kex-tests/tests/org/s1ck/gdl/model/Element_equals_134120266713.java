package org.s1ck.gdl.model;

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
import static org.s1ck.gdl.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.util.HashMap;

public class Element_equals_134120266713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2859;
     Object term2919;

    public Element_equals_134120266713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2860 = new Long(-4443169559037975007L);
        ArrayList term2862 = new ArrayList();
        ((ArrayList) term2862).add("ZVecLZMLHF");
        ((ArrayList) term2862).add("fztQhjqwdP");
        ((ArrayList) term2862).add("eVpkWxjuki");
        HashMap term2902 = new HashMap();
        term2859 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2859, term2859.getClass(), "id", term2860);
        setField(term2859, term2859.getClass(), "labels", term2862);
        setField(term2859, term2859.getClass(), "properties", term2902);
        setField(term2859, term2859.getClass(), "variable", "SJiQaLvSKv");
        term2919 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2919;
        callMethod(klass, "equals", argTypes, term2859, args);
    }

};


