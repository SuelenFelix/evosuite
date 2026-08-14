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

public class GeneratorMetadata_getPostGenerationMsg_164375433212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1529228;

    public GeneratorMetadata_getPostGenerationMsg_164375433212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1529424 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1529423 = ((Class) term1529424).getDeclaredField((String) "K_SIX");
        ((Field) term1529423).setAccessible(true);
        Object enum2977 = ((Field) term1529423).get((Object) null);
        Class<? extends Object> term1529861 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1529860 = ((Class) term1529861).getDeclaredField((String) "SERVER");
        ((Field) term1529860).setAccessible(true);
        Object enum2978 = ((Field) term1529860).get((Object) null);
        Class<? extends Object> term1530271 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1530270 = ((Class) term1530271).getDeclaredField((String) "DEPRECATED");
        ((Field) term1530270).setAccessible(true);
        Object enum2979 = ((Field) term1530270).get((Object) null);
        HashMap term1529302 = new HashMap();
        ArrayList term1529337 = new ArrayList();
        ((ArrayList) term1529337).add("rYbtIDVdnd");
        ((ArrayList) term1529337).add("UKAReurpHG");
        HashMap term1529366 = new HashMap();
        Set<Object> term1530712 =  ((Map) term1529366).keySet();
        HashSet term1529365 = new HashSet((Collection<? extends Object>) term1530712);
        HashMap term1529380 = new HashMap();
        HashMap term1529391 = new HashMap();
        Set<Object> term1530713 =  ((Map) term1529391).keySet();
        HashSet term1529390 = new HashSet((Collection<? extends Object>) term1530713);
        term1529228 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1529312 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1529228, term1529228.getClass(), "name", "pJbnHTYrxn");
        setField(term1529228, term1529228.getClass(), "language", enum2977);
        setField(term1529228, term1529228.getClass(), "languageVersion", "iIRsCSYqXH");
        setField(term1529228, term1529228.getClass(), "type", enum2978);
        setField(term1529228, term1529228.getClass(), "stability", enum2979);
        setField(term1529228, term1529228.getClass(), "libraryFeatures", term1529302);
        setField(term1529312, term1529312.getClass(), "clientModificationFeatures", null);
        setField(term1529312, term1529312.getClass(), "dataTypeFeatures", null);
        setField(term1529312, term1529312.getClass(), "componentsFeatures", null);
        setField(term1529312, term1529312.getClass(), "documentationFeatures", null);
        setField(term1529312, term1529312.getClass(), "globalFeatures", null);
        setField(term1529312, term1529312.getClass(), "schemaFeatures", null);
        setField(term1529312, term1529312.getClass(), "parameterFeatures", null);
        setField(term1529312, term1529312.getClass(), "securityFeatures", null);
        setField(term1529312, term1529312.getClass(), "operationFeatures", null);
        setField(term1529312, term1529312.getClass(), "wireFormatFeatures", null);
        setField(term1529228, term1529228.getClass(), "featureSet", term1529312);
        setField(term1529228, term1529228.getClass(), "generationMessage", "WBAOTqErtm");
        setField(term1529228, term1529228.getClass(), "helpMsg", "PqtVXXZMqK");
        setField(term1529228, term1529228.getClass(), "postGenerationMsg", term1529337);
        setField(term1529228, term1529228.getClass(), "reservedWords", term1529365);
        setField(term1529228, term1529228.getClass(), "instantiationTypes", term1529380);
        setField(term1529228, term1529228.getClass(), "languageSpecificPrimitives", term1529390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPostGenerationMsg", argTypes, term1529228, args);
    }

};


