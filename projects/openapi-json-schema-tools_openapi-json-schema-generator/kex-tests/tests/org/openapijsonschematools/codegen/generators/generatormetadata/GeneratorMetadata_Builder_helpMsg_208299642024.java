package org.openapijsonschematools.codegen.generators.generatormetadata;

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
import static org.openapijsonschematools.codegen.generators.generatormetadata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GeneratorMetadata_Builder_helpMsg_208299642024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2477070;

    public GeneratorMetadata_Builder_helpMsg_208299642024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2477070 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata$Builder"));
        setField(term2477070, term2477070.getClass(), "name", null);
        setField(term2477070, term2477070.getClass(), "language", null);
        setField(term2477070, term2477070.getClass(), "languageVersion", null);
        setField(term2477070, term2477070.getClass(), "type", null);
        setField(term2477070, term2477070.getClass(), "stability", null);
        setField(term2477070, term2477070.getClass(), "generationMessage", null);
        setField(term2477070, term2477070.getClass(), "featureSet", null);
        setField(term2477070, term2477070.getClass(), "libraryFeatures", null);
        setField(term2477070, term2477070.getClass(), "helpMsg", null);
        setField(term2477070, term2477070.getClass(), "postGenerationMsg", null);
        setField(term2477070, term2477070.getClass(), "reservedWords", null);
        setField(term2477070, term2477070.getClass(), "instantiationTypes", null);
        setField(term2477070, term2477070.getClass(), "languageSpecificPrimitives", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "helpMsg", argTypes, term2477070, args);
    }

};


