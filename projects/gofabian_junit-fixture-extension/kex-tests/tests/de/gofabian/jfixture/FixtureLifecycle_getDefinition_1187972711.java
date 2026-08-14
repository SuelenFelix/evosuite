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

public class FixtureLifecycle_getDefinition_1187972711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1129;

    public FixtureLifecycle_getDefinition_1187972711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1129 = newInstance(Class.forName("de.gofabian.jfixture.FixtureLifecycle"));
        Object term1131 = newInstance(Class.forName("java.lang.Object"));
        setField(term1129, term1129.getClass(), "definition", null);
        setBooleanField(term1129, term1129.getClass(), "isSetUp", false);
        setField(term1129, term1129.getClass(), "object", term1131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureLifecycle");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefinition", argTypes, term1129, args);
    }

};


