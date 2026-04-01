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

public class CodegenResponse_pathFromDocRoot_19885544638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5833;

    public CodegenResponse_pathFromDocRoot_19885544638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5834 = new LinkedHashMap();
        HashMap term5973 = new HashMap();
        term5833 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term5862 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term5911 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term5983 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5984 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5985 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5987 = newInstance(Class.forName("java.lang.Object"));
        Object term5988 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5990 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term5833, term5833.getClass(), "description", null);
        setField(term5833, term5833.getClass(), "headers", null);
        setField(term5833, term5833.getClass(), "headersObjectSchema", null);
        setField(term5833, term5833.getClass(), "content", term5834);
        setField(term5862, term5862.getClass(), "ref", null);
        setField(term5862, term5862.getClass(), "refClass", "TydzbTXvbY");
        setField(term5862, term5862.getClass(), "refModule", "yNogNNecFu");
        setField(term5862, term5862.getClass(), "refModuleLocation", "tcaaotqgDF");
        setField(term5862, term5862.getClass(), "refModuleAlias", "bXInWdOeyi");
        setField(term5833, term5833.getClass(), "refInfo", term5862);
        setField(term5911, term5911.getClass(), "original", "HdwopulXkf");
        setBooleanField(term5911, term5911.getClass(), "isValid", true);
        setField(term5911, term5911.getClass(), "snakeCase", "FuCKfgAhpC");
        setField(term5911, term5911.getClass(), "pascalCase", "gqMysJhxfA");
        setField(term5911, term5911.getClass(), "camelCase", "HtLEppUqzI");
        setField(term5911, term5911.getClass(), "kebabCase", "bVlRrMQeRY");
        setField(term5833, term5833.getClass(), "jsonPathPiece", term5911);
        setField(term5833, term5833.getClass(), "vendorExtensions", term5973);
        setField(term5984, term5984.getClass(), "comparator", null);
        setField(term5985, term5985.getClass(), "key", "");
        setField(term5985, term5985.getClass(), "value", term5987);
        setField(term5988, term5988.getClass(), "key", null);
        setField(term5988, term5988.getClass(), "value", term5987);
        setField(term5988, term5988.getClass(), "left", null);
        setField(term5988, term5988.getClass(), "right", null);
        setField(term5988, term5988.getClass(), "parent", term5985);
        setBooleanField(term5988, term5988.getClass(), "color", true);
        setField(term5985, term5985.getClass(), "left", term5988);
        setField(term5990, term5990.getClass(), "key", null);
        setField(term5990, term5990.getClass(), "value", term5987);
        setField(term5990, term5990.getClass(), "left", null);
        setField(term5990, term5990.getClass(), "right", null);
        setField(term5990, term5990.getClass(), "parent", term5985);
        setBooleanField(term5990, term5990.getClass(), "color", true);
        setField(term5985, term5985.getClass(), "right", term5990);
        setField(term5985, term5985.getClass(), "parent", null);
        setBooleanField(term5985, term5985.getClass(), "color", true);
        setField(term5984, term5984.getClass(), "root", term5985);
        setIntField(term5984, term5984.getClass(), "size", 5);
        setIntField(term5984, term5984.getClass(), "modCount", 5);
        setField(term5984, term5984.getClass(), "entrySet", null);
        setField(term5984, term5984.getClass(), "navigableKeySet", null);
        setField(term5984, term5984.getClass(), "descendingMap", null);
        setField(term5984, term5984.getClass(), "keySet", null);
        setField(term5984, term5984.getClass(), "values", null);
        setField(term5983, term5983.getClass(), "m", term5984);
        setField(term5833, term5833.getClass(), "imports", term5983);
        setBooleanField(term5833, term5833.getClass(), "componentModule", false);
        setField(term5833, term5833.getClass(), "pathFromDocRoot", "QsIOCSpRow");
        setField(term5833, term5833.getClass(), "subpackage", "gcFzvYOUch");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pathFromDocRoot", argTypes, term5833, args);
    }

};


