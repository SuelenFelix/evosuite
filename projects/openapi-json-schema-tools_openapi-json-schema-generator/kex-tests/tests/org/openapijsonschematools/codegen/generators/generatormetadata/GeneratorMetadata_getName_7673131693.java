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

public class GeneratorMetadata_getName_7673131693 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1515419;

    public GeneratorMetadata_getName_7673131693() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1515646 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1515645 = ((Class) term1515646).getDeclaredField((String) "SWIFT");
        ((Field) term1515645).setAccessible(true);
        Object enum2950 = ((Field) term1515645).get((Object) null);
        Class<? extends Object> term1516083 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1516082 = ((Class) term1516083).getDeclaredField((String) "OTHER");
        ((Field) term1516082).setAccessible(true);
        Object enum2951 = ((Field) term1516082).get((Object) null);
        Class<? extends Object> term1516490 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1516489 = ((Class) term1516490).getDeclaredField((String) "BETA");
        ((Field) term1516489).setAccessible(true);
        Object enum2952 = ((Field) term1516489).get((Object) null);
        HashMap term1515483 = new HashMap();
        ArrayList term1515518 = new ArrayList();
        ((ArrayList) term1515518).add("hoicvmsovO");
        ((ArrayList) term1515518).add("eqJfYWRaEL");
        ((ArrayList) term1515518).add("fhkbdRViHi");
        ((ArrayList) term1515518).add("uWHnvSvaPl");
        ((ArrayList) term1515518).add("kBdSllIBVz");
        ((ArrayList) term1515518).add("TJmVBGfTML");
        ((ArrayList) term1515518).add("tPlsykYBqO");
        HashMap term1515607 = new HashMap();
        Set<Object> term1516963 =  ((Map) term1515607).keySet();
        HashSet term1515606 = new HashSet((Collection<? extends Object>) term1516963);
        HashMap term1515612 = new HashMap();
        HashMap term1515623 = new HashMap();
        Set<Object> term1516964 =  ((Map) term1515623).keySet();
        HashSet term1515622 = new HashSet((Collection<? extends Object>) term1516964);
        term1515419 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1515493 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1515419, term1515419.getClass(), "name", "MLqYREekMl");
        setField(term1515419, term1515419.getClass(), "language", enum2950);
        setField(term1515419, term1515419.getClass(), "languageVersion", "ytSBIKXogI");
        setField(term1515419, term1515419.getClass(), "type", enum2951);
        setField(term1515419, term1515419.getClass(), "stability", enum2952);
        setField(term1515419, term1515419.getClass(), "libraryFeatures", term1515483);
        setField(term1515493, term1515493.getClass(), "clientModificationFeatures", null);
        setField(term1515493, term1515493.getClass(), "dataTypeFeatures", null);
        setField(term1515493, term1515493.getClass(), "componentsFeatures", null);
        setField(term1515493, term1515493.getClass(), "documentationFeatures", null);
        setField(term1515493, term1515493.getClass(), "globalFeatures", null);
        setField(term1515493, term1515493.getClass(), "schemaFeatures", null);
        setField(term1515493, term1515493.getClass(), "parameterFeatures", null);
        setField(term1515493, term1515493.getClass(), "securityFeatures", null);
        setField(term1515493, term1515493.getClass(), "operationFeatures", null);
        setField(term1515493, term1515493.getClass(), "wireFormatFeatures", null);
        setField(term1515419, term1515419.getClass(), "featureSet", term1515493);
        setField(term1515419, term1515419.getClass(), "generationMessage", "ieCtQFdkii");
        setField(term1515419, term1515419.getClass(), "helpMsg", "dEnhdmILtU");
        setField(term1515419, term1515419.getClass(), "postGenerationMsg", term1515518);
        setField(term1515419, term1515419.getClass(), "reservedWords", term1515606);
        setField(term1515419, term1515419.getClass(), "instantiationTypes", term1515612);
        setField(term1515419, term1515419.getClass(), "languageSpecificPrimitives", term1515622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1515419, args);
    }

};


