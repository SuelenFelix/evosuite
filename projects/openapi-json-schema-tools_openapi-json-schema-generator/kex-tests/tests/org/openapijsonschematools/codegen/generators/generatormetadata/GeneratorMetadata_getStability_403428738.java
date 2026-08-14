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

public class GeneratorMetadata_getStability_403428738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1522934;

    public GeneratorMetadata_getStability_403428738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1523214 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1523213 = ((Class) term1523214).getDeclaredField((String) "C_SHARP");
        ((Field) term1523213).setAccessible(true);
        Object enum2965 = ((Field) term1523213).get((Object) null);
        Class<? extends Object> term1523657 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1523656 = ((Class) term1523657).getDeclaredField((String) "SCHEMA");
        ((Field) term1523656).setAccessible(true);
        Object enum2966 = ((Field) term1523656).get((Object) null);
        Class<? extends Object> term1524067 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1524066 = ((Class) term1524067).getDeclaredField((String) "EXPERIMENTAL");
        ((Field) term1524066).setAccessible(true);
        Object enum2967 = ((Field) term1524066).get((Object) null);
        HashMap term1523014 = new HashMap();
        ArrayList term1523049 = new ArrayList();
        ((ArrayList) term1523049).add("VeDtgDzGAN");
        ((ArrayList) term1523049).add("aWYOWZFyaX");
        ((ArrayList) term1523049).add("BRIVNtfUWU");
        ((ArrayList) term1523049).add("DbiCVtPPCT");
        ((ArrayList) term1523049).add("WzFopsaDuG");
        ((ArrayList) term1523049).add("PapWxkhEWe");
        ((ArrayList) term1523049).add("smnHEqRFRx");
        ((ArrayList) term1523049).add("XYtryyobou");
        ((ArrayList) term1523049).add("OYbzXylRWW");
        HashMap term1523162 = new HashMap();
        Set<Object> term1524584 =  ((Map) term1523162).keySet();
        HashSet term1523161 = new HashSet((Collection<? extends Object>) term1524584);
        HashMap term1523180 = new HashMap();
        HashMap term1523191 = new HashMap();
        Set<Object> term1524585 =  ((Map) term1523191).keySet();
        HashSet term1523190 = new HashSet((Collection<? extends Object>) term1524585);
        term1522934 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1523024 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1522934, term1522934.getClass(), "name", "aNWLJdrZMq");
        setField(term1522934, term1522934.getClass(), "language", enum2965);
        setField(term1522934, term1522934.getClass(), "languageVersion", "HHmNoYxIGj");
        setField(term1522934, term1522934.getClass(), "type", enum2966);
        setField(term1522934, term1522934.getClass(), "stability", enum2967);
        setField(term1522934, term1522934.getClass(), "libraryFeatures", term1523014);
        setField(term1523024, term1523024.getClass(), "clientModificationFeatures", null);
        setField(term1523024, term1523024.getClass(), "dataTypeFeatures", null);
        setField(term1523024, term1523024.getClass(), "componentsFeatures", null);
        setField(term1523024, term1523024.getClass(), "documentationFeatures", null);
        setField(term1523024, term1523024.getClass(), "globalFeatures", null);
        setField(term1523024, term1523024.getClass(), "schemaFeatures", null);
        setField(term1523024, term1523024.getClass(), "parameterFeatures", null);
        setField(term1523024, term1523024.getClass(), "securityFeatures", null);
        setField(term1523024, term1523024.getClass(), "operationFeatures", null);
        setField(term1523024, term1523024.getClass(), "wireFormatFeatures", null);
        setField(term1522934, term1522934.getClass(), "featureSet", term1523024);
        setField(term1522934, term1522934.getClass(), "generationMessage", "HWkpTmtlrc");
        setField(term1522934, term1522934.getClass(), "helpMsg", "hMmaoREuCK");
        setField(term1522934, term1522934.getClass(), "postGenerationMsg", term1523049);
        setField(term1522934, term1522934.getClass(), "reservedWords", term1523161);
        setField(term1522934, term1522934.getClass(), "instantiationTypes", term1523180);
        setField(term1522934, term1522934.getClass(), "languageSpecificPrimitives", term1523190);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStability", argTypes, term1522934, args);
    }

};


