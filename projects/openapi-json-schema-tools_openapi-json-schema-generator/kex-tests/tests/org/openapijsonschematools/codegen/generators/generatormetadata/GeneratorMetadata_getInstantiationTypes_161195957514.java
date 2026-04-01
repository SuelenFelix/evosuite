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

public class GeneratorMetadata_getInstantiationTypes_161195957514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1532131;

    public GeneratorMetadata_getInstantiationTypes_161195957514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1532444 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorLanguage");
        Field term1532443 = ((Class) term1532444).getDeclaredField((String) "PROTOBUF");
        ((Field) term1532443).setAccessible(true);
        Object enum2983 = ((Field) term1532443).get((Object) null);
        Class<? extends Object> term1532890 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorType");
        Field term1532889 = ((Class) term1532890).getDeclaredField((String) "DOCUMENTATION");
        ((Field) term1532889).setAccessible(true);
        Object enum2984 = ((Field) term1532889).get((Object) null);
        Class<? extends Object> term1533321 = Class.forName((String) "org.openapijsonschematools.codegen.generators.generatormetadata.Stability");
        Field term1533320 = ((Class) term1533321).getDeclaredField((String) "DEPRECATED");
        ((Field) term1533320).setAccessible(true);
        Object enum2985 = ((Field) term1533320).get((Object) null);
        HashMap term1532240 = new HashMap();
        ArrayList term1532275 = new ArrayList();
        ((ArrayList) term1532275).add("MYWYUeLGOp");
        ((ArrayList) term1532275).add("tsTGdgQYUL");
        ((ArrayList) term1532275).add("TtGbVmKcnX");
        ((ArrayList) term1532275).add("GJVkUrCVdD");
        ((ArrayList) term1532275).add("zNdorvdUgu");
        ((ArrayList) term1532275).add("oPxuZbkYio");
        ((ArrayList) term1532275).add("vKitydDVnM");
        ((ArrayList) term1532275).add("urCiQnUFBM");
        ((ArrayList) term1532275).add("EKjQdtKxAM");
        HashMap term1532388 = new HashMap();
        Set<Object> term1533832 =  ((Map) term1532388).keySet();
        HashSet term1532387 = new HashSet((Collection<? extends Object>) term1533832);
        HashMap term1532402 = new HashMap();
        HashMap term1532413 = new HashMap();
        Set<Object> term1533833 =  ((Map) term1532413).keySet();
        HashSet term1532412 = new HashSet((Collection<? extends Object>) term1533833);
        term1532131 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata"));
        Object term1532250 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.FeatureSet"));
        setField(term1532131, term1532131.getClass(), "name", "TweMFhxNdj");
        setField(term1532131, term1532131.getClass(), "language", enum2983);
        setField(term1532131, term1532131.getClass(), "languageVersion", "NBrvVzvQHe");
        setField(term1532131, term1532131.getClass(), "type", enum2984);
        setField(term1532131, term1532131.getClass(), "stability", enum2985);
        setField(term1532131, term1532131.getClass(), "libraryFeatures", term1532240);
        setField(term1532250, term1532250.getClass(), "clientModificationFeatures", null);
        setField(term1532250, term1532250.getClass(), "dataTypeFeatures", null);
        setField(term1532250, term1532250.getClass(), "componentsFeatures", null);
        setField(term1532250, term1532250.getClass(), "documentationFeatures", null);
        setField(term1532250, term1532250.getClass(), "globalFeatures", null);
        setField(term1532250, term1532250.getClass(), "schemaFeatures", null);
        setField(term1532250, term1532250.getClass(), "parameterFeatures", null);
        setField(term1532250, term1532250.getClass(), "securityFeatures", null);
        setField(term1532250, term1532250.getClass(), "operationFeatures", null);
        setField(term1532250, term1532250.getClass(), "wireFormatFeatures", null);
        setField(term1532131, term1532131.getClass(), "featureSet", term1532250);
        setField(term1532131, term1532131.getClass(), "generationMessage", "iCCsaLHohG");
        setField(term1532131, term1532131.getClass(), "helpMsg", "NJhGgctbdj");
        setField(term1532131, term1532131.getClass(), "postGenerationMsg", term1532275);
        setField(term1532131, term1532131.getClass(), "reservedWords", term1532387);
        setField(term1532131, term1532131.getClass(), "instantiationTypes", term1532402);
        setField(term1532131, term1532131.getClass(), "languageSpecificPrimitives", term1532412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.generatormetadata.GeneratorMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstantiationTypes", argTypes, term1532131, args);
    }

};


