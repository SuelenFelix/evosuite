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

public class RootedFileRule_getExtensionPart_6410033112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5783;
     Object term5860;

    public RootedFileRule_getExtensionPart_6410033112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5893 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term5892 = ((Class) term5893).getDeclaredField((String) "COMMENT");
        ((Field) term5892).setAccessible(true);
        Object enum11 = ((Field) term5892).get((Object) null);
        Object term5822 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5822, term5822.getClass(), "token", enum11);
        setField(term5822, term5822.getClass(), "value", "");
        Object term5826 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5826, term5826.getClass(), "token", enum11);
        setField(term5826, term5826.getClass(), "value", "");
        Class<? extends Object> term6351 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term6350 = ((Class) term6351).getDeclaredField((String) "ESCAPED_SPACE");
        ((Field) term6350).setAccessible(true);
        Object enum12 = ((Field) term6350).get((Object) null);
        Object term5828 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5828, term5828.getClass(), "token", enum12);
        setField(term5828, term5828.getClass(), "value", "");
        Class<? extends Object> term6827 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term6826 = ((Class) term6827).getDeclaredField((String) "PATH_DELIM");
        ((Field) term6826).setAccessible(true);
        Object enum13 = ((Field) term6826).get((Object) null);
        Object term5832 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5832, term5832.getClass(), "token", enum13);
        setField(term5832, term5832.getClass(), "value", "");
        Object term5836 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5836, term5836.getClass(), "token", enum11);
        setField(term5836, term5836.getClass(), "value", "");
        Class<? extends Object> term7294 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term7293 = ((Class) term7294).getDeclaredField((String) "PATH_DELIM");
        ((Field) term7293).setAccessible(true);
        Object enum14 = ((Field) term7293).get((Object) null);
        Object term5838 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5838, term5838.getClass(), "token", enum14);
        setField(term5838, term5838.getClass(), "value", "");
        Class<? extends Object> term7761 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term7760 = ((Class) term7761).getDeclaredField((String) "MATCH_ANY");
        ((Field) term7760).setAccessible(true);
        Object enum15 = ((Field) term7760).get((Object) null);
        Object term5842 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term5842, term5842.getClass(), "token", enum15);
        setField(term5842, term5842.getClass(), "value", "");
        ArrayList term5820 = new ArrayList();
        ((ArrayList) term5820).add(term5822);
        ((ArrayList) term5820).add(term5826);
        ((ArrayList) term5820).add(term5828);
        ((ArrayList) term5820).add(term5832);
        ((ArrayList) term5820).add(term5836);
        ((ArrayList) term5820).add(term5838);
        ((ArrayList) term5820).add(term5842);
        term5783 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule"));
        setField(term5783, term5783.getClass(), "definedFilename", "pCTimMblYc");
        setField(term5783, term5783.getClass(), "definedExtension", "hNxWaHcfhY");
        setField(term5783, term5783.getClass(), "definition", "RkybSrpybU");
        setField(term5783, term5783.getClass(), "syntax", term5820);
        term5860 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "TEParAifyi";
        args[1] = term5860;
        callMethod(klass, "getExtensionPart", argTypes, term5783, args);
    }

};


