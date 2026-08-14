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

public class CodegenHeader_addInstanceInfo_11751719135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2060;
     Object term2265;

    public CodegenHeader_addInstanceInfo_11751719135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2073 = new HashMap();
        Boolean term2083 = new Boolean(false);
        LinkedHashMap term2085 = new LinkedHashMap();
        Boolean term2188 = new Boolean(true);
        Boolean term2202 = new Boolean(true);
        term2060 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term2113 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2114 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2115 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2117 = newInstance(Class.forName("java.lang.Object"));
        Object term2118 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2120 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2126 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term2204 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term2060, term2060.getClass(), "description", null);
        setField(term2060, term2060.getClass(), "example", "VJgREHwfRM");
        setField(term2060, term2060.getClass(), "vendorExtensions", term2073);
        setField(term2060, term2060.getClass(), "required", term2083);
        setField(term2060, term2060.getClass(), "content", term2085);
        setField(term2114, term2114.getClass(), "comparator", null);
        setField(term2115, term2115.getClass(), "key", "");
        setField(term2115, term2115.getClass(), "value", term2117);
        setField(term2118, term2118.getClass(), "key", null);
        setField(term2118, term2118.getClass(), "value", term2117);
        setField(term2118, term2118.getClass(), "left", null);
        setField(term2118, term2118.getClass(), "right", null);
        setField(term2118, term2118.getClass(), "parent", term2115);
        setBooleanField(term2118, term2118.getClass(), "color", true);
        setField(term2115, term2115.getClass(), "left", term2118);
        setField(term2120, term2120.getClass(), "key", null);
        setField(term2120, term2120.getClass(), "value", term2117);
        setField(term2120, term2120.getClass(), "left", null);
        setField(term2120, term2120.getClass(), "right", null);
        setField(term2120, term2120.getClass(), "parent", term2115);
        setBooleanField(term2120, term2120.getClass(), "color", true);
        setField(term2115, term2115.getClass(), "right", term2120);
        setField(term2115, term2115.getClass(), "parent", null);
        setBooleanField(term2115, term2115.getClass(), "color", true);
        setField(term2114, term2114.getClass(), "root", term2115);
        setIntField(term2114, term2114.getClass(), "size", 5);
        setIntField(term2114, term2114.getClass(), "modCount", 5);
        setField(term2114, term2114.getClass(), "entrySet", null);
        setField(term2114, term2114.getClass(), "navigableKeySet", null);
        setField(term2114, term2114.getClass(), "descendingMap", null);
        setField(term2114, term2114.getClass(), "keySet", null);
        setField(term2114, term2114.getClass(), "values", null);
        setField(term2113, term2113.getClass(), "m", term2114);
        setField(term2060, term2060.getClass(), "imports", term2113);
        setBooleanField(term2060, term2060.getClass(), "componentModule", false);
        setField(term2126, term2126.getClass(), "original", "XeSDJYKMBf");
        setBooleanField(term2126, term2126.getClass(), "isValid", true);
        setField(term2126, term2126.getClass(), "snakeCase", "tIsFcOGTUX");
        setField(term2126, term2126.getClass(), "pascalCase", "XUVRcnELFP");
        setField(term2126, term2126.getClass(), "camelCase", "xIeSbezmkD");
        setField(term2126, term2126.getClass(), "kebabCase", "txUWLZRkSv");
        setField(term2060, term2060.getClass(), "jsonPathPiece", term2126);
        setField(term2060, term2060.getClass(), "explode", term2188);
        setField(term2060, term2060.getClass(), "style", "gHRMJRsBGm");
        setField(term2060, term2060.getClass(), "deprecated", term2202);
        setField(term2060, term2060.getClass(), "schema", null);
        setField(term2204, term2204.getClass(), "ref", null);
        setField(term2204, term2204.getClass(), "refClass", "rZyrfnMvHa");
        setField(term2204, term2204.getClass(), "refModule", "GMyMhTZeDC");
        setField(term2204, term2204.getClass(), "refModuleLocation", "KqQOTshBOL");
        setField(term2204, term2204.getClass(), "refModuleAlias", "cuWgFcYkPC");
        setField(term2060, term2060.getClass(), "refInfo", term2204);
        setField(term2060, term2060.getClass(), "subpackage", "HfbcOKkXBm");
        term2265 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term2266 = (byte[]) newByteArray(16);
        setField(term2265, term2265.getClass(), "value", term2266);
        setByteField(term2265, term2265.getClass(), "coder", (byte) 47);
        setIntField(term2265, term2265.getClass(), "count", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term2265;
        callMethod(klass, "addInstanceInfo", argTypes, term2060, args);
    }

};


