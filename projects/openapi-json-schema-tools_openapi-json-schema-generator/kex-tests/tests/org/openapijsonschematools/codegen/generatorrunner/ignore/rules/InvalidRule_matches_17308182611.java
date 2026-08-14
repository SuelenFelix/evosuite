package org.openapijsonschematools.codegen.generatorrunner.ignore.rules;

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
import static org.openapijsonschematools.codegen.generatorrunner.ignore.rules.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class InvalidRule_matches_17308182611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16817;

    public InvalidRule_matches_17308182611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16883 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term16882 = ((Class) term16883).getDeclaredField((String) "ROOTED_MARKER");
        ((Field) term16882).setAccessible(true);
        Object enum33 = ((Field) term16882).get((Object) null);
        Object term16844 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term16844, term16844.getClass(), "token", enum33);
        setField(term16844, term16844.getClass(), "value", "");
        ArrayList term16842 = new ArrayList();
        ((ArrayList) term16842).add(term16844);
        term16817 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule"));
        setField(term16817, term16817.getClass(), "reason", "tPlsykYBqO");
        setField(term16817, term16817.getClass(), "definition", "bLPjGVBhlX");
        setField(term16817, term16817.getClass(), "syntax", term16842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IgRJUzaCwW";
        callMethod(klass, "matches", argTypes, term16817, args);
    }

};


