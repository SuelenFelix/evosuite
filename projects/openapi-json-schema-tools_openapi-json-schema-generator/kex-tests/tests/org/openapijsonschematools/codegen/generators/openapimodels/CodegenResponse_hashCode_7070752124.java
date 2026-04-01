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

public class CodegenResponse_hashCode_7070752124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4644;

    public CodegenResponse_hashCode_7070752124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4645 = new LinkedHashMap();
        HashMap term4784 = new HashMap();
        term4644 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term4673 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term4722 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term4794 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4795 = newInstance(Class.forName("java.util.TreeMap"));
        Object term4796 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4798 = newInstance(Class.forName("java.lang.Object"));
        Object term4799 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term4801 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term4644, term4644.getClass(), "description", null);
        setField(term4644, term4644.getClass(), "headers", null);
        setField(term4644, term4644.getClass(), "headersObjectSchema", null);
        setField(term4644, term4644.getClass(), "content", term4645);
        setField(term4673, term4673.getClass(), "ref", null);
        setField(term4673, term4673.getClass(), "refClass", "YaWdTQZkTw");
        setField(term4673, term4673.getClass(), "refModule", "QqsjlsXtmm");
        setField(term4673, term4673.getClass(), "refModuleLocation", "FuWUjAYXxz");
        setField(term4673, term4673.getClass(), "refModuleAlias", "rKIvvYydou");
        setField(term4644, term4644.getClass(), "refInfo", term4673);
        setField(term4722, term4722.getClass(), "original", "KNgeIkQoef");
        setBooleanField(term4722, term4722.getClass(), "isValid", false);
        setField(term4722, term4722.getClass(), "snakeCase", "MeMWAHyjMR");
        setField(term4722, term4722.getClass(), "pascalCase", "lTuLOcnSnJ");
        setField(term4722, term4722.getClass(), "camelCase", "govbBrRstA");
        setField(term4722, term4722.getClass(), "kebabCase", "zSMUNzRRyM");
        setField(term4644, term4644.getClass(), "jsonPathPiece", term4722);
        setField(term4644, term4644.getClass(), "vendorExtensions", term4784);
        setField(term4795, term4795.getClass(), "comparator", null);
        setField(term4796, term4796.getClass(), "key", "");
        setField(term4796, term4796.getClass(), "value", term4798);
        setField(term4799, term4799.getClass(), "key", null);
        setField(term4799, term4799.getClass(), "value", term4798);
        setField(term4799, term4799.getClass(), "left", null);
        setField(term4799, term4799.getClass(), "right", null);
        setField(term4799, term4799.getClass(), "parent", term4796);
        setBooleanField(term4799, term4799.getClass(), "color", false);
        setField(term4796, term4796.getClass(), "left", term4799);
        setField(term4801, term4801.getClass(), "key", null);
        setField(term4801, term4801.getClass(), "value", term4798);
        setField(term4801, term4801.getClass(), "left", null);
        setField(term4801, term4801.getClass(), "right", null);
        setField(term4801, term4801.getClass(), "parent", term4796);
        setBooleanField(term4801, term4801.getClass(), "color", false);
        setField(term4796, term4796.getClass(), "right", term4801);
        setField(term4796, term4796.getClass(), "parent", null);
        setBooleanField(term4796, term4796.getClass(), "color", true);
        setField(term4795, term4795.getClass(), "root", term4796);
        setIntField(term4795, term4795.getClass(), "size", 9);
        setIntField(term4795, term4795.getClass(), "modCount", 9);
        setField(term4795, term4795.getClass(), "entrySet", null);
        setField(term4795, term4795.getClass(), "navigableKeySet", null);
        setField(term4795, term4795.getClass(), "descendingMap", null);
        setField(term4795, term4795.getClass(), "keySet", null);
        setField(term4795, term4795.getClass(), "values", null);
        setField(term4794, term4794.getClass(), "m", term4795);
        setField(term4644, term4644.getClass(), "imports", term4794);
        setBooleanField(term4644, term4644.getClass(), "componentModule", true);
        setField(term4644, term4644.getClass(), "pathFromDocRoot", "CUagRkEuzN");
        setField(term4644, term4644.getClass(), "subpackage", "eWIWfWobXm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term4644, args);
    }

};


