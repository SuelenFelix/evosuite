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

public class CodegenResponse_toString_1963155226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5239;

    public CodegenResponse_toString_1963155226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5240 = new LinkedHashMap();
        HashMap term5379 = new HashMap();
        term5239 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term5268 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term5317 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term5389 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5390 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5391 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5393 = newInstance(Class.forName("java.lang.Object"));
        Object term5394 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5396 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term5239, term5239.getClass(), "description", null);
        setField(term5239, term5239.getClass(), "headers", null);
        setField(term5239, term5239.getClass(), "headersObjectSchema", null);
        setField(term5239, term5239.getClass(), "content", term5240);
        setField(term5268, term5268.getClass(), "ref", null);
        setField(term5268, term5268.getClass(), "refClass", "AQbnQoJwOO");
        setField(term5268, term5268.getClass(), "refModule", "NnicBPzNzw");
        setField(term5268, term5268.getClass(), "refModuleLocation", "WADNPbexnT");
        setField(term5268, term5268.getClass(), "refModuleAlias", "rMbsSfMKvX");
        setField(term5239, term5239.getClass(), "refInfo", term5268);
        setField(term5317, term5317.getClass(), "original", "oCsqRJXMBc");
        setBooleanField(term5317, term5317.getClass(), "isValid", true);
        setField(term5317, term5317.getClass(), "snakeCase", "npPxKNoqdS");
        setField(term5317, term5317.getClass(), "pascalCase", "tGgCtmAQPu");
        setField(term5317, term5317.getClass(), "camelCase", "HokisXXNMR");
        setField(term5317, term5317.getClass(), "kebabCase", "JbtvoXZZHr");
        setField(term5239, term5239.getClass(), "jsonPathPiece", term5317);
        setField(term5239, term5239.getClass(), "vendorExtensions", term5379);
        setField(term5390, term5390.getClass(), "comparator", null);
        setField(term5391, term5391.getClass(), "key", "");
        setField(term5391, term5391.getClass(), "value", term5393);
        setField(term5394, term5394.getClass(), "key", null);
        setField(term5394, term5394.getClass(), "value", term5393);
        setField(term5394, term5394.getClass(), "left", null);
        setField(term5394, term5394.getClass(), "right", null);
        setField(term5394, term5394.getClass(), "parent", term5391);
        setBooleanField(term5394, term5394.getClass(), "color", true);
        setField(term5391, term5391.getClass(), "left", term5394);
        setField(term5396, term5396.getClass(), "key", null);
        setField(term5396, term5396.getClass(), "value", term5393);
        setField(term5396, term5396.getClass(), "left", null);
        setField(term5396, term5396.getClass(), "right", null);
        setField(term5396, term5396.getClass(), "parent", term5391);
        setBooleanField(term5396, term5396.getClass(), "color", false);
        setField(term5391, term5391.getClass(), "right", term5396);
        setField(term5391, term5391.getClass(), "parent", null);
        setBooleanField(term5391, term5391.getClass(), "color", true);
        setField(term5390, term5390.getClass(), "root", term5391);
        setIntField(term5390, term5390.getClass(), "size", 8);
        setIntField(term5390, term5390.getClass(), "modCount", 8);
        setField(term5390, term5390.getClass(), "entrySet", null);
        setField(term5390, term5390.getClass(), "navigableKeySet", null);
        setField(term5390, term5390.getClass(), "descendingMap", null);
        setField(term5390, term5390.getClass(), "keySet", null);
        setField(term5390, term5390.getClass(), "values", null);
        setField(term5389, term5389.getClass(), "m", term5390);
        setField(term5239, term5239.getClass(), "imports", term5389);
        setBooleanField(term5239, term5239.getClass(), "componentModule", false);
        setField(term5239, term5239.getClass(), "pathFromDocRoot", "AaxnITALtd");
        setField(term5239, term5239.getClass(), "subpackage", "RdnRRpWglh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term5239, args);
    }

};


