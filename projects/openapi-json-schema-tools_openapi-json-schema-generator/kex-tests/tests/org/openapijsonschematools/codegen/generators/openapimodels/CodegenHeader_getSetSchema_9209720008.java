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

public class CodegenHeader_getSetSchema_9209720008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3067;

    public CodegenHeader_getSetSchema_9209720008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3080 = new HashMap();
        Boolean term3090 = new Boolean(true);
        LinkedHashMap term3092 = new LinkedHashMap();
        Boolean term3195 = new Boolean(false);
        Boolean term3209 = new Boolean(true);
        term3067 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term3120 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3121 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3122 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3124 = newInstance(Class.forName("java.lang.Object"));
        Object term3125 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3127 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3133 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term3211 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term3067, term3067.getClass(), "description", null);
        setField(term3067, term3067.getClass(), "example", "otxkkKfDfl");
        setField(term3067, term3067.getClass(), "vendorExtensions", term3080);
        setField(term3067, term3067.getClass(), "required", term3090);
        setField(term3067, term3067.getClass(), "content", term3092);
        setField(term3121, term3121.getClass(), "comparator", null);
        setField(term3122, term3122.getClass(), "key", "");
        setField(term3122, term3122.getClass(), "value", term3124);
        setField(term3125, term3125.getClass(), "key", null);
        setField(term3125, term3125.getClass(), "value", term3124);
        setField(term3125, term3125.getClass(), "left", null);
        setField(term3125, term3125.getClass(), "right", null);
        setField(term3125, term3125.getClass(), "parent", term3122);
        setBooleanField(term3125, term3125.getClass(), "color", true);
        setField(term3122, term3122.getClass(), "left", term3125);
        setField(term3127, term3127.getClass(), "key", null);
        setField(term3127, term3127.getClass(), "value", term3124);
        setField(term3127, term3127.getClass(), "left", null);
        setField(term3127, term3127.getClass(), "right", null);
        setField(term3127, term3127.getClass(), "parent", term3122);
        setBooleanField(term3127, term3127.getClass(), "color", true);
        setField(term3122, term3122.getClass(), "right", term3127);
        setField(term3122, term3122.getClass(), "parent", null);
        setBooleanField(term3122, term3122.getClass(), "color", true);
        setField(term3121, term3121.getClass(), "root", term3122);
        setIntField(term3121, term3121.getClass(), "size", 5);
        setIntField(term3121, term3121.getClass(), "modCount", 5);
        setField(term3121, term3121.getClass(), "entrySet", null);
        setField(term3121, term3121.getClass(), "navigableKeySet", null);
        setField(term3121, term3121.getClass(), "descendingMap", null);
        setField(term3121, term3121.getClass(), "keySet", null);
        setField(term3121, term3121.getClass(), "values", null);
        setField(term3120, term3120.getClass(), "m", term3121);
        setField(term3067, term3067.getClass(), "imports", term3120);
        setBooleanField(term3067, term3067.getClass(), "componentModule", true);
        setField(term3133, term3133.getClass(), "original", "yXLTfzOgfX");
        setBooleanField(term3133, term3133.getClass(), "isValid", false);
        setField(term3133, term3133.getClass(), "snakeCase", "MANlfBKTPY");
        setField(term3133, term3133.getClass(), "pascalCase", "mRoEmuCJhW");
        setField(term3133, term3133.getClass(), "camelCase", "JJUWbMXpyM");
        setField(term3133, term3133.getClass(), "kebabCase", "KDrRQWVXok");
        setField(term3067, term3067.getClass(), "jsonPathPiece", term3133);
        setField(term3067, term3067.getClass(), "explode", term3195);
        setField(term3067, term3067.getClass(), "style", "oOOwvWgxtf");
        setField(term3067, term3067.getClass(), "deprecated", term3209);
        setField(term3067, term3067.getClass(), "schema", null);
        setField(term3211, term3211.getClass(), "ref", null);
        setField(term3211, term3211.getClass(), "refClass", "ywoADeiUfF");
        setField(term3211, term3211.getClass(), "refModule", "loHiudJxbt");
        setField(term3211, term3211.getClass(), "refModuleLocation", "lRbxbybNew");
        setField(term3211, term3211.getClass(), "refModuleAlias", "WzGudiEARD");
        setField(term3067, term3067.getClass(), "refInfo", term3211);
        setField(term3067, term3067.getClass(), "subpackage", "IoefPqGtaj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSetSchema", argTypes, term3067, args);
    }

};


