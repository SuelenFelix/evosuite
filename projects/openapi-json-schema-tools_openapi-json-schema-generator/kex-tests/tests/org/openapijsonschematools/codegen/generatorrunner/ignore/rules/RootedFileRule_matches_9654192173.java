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

public class RootedFileRule_matches_9654192173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8234;

    public RootedFileRule_matches_9654192173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8271 = new ArrayList();
        term8234 = newInstance(Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule"));
        setField(term8234, term8234.getClass(), "definedFilename", "OWDIEULEFu");
        setField(term8234, term8234.getClass(), "definedExtension", "dWRymuLBtr");
        setField(term8234, term8234.getClass(), "definition", "AijpHYOFuy");
        setField(term8234, term8234.getClass(), "syntax", term8271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generatorrunner.ignore.rules.RootedFileRule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SbAoxhfrkn";
        callMethod(klass, "matches", argTypes, term8234, args);
    }

};


