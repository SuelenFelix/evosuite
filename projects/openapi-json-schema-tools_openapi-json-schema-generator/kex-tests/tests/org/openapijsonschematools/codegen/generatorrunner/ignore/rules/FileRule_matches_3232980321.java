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

public class FileRule_matches_3232980321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2733;

    public FileRule_matches_3232980321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2789 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term2788 = ((Class) term2789).getDeclaredField((String) "COMMENT");
        ((Field) term2788).setAccessible(true);
        Object enum5 = ((Field) term2788).get((Object) null);
        Object term2748 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term2748, term2748.getClass(), "token", enum5);
        setField(term2748, term2748.getClass(), "value", "");
        Class<? extends Object> term3247 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term3246 = ((Class) term3247).getDeclaredField((String) "DIRECTORY_MARKER");
        ((Field) term3246).setAccessible(true);
        Object enum6 = ((Field) term3246).get((Object) null);
        Object term2752 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term2752, term2752.getClass(), "token", enum6);
        setField(term2752, term2752.getClass(), "value", "");
        Class<? extends Object> term3732 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term3731 = ((Class) term3732).getDeclaredField((String) "DIRECTORY_MARKER");
        ((Field) term3731).setAccessible(true);
        Object enum7 = ((Field) term3731).get((Object) null);
        Object term2756 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term2756, term2756.getClass(), "token", enum7);
        setField(term2756, term2756.getClass(), "value", "");
        Class<? extends Object> term4217 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term4216 = ((Class) term4217).getDeclaredField((String) "PATH_DELIM");
        ((Field) term4216).setAccessible(true);
        Object enum8 = ((Field) term4216).get((Object) null);
        Object term2760 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term2760, term2760.getClass(), "token", enum8);
        setField(term2760, term2760.getClass(), "value", "");
        ArrayList term2746 = new ArrayList();
        ((ArrayList) term2746).add(term2748);
        ((ArrayList) term2746).add(term2752);
        ((ArrayList) term2746).add(term2756);
        ((ArrayList) term2746).add(term2760);
        term2733 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.FileRule"));
        setField(term2733, term2733.getClass(), "matcher", null);
        setField(term2733, term2733.getClass(), "definition", "SzjVpOQTyS");
        setField(term2733, term2733.getClass(), "syntax", term2746);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.FileRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "matches", argTypes, term2733, args);
    }

};


