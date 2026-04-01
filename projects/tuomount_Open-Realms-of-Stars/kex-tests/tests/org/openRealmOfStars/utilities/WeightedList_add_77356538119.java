package org.openRealmOfStars.utilities;

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
import static org.openRealmOfStars.utilities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class WeightedList_add_77356538119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5853;
     Object term5855;

    public WeightedList_add_77356538119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5853 = newInstance(Class.forName("org.openRealmOfStars.utilities.WeightedList"));
        setField(term5853, term5853.getClass(), "entries", null);
        setDoubleField(term5853, term5853.getClass(), "total", 0.0);
        term5855 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.WeightedList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term5855;
        args[1] = null;
        callMethod(klass, "add", argTypes, term5853, args);
    }

};


