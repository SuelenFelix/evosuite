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

public class GeneratorMetadata_getLanguage_50209384621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1535255;

    public GeneratorMetadata_getLanguage_50209384621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1535255 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        setField(term1535255, term1535255.getClass(), "name", null);
        setField(term1535255, term1535255.getClass(), "language", null);
        setField(term1535255, term1535255.getClass(), "languageVersion", null);
        setField(term1535255, term1535255.getClass(), "type", null);
        setField(term1535255, term1535255.getClass(), "stability", null);
        setField(term1535255, term1535255.getClass(), "libraryFeatures", null);
        setField(term1535255, term1535255.getClass(), "featureSet", null);
        setField(term1535255, term1535255.getClass(), "generationMessage", null);
        setField(term1535255, term1535255.getClass(), "helpMsg", null);
        setField(term1535255, term1535255.getClass(), "postGenerationMsg", null);
        setField(term1535255, term1535255.getClass(), "reservedWords", null);
        setField(term1535255, term1535255.getClass(), "instantiationTypes", null);
        setField(term1535255, term1535255.getClass(), "languageSpecificPrimitives", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term1535255, args);
    }

};


