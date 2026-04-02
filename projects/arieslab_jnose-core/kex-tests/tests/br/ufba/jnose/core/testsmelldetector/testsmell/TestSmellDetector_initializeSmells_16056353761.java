package br.ufba.jnose.core.testsmelldetector.testsmell;

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
import static br.ufba.jnose.core.testsmelldetector.testsmell.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class TestSmellDetector_initializeSmells_16056353761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2044;

    public TestSmellDetector_initializeSmells_16056353761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2045 = new ArrayList();
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        ((ArrayList) term2045).add((Object)null);
        term2044 = newInstance(Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector"));
        setField(term2044, term2044.getClass(), "testSmells", term2045);
        setField(term2044, term2044.getClass(), "config", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("br.ufba.jnose.core.testsmelldetector.testsmell.TestSmellDetector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeSmells", argTypes, term2044, args);
    }

};


