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

public class FixtureMethodParser_1_setUp_1395159334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3698;

    public FixtureMethodParser_1_setUp_1395159334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3698 = newInstance(Class.forName("de.gofabian.jfixture.FixtureMethodParser$1"));
        setField(term3698, term3698.getClass(), "context", null);
        setField(term3698, term3698.getClass(), "val$parameterTypes", null);
        setField(term3698, term3698.getClass(), "val$method", null);
        setField(term3698, term3698.getClass(), "val$instance", null);
        setField(term3698, term3698.getClass(), "this$0", null);
        setField(term3698, term3698.getClass(), "scope", null);
        setField(term3698, term3698.getClass(), "id", null);
        setField(term3698, term3698.getClass(), "dependencyIds", null);
        setBooleanField(term3698, term3698.getClass(), "autoUse", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUp", argTypes, term3698, args);
    }

};


