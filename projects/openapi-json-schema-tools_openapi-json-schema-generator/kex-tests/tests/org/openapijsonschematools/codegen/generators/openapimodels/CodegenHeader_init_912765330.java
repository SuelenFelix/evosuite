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
import java.lang.Boolean;
import java.lang.Object;
import java.util.HashMap;

public class CodegenHeader_init_912765330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term71;
     Object term73;
     Object term195;
     Object term199;
     Object term201;
     Object term263;
     Object term277;
     Object term279;

    public CodegenHeader_init_912765330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = new LinkedHashMap();
        term71 = new Boolean(false);
        term73 = new LinkedHashMap();
        term195 = newInstance(Class.forName("java.util.TreeSet"));
        Object term196 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term196, term196.getClass(), "comparator", null);
        setField(term196, term196.getClass(), "root", null);
        setIntField(term196, term196.getClass(), "size", 0);
        setIntField(term196, term196.getClass(), "modCount", 0);
        setField(term196, term196.getClass(), "entrySet", null);
        setField(term196, term196.getClass(), "navigableKeySet", null);
        setField(term196, term196.getClass(), "descendingMap", null);
        setField(term196, term196.getClass(), "keySet", null);
        setField(term196, term196.getClass(), "values", null);
        setField(term195, term195.getClass(), "m", term196);
        term199 = new Boolean(false);
        term201 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        setField(term201, term201.getClass(), "original", "ONcbPCQnHd");
        setBooleanField(term201, term201.getClass(), "isValid", true);
        setField(term201, term201.getClass(), "snakeCase", "AobDaplFLl");
        setField(term201, term201.getClass(), "pascalCase", "pDkMNnAGgv");
        setField(term201, term201.getClass(), "camelCase", "PaCpFXGzdX");
        setField(term201, term201.getClass(), "kebabCase", "FftYCNbnks");
        term263 = new Boolean(true);
        term277 = new Boolean(true);
        HashMap term293 = new HashMap();
        Boolean term301 = new Boolean(true);
        LinkedHashMap term303 = new LinkedHashMap();
        Boolean term384 = new Boolean(true);
        Boolean term398 = new Boolean(true);
        term279 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term280 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term315 = newInstance(Class.forName("java.util.TreeSet"));
        Object term316 = newInstance(Class.forName("java.util.TreeMap"));
        Object term317 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term322 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term400 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term280, term280.getClass(), "description", null);
        setField(term280, term280.getClass(), "example", "EkgprvqZlM");
        setField(term280, term280.getClass(), "vendorExtensions", term293);
        setField(term280, term280.getClass(), "required", term301);
        setField(term280, term280.getClass(), "content", term303);
        setField(term316, term316.getClass(), "comparator", null);
        setField(term317, term317.getClass(), "key", null);
        setField(term317, term317.getClass(), "value", null);
        setField(term317, term317.getClass(), "left", null);
        setField(term317, term317.getClass(), "right", null);
        setField(term317, term317.getClass(), "parent", null);
        setBooleanField(term317, term317.getClass(), "color", true);
        setField(term316, term316.getClass(), "root", term317);
        setIntField(term316, term316.getClass(), "size", 6);
        setIntField(term316, term316.getClass(), "modCount", 6);
        setField(term316, term316.getClass(), "entrySet", null);
        setField(term316, term316.getClass(), "navigableKeySet", null);
        setField(term316, term316.getClass(), "descendingMap", null);
        setField(term316, term316.getClass(), "keySet", null);
        setField(term316, term316.getClass(), "values", null);
        setField(term315, term315.getClass(), "m", term316);
        setField(term280, term280.getClass(), "imports", term315);
        setBooleanField(term280, term280.getClass(), "componentModule", true);
        setField(term322, term322.getClass(), "original", "MpJsPKLTIU");
        setBooleanField(term322, term322.getClass(), "isValid", true);
        setField(term322, term322.getClass(), "snakeCase", "IiNCZfdouL");
        setField(term322, term322.getClass(), "pascalCase", "AhOHzCsHKW");
        setField(term322, term322.getClass(), "camelCase", "UqgLPaaAHi");
        setField(term322, term322.getClass(), "kebabCase", "xypryEkUPF");
        setField(term280, term280.getClass(), "jsonPathPiece", term322);
        setField(term280, term280.getClass(), "explode", term384);
        setField(term280, term280.getClass(), "style", "zyZTzHNjQr");
        setField(term280, term280.getClass(), "deprecated", term398);
        setField(term280, term280.getClass(), "schema", null);
        setField(term400, term400.getClass(), "ref", null);
        setField(term400, term400.getClass(), "refClass", "YSrFKQQwXE");
        setField(term400, term400.getClass(), "refModule", "qxhOsmyyjm");
        setField(term400, term400.getClass(), "refModuleLocation", "DuKcNfVVYR");
        setField(term400, term400.getClass(), "refModuleAlias", "fRujHWvXjJ");
        setField(term280, term280.getClass(), "refInfo", term400);
        setField(term280, term280.getClass(), "subpackage", "EAIAAStlTz");
        setField(term279, term279.getClass(), "ref", term280);
        setField(term279, term279.getClass(), "refClass", "yIWXcOQTgy");
        setField(term279, term279.getClass(), "refModule", "xAWekqanqc");
        setField(term279, term279.getClass(), "refModuleLocation", "GSOWFHMlbF");
        setField(term279, term279.getClass(), "refModuleAlias", "vpZIqpFbKM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[14];
        argTypes[0] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenText");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Map");
        argTypes[3] = Class.forName("java.lang.Boolean");
        argTypes[4] = Class.forName("java.util.LinkedHashMap");
        argTypes[5] = Class.forName("java.util.TreeSet");
        argTypes[6] = boolean.class;
        argTypes[7] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey");
        argTypes[8] = Class.forName("java.lang.Boolean");
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = Class.forName("java.lang.Boolean");
        argTypes[11] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenSchema");
        argTypes[12] = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo");
        argTypes[13] = Class.forName("java.lang.String");
        Object[] args = new Object[14];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = term13;
        args[3] = term71;
        args[4] = term73;
        args[5] = term195;
        args[6] = term199;
        args[7] = term201;
        args[8] = term263;
        args[9] = "lJoltmsadS";
        args[10] = term277;
        args[11] = null;
        args[12] = term279;
        args[13] = "dAbwpJCDif";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


