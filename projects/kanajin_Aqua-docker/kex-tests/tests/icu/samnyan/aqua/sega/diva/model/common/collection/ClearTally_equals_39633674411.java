package icu.samnyan.aqua.sega.diva.model.common.collection;

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
import static icu.samnyan.aqua.sega.diva.model.common.collection.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ClearTally_equals_39633674411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18287;
     Object term18313;

    public ClearTally_equals_39633674411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18287 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally"));
        Object term18288 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18293 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18298 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18303 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        Object term18308 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term18288, term18288.getClass(), "clear", 0);
        setIntField(term18288, term18288.getClass(), "great", 0);
        setIntField(term18288, term18288.getClass(), "excellent", 0);
        setIntField(term18288, term18288.getClass(), "perfect", 0);
        setField(term18287, term18287.getClass(), "easy", term18288);
        setIntField(term18293, term18293.getClass(), "clear", 0);
        setIntField(term18293, term18293.getClass(), "great", 0);
        setIntField(term18293, term18293.getClass(), "excellent", 0);
        setIntField(term18293, term18293.getClass(), "perfect", 0);
        setField(term18287, term18287.getClass(), "normal", term18293);
        setIntField(term18298, term18298.getClass(), "clear", 0);
        setIntField(term18298, term18298.getClass(), "great", 0);
        setIntField(term18298, term18298.getClass(), "excellent", 0);
        setIntField(term18298, term18298.getClass(), "perfect", 0);
        setField(term18287, term18287.getClass(), "hard", term18298);
        setIntField(term18303, term18303.getClass(), "clear", 0);
        setIntField(term18303, term18303.getClass(), "great", 0);
        setIntField(term18303, term18303.getClass(), "excellent", 0);
        setIntField(term18303, term18303.getClass(), "perfect", 0);
        setField(term18287, term18287.getClass(), "extreme", term18303);
        setIntField(term18308, term18308.getClass(), "clear", 0);
        setIntField(term18308, term18308.getClass(), "great", 0);
        setIntField(term18308, term18308.getClass(), "excellent", 0);
        setIntField(term18308, term18308.getClass(), "perfect", 0);
        setField(term18287, term18287.getClass(), "extraExtreme", term18308);
        term18313 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearTally");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18313;
        callMethod(klass, "equals", argTypes, term18287, args);
    }

};


