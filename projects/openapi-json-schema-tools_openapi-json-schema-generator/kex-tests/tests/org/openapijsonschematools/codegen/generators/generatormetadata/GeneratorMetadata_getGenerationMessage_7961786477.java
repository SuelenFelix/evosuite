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

public class GeneratorMetadata_getGenerationMessage_7961786477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1521466;

    public GeneratorMetadata_getGenerationMessage_7961786477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1521651 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1521650 = ((Class) term1521651).getDeclaredField((String) "JAVA");
        ((Field) term1521650).setAccessible(true);
        Object enum2962 = ((Field) term1521650).get((Object) null);
        Class<? extends Object> term1522085 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1522084 = ((Class) term1522085).getDeclaredField((String) "SCHEMA");
        ((Field) term1522084).setAccessible(true);
        Object enum2963 = ((Field) term1522084).get((Object) null);
        Class<? extends Object> term1522495 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1522494 = ((Class) term1522495).getDeclaredField((String) "EXPERIMENTAL");
        ((Field) term1522494).setAccessible(true);
        Object enum2964 = ((Field) term1522494).get((Object) null);
        HashMap term1521545 = new HashMap();
        ArrayList term1521580 = new ArrayList();
        ((ArrayList) term1521580).add("yVMkkQhvmN");
        HashMap term1521597 = new HashMap();
        Set<Object> term1522932 =  ((Map) term1521597).keySet();
        HashSet term1521596 = new HashSet((Collection<? extends Object>) term1522932);
        HashMap term1521611 = new HashMap();
        HashMap term1521622 = new HashMap();
        Set<Object> term1522933 =  ((Map) term1521622).keySet();
        HashSet term1521621 = new HashSet((Collection<? extends Object>) term1522933);
        term1521466 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1521555 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1521466, term1521466.getClass(), "name", "wfaXBpWAUH");
        setField(term1521466, term1521466.getClass(), "language", enum2962);
        setField(term1521466, term1521466.getClass(), "languageVersion", "VMeAzAHwZj");
        setField(term1521466, term1521466.getClass(), "type", enum2963);
        setField(term1521466, term1521466.getClass(), "stability", enum2964);
        setField(term1521466, term1521466.getClass(), "libraryFeatures", term1521545);
        setField(term1521555, term1521555.getClass(), "clientModificationFeatures", null);
        setField(term1521555, term1521555.getClass(), "dataTypeFeatures", null);
        setField(term1521555, term1521555.getClass(), "componentsFeatures", null);
        setField(term1521555, term1521555.getClass(), "documentationFeatures", null);
        setField(term1521555, term1521555.getClass(), "globalFeatures", null);
        setField(term1521555, term1521555.getClass(), "schemaFeatures", null);
        setField(term1521555, term1521555.getClass(), "parameterFeatures", null);
        setField(term1521555, term1521555.getClass(), "securityFeatures", null);
        setField(term1521555, term1521555.getClass(), "operationFeatures", null);
        setField(term1521555, term1521555.getClass(), "wireFormatFeatures", null);
        setField(term1521466, term1521466.getClass(), "featureSet", term1521555);
        setField(term1521466, term1521466.getClass(), "generationMessage", "ZzIujlwVsw");
        setField(term1521466, term1521466.getClass(), "helpMsg", "LWyEaeIyAo");
        setField(term1521466, term1521466.getClass(), "postGenerationMsg", term1521580);
        setField(term1521466, term1521466.getClass(), "reservedWords", term1521596);
        setField(term1521466, term1521466.getClass(), "instantiationTypes", term1521611);
        setField(term1521466, term1521466.getClass(), "languageSpecificPrimitives", term1521621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenerationMessage", argTypes, term1521466, args);
    }

};


