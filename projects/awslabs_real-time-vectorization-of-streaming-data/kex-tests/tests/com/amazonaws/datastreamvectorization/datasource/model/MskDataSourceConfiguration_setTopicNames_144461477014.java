package com.amazonaws.datastreamvectorization.datasource.model;

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
import static com.amazonaws.datastreamvectorization.datasource.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;

public class MskDataSourceConfiguration_setTopicNames_144461477014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6713;

    public MskDataSourceConfiguration_setTopicNames_144461477014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6713 = new LinkedList();
        ((LinkedList) term6713).add("XPKmummaqg");
        ((LinkedList) term6713).add("BKLfkLiZTH");
        ((LinkedList) term6713).add("");
        ((LinkedList) term6713).add((Object)null);
        ((LinkedList) term6713).add((Object)null);
        ((LinkedList) term6713).add((Object)null);
        ((LinkedList) term6713).add((Object)null);
        ((LinkedList) term6713).add((Object)null);
        ((LinkedList) term6713).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.amazonaws.datastreamvectorization.datasource.model.MskDataSourceConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6713;
        callMethod(klass, "setTopicNames", argTypes, null, args);
    }

};


