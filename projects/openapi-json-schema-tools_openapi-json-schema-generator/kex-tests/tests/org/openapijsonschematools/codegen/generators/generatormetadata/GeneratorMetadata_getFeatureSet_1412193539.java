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

public class GeneratorMetadata_getFeatureSet_1412193539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1524586;

    public GeneratorMetadata_getFeatureSet_1412193539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1524857 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1524856 = ((Class) term1524857).getDeclaredField((String) "OBJECTIVE_C");
        ((Field) term1524856).setAccessible(true);
        Object enum2968 = ((Field) term1524856).get((Object) null);
        Class<? extends Object> term1525312 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1525311 = ((Class) term1525312).getDeclaredField((String) "SCHEMA");
        ((Field) term1525311).setAccessible(true);
        Object enum2969 = ((Field) term1525311).get((Object) null);
        Class<? extends Object> term1525722 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1525721 = ((Class) term1525722).getDeclaredField((String) "BETA");
        ((Field) term1525721).setAccessible(true);
        Object enum2970 = ((Field) term1525721).get((Object) null);
        HashMap term1524663 = new HashMap();
        ArrayList term1524698 = new ArrayList();
        ((ArrayList) term1524698).add("iljANwuEjk");
        ((ArrayList) term1524698).add("kNqaJKIATy");
        ((ArrayList) term1524698).add("vKQukfbJUd");
        ((ArrayList) term1524698).add("lFRJFUMVbx");
        ((ArrayList) term1524698).add("sZdUNdggUW");
        ((ArrayList) term1524698).add("OqbwYQfvAe");
        ((ArrayList) term1524698).add("tRxZafjqIx");
        ((ArrayList) term1524698).add("DhjNLmRMCu");
        ((ArrayList) term1524698).add("PgPzMSEjjX");
        HashMap term1524811 = new HashMap();
        Set<Object> term1526215 =  ((Map) term1524811).keySet();
        HashSet term1524810 = new HashSet((Collection<? extends Object>) term1526215);
        HashMap term1524827 = new HashMap();
        HashMap term1524838 = new HashMap();
        Set<Object> term1526216 =  ((Map) term1524838).keySet();
        HashSet term1524837 = new HashSet((Collection<? extends Object>) term1526216);
        term1524586 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1524673 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1524586, term1524586.getClass(), "name", "kVEZMHmRtR");
        setField(term1524586, term1524586.getClass(), "language", enum2968);
        setField(term1524586, term1524586.getClass(), "languageVersion", "ekxGuOYIwi");
        setField(term1524586, term1524586.getClass(), "type", enum2969);
        setField(term1524586, term1524586.getClass(), "stability", enum2970);
        setField(term1524586, term1524586.getClass(), "libraryFeatures", term1524663);
        setField(term1524673, term1524673.getClass(), "clientModificationFeatures", null);
        setField(term1524673, term1524673.getClass(), "dataTypeFeatures", null);
        setField(term1524673, term1524673.getClass(), "componentsFeatures", null);
        setField(term1524673, term1524673.getClass(), "documentationFeatures", null);
        setField(term1524673, term1524673.getClass(), "globalFeatures", null);
        setField(term1524673, term1524673.getClass(), "schemaFeatures", null);
        setField(term1524673, term1524673.getClass(), "parameterFeatures", null);
        setField(term1524673, term1524673.getClass(), "securityFeatures", null);
        setField(term1524673, term1524673.getClass(), "operationFeatures", null);
        setField(term1524673, term1524673.getClass(), "wireFormatFeatures", null);
        setField(term1524586, term1524586.getClass(), "featureSet", term1524673);
        setField(term1524586, term1524586.getClass(), "generationMessage", "YpJbIgJWWv");
        setField(term1524586, term1524586.getClass(), "helpMsg", "JppkknKVOw");
        setField(term1524586, term1524586.getClass(), "postGenerationMsg", term1524698);
        setField(term1524586, term1524586.getClass(), "reservedWords", term1524810);
        setField(term1524586, term1524586.getClass(), "instantiationTypes", term1524827);
        setField(term1524586, term1524586.getClass(), "languageSpecificPrimitives", term1524837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeatureSet", argTypes, term1524586, args);
    }

};


