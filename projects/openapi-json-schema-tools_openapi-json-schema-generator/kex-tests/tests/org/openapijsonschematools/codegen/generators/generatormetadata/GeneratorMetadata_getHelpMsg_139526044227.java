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

public class GeneratorMetadata_getHelpMsg_139526044227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535261;

    public GeneratorMetadata_getHelpMsg_139526044227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1535261 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        setField(term1535261, term1535261.getClass(), "name", null);
        setField(term1535261, term1535261.getClass(), "language", null);
        setField(term1535261, term1535261.getClass(), "languageVersion", null);
        setField(term1535261, term1535261.getClass(), "type", null);
        setField(term1535261, term1535261.getClass(), "stability", null);
        setField(term1535261, term1535261.getClass(), "libraryFeatures", null);
        setField(term1535261, term1535261.getClass(), "featureSet", null);
        setField(term1535261, term1535261.getClass(), "generationMessage", null);
        setField(term1535261, term1535261.getClass(), "helpMsg", null);
        setField(term1535261, term1535261.getClass(), "postGenerationMsg", null);
        setField(term1535261, term1535261.getClass(), "reservedWords", null);
        setField(term1535261, term1535261.getClass(), "instantiationTypes", null);
        setField(term1535261, term1535261.getClass(), "languageSpecificPrimitives", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpMsg", argTypes, term1535261, args);
    }

};


