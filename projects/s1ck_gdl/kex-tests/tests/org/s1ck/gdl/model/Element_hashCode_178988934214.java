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

public class Element_hashCode_178988934214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2960;

    public Element_hashCode_178988934214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2961 = new Long(-3842548265506930260L);
        ArrayList term2963 = new ArrayList();
        ((ArrayList) term2963).add("OEXDRUKcFl");
        ((ArrayList) term2963).add("RYdKCNNMBR");
        ((ArrayList) term2963).add("yGtHPyvYiQ");
        ((ArrayList) term2963).add("MvRIxilFMJ");
        HashMap term3015 = new HashMap();
        term2960 = newInstance(Class.forName("org.s1ck.gdl.model.Element"));
        setField(term2960, term2960.getClass(), "id", term2961);
        setField(term2960, term2960.getClass(), "labels", term2963);
        setField(term2960, term2960.getClass(), "properties", term3015);
        setField(term2960, term2960.getClass(), "variable", "iNwOJRBEjp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.s1ck.gdl.model.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2960, args);
    }

};


