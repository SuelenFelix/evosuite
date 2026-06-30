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

public class Result_getGeometry_6310302443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term435;

    public Result_getGeometry_6310302443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term435 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term448 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term449 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setField(term435, term435.getClass(), "formattedAddress", "nyiiPDVjAc");
        setDoubleField(term449, term449.getClass(), "lat", 0.426231085465289);
        setDoubleField(term449, term449.getClass(), "lng", 0.0027299293098262956);
        setField(term448, term448.getClass(), "location", term449);
        setField(term435, term435.getClass(), "geometry", term448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGeometry", argTypes, term435, args);
    }

};


