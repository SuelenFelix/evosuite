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

public class CodegenHeader_getSchemaJsonPath_7359620942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;

    public CodegenHeader_getSchemaJsonPath_7359620942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1099 = new HashMap();
        Boolean term1109 = new Boolean(true);
        LinkedHashMap term1111 = new LinkedHashMap();
        Boolean term1214 = new Boolean(true);
        Boolean term1228 = new Boolean(false);
        term1086 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader"));
        Object term1139 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1140 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1141 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1143 = newInstance(Class.forName("java.lang.Object"));
        Object term1144 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1146 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1152 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term1230 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        setField(term1086, term1086.getClass(), "description", null);
        setField(term1086, term1086.getClass(), "example", "QjvDwgKJGz");
        setField(term1086, term1086.getClass(), "vendorExtensions", term1099);
        setField(term1086, term1086.getClass(), "required", term1109);
        setField(term1086, term1086.getClass(), "content", term1111);
        setField(term1140, term1140.getClass(), "comparator", null);
        setField(term1141, term1141.getClass(), "key", "");
        setField(term1141, term1141.getClass(), "value", term1143);
        setField(term1144, term1144.getClass(), "key", null);
        setField(term1144, term1144.getClass(), "value", term1143);
        setField(term1144, term1144.getClass(), "left", null);
        setField(term1144, term1144.getClass(), "right", null);
        setField(term1144, term1144.getClass(), "parent", term1141);
        setBooleanField(term1144, term1144.getClass(), "color", true);
        setField(term1141, term1141.getClass(), "left", term1144);
        setField(term1146, term1146.getClass(), "key", null);
        setField(term1146, term1146.getClass(), "value", term1143);
        setField(term1146, term1146.getClass(), "left", null);
        setField(term1146, term1146.getClass(), "right", null);
        setField(term1146, term1146.getClass(), "parent", term1141);
        setBooleanField(term1146, term1146.getClass(), "color", false);
        setField(term1141, term1141.getClass(), "right", term1146);
        setField(term1141, term1141.getClass(), "parent", null);
        setBooleanField(term1141, term1141.getClass(), "color", true);
        setField(term1140, term1140.getClass(), "root", term1141);
        setIntField(term1140, term1140.getClass(), "size", 7);
        setIntField(term1140, term1140.getClass(), "modCount", 7);
        setField(term1140, term1140.getClass(), "entrySet", null);
        setField(term1140, term1140.getClass(), "navigableKeySet", null);
        setField(term1140, term1140.getClass(), "descendingMap", null);
        setField(term1140, term1140.getClass(), "keySet", null);
        setField(term1140, term1140.getClass(), "values", null);
        setField(term1139, term1139.getClass(), "m", term1140);
        setField(term1086, term1086.getClass(), "imports", term1139);
        setBooleanField(term1086, term1086.getClass(), "componentModule", true);
        setField(term1152, term1152.getClass(), "original", "jdQANIXSTq");
        setBooleanField(term1152, term1152.getClass(), "isValid", false);
        setField(term1152, term1152.getClass(), "snakeCase", "stVcZLTNpu");
        setField(term1152, term1152.getClass(), "pascalCase", "LgXdqWrsLL");
        setField(term1152, term1152.getClass(), "camelCase", "bbHWyibNmy");
        setField(term1152, term1152.getClass(), "kebabCase", "vYYOYhWMWZ");
        setField(term1086, term1086.getClass(), "jsonPathPiece", term1152);
        setField(term1086, term1086.getClass(), "explode", term1214);
        setField(term1086, term1086.getClass(), "style", "FLQJOzEXff");
        setField(term1086, term1086.getClass(), "deprecated", term1228);
        setField(term1086, term1086.getClass(), "schema", null);
        setField(term1230, term1230.getClass(), "ref", null);
        setField(term1230, term1230.getClass(), "refClass", "qlaIVJBSfQ");
        setField(term1230, term1230.getClass(), "refModule", "lYvIWBFFsq");
        setField(term1230, term1230.getClass(), "refModuleLocation", "tThwsqWKcE");
        setField(term1230, term1230.getClass(), "refModuleAlias", "bkSgsDrkCN");
        setField(term1086, term1086.getClass(), "refInfo", term1230);
        setField(term1086, term1086.getClass(), "subpackage", "hwjlcimgJH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenHeader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSchemaJsonPath", argTypes, term1086, args);
    }

};


