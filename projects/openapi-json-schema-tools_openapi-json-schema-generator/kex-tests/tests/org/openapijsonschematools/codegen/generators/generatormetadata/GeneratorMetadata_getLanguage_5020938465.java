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

public class GeneratorMetadata_getLanguage_5020938465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1518408;

    public GeneratorMetadata_getLanguage_5020938465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1518651 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1518650 = ((Class) term1518651).getDeclaredField((String) "CRYSTAL");
        ((Field) term1518650).setAccessible(true);
        Object enum2956 = ((Field) term1518650).get((Object) null);
        Class<? extends Object> term1519094 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1519093 = ((Class) term1519094).getDeclaredField((String) "SERVER");
        ((Field) term1519093).setAccessible(true);
        Object enum2957 = ((Field) term1519093).get((Object) null);
        Class<? extends Object> term1519504 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1519503 = ((Class) term1519504).getDeclaredField((String) "EXPERIMENTAL");
        ((Field) term1519503).setAccessible(true);
        Object enum2958 = ((Field) term1519503).get((Object) null);
        HashMap term1518493 = new HashMap();
        ArrayList term1518528 = new ArrayList();
        ((ArrayList) term1518528).add("SPpkrGcPRr");
        ((ArrayList) term1518528).add("sEccwbJKYE");
        ((ArrayList) term1518528).add("AWRooQKkdW");
        ((ArrayList) term1518528).add("vjxIhXHxGR");
        ((ArrayList) term1518528).add("QXzGXbEXMu");
        ((ArrayList) term1518528).add("qxSDVejjiY");
        HashMap term1518605 = new HashMap();
        Set<Object> term1519991 =  ((Map) term1518605).keySet();
        HashSet term1518604 = new HashSet((Collection<? extends Object>) term1519991);
        HashMap term1518617 = new HashMap();
        HashMap term1518628 = new HashMap();
        Set<Object> term1519992 =  ((Map) term1518628).keySet();
        HashSet term1518627 = new HashSet((Collection<? extends Object>) term1519992);
        term1518408 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1518503 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1518408, term1518408.getClass(), "name", "DfISiziTgG");
        setField(term1518408, term1518408.getClass(), "language", enum2956);
        setField(term1518408, term1518408.getClass(), "languageVersion", "XqgfKFvPSD");
        setField(term1518408, term1518408.getClass(), "type", enum2957);
        setField(term1518408, term1518408.getClass(), "stability", enum2958);
        setField(term1518408, term1518408.getClass(), "libraryFeatures", term1518493);
        setField(term1518503, term1518503.getClass(), "clientModificationFeatures", null);
        setField(term1518503, term1518503.getClass(), "dataTypeFeatures", null);
        setField(term1518503, term1518503.getClass(), "componentsFeatures", null);
        setField(term1518503, term1518503.getClass(), "documentationFeatures", null);
        setField(term1518503, term1518503.getClass(), "globalFeatures", null);
        setField(term1518503, term1518503.getClass(), "schemaFeatures", null);
        setField(term1518503, term1518503.getClass(), "parameterFeatures", null);
        setField(term1518503, term1518503.getClass(), "securityFeatures", null);
        setField(term1518503, term1518503.getClass(), "operationFeatures", null);
        setField(term1518503, term1518503.getClass(), "wireFormatFeatures", null);
        setField(term1518408, term1518408.getClass(), "featureSet", term1518503);
        setField(term1518408, term1518408.getClass(), "generationMessage", "XPKmummaqg");
        setField(term1518408, term1518408.getClass(), "helpMsg", "BKLfkLiZTH");
        setField(term1518408, term1518408.getClass(), "postGenerationMsg", term1518528);
        setField(term1518408, term1518408.getClass(), "reservedWords", term1518604);
        setField(term1518408, term1518408.getClass(), "instantiationTypes", term1518617);
        setField(term1518408, term1518408.getClass(), "languageSpecificPrimitives", term1518627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLanguage", argTypes, term1518408, args);
    }

};


