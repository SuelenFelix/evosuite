package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FixtureLifecycle_isSetUp_7166478192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1132;

    public FixtureLifecycle_isSetUp_7166478192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1132 = newInstance(Class.forName("de.gofabian.jfixture.FixtureLifecycle"));
        Object term1134 = newInstance(Class.forName("java.lang.Object"));
        setField(term1132, term1132.getClass(), "definition", null);
        setBooleanField(term1132, term1132.getClass(), "isSetUp", false);
        setField(term1132, term1132.getClass(), "object", term1134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureLifecycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSetUp", argTypes, term1132, args);
    }

};


