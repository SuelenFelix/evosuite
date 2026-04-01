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
import java.lang.Integer;

public class RootedFileRule_getExtensionPart_6410033116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8330;
     Object term8331;

    public RootedFileRule_getExtensionPart_6410033116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8330 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule"));
        setField(term8330, term8330.getClass(), "definedFilename", null);
        setField(term8330, term8330.getClass(), "definedExtension", null);
        setField(term8330, term8330.getClass(), "definition", null);
        setField(term8330, term8330.getClass(), "syntax", null);
        term8331 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8331;
        callMethod(klass, "getExtensionPart", argTypes, term8330, args);
    }

};


