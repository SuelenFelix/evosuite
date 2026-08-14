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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class GeneratorMetadata_getLanguageSpecificPrimitives_43466725715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1533834;

    public GeneratorMetadata_getLanguageSpecificPrimitives_43466725715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1533995 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1533994 = ((Class) term1533995).getDeclaredField((String) "ELM");
        ((Field) term1533994).setAccessible(true);
        Object enum2986 = ((Field) term1533994).get((Object) null);
        Class<? extends Object> term1534426 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1534425 = ((Class) term1534426).getDeclaredField((String) "CONFIG");
        ((Field) term1534425).setAccessible(true);
        Object enum2987 = ((Field) term1534425).get((Object) null);
        Class<? extends Object> term1534836 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1534835 = ((Class) term1534836).getDeclaredField((String) "BETA");
        ((Field) term1534835).setAccessible(true);
        Object enum2988 = ((Field) term1534835).get((Object) null);
        HashMap term1533895 = new HashMap();
        ArrayList term1533930 = new ArrayList();
        ((ArrayList) term1533930).add("GEJABPlHSI");
        HashMap term1533947 = new HashMap();
        Set<Object> term1535249 =  ((Map) term1533947).keySet();
        HashSet term1533946 = new HashSet((Collection<? extends Object>) term1535249);
        HashMap term1533959 = new HashMap();
        HashMap term1533970 = new HashMap();
        Set<Object> term1535250 =  ((Map) term1533970).keySet();
        HashSet term1533969 = new HashSet((Collection<? extends Object>) term1535250);
        term1533834 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1533905 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1533834, term1533834.getClass(), "name", "NTWMiBEaDF");
        setField(term1533834, term1533834.getClass(), "language", enum2986);
        setField(term1533834, term1533834.getClass(), "languageVersion", "SPBstwKFVr");
        setField(term1533834, term1533834.getClass(), "type", enum2987);
        setField(term1533834, term1533834.getClass(), "stability", enum2988);
        setField(term1533834, term1533834.getClass(), "libraryFeatures", term1533895);
        setField(term1533905, term1533905.getClass(), "clientModificationFeatures", null);
        setField(term1533905, term1533905.getClass(), "dataTypeFeatures", null);
        setField(term1533905, term1533905.getClass(), "componentsFeatures", null);
        setField(term1533905, term1533905.getClass(), "documentationFeatures", null);
        setField(term1533905, term1533905.getClass(), "globalFeatures", null);
        setField(term1533905, term1533905.getClass(), "schemaFeatures", null);
        setField(term1533905, term1533905.getClass(), "parameterFeatures", null);
        setField(term1533905, term1533905.getClass(), "securityFeatures", null);
        setField(term1533905, term1533905.getClass(), "operationFeatures", null);
        setField(term1533905, term1533905.getClass(), "wireFormatFeatures", null);
        setField(term1533834, term1533834.getClass(), "featureSet", term1533905);
        setField(term1533834, term1533834.getClass(), "generationMessage", "OeQLvhVERT");
        setField(term1533834, term1533834.getClass(), "helpMsg", "IlvgFINwIa");
        setField(term1533834, term1533834.getClass(), "postGenerationMsg", term1533930);
        setField(term1533834, term1533834.getClass(), "reservedWords", term1533946);
        setField(term1533834, term1533834.getClass(), "instantiationTypes", term1533959);
        setField(term1533834, term1533834.getClass(), "languageSpecificPrimitives", term1533969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguageSpecificPrimitives", argTypes, term1533834, args);
    }

};


