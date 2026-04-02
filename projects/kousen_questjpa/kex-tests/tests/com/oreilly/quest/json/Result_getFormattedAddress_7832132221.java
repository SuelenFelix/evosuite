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

public class Result_getFormattedAddress_7832132221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;

    public Result_getFormattedAddress_7832132221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term359 = newInstance(Class.forName("com.oreilly.quest.json.Result"));
        Object term372 = newInstance(Class.forName("com.oreilly.quest.json.Geometry"));
        Object term373 = newInstance(Class.forName("com.oreilly.quest.json.Location"));
        setField(term359, term359.getClass(), "formattedAddress", "Ghbwtircqb");
        setDoubleField(term373, term373.getClass(), "lat", 0.03699061125289671);
        setDoubleField(term373, term373.getClass(), "lng", 0.6047137830113202);
        setField(term372, term372.getClass(), "location", term373);
        setField(term359, term359.getClass(), "geometry", term372);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.json.Result");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFormattedAddress", argTypes, term359, args);
    }

};


