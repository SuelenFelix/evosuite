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

public class CodegenHeader_equals_1017009094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1734;
     Object term1939;

    public CodegenHeader_equals_1017009094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1747 = new HashMap();
        Boolean term1757 = new Boolean(true);
        LinkedHashMap term1759 = new LinkedHashMap();
        Boolean term1862 = new Boolean(true);
        Boolean term1876 = new Boolean(false);
        term1734 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term1787 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1788 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1789 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1791 = newInstance(Class.forName("java.lang.Object"));
        Object term1792 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1794 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1800 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term1878 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term1734, term1734.getClass(), "description", null);
        setField(term1734, term1734.getClass(), "example", "owLqDDnwZA");
        setField(term1734, term1734.getClass(), "vendorExtensions", term1747);
        setField(term1734, term1734.getClass(), "required", term1757);
        setField(term1734, term1734.getClass(), "content", term1759);
        setField(term1788, term1788.getClass(), "comparator", null);
        setField(term1789, term1789.getClass(), "key", "");
        setField(term1789, term1789.getClass(), "value", term1791);
        setField(term1792, term1792.getClass(), "key", null);
        setField(term1792, term1792.getClass(), "value", term1791);
        setField(term1792, term1792.getClass(), "left", null);
        setField(term1792, term1792.getClass(), "right", null);
        setField(term1792, term1792.getClass(), "parent", term1789);
        setBooleanField(term1792, term1792.getClass(), "color", false);
        setField(term1789, term1789.getClass(), "left", term1792);
        setField(term1794, term1794.getClass(), "key", null);
        setField(term1794, term1794.getClass(), "value", term1791);
        setField(term1794, term1794.getClass(), "left", null);
        setField(term1794, term1794.getClass(), "right", null);
        setField(term1794, term1794.getClass(), "parent", term1789);
        setBooleanField(term1794, term1794.getClass(), "color", true);
        setField(term1789, term1789.getClass(), "right", term1794);
        setField(term1789, term1789.getClass(), "parent", null);
        setBooleanField(term1789, term1789.getClass(), "color", true);
        setField(term1788, term1788.getClass(), "root", term1789);
        setIntField(term1788, term1788.getClass(), "size", 8);
        setIntField(term1788, term1788.getClass(), "modCount", 8);
        setField(term1788, term1788.getClass(), "entrySet", null);
        setField(term1788, term1788.getClass(), "navigableKeySet", null);
        setField(term1788, term1788.getClass(), "descendingMap", null);
        setField(term1788, term1788.getClass(), "keySet", null);
        setField(term1788, term1788.getClass(), "values", null);
        setField(term1787, term1787.getClass(), "m", term1788);
        setField(term1734, term1734.getClass(), "imports", term1787);
        setBooleanField(term1734, term1734.getClass(), "componentModule", false);
        setField(term1800, term1800.getClass(), "original", "ojLrjltndD");
        setBooleanField(term1800, term1800.getClass(), "isValid", false);
        setField(term1800, term1800.getClass(), "snakeCase", "VJtFSexKat");
        setField(term1800, term1800.getClass(), "pascalCase", "xPVddlPSQR");
        setField(term1800, term1800.getClass(), "camelCase", "MxrhCLTMTH");
        setField(term1800, term1800.getClass(), "kebabCase", "kEehLMZcOU");
        setField(term1734, term1734.getClass(), "jsonPathPiece", term1800);
        setField(term1734, term1734.getClass(), "explode", term1862);
        setField(term1734, term1734.getClass(), "style", "RhLliqMiOF");
        setField(term1734, term1734.getClass(), "deprecated", term1876);
        setField(term1734, term1734.getClass(), "schema", null);
        setField(term1878, term1878.getClass(), "ref", null);
        setField(term1878, term1878.getClass(), "refClass", "jlhonEGrJH");
        setField(term1878, term1878.getClass(), "refModule", "RKcKwlEYZb");
        setField(term1878, term1878.getClass(), "refModuleLocation", "acPRDlpsid");
        setField(term1878, term1878.getClass(), "refModuleAlias", "YyojIzvxLZ");
        setField(term1734, term1734.getClass(), "refInfo", term1878);
        setField(term1734, term1734.getClass(), "subpackage", "fxapaYlZea");
        term1939 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term1939;
        callMethod(klass, "equals", argTypes, term1734, args);
    }

};


