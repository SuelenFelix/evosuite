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

public class GeneratorMetadata_getReservedWords_133068512813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1530714;

    public GeneratorMetadata_getReservedWords_133068512813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1530875 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1530874 = ((Class) term1530875).getDeclaredField((String) "PHP");
        ((Field) term1530874).setAccessible(true);
        Object enum2980 = ((Field) term1530874).get((Object) null);
        Class<? extends Object> term1531306 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1531305 = ((Class) term1531306).getDeclaredField((String) "SCHEMA");
        ((Field) term1531305).setAccessible(true);
        Object enum2981 = ((Field) term1531305).get((Object) null);
        Class<? extends Object> term1531716 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1531715 = ((Class) term1531716).getDeclaredField((String) "BETA");
        ((Field) term1531715).setAccessible(true);
        Object enum2982 = ((Field) term1531715).get((Object) null);
        HashMap term1530775 = new HashMap();
        ArrayList term1530810 = new ArrayList();
        ((ArrayList) term1530810).add("onQLVONGuf");
        HashMap term1530827 = new HashMap();
        Set<Object> term1532129 =  ((Map) term1530827).keySet();
        HashSet term1530826 = new HashSet((Collection<? extends Object>) term1532129);
        HashMap term1530835 = new HashMap();
        HashMap term1530846 = new HashMap();
        Set<Object> term1532130 =  ((Map) term1530846).keySet();
        HashSet term1530845 = new HashSet((Collection<? extends Object>) term1532130);
        term1530714 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1530785 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1530714, term1530714.getClass(), "name", "ZKMLioamsY");
        setField(term1530714, term1530714.getClass(), "language", enum2980);
        setField(term1530714, term1530714.getClass(), "languageVersion", "WVbxuoDBcn");
        setField(term1530714, term1530714.getClass(), "type", enum2981);
        setField(term1530714, term1530714.getClass(), "stability", enum2982);
        setField(term1530714, term1530714.getClass(), "libraryFeatures", term1530775);
        setField(term1530785, term1530785.getClass(), "clientModificationFeatures", null);
        setField(term1530785, term1530785.getClass(), "dataTypeFeatures", null);
        setField(term1530785, term1530785.getClass(), "componentsFeatures", null);
        setField(term1530785, term1530785.getClass(), "documentationFeatures", null);
        setField(term1530785, term1530785.getClass(), "globalFeatures", null);
        setField(term1530785, term1530785.getClass(), "schemaFeatures", null);
        setField(term1530785, term1530785.getClass(), "parameterFeatures", null);
        setField(term1530785, term1530785.getClass(), "securityFeatures", null);
        setField(term1530785, term1530785.getClass(), "operationFeatures", null);
        setField(term1530785, term1530785.getClass(), "wireFormatFeatures", null);
        setField(term1530714, term1530714.getClass(), "featureSet", term1530785);
        setField(term1530714, term1530714.getClass(), "generationMessage", "beAMpkroCQ");
        setField(term1530714, term1530714.getClass(), "helpMsg", "uSUvKAyuvd");
        setField(term1530714, term1530714.getClass(), "postGenerationMsg", term1530810);
        setField(term1530714, term1530714.getClass(), "reservedWords", term1530826);
        setField(term1530714, term1530714.getClass(), "instantiationTypes", term1530835);
        setField(term1530714, term1530714.getClass(), "languageSpecificPrimitives", term1530845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReservedWords", argTypes, term1530714, args);
    }

};


