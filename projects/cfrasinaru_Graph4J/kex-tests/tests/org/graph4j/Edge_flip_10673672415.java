package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class Edge_flip_10673672415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108303;

    public Edge_flip_10673672415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108308 = new Double(0.8021566501622185);
        Double term108310 = new Double(0.9797763362008045);
        Double term108312 = new Double(0.8730095856413708);
        Double term108314 = new Double(0.42594697418584104);
        Double term108316 = new Double(0.7359116915729608);
        term108303 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108307 = (Object[]) newArray("java.lang.Double", 5);
        setBooleanField(term108303, term108303.getClass(), "directed", true);
        setIntField(term108303, term108303.getClass(), "source", -826658409);
        setIntField(term108303, term108303.getClass(), "target", 1010337146);
        setElement(term108307, 0, term108308);
        setElement(term108307, 1, term108310);
        setElement(term108307, 2, term108312);
        setElement(term108307, 3, term108314);
        setElement(term108307, 4, term108316);
        setField(term108303, term108303.getClass(), "data", term108307);
        setField(term108303, term108303.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "flip", argTypes, term108303, args);
    }

};


