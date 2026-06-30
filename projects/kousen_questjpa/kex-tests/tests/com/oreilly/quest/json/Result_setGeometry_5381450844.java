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

public class Result_setGeometry_5381450844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462;
     Object term479;

    public Result_setGeometry_5381450844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term475 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term476 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setField(term462, term462.getClass(), "formattedAddress", "aKnKipADSo");
        setDoubleField(term476, term476.getClass(), "lat", 0.29874017652881824);
        setDoubleField(term476, term476.getClass(), "lng", 0.32554480512985284);
        setField(term475, term475.getClass(), "location", term476);
        setField(term462, term462.getClass(), "geometry", term475);
        term479 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term480 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setDoubleField(term480, term480.getClass(), "lat", 0.8924855581421237);
        setDoubleField(term480, term480.getClass(), "lng", 0.32237559209193944);
        setField(term479, term479.getClass(), "location", term480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Result");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.json.Geometry");
        Object[] args = new Object[1];
        args[0] = term479;
        callMethod(klass, "setGeometry", argTypes, term462, args);
    }

};


