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

public class Element_getLabels_20035747905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2128;

    public Element_getLabels_20035747905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2129 = new Long(4178434741742309755L);
        ArrayList term2131 = new ArrayList();
        HashMap term2135 = new HashMap();
        term2128 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2128, term2128.getClass(), "id", term2129);
        setField(term2128, term2128.getClass(), "labels", term2131);
        setField(term2128, term2128.getClass(), "properties", term2135);
        setField(term2128, term2128.getClass(), "variable", "wGmYcqUkgE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLabels", argTypes, term2128, args);
    }

};


