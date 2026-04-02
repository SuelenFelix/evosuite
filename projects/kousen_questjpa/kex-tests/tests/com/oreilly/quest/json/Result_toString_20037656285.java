package com.oreilly.quest.json;

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
import static com.oreilly.quest.json.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Result_toString_20037656285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;

    public Result_toString_20037656285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term506 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term507 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setField(term493, term493.getClass(), "formattedAddress", "wSQxaModmm");
        setDoubleField(term507, term507.getClass(), "lat", 0.53094494792755);
        setDoubleField(term507, term507.getClass(), "lng", 0.146431486357265);
        setField(term506, term506.getClass(), "location", term507);
        setField(term493, term493.getClass(), "geometry", term506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term493, args);
    }

};


