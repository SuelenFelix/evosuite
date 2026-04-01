package org.graph4j.generators;

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
import static org.graph4j.generators.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BarabasiAlbertGenerator_checkArguments_6740543306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2776;

    public BarabasiAlbertGenerator_checkArguments_6740543306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2776 = newInstance(Class.forName("org.graph4j.generators.BarabasiAlbertGenerator"));
        setIntField(term2776, term2776.getClass(), "numVertices", 0);
        setIntField(term2776, term2776.getClass(), "edgesPerVertex", 0);
        setField(term2776, term2776.getClass(), "initialGraph", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.generators.BarabasiAlbertGenerator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkArguments", argTypes, term2776, args);
    }

};


