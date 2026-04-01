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
import java.util.ArrayList;
import java.lang.Object;

public class WeightedList_add_12101456626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5799;
     Object term5805;

    public WeightedList_add_12101456626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5800 = new ArrayList();
        term5799 = newInstance(Class.forName("org.openRealmOfStars.utilities.WeightedList"));
        setField(term5799, term5799.getClass(), "entries", term5800);
        setDoubleField(term5799, term5799.getClass(), "total", 0.36923381893433327);
        term5805 = newInstance(Class.forName("org.openRealmOfStars.utilities.WeightedList$Entry"));
        Object term5807 = newInstance(Class.forName("java.lang.Object"));
        setDoubleField(term5805, term5805.getClass(), "weight", 0.37773193782763337);
        setField(term5805, term5805.getClass(), "value", term5807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.WeightedList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.utilities.WeightedList$Entry");
        Object[] args = new Object[1];
        args[0] = term5805;
        callMethod(klass, "add", argTypes, term5799, args);
    }

};


