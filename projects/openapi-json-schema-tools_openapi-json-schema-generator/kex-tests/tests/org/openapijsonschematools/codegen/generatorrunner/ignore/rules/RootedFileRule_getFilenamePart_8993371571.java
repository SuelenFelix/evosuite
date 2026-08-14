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
import java.lang.Integer;

public class RootedFileRule_getFilenamePart_8993371571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719;
     Object term4780;

    public RootedFileRule_getFilenamePart_8993371571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4813 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term4812 = ((Class) term4813).getDeclaredField((String) "ESCAPED_EXCLAMATION");
        ((Field) term4812).setAccessible(true);
        Object enum9 = ((Field) term4812).get((Object) null);
        Object term4758 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term4758, term4758.getClass(), "token", enum9);
        setField(term4758, term4758.getClass(), "value", "");
        Class<? extends Object> term5307 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term5306 = ((Class) term5307).getDeclaredField((String) "PATH_DELIM");
        ((Field) term5306).setAccessible(true);
        Object enum10 = ((Field) term5306).get((Object) null);
        Object term4762 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term4762, term4762.getClass(), "token", enum10);
        setField(term4762, term4762.getClass(), "value", "");
        ArrayList term4756 = new ArrayList();
        ((ArrayList) term4756).add(term4758);
        ((ArrayList) term4756).add(term4762);
        term4719 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule"));
        setField(term4719, term4719.getClass(), "definedFilename", "LQFpaHEwXR");
        setField(term4719, term4719.getClass(), "definedExtension", "oVcInYnLWB");
        setField(term4719, term4719.getClass(), "definition", "aJlieCFVtF");
        setField(term4719, term4719.getClass(), "syntax", term4756);
        term4780 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "HyxfbSQYBe";
        args[1] = term4780;
        callMethod(klass, "getFilenamePart", argTypes, term4719, args);
    }

};


