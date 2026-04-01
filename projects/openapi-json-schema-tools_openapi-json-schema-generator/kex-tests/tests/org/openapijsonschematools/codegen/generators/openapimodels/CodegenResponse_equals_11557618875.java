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

public class CodegenResponse_equals_11557618875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4941;
     Object term5128;

    public CodegenResponse_equals_11557618875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4942 = new LinkedHashMap();
        HashMap term5081 = new HashMap();
        term4941 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term4970 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term5019 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term5091 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5092 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5093 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5095 = newInstance(Class.forName("java.lang.Object"));
        Object term5096 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5098 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4941, term4941.getClass(), "description", null);
        setField(term4941, term4941.getClass(), "headers", null);
        setField(term4941, term4941.getClass(), "headersObjectSchema", null);
        setField(term4941, term4941.getClass(), "content", term4942);
        setField(term4970, term4970.getClass(), "ref", null);
        setField(term4970, term4970.getClass(), "refClass", "lNbVasLAKL");
        setField(term4970, term4970.getClass(), "refModule", "wKeyHBCSLZ");
        setField(term4970, term4970.getClass(), "refModuleLocation", "iQCLduwSPi");
        setField(term4970, term4970.getClass(), "refModuleAlias", "ZcODLNhxqg");
        setField(term4941, term4941.getClass(), "refInfo", term4970);
        setField(term5019, term5019.getClass(), "original", "iNtHOROBMq");
        setBooleanField(term5019, term5019.getClass(), "isValid", true);
        setField(term5019, term5019.getClass(), "snakeCase", "GbvfbbsrOl");
        setField(term5019, term5019.getClass(), "pascalCase", "IIZlqzOmtY");
        setField(term5019, term5019.getClass(), "camelCase", "iRFRSxtnkr");
        setField(term5019, term5019.getClass(), "kebabCase", "iGWkLjLGBY");
        setField(term4941, term4941.getClass(), "jsonPathPiece", term5019);
        setField(term4941, term4941.getClass(), "vendorExtensions", term5081);
        setField(term5092, term5092.getClass(), "comparator", null);
        setField(term5093, term5093.getClass(), "key", "");
        setField(term5093, term5093.getClass(), "value", term5095);
        setField(term5096, term5096.getClass(), "key", null);
        setField(term5096, term5096.getClass(), "value", term5095);
        setField(term5096, term5096.getClass(), "left", null);
        setField(term5096, term5096.getClass(), "right", null);
        setField(term5096, term5096.getClass(), "parent", term5093);
        setBooleanField(term5096, term5096.getClass(), "color", true);
        setField(term5093, term5093.getClass(), "left", term5096);
        setField(term5098, term5098.getClass(), "key", null);
        setField(term5098, term5098.getClass(), "value", term5095);
        setField(term5098, term5098.getClass(), "left", null);
        setField(term5098, term5098.getClass(), "right", null);
        setField(term5098, term5098.getClass(), "parent", term5093);
        setBooleanField(term5098, term5098.getClass(), "color", true);
        setField(term5093, term5093.getClass(), "right", term5098);
        setField(term5093, term5093.getClass(), "parent", null);
        setBooleanField(term5093, term5093.getClass(), "color", true);
        setField(term5092, term5092.getClass(), "root", term5093);
        setIntField(term5092, term5092.getClass(), "size", 5);
        setIntField(term5092, term5092.getClass(), "modCount", 5);
        setField(term5092, term5092.getClass(), "entrySet", null);
        setField(term5092, term5092.getClass(), "navigableKeySet", null);
        setField(term5092, term5092.getClass(), "descendingMap", null);
        setField(term5092, term5092.getClass(), "keySet", null);
        setField(term5092, term5092.getClass(), "values", null);
        setField(term5091, term5091.getClass(), "m", term5092);
        setField(term4941, term4941.getClass(), "imports", term5091);
        setBooleanField(term4941, term4941.getClass(), "componentModule", false);
        setField(term4941, term4941.getClass(), "pathFromDocRoot", "SbTxRdDQQc");
        setField(term4941, term4941.getClass(), "subpackage", "MrVdoUYAdO");
        term5128 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5128;
        callMethod(klass, "equals", argTypes, term4941, args);
    }

};


