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

public class GeneratorMetadata_getLibraryFeatures_98183210510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1526217;

    public GeneratorMetadata_getLibraryFeatures_98183210510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1526418 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1526417 = ((Class) term1526418).getDeclaredField((String) "WSDL");
        ((Field) term1526417).setAccessible(true);
        Object enum2971 = ((Field) term1526417).get((Object) null);
        Class<? extends Object> term1526852 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1526851 = ((Class) term1526852).getDeclaredField((String) "CONFIG");
        ((Field) term1526851).setAccessible(true);
        Object enum2972 = ((Field) term1526851).get((Object) null);
        Class<? extends Object> term1527262 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1527261 = ((Class) term1527262).getDeclaredField((String) "EXPERIMENTAL");
        ((Field) term1527261).setAccessible(true);
        Object enum2973 = ((Field) term1527261).get((Object) null);
        HashMap term1526332 = new HashMap();
        ArrayList term1526367 = new ArrayList();
        HashMap term1526372 = new HashMap();
        Set<Object> term1527689 =  ((Map) term1526372).keySet();
        HashSet term1526371 = new HashSet((Collection<? extends Object>) term1527689);
        HashMap term1526384 = new HashMap();
        HashMap term1526395 = new HashMap();
        Set<Object> term1527690 =  ((Map) term1526395).keySet();
        HashSet term1526394 = new HashSet((Collection<? extends Object>) term1527690);
        term1526217 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1526342 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1526217, term1526217.getClass(), "name", "BjugTaMcxJ");
        setField(term1526217, term1526217.getClass(), "language", enum2971);
        setField(term1526217, term1526217.getClass(), "languageVersion", "vGiuZVPJNH");
        setField(term1526217, term1526217.getClass(), "type", enum2972);
        setField(term1526217, term1526217.getClass(), "stability", enum2973);
        setField(term1526217, term1526217.getClass(), "libraryFeatures", term1526332);
        setField(term1526342, term1526342.getClass(), "clientModificationFeatures", null);
        setField(term1526342, term1526342.getClass(), "dataTypeFeatures", null);
        setField(term1526342, term1526342.getClass(), "componentsFeatures", null);
        setField(term1526342, term1526342.getClass(), "documentationFeatures", null);
        setField(term1526342, term1526342.getClass(), "globalFeatures", null);
        setField(term1526342, term1526342.getClass(), "schemaFeatures", null);
        setField(term1526342, term1526342.getClass(), "parameterFeatures", null);
        setField(term1526342, term1526342.getClass(), "securityFeatures", null);
        setField(term1526342, term1526342.getClass(), "operationFeatures", null);
        setField(term1526342, term1526342.getClass(), "wireFormatFeatures", null);
        setField(term1526217, term1526217.getClass(), "featureSet", term1526342);
        setField(term1526217, term1526217.getClass(), "generationMessage", "AZdLeSugwv");
        setField(term1526217, term1526217.getClass(), "helpMsg", "RMsXuyzKJV");
        setField(term1526217, term1526217.getClass(), "postGenerationMsg", term1526367);
        setField(term1526217, term1526217.getClass(), "reservedWords", term1526371);
        setField(term1526217, term1526217.getClass(), "instantiationTypes", term1526384);
        setField(term1526217, term1526217.getClass(), "languageSpecificPrimitives", term1526394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLibraryFeatures", argTypes, term1526217, args);
    }

};


