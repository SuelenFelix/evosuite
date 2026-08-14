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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;

public class DirectoryRule_init_17890915360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8334;

    public DirectoryRule_init_17890915360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8395 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term8394 = ((Class) term8395).getDeclaredField((String) "COMMENT");
        ((Field) term8394).setAccessible(true);
        Object enum16 = ((Field) term8394).get((Object) null);
        Object term8337 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term8337, term8337.getClass(), "token", enum16);
        setField(term8337, term8337.getClass(), "value", "kuTXqwMtDB");
        Class<? extends Object> term8863 = Class.forName((String) "org.openapijsonschematools.codegen.generatorrunner.ignore.rules.IgnoreLineParser$Token");
        Field term8862 = ((Class) term8863).getDeclaredField((String) "ESCAPED_EXCLAMATION");
        ((Field) term8862).setAccessible(true);
        Object enum17 = ((Field) term8862).get((Object) null);
        Object term8355 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term8355, term8355.getClass(), "token", enum17);
        setField(term8355, term8355.getClass(), "value", "");
        Object term8360 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.Part"));
        setField(term8360, term8360.getClass(), "token", null);
        setField(term8360, term8360.getClass(), "value", null);
        term8334 = new LinkedList();
        ((LinkedList) term8334).add(term8337);
        ((LinkedList) term8334).add(term8355);
        ((LinkedList) term8334).add(term8360);
        ((LinkedList) term8334).add((Object)null);
        ((LinkedList) term8334).add((Object)null);
        ((LinkedList) term8334).add((Object)null);
        ((LinkedList) term8334).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.DirectoryRule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term8334;
        args[1] = "UlajhuVLaP";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


