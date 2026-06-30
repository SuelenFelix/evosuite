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

public class ClearSet_getPerfect_361609077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501356;

    public ClearSet_getPerfect_361609077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501356 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet"));
        setIntField(term1501356, term1501356.getClass(), "clear", 46867168);
        setIntField(term1501356, term1501356.getClass(), "great", 553457631);
        setIntField(term1501356, term1501356.getClass(), "excellent", -289951910);
        setIntField(term1501356, term1501356.getClass(), "perfect", 308999522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.common.collection.ClearSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPerfect", argTypes, term1501356, args);
    }

};


