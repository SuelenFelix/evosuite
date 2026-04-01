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
import java.util.HashMap;
import java.lang.Boolean;
import java.util.LinkedHashMap;
import java.lang.Object;

public class CodegenHeader_getDeepestRef_20300330707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2746;

    public CodegenHeader_getDeepestRef_20300330707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2759 = new HashMap();
        Boolean term2769 = new Boolean(false);
        LinkedHashMap term2771 = new LinkedHashMap();
        Boolean term2870 = new Boolean(true);
        Boolean term2884 = new Boolean(true);
        term2746 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term2799 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2800 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2801 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2803 = newInstance(Class.forName("java.lang.Object"));
        Object term2808 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term2886 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term2746, term2746.getClass(), "description", null);
        setField(term2746, term2746.getClass(), "example", "IyOhWYyaDV");
        setField(term2746, term2746.getClass(), "vendorExtensions", term2759);
        setField(term2746, term2746.getClass(), "required", term2769);
        setField(term2746, term2746.getClass(), "content", term2771);
        setField(term2800, term2800.getClass(), "comparator", null);
        setField(term2801, term2801.getClass(), "key", "");
        setField(term2801, term2801.getClass(), "value", term2803);
        setField(term2801, term2801.getClass(), "left", null);
        setField(term2801, term2801.getClass(), "right", null);
        setField(term2801, term2801.getClass(), "parent", null);
        setBooleanField(term2801, term2801.getClass(), "color", true);
        setField(term2800, term2800.getClass(), "root", term2801);
        setIntField(term2800, term2800.getClass(), "size", 1);
        setIntField(term2800, term2800.getClass(), "modCount", 1);
        setField(term2800, term2800.getClass(), "entrySet", null);
        setField(term2800, term2800.getClass(), "navigableKeySet", null);
        setField(term2800, term2800.getClass(), "descendingMap", null);
        setField(term2800, term2800.getClass(), "keySet", null);
        setField(term2800, term2800.getClass(), "values", null);
        setField(term2799, term2799.getClass(), "m", term2800);
        setField(term2746, term2746.getClass(), "imports", term2799);
        setBooleanField(term2746, term2746.getClass(), "componentModule", false);
        setField(term2808, term2808.getClass(), "original", "UMMXkhuqzw");
        setBooleanField(term2808, term2808.getClass(), "isValid", false);
        setField(term2808, term2808.getClass(), "snakeCase", "KyGXZcXJwq");
        setField(term2808, term2808.getClass(), "pascalCase", "TqiCjeuoWE");
        setField(term2808, term2808.getClass(), "camelCase", "GWWfkXOYLP");
        setField(term2808, term2808.getClass(), "kebabCase", "qvykDllgpT");
        setField(term2746, term2746.getClass(), "jsonPathPiece", term2808);
        setField(term2746, term2746.getClass(), "explode", term2870);
        setField(term2746, term2746.getClass(), "style", "hzdUbcLZhZ");
        setField(term2746, term2746.getClass(), "deprecated", term2884);
        setField(term2746, term2746.getClass(), "schema", null);
        setField(term2886, term2886.getClass(), "ref", null);
        setField(term2886, term2886.getClass(), "refClass", "GlxnEJvYeC");
        setField(term2886, term2886.getClass(), "refModule", "SLdOGaqmNv");
        setField(term2886, term2886.getClass(), "refModuleLocation", "QZfhwDBzyR");
        setField(term2886, term2886.getClass(), "refModuleAlias", "HvnMmAOZev");
        setField(term2746, term2746.getClass(), "refInfo", term2886);
        setField(term2746, term2746.getClass(), "subpackage", "JTPAQsfRtT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeepestRef", argTypes, term2746, args);
    }

};


