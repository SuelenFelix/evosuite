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

public class CodegenHeader_hashCode_5503875843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1411;

    public CodegenHeader_hashCode_5503875843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1424 = new HashMap();
        Boolean term1434 = new Boolean(false);
        LinkedHashMap term1436 = new LinkedHashMap();
        Boolean term1537 = new Boolean(false);
        Boolean term1551 = new Boolean(true);
        term1411 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term1464 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1465 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1466 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1468 = newInstance(Class.forName("java.lang.Object"));
        Object term1469 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1475 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term1553 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term1411, term1411.getClass(), "description", null);
        setField(term1411, term1411.getClass(), "example", "TLxQzxvizR");
        setField(term1411, term1411.getClass(), "vendorExtensions", term1424);
        setField(term1411, term1411.getClass(), "required", term1434);
        setField(term1411, term1411.getClass(), "content", term1436);
        setField(term1465, term1465.getClass(), "comparator", null);
        setField(term1466, term1466.getClass(), "key", "");
        setField(term1466, term1466.getClass(), "value", term1468);
        setField(term1469, term1469.getClass(), "key", null);
        setField(term1469, term1469.getClass(), "value", term1468);
        setField(term1469, term1469.getClass(), "left", null);
        setField(term1469, term1469.getClass(), "right", null);
        setField(term1469, term1469.getClass(), "parent", term1466);
        setBooleanField(term1469, term1469.getClass(), "color", false);
        setField(term1466, term1466.getClass(), "left", term1469);
        setField(term1466, term1466.getClass(), "right", null);
        setField(term1466, term1466.getClass(), "parent", null);
        setBooleanField(term1466, term1466.getClass(), "color", true);
        setField(term1465, term1465.getClass(), "root", term1466);
        setIntField(term1465, term1465.getClass(), "size", 2);
        setIntField(term1465, term1465.getClass(), "modCount", 2);
        setField(term1465, term1465.getClass(), "entrySet", null);
        setField(term1465, term1465.getClass(), "navigableKeySet", null);
        setField(term1465, term1465.getClass(), "descendingMap", null);
        setField(term1465, term1465.getClass(), "keySet", null);
        setField(term1465, term1465.getClass(), "values", null);
        setField(term1464, term1464.getClass(), "m", term1465);
        setField(term1411, term1411.getClass(), "imports", term1464);
        setBooleanField(term1411, term1411.getClass(), "componentModule", true);
        setField(term1475, term1475.getClass(), "original", "lRaSlqzqNY");
        setBooleanField(term1475, term1475.getClass(), "isValid", false);
        setField(term1475, term1475.getClass(), "snakeCase", "TiEyxWXsra");
        setField(term1475, term1475.getClass(), "pascalCase", "TuLgwTZsPP");
        setField(term1475, term1475.getClass(), "camelCase", "KoasxTJGpx");
        setField(term1475, term1475.getClass(), "kebabCase", "ceGeARYMoa");
        setField(term1411, term1411.getClass(), "jsonPathPiece", term1475);
        setField(term1411, term1411.getClass(), "explode", term1537);
        setField(term1411, term1411.getClass(), "style", "fFWllaiFvh");
        setField(term1411, term1411.getClass(), "deprecated", term1551);
        setField(term1411, term1411.getClass(), "schema", null);
        setField(term1553, term1553.getClass(), "ref", null);
        setField(term1553, term1553.getClass(), "refClass", "PFTdEDSbvZ");
        setField(term1553, term1553.getClass(), "refModule", "TbiwoiebNe");
        setField(term1553, term1553.getClass(), "refModuleLocation", "laTITSWZuc");
        setField(term1553, term1553.getClass(), "refModuleAlias", "fkzRpxlAqS");
        setField(term1411, term1411.getClass(), "refInfo", term1553);
        setField(term1411, term1411.getClass(), "subpackage", "VYvbTGKslj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term1411, args);
    }

};


