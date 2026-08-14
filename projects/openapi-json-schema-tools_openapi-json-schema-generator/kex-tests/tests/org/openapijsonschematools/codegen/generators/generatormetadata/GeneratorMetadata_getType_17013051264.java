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

public class GeneratorMetadata_getType_17013051264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1516965;

    public GeneratorMetadata_getType_17013051264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1517140 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1517139 = ((Class) term1517140).getDeclaredField((String) "KTORM");
        ((Field) term1517139).setAccessible(true);
        Object enum2953 = ((Field) term1517139).get((Object) null);
        Class<? extends Object> term1517577 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1517576 = ((Class) term1517577).getDeclaredField((String) "SCHEMA");
        ((Field) term1517576).setAccessible(true);
        Object enum2954 = ((Field) term1517576).get((Object) null);
        Class<? extends Object> term1517987 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1517986 = ((Class) term1517987).getDeclaredField((String) "STABLE");
        ((Field) term1517986).setAccessible(true);
        Object enum2955 = ((Field) term1517986).get((Object) null);
        HashMap term1517034 = new HashMap();
        ArrayList term1517069 = new ArrayList();
        ((ArrayList) term1517069).add("idgaQsnJpQ");
        HashMap term1517086 = new HashMap();
        Set<Object> term1518406 =  ((Map) term1517086).keySet();
        HashSet term1517085 = new HashSet((Collection<? extends Object>) term1518406);
        HashMap term1517106 = new HashMap();
        HashMap term1517117 = new HashMap();
        Set<Object> term1518407 =  ((Map) term1517117).keySet();
        HashSet term1517116 = new HashSet((Collection<? extends Object>) term1518407);
        term1516965 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1517044 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1516965, term1516965.getClass(), "name", "MAcUBcBckh");
        setField(term1516965, term1516965.getClass(), "language", enum2953);
        setField(term1516965, term1516965.getClass(), "languageVersion", "oVgzLbrsFr");
        setField(term1516965, term1516965.getClass(), "type", enum2954);
        setField(term1516965, term1516965.getClass(), "stability", enum2955);
        setField(term1516965, term1516965.getClass(), "libraryFeatures", term1517034);
        setField(term1517044, term1517044.getClass(), "clientModificationFeatures", null);
        setField(term1517044, term1517044.getClass(), "dataTypeFeatures", null);
        setField(term1517044, term1517044.getClass(), "componentsFeatures", null);
        setField(term1517044, term1517044.getClass(), "documentationFeatures", null);
        setField(term1517044, term1517044.getClass(), "globalFeatures", null);
        setField(term1517044, term1517044.getClass(), "schemaFeatures", null);
        setField(term1517044, term1517044.getClass(), "parameterFeatures", null);
        setField(term1517044, term1517044.getClass(), "securityFeatures", null);
        setField(term1517044, term1517044.getClass(), "operationFeatures", null);
        setField(term1517044, term1517044.getClass(), "wireFormatFeatures", null);
        setField(term1516965, term1516965.getClass(), "featureSet", term1517044);
        setField(term1516965, term1516965.getClass(), "generationMessage", "OWKQODBLzb");
        setField(term1516965, term1516965.getClass(), "helpMsg", "wGmYcqUkgE");
        setField(term1516965, term1516965.getClass(), "postGenerationMsg", term1517069);
        setField(term1516965, term1516965.getClass(), "reservedWords", term1517085);
        setField(term1516965, term1516965.getClass(), "instantiationTypes", term1517106);
        setField(term1516965, term1516965.getClass(), "languageSpecificPrimitives", term1517116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term1516965, args);
    }

};


