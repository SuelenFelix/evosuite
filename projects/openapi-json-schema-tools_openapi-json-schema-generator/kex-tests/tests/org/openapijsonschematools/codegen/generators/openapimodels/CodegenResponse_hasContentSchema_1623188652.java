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

public class CodegenResponse_hasContentSchema_1623188652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4058;

    public CodegenResponse_hasContentSchema_1623188652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4059 = new LinkedHashMap();
        HashMap term4198 = new HashMap();
        term4058 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term4087 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term4136 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term4208 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4209 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4210 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4212 = newInstance(Class.forName("java.lang.Object"));
        Object term4213 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4215 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4058, term4058.getClass(), "description", null);
        setField(term4058, term4058.getClass(), "headers", null);
        setField(term4058, term4058.getClass(), "headersObjectSchema", null);
        setField(term4058, term4058.getClass(), "content", term4059);
        setField(term4087, term4087.getClass(), "ref", null);
        setField(term4087, term4087.getClass(), "refClass", "ScztqspySK");
        setField(term4087, term4087.getClass(), "refModule", "IvYxGwWoVu");
        setField(term4087, term4087.getClass(), "refModuleLocation", "XnZHOhTfxL");
        setField(term4087, term4087.getClass(), "refModuleAlias", "oFBhNamtAs");
        setField(term4058, term4058.getClass(), "refInfo", term4087);
        setField(term4136, term4136.getClass(), "original", "YURcpRjwSt");
        setBooleanField(term4136, term4136.getClass(), "isValid", false);
        setField(term4136, term4136.getClass(), "snakeCase", "SXMdNSGPog");
        setField(term4136, term4136.getClass(), "pascalCase", "vsqwOLpDjj");
        setField(term4136, term4136.getClass(), "camelCase", "rJgXQRsPCl");
        setField(term4136, term4136.getClass(), "kebabCase", "RgqpoBknjN");
        setField(term4058, term4058.getClass(), "jsonPathPiece", term4136);
        setField(term4058, term4058.getClass(), "vendorExtensions", term4198);
        setField(term4209, term4209.getClass(), "comparator", null);
        setField(term4210, term4210.getClass(), "key", "");
        setField(term4210, term4210.getClass(), "value", term4212);
        setField(term4213, term4213.getClass(), "key", null);
        setField(term4213, term4213.getClass(), "value", term4212);
        setField(term4213, term4213.getClass(), "left", null);
        setField(term4213, term4213.getClass(), "right", null);
        setField(term4213, term4213.getClass(), "parent", term4210);
        setBooleanField(term4213, term4213.getClass(), "color", true);
        setField(term4210, term4210.getClass(), "left", term4213);
        setField(term4215, term4215.getClass(), "key", null);
        setField(term4215, term4215.getClass(), "value", term4212);
        setField(term4215, term4215.getClass(), "left", null);
        setField(term4215, term4215.getClass(), "right", null);
        setField(term4215, term4215.getClass(), "parent", term4210);
        setBooleanField(term4215, term4215.getClass(), "color", false);
        setField(term4210, term4210.getClass(), "right", term4215);
        setField(term4210, term4210.getClass(), "parent", null);
        setBooleanField(term4210, term4210.getClass(), "color", true);
        setField(term4209, term4209.getClass(), "root", term4210);
        setIntField(term4209, term4209.getClass(), "size", 9);
        setIntField(term4209, term4209.getClass(), "modCount", 9);
        setField(term4209, term4209.getClass(), "entrySet", null);
        setField(term4209, term4209.getClass(), "navigableKeySet", null);
        setField(term4209, term4209.getClass(), "descendingMap", null);
        setField(term4209, term4209.getClass(), "keySet", null);
        setField(term4209, term4209.getClass(), "values", null);
        setField(term4208, term4208.getClass(), "m", term4209);
        setField(term4058, term4058.getClass(), "imports", term4208);
        setBooleanField(term4058, term4058.getClass(), "componentModule", true);
        setField(term4058, term4058.getClass(), "pathFromDocRoot", "JiSIFtJnYv");
        setField(term4058, term4058.getClass(), "subpackage", "wxAHQRVgKc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasContentSchema", argTypes, term4058, args);
    }

};


