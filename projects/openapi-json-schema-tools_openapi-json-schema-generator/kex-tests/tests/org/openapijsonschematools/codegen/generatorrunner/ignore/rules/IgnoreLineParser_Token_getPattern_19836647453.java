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
import java.lang.String;
import java.lang.Object;

public class IgnoreLineParser_Token_getPattern_19836647453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum0;

    public IgnoreLineParser_Token_getPattern_19836647453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term287 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term286 = ((Class) term287).getDeclaredField((String) "DIRECTORY_MARKER");
        ((Field) term286).setAccessible(true);
        enum0 = ((Field) term286).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPattern", argTypes, enum0, args);
    }

};


