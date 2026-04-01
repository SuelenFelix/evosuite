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

public class CodegenHeader_toString_10611472746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2421;

    public CodegenHeader_toString_10611472746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2434 = new HashMap();
        Boolean term2444 = new Boolean(false);
        LinkedHashMap term2446 = new LinkedHashMap();
        Boolean term2549 = new Boolean(true);
        Boolean term2563 = new Boolean(false);
        term2421 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term2474 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2475 = newInstance(Class.forName("java.util.TreeMap"));
        Object term2476 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2478 = newInstance(Class.forName("java.lang.Object"));
        Object term2479 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2481 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term2487 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term2565 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term2421, term2421.getClass(), "description", null);
        setField(term2421, term2421.getClass(), "example", "pLbTzSMbsN");
        setField(term2421, term2421.getClass(), "vendorExtensions", term2434);
        setField(term2421, term2421.getClass(), "required", term2444);
        setField(term2421, term2421.getClass(), "content", term2446);
        setField(term2475, term2475.getClass(), "comparator", null);
        setField(term2476, term2476.getClass(), "key", "");
        setField(term2476, term2476.getClass(), "value", term2478);
        setField(term2479, term2479.getClass(), "key", null);
        setField(term2479, term2479.getClass(), "value", term2478);
        setField(term2479, term2479.getClass(), "left", null);
        setField(term2479, term2479.getClass(), "right", null);
        setField(term2479, term2479.getClass(), "parent", term2476);
        setBooleanField(term2479, term2479.getClass(), "color", true);
        setField(term2476, term2476.getClass(), "left", term2479);
        setField(term2481, term2481.getClass(), "key", null);
        setField(term2481, term2481.getClass(), "value", term2478);
        setField(term2481, term2481.getClass(), "left", null);
        setField(term2481, term2481.getClass(), "right", null);
        setField(term2481, term2481.getClass(), "parent", term2476);
        setBooleanField(term2481, term2481.getClass(), "color", false);
        setField(term2476, term2476.getClass(), "right", term2481);
        setField(term2476, term2476.getClass(), "parent", null);
        setBooleanField(term2476, term2476.getClass(), "color", true);
        setField(term2475, term2475.getClass(), "root", term2476);
        setIntField(term2475, term2475.getClass(), "size", 7);
        setIntField(term2475, term2475.getClass(), "modCount", 7);
        setField(term2475, term2475.getClass(), "entrySet", null);
        setField(term2475, term2475.getClass(), "navigableKeySet", null);
        setField(term2475, term2475.getClass(), "descendingMap", null);
        setField(term2475, term2475.getClass(), "keySet", null);
        setField(term2475, term2475.getClass(), "values", null);
        setField(term2474, term2474.getClass(), "m", term2475);
        setField(term2421, term2421.getClass(), "imports", term2474);
        setBooleanField(term2421, term2421.getClass(), "componentModule", false);
        setField(term2487, term2487.getClass(), "original", "DbZKLwYBgy");
        setBooleanField(term2487, term2487.getClass(), "isValid", false);
        setField(term2487, term2487.getClass(), "snakeCase", "LnNRVsjmxw");
        setField(term2487, term2487.getClass(), "pascalCase", "PlOnDkNrvX");
        setField(term2487, term2487.getClass(), "camelCase", "MltgFGldop");
        setField(term2487, term2487.getClass(), "kebabCase", "JCWSoxnBJs");
        setField(term2421, term2421.getClass(), "jsonPathPiece", term2487);
        setField(term2421, term2421.getClass(), "explode", term2549);
        setField(term2421, term2421.getClass(), "style", "vAxcpvjEEa");
        setField(term2421, term2421.getClass(), "deprecated", term2563);
        setField(term2421, term2421.getClass(), "schema", null);
        setField(term2565, term2565.getClass(), "ref", null);
        setField(term2565, term2565.getClass(), "refClass", "FCkOgIBqXE");
        setField(term2565, term2565.getClass(), "refModule", "kadRHthQRD");
        setField(term2565, term2565.getClass(), "refModuleLocation", "cGbJSRSpNn");
        setField(term2565, term2565.getClass(), "refModuleAlias", "MzXzaqaiHW");
        setField(term2421, term2421.getClass(), "refInfo", term2565);
        setField(term2421, term2421.getClass(), "subpackage", "jWOWtrhVkA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2421, args);
    }

};


