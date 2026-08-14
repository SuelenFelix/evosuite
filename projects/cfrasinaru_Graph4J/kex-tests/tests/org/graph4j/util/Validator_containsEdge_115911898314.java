package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Validator_containsEdge_115911898314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3274;

    public Validator_containsEdge_115911898314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3279 = new Double(0.3202192021706908);
        Double term3281 = new Double(0.22651340641904605);
        Double term3283 = new Double(0.8878841294187743);
        Double term3285 = new Double(0.6588948704887806);
        Double term3287 = new Double(0.6397214730945112);
        Double term3289 = new Double(0.25937345430928016);
        term3274 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term3278 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term3274, term3274.getClass(), "directed", true);
        setIntField(term3274, term3274.getClass(), "source", -235039141);
        setIntField(term3274, term3274.getClass(), "target", -1414233013);
        setElement(term3278, 0, term3279);
        setElement(term3278, 1, term3281);
        setElement(term3278, 2, term3283);
        setElement(term3278, 3, term3285);
        setElement(term3278, 4, term3287);
        setElement(term3278, 5, term3289);
        setField(term3274, term3274.getClass(), "data", term3278);
        setField(term3274, term3274.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Validator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3274;
        callMethod(klass, "containsEdge", argTypes, null, args);
    }

};


