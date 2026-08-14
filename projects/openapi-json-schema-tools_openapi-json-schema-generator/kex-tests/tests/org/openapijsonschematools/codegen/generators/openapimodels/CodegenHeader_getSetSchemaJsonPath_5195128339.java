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

public class CodegenHeader_getSetSchemaJsonPath_5195128339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3392;

    public CodegenHeader_getSetSchemaJsonPath_5195128339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3405 = new HashMap();
        Boolean term3415 = new Boolean(true);
        LinkedHashMap term3417 = new LinkedHashMap();
        Boolean term3520 = new Boolean(true);
        Boolean term3534 = new Boolean(true);
        term3392 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term3445 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3446 = newInstance(Class.forName("java.util.TreeMap"));
        Object term3447 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3449 = newInstance(Class.forName("java.lang.Object"));
        Object term3450 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3452 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term3458 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term3536 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term3392, term3392.getClass(), "description", null);
        setField(term3392, term3392.getClass(), "example", "YMmtjELJuB");
        setField(term3392, term3392.getClass(), "vendorExtensions", term3405);
        setField(term3392, term3392.getClass(), "required", term3415);
        setField(term3392, term3392.getClass(), "content", term3417);
        setField(term3446, term3446.getClass(), "comparator", null);
        setField(term3447, term3447.getClass(), "key", "");
        setField(term3447, term3447.getClass(), "value", term3449);
        setField(term3450, term3450.getClass(), "key", null);
        setField(term3450, term3450.getClass(), "value", term3449);
        setField(term3450, term3450.getClass(), "left", null);
        setField(term3450, term3450.getClass(), "right", null);
        setField(term3450, term3450.getClass(), "parent", term3447);
        setBooleanField(term3450, term3450.getClass(), "color", true);
        setField(term3447, term3447.getClass(), "left", term3450);
        setField(term3452, term3452.getClass(), "key", null);
        setField(term3452, term3452.getClass(), "value", term3449);
        setField(term3452, term3452.getClass(), "left", null);
        setField(term3452, term3452.getClass(), "right", null);
        setField(term3452, term3452.getClass(), "parent", term3447);
        setBooleanField(term3452, term3452.getClass(), "color", true);
        setField(term3447, term3447.getClass(), "right", term3452);
        setField(term3447, term3447.getClass(), "parent", null);
        setBooleanField(term3447, term3447.getClass(), "color", true);
        setField(term3446, term3446.getClass(), "root", term3447);
        setIntField(term3446, term3446.getClass(), "size", 4);
        setIntField(term3446, term3446.getClass(), "modCount", 4);
        setField(term3446, term3446.getClass(), "entrySet", null);
        setField(term3446, term3446.getClass(), "navigableKeySet", null);
        setField(term3446, term3446.getClass(), "descendingMap", null);
        setField(term3446, term3446.getClass(), "keySet", null);
        setField(term3446, term3446.getClass(), "values", null);
        setField(term3445, term3445.getClass(), "m", term3446);
        setField(term3392, term3392.getClass(), "imports", term3445);
        setBooleanField(term3392, term3392.getClass(), "componentModule", false);
        setField(term3458, term3458.getClass(), "original", "oWBXOvjPUT");
        setBooleanField(term3458, term3458.getClass(), "isValid", true);
        setField(term3458, term3458.getClass(), "snakeCase", "DcKqrrTdId");
        setField(term3458, term3458.getClass(), "pascalCase", "fwtOJhjXbW");
        setField(term3458, term3458.getClass(), "camelCase", "ltWBKZaXwJ");
        setField(term3458, term3458.getClass(), "kebabCase", "FSQpgxQnsH");
        setField(term3392, term3392.getClass(), "jsonPathPiece", term3458);
        setField(term3392, term3392.getClass(), "explode", term3520);
        setField(term3392, term3392.getClass(), "style", "LBPwnVMEpP");
        setField(term3392, term3392.getClass(), "deprecated", term3534);
        setField(term3392, term3392.getClass(), "schema", null);
        setField(term3536, term3536.getClass(), "ref", null);
        setField(term3536, term3536.getClass(), "refClass", "cwALzyQVjH");
        setField(term3536, term3536.getClass(), "refModule", "jlYNjpdkoz");
        setField(term3536, term3536.getClass(), "refModuleLocation", "DZAGnhJkeU");
        setField(term3536, term3536.getClass(), "refModuleAlias", "xQuVexkiVz");
        setField(term3392, term3392.getClass(), "refInfo", term3536);
        setField(term3392, term3392.getClass(), "subpackage", "LqNgPziYtv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wiDfuaXnrP";
        callMethod(klass, "getSetSchemaJsonPath", argTypes, term3392, args);
    }

};


