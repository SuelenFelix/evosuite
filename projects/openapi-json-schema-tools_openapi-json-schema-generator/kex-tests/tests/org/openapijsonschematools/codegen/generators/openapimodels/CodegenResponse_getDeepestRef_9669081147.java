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

public class CodegenResponse_getDeepestRef_9669081147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536;

    public CodegenResponse_getDeepestRef_9669081147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5537 = new LinkedHashMap();
        HashMap term5676 = new HashMap();
        term5536 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term5565 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term5614 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term5686 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5687 = newInstance(Class.forName("java.util.TreeMap"));
        Object term5688 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5690 = newInstance(Class.forName("java.lang.Object"));
        Object term5691 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term5693 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        setField(term5536, term5536.getClass(), "description", null);
        setField(term5536, term5536.getClass(), "headers", null);
        setField(term5536, term5536.getClass(), "headersObjectSchema", null);
        setField(term5536, term5536.getClass(), "content", term5537);
        setField(term5565, term5565.getClass(), "ref", null);
        setField(term5565, term5565.getClass(), "refClass", "FivesaUeHG");
        setField(term5565, term5565.getClass(), "refModule", "TnpXhZmCRY");
        setField(term5565, term5565.getClass(), "refModuleLocation", "ECVAXFhrTP");
        setField(term5565, term5565.getClass(), "refModuleAlias", "ypytdNbrBc");
        setField(term5536, term5536.getClass(), "refInfo", term5565);
        setField(term5614, term5614.getClass(), "original", "XvrJCOSYei");
        setBooleanField(term5614, term5614.getClass(), "isValid", false);
        setField(term5614, term5614.getClass(), "snakeCase", "QdRcxOxNSl");
        setField(term5614, term5614.getClass(), "pascalCase", "lvdsucnNvR");
        setField(term5614, term5614.getClass(), "camelCase", "mSjSKfeMUn");
        setField(term5614, term5614.getClass(), "kebabCase", "nVXCBYnEcg");
        setField(term5536, term5536.getClass(), "jsonPathPiece", term5614);
        setField(term5536, term5536.getClass(), "vendorExtensions", term5676);
        setField(term5687, term5687.getClass(), "comparator", null);
        setField(term5688, term5688.getClass(), "key", "");
        setField(term5688, term5688.getClass(), "value", term5690);
        setField(term5691, term5691.getClass(), "key", null);
        setField(term5691, term5691.getClass(), "value", term5690);
        setField(term5691, term5691.getClass(), "left", null);
        setField(term5691, term5691.getClass(), "right", null);
        setField(term5691, term5691.getClass(), "parent", term5688);
        setBooleanField(term5691, term5691.getClass(), "color", false);
        setField(term5688, term5688.getClass(), "left", term5691);
        setField(term5693, term5693.getClass(), "key", null);
        setField(term5693, term5693.getClass(), "value", term5690);
        setField(term5693, term5693.getClass(), "left", null);
        setField(term5693, term5693.getClass(), "right", null);
        setField(term5693, term5693.getClass(), "parent", term5688);
        setBooleanField(term5693, term5693.getClass(), "color", true);
        setField(term5688, term5688.getClass(), "right", term5693);
        setField(term5688, term5688.getClass(), "parent", null);
        setBooleanField(term5688, term5688.getClass(), "color", true);
        setField(term5687, term5687.getClass(), "root", term5688);
        setIntField(term5687, term5687.getClass(), "size", 8);
        setIntField(term5687, term5687.getClass(), "modCount", 8);
        setField(term5687, term5687.getClass(), "entrySet", null);
        setField(term5687, term5687.getClass(), "navigableKeySet", null);
        setField(term5687, term5687.getClass(), "descendingMap", null);
        setField(term5687, term5687.getClass(), "keySet", null);
        setField(term5687, term5687.getClass(), "values", null);
        setField(term5686, term5686.getClass(), "m", term5687);
        setField(term5536, term5536.getClass(), "imports", term5686);
        setBooleanField(term5536, term5536.getClass(), "componentModule", true);
        setField(term5536, term5536.getClass(), "pathFromDocRoot", "TRfRRMMCZw");
        setField(term5536, term5536.getClass(), "subpackage", "rwbfUcOMVc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeepestRef", argTypes, term5536, args);
    }

};


