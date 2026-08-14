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

public class DirectoryRule_matches_16269439251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9366;

    public DirectoryRule_matches_16269439251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9416 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term9415 = ((Class) term9416).getDeclaredField((String) "MATCH_ANY");
        ((Field) term9415).setAccessible(true);
        Object enum18 = ((Field) term9415).get((Object) null);
        Object term9381 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term9381, term9381.getClass(), "token", enum18);
        setField(term9381, term9381.getClass(), "value", "");
        Class<? extends Object> term9880 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term9879 = ((Class) term9880).getDeclaredField((String) "DIRECTORY_MARKER");
        ((Field) term9879).setAccessible(true);
        Object enum19 = ((Field) term9879).get((Object) null);
        Object term9385 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term9385, term9385.getClass(), "token", enum19);
        setField(term9385, term9385.getClass(), "value", "");
        Object term9389 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term9389, term9389.getClass(), "token", enum19);
        setField(term9389, term9389.getClass(), "value", "");
        ArrayList term9379 = new ArrayList();
        ((ArrayList) term9379).add(term9381);
        ((ArrayList) term9379).add(term9385);
        ((ArrayList) term9379).add(term9389);
        term9366 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.DirectoryRule"));
        setField(term9366, term9366.getClass(), "directoryMatcher", null);
        setField(term9366, term9366.getClass(), "contentsMatcher", null);
        setField(term9366, term9366.getClass(), "matcher", null);
        setField(term9366, term9366.getClass(), "definition", "gGSMzuGICf");
        setField(term9366, term9366.getClass(), "syntax", term9379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.DirectoryRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "matches", argTypes, term9366, args);
    }

};


