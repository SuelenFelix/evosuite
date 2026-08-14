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

public class GeneratorMetadata_getHelpMsg_139526044211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527691;

    public GeneratorMetadata_getHelpMsg_139526044211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1527913 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1527912 = ((Class) term1527913).getDeclaredField((String) "ERLANG");
        ((Field) term1527912).setAccessible(true);
        Object enum2974 = ((Field) term1527912).get((Object) null);
        Class<? extends Object> term1528353 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1528352 = ((Class) term1528353).getDeclaredField((String) "SCHEMA");
        ((Field) term1528352).setAccessible(true);
        Object enum2975 = ((Field) term1528352).get((Object) null);
        Class<? extends Object> term1528763 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1528762 = ((Class) term1528763).getDeclaredField((String) "BETA");
        ((Field) term1528762).setAccessible(true);
        Object enum2976 = ((Field) term1528762).get((Object) null);
        HashMap term1527758 = new HashMap();
        ArrayList term1527793 = new ArrayList();
        ((ArrayList) term1527793).add("WXMWFDGcLB");
        ((ArrayList) term1527793).add("wKWbJssZuG");
        ((ArrayList) term1527793).add("NzBMMhkhpT");
        ((ArrayList) term1527793).add("qCpEbQDHdF");
        ((ArrayList) term1527793).add("AHbZyFOmlo");
        ((ArrayList) term1527793).add("TwfWVQGiIj");
        HashMap term1527870 = new HashMap();
        Set<Object> term1529226 =  ((Map) term1527870).keySet();
        HashSet term1527869 = new HashSet((Collection<? extends Object>) term1529226);
        HashMap term1527875 = new HashMap();
        HashMap term1527886 = new HashMap();
        Set<Object> term1529227 =  ((Map) term1527886).keySet();
        HashSet term1527885 = new HashSet((Collection<? extends Object>) term1529227);
        term1527691 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1527768 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1527691, term1527691.getClass(), "name", "GrqozDKFOk");
        setField(term1527691, term1527691.getClass(), "language", enum2974);
        setField(term1527691, term1527691.getClass(), "languageVersion", "CFyoseFGLF");
        setField(term1527691, term1527691.getClass(), "type", enum2975);
        setField(term1527691, term1527691.getClass(), "stability", enum2976);
        setField(term1527691, term1527691.getClass(), "libraryFeatures", term1527758);
        setField(term1527768, term1527768.getClass(), "clientModificationFeatures", null);
        setField(term1527768, term1527768.getClass(), "dataTypeFeatures", null);
        setField(term1527768, term1527768.getClass(), "componentsFeatures", null);
        setField(term1527768, term1527768.getClass(), "documentationFeatures", null);
        setField(term1527768, term1527768.getClass(), "globalFeatures", null);
        setField(term1527768, term1527768.getClass(), "schemaFeatures", null);
        setField(term1527768, term1527768.getClass(), "parameterFeatures", null);
        setField(term1527768, term1527768.getClass(), "securityFeatures", null);
        setField(term1527768, term1527768.getClass(), "operationFeatures", null);
        setField(term1527768, term1527768.getClass(), "wireFormatFeatures", null);
        setField(term1527691, term1527691.getClass(), "featureSet", term1527768);
        setField(term1527691, term1527691.getClass(), "generationMessage", "GZdcJyZntS");
        setField(term1527691, term1527691.getClass(), "helpMsg", "OIHoJeysUi");
        setField(term1527691, term1527691.getClass(), "postGenerationMsg", term1527793);
        setField(term1527691, term1527691.getClass(), "reservedWords", term1527869);
        setField(term1527691, term1527691.getClass(), "instantiationTypes", term1527875);
        setField(term1527691, term1527691.getClass(), "languageSpecificPrimitives", term1527885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHelpMsg", argTypes, term1527691, args);
    }

};


