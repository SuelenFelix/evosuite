package org.openapijsonschematools.codegen.generators.openapimodels;

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
import static org.openapijsonschematools.codegen.generators.openapimodels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.HashMap;

public class CodegenResponse_getSelfOrDeepestRef_20824384990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3759;

    public CodegenResponse_getSelfOrDeepestRef_20824384990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term3760 = new LinkedHashMap();
        HashMap term3899 = new HashMap();
        term3759 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term3788 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term3837 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term3909 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3910 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3911 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3913 = newInstance(Class.forName("java.lang.Object"));
        Object term3914 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3916 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term3759, term3759.getClass(), "description", null);
        setField(term3759, term3759.getClass(), "headers", null);
        setField(term3759, term3759.getClass(), "headersObjectSchema", null);
        setField(term3759, term3759.getClass(), "content", term3760);
        setField(term3788, term3788.getClass(), "ref", null);
        setField(term3788, term3788.getClass(), "refClass", "FTuOcSieav");
        setField(term3788, term3788.getClass(), "refModule", "qSnwPXRuzC");
        setField(term3788, term3788.getClass(), "refModuleLocation", "gqhqalMaKC");
        setField(term3788, term3788.getClass(), "refModuleAlias", "qkMduZHBXR");
        setField(term3759, term3759.getClass(), "refInfo", term3788);
        setField(term3837, term3837.getClass(), "original", "jMQsCLYfKd");
        setBooleanField(term3837, term3837.getClass(), "isValid", false);
        setField(term3837, term3837.getClass(), "snakeCase", "dpcpGqEQLd");
        setField(term3837, term3837.getClass(), "pascalCase", "pButgbcWlR");
        setField(term3837, term3837.getClass(), "camelCase", "tPiZMhJIXj");
        setField(term3837, term3837.getClass(), "kebabCase", "lrEkNimddJ");
        setField(term3759, term3759.getClass(), "jsonPathPiece", term3837);
        setField(term3759, term3759.getClass(), "vendorExtensions", term3899);
        setField(term3910, term3910.getClass(), "comparator", null);
        setField(term3911, term3911.getClass(), "key", "");
        setField(term3911, term3911.getClass(), "value", term3913);
        setField(term3914, term3914.getClass(), "key", null);
        setField(term3914, term3914.getClass(), "value", term3913);
        setField(term3914, term3914.getClass(), "left", null);
        setField(term3914, term3914.getClass(), "right", null);
        setField(term3914, term3914.getClass(), "parent", term3911);
        setBooleanField(term3914, term3914.getClass(), "color", true);
        setField(term3911, term3911.getClass(), "left", term3914);
        setField(term3916, term3916.getClass(), "key", null);
        setField(term3916, term3916.getClass(), "value", term3913);
        setField(term3916, term3916.getClass(), "left", null);
        setField(term3916, term3916.getClass(), "right", null);
        setField(term3916, term3916.getClass(), "parent", term3911);
        setBooleanField(term3916, term3916.getClass(), "color", true);
        setField(term3911, term3911.getClass(), "right", term3916);
        setField(term3911, term3911.getClass(), "parent", null);
        setBooleanField(term3911, term3911.getClass(), "color", true);
        setField(term3910, term3910.getClass(), "root", term3911);
        setIntField(term3910, term3910.getClass(), "size", 4);
        setIntField(term3910, term3910.getClass(), "modCount", 4);
        setField(term3910, term3910.getClass(), "entrySet", null);
        setField(term3910, term3910.getClass(), "navigableKeySet", null);
        setField(term3910, term3910.getClass(), "descendingMap", null);
        setField(term3910, term3910.getClass(), "keySet", null);
        setField(term3910, term3910.getClass(), "values", null);
        setField(term3909, term3909.getClass(), "m", term3910);
        setField(term3759, term3759.getClass(), "imports", term3909);
        setBooleanField(term3759, term3759.getClass(), "componentModule", false);
        setField(term3759, term3759.getClass(), "pathFromDocRoot", "nGYLfZrtWO");
        setField(term3759, term3759.getClass(), "subpackage", "DBufEhhBCQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelfOrDeepestRef", argTypes, term3759, args);
    }

};


