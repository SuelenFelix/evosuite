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
import java.util.HashMap;
import java.util.ArrayList;

public class FixtureManager_supports_2709207823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term973;
     Object term989;

    public FixtureManager_supports_2709207823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term975 = new HashMap();
        ArrayList term980 = new ArrayList();
        ArrayList term985 = new ArrayList();
        ((ArrayList) term985).add((Object)null);
        term973 = newInstance(Class.forName("de.gofabian.jfixture.FixtureManager"));
        Object term974 = newInstance(Class.forName("de.gofabian.jfixture.FixtureSession"));
        Object term984 = newInstance(Class.forName("de.gofabian.jfixture.FixtureDefinitionQueries"));
        setField(term974, term974.getClass(), "definitionLifecycleMap", term975);
        setField(term974, term974.getClass(), "orderedLifecycles", term980);
        setField(term973, term973.getClass(), "session", term974);
        setField(term984, term984.getClass(), "definitions", term985);
        setField(term973, term973.getClass(), "definitions", term984);
        term989 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term989, term989.getClass(), "type", null);
        setField(term989, term989.getClass(), "name", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("de.gofabian.jfixture.api.FixtureId");
        Object[] args = new Object[1];
        args[0] = term989;
        callMethod(klass, "supports", argTypes, term973, args);
    }

};


