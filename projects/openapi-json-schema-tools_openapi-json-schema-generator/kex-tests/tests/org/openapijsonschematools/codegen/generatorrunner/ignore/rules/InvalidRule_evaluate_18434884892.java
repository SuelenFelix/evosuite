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

public class InvalidRule_evaluate_18434884892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17368;

    public InvalidRule_evaluate_18434884892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17452 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term17451 = ((Class) term17452).getDeclaredField((String) "COMMENT");
        ((Field) term17451).setAccessible(true);
        Object enum34 = ((Field) term17451).get((Object) null);
        Object term17395 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17395, term17395.getClass(), "token", enum34);
        setField(term17395, term17395.getClass(), "value", "");
        Class<? extends Object> term17910 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term17909 = ((Class) term17910).getDeclaredField((String) "ESCAPED_SPACE");
        ((Field) term17909).setAccessible(true);
        Object enum35 = ((Field) term17909).get((Object) null);
        Object term17399 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17399, term17399.getClass(), "token", enum35);
        setField(term17399, term17399.getClass(), "value", "");
        Class<? extends Object> term18386 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term18385 = ((Class) term18386).getDeclaredField((String) "PATH_DELIM");
        ((Field) term18385).setAccessible(true);
        Object enum36 = ((Field) term18385).get((Object) null);
        Object term17403 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17403, term17403.getClass(), "token", enum36);
        setField(term17403, term17403.getClass(), "value", "");
        Class<? extends Object> term18853 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term18852 = ((Class) term18853).getDeclaredField((String) "ESCAPED_SPACE");
        ((Field) term18852).setAccessible(true);
        Object enum37 = ((Field) term18852).get((Object) null);
        Object term17407 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17407, term17407.getClass(), "token", enum37);
        setField(term17407, term17407.getClass(), "value", "");
        Class<? extends Object> term19329 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term19328 = ((Class) term19329).getDeclaredField((String) "ESCAPED_SPACE");
        ((Field) term19328).setAccessible(true);
        Object enum38 = ((Field) term19328).get((Object) null);
        Object term17411 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17411, term17411.getClass(), "token", enum38);
        setField(term17411, term17411.getClass(), "value", "");
        Object term17415 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term17415, term17415.getClass(), "token", enum36);
        setField(term17415, term17415.getClass(), "value", "");
        ArrayList term17393 = new ArrayList();
        ((ArrayList) term17393).add(term17395);
        ((ArrayList) term17393).add(term17399);
        ((ArrayList) term17393).add(term17403);
        ((ArrayList) term17393).add(term17407);
        ((ArrayList) term17393).add(term17411);
        ((ArrayList) term17393).add(term17415);
        term17368 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule"));
        setField(term17368, term17368.getClass(), "reason", "JUmudUmaaV");
        setField(term17368, term17368.getClass(), "definition", "KoyGrUJeJW");
        setField(term17368, term17368.getClass(), "syntax", term17393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.InvalidRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "evaluate", argTypes, term17368, args);
    }

};


