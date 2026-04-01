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

public class GeneratorMetadata_newBuilder_8021911992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1513818;

    public GeneratorMetadata_newBuilder_8021911992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1514077 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1514076 = ((Class) term1514077).getDeclaredField((String) "OCAML");
        ((Field) term1514076).setAccessible(true);
        Object enum2947 = ((Field) term1514076).get((Object) null);
        Class<? extends Object> term1514514 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1514513 = ((Class) term1514514).getDeclaredField((String) "CONFIG");
        ((Field) term1514513).setAccessible(true);
        Object enum2948 = ((Field) term1514513).get((Object) null);
        Class<? extends Object> term1514924 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1514923 = ((Class) term1514924).getDeclaredField((String) "BETA");
        ((Field) term1514923).setAccessible(true);
        Object enum2949 = ((Field) term1514923).get((Object) null);
        HashMap term1513883 = new HashMap();
        ArrayList term1513918 = new ArrayList();
        ((ArrayList) term1513918).add("nyiiPDVjAc");
        ((ArrayList) term1513918).add("aKnKipADSo");
        ((ArrayList) term1513918).add("wSQxaModmm");
        ((ArrayList) term1513918).add("UlajhuVLaP");
        ((ArrayList) term1513918).add("gGSMzuGICf");
        ((ArrayList) term1513918).add("hxCBltsObl");
        ((ArrayList) term1513918).add("BndsHwAFMv");
        ((ArrayList) term1513918).add("GzFkzHGYFt");
        ((ArrayList) term1513918).add("tShwQLRGNe");
        HashMap term1514031 = new HashMap();
        Set<Object> term1515417 =  ((Map) term1514031).keySet();
        HashSet term1514030 = new HashSet((Collection<? extends Object>) term1515417);
        HashMap term1514045 = new HashMap();
        HashMap term1514056 = new HashMap();
        Set<Object> term1515418 =  ((Map) term1514056).keySet();
        HashSet term1514055 = new HashSet((Collection<? extends Object>) term1515418);
        term1513818 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1513893 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1513818, term1513818.getClass(), "name", "SbAoxhfrkn");
        setField(term1513818, term1513818.getClass(), "language", enum2947);
        setField(term1513818, term1513818.getClass(), "languageVersion", "kuTXqwMtDB");
        setField(term1513818, term1513818.getClass(), "type", enum2948);
        setField(term1513818, term1513818.getClass(), "stability", enum2949);
        setField(term1513818, term1513818.getClass(), "libraryFeatures", term1513883);
        setField(term1513893, term1513893.getClass(), "clientModificationFeatures", null);
        setField(term1513893, term1513893.getClass(), "dataTypeFeatures", null);
        setField(term1513893, term1513893.getClass(), "componentsFeatures", null);
        setField(term1513893, term1513893.getClass(), "documentationFeatures", null);
        setField(term1513893, term1513893.getClass(), "globalFeatures", null);
        setField(term1513893, term1513893.getClass(), "schemaFeatures", null);
        setField(term1513893, term1513893.getClass(), "parameterFeatures", null);
        setField(term1513893, term1513893.getClass(), "securityFeatures", null);
        setField(term1513893, term1513893.getClass(), "operationFeatures", null);
        setField(term1513893, term1513893.getClass(), "wireFormatFeatures", null);
        setField(term1513818, term1513818.getClass(), "featureSet", term1513893);
        setField(term1513818, term1513818.getClass(), "generationMessage", "xrwlQZdwCp");
        setField(term1513818, term1513818.getClass(), "helpMsg", "IDCWpPLRkE");
        setField(term1513818, term1513818.getClass(), "postGenerationMsg", term1513918);
        setField(term1513818, term1513818.getClass(), "reservedWords", term1514030);
        setField(term1513818, term1513818.getClass(), "instantiationTypes", term1514045);
        setField(term1513818, term1513818.getClass(), "languageSpecificPrimitives", term1514055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Object[] args = new Object[1];
        args[0] = term1513818;
        callMethod(klass, "newBuilder", argTypes, null, args);
    }

};


