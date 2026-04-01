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

public class GeneratorMetadata_getLanguageVersion_13453404226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1519993;

    public GeneratorMetadata_getLanguageVersion_13453404226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1520185 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1520184 = ((Class) term1520185).getDeclaredField((String) "NIM");
        ((Field) term1520184).setAccessible(true);
        Object enum2959 = ((Field) term1520184).get((Object) null);
        Class<? extends Object> term1520616 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1520615 = ((Class) term1520616).getDeclaredField((String) "OTHER");
        ((Field) term1520615).setAccessible(true);
        Object enum2960 = ((Field) term1520615).get((Object) null);
        Class<? extends Object> term1521023 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1521022 = ((Class) term1521023).getDeclaredField((String) "DEPRECATED");
        ((Field) term1521022).setAccessible(true);
        Object enum2961 = ((Field) term1521022).get((Object) null);
        HashMap term1520065 = new HashMap();
        ArrayList term1520100 = new ArrayList();
        ((ArrayList) term1520100).add("dpNsDgfPso");
        ((ArrayList) term1520100).add("hCWPJQKpdc");
        HashMap term1520129 = new HashMap();
        Set<Object> term1521464 =  ((Map) term1520129).keySet();
        HashSet term1520128 = new HashSet((Collection<? extends Object>) term1521464);
        HashMap term1520141 = new HashMap();
        HashMap term1520152 = new HashMap();
        Set<Object> term1521465 =  ((Map) term1520152).keySet();
        HashSet term1520151 = new HashSet((Collection<? extends Object>) term1521465);
        term1519993 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1520075 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1519993, term1519993.getClass(), "name", "MvRIxilFMJ");
        setField(term1519993, term1519993.getClass(), "language", enum2959);
        setField(term1519993, term1519993.getClass(), "languageVersion", "iNwOJRBEjp");
        setField(term1519993, term1519993.getClass(), "type", enum2960);
        setField(term1519993, term1519993.getClass(), "stability", enum2961);
        setField(term1519993, term1519993.getClass(), "libraryFeatures", term1520065);
        setField(term1520075, term1520075.getClass(), "clientModificationFeatures", null);
        setField(term1520075, term1520075.getClass(), "dataTypeFeatures", null);
        setField(term1520075, term1520075.getClass(), "componentsFeatures", null);
        setField(term1520075, term1520075.getClass(), "documentationFeatures", null);
        setField(term1520075, term1520075.getClass(), "globalFeatures", null);
        setField(term1520075, term1520075.getClass(), "schemaFeatures", null);
        setField(term1520075, term1520075.getClass(), "parameterFeatures", null);
        setField(term1520075, term1520075.getClass(), "securityFeatures", null);
        setField(term1520075, term1520075.getClass(), "operationFeatures", null);
        setField(term1520075, term1520075.getClass(), "wireFormatFeatures", null);
        setField(term1519993, term1519993.getClass(), "featureSet", term1520075);
        setField(term1519993, term1519993.getClass(), "generationMessage", "pORebkoRdD");
        setField(term1519993, term1519993.getClass(), "helpMsg", "mXGCWJDOqA");
        setField(term1519993, term1519993.getClass(), "postGenerationMsg", term1520100);
        setField(term1519993, term1519993.getClass(), "reservedWords", term1520128);
        setField(term1519993, term1519993.getClass(), "instantiationTypes", term1520141);
        setField(term1519993, term1519993.getClass(), "languageSpecificPrimitives", term1520151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguageVersion", argTypes, term1519993, args);
    }

};


