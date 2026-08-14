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

public class EverythingRule_matches_1280164731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12413;

    public EverythingRule_matches_1280164731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12457 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term12456 = ((Class) term12457).getDeclaredField((String) "PATH_DELIM");
        ((Field) term12456).setAccessible(true);
        Object enum24 = ((Field) term12456).get((Object) null);
        Object term12428 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term12428, term12428.getClass(), "token", enum24);
        setField(term12428, term12428.getClass(), "value", "");
        ArrayList term12426 = new ArrayList();
        ((ArrayList) term12426).add(term12428);
        term12413 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule"));
        setField(term12413, term12413.getClass(), "definition", "UiUYnPrcCi");
        setField(term12413, term12413.getClass(), "syntax", term12426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.EverythingRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JDswTTCZHV";
        callMethod(klass, "matches", argTypes, term12413, args);
    }

};


