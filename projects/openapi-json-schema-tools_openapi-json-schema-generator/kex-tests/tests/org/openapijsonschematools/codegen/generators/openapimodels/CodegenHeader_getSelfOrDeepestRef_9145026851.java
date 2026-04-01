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

public class CodegenHeader_getSelfOrDeepestRef_9145026851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761;

    public CodegenHeader_getSelfOrDeepestRef_9145026851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term774 = new HashMap();
        Boolean term784 = new Boolean(false);
        LinkedHashMap term786 = new LinkedHashMap();
        Boolean term889 = new Boolean(false);
        Boolean term903 = new Boolean(false);
        term761 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term814 = newInstance(Class.forName("java.util.TreeSet"));
        Object term815 = newInstance(Class.forName("java.util.TreeMap"));
        Object term816 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term818 = newInstance(Class.forName("java.lang.Object"));
        Object term819 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term821 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term827 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term905 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term761, term761.getClass(), "description", null);
        setField(term761, term761.getClass(), "example", "ATSXJPySio");
        setField(term761, term761.getClass(), "vendorExtensions", term774);
        setField(term761, term761.getClass(), "required", term784);
        setField(term761, term761.getClass(), "content", term786);
        setField(term815, term815.getClass(), "comparator", null);
        setField(term816, term816.getClass(), "key", "");
        setField(term816, term816.getClass(), "value", term818);
        setField(term819, term819.getClass(), "key", null);
        setField(term819, term819.getClass(), "value", term818);
        setField(term819, term819.getClass(), "left", null);
        setField(term819, term819.getClass(), "right", null);
        setField(term819, term819.getClass(), "parent", term816);
        setBooleanField(term819, term819.getClass(), "color", false);
        setField(term816, term816.getClass(), "left", term819);
        setField(term821, term821.getClass(), "key", null);
        setField(term821, term821.getClass(), "value", term818);
        setField(term821, term821.getClass(), "left", null);
        setField(term821, term821.getClass(), "right", null);
        setField(term821, term821.getClass(), "parent", term816);
        setBooleanField(term821, term821.getClass(), "color", false);
        setField(term816, term816.getClass(), "right", term821);
        setField(term816, term816.getClass(), "parent", null);
        setBooleanField(term816, term816.getClass(), "color", true);
        setField(term815, term815.getClass(), "root", term816);
        setIntField(term815, term815.getClass(), "size", 3);
        setIntField(term815, term815.getClass(), "modCount", 3);
        setField(term815, term815.getClass(), "entrySet", null);
        setField(term815, term815.getClass(), "navigableKeySet", null);
        setField(term815, term815.getClass(), "descendingMap", null);
        setField(term815, term815.getClass(), "keySet", null);
        setField(term815, term815.getClass(), "values", null);
        setField(term814, term814.getClass(), "m", term815);
        setField(term761, term761.getClass(), "imports", term814);
        setBooleanField(term761, term761.getClass(), "componentModule", true);
        setField(term827, term827.getClass(), "original", "JptuwlirlS");
        setBooleanField(term827, term827.getClass(), "isValid", true);
        setField(term827, term827.getClass(), "snakeCase", "TKOMaGswbU");
        setField(term827, term827.getClass(), "pascalCase", "YcTbglHiUq");
        setField(term827, term827.getClass(), "camelCase", "TiUqHrjoEU");
        setField(term827, term827.getClass(), "kebabCase", "eoEvZbdLjL");
        setField(term761, term761.getClass(), "jsonPathPiece", term827);
        setField(term761, term761.getClass(), "explode", term889);
        setField(term761, term761.getClass(), "style", "BkIxsyPkGy");
        setField(term761, term761.getClass(), "deprecated", term903);
        setField(term761, term761.getClass(), "schema", null);
        setField(term905, term905.getClass(), "ref", null);
        setField(term905, term905.getClass(), "refClass", "mrMGwoRgVY");
        setField(term905, term905.getClass(), "refModule", "mxVLTgCwki");
        setField(term905, term905.getClass(), "refModuleLocation", "wCurppnDSA");
        setField(term905, term905.getClass(), "refModuleAlias", "JydxSNTMYt");
        setField(term761, term761.getClass(), "refInfo", term905);
        setField(term761, term761.getClass(), "subpackage", "KpurAcrHYT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelfOrDeepestRef", argTypes, term761, args);
    }

};


