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

public class CodegenResponse_hasInlineHeader_6398702893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4355;

    public CodegenResponse_hasInlineHeader_6398702893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term4356 = new LinkedHashMap();
        HashMap term4495 = new HashMap();
        term4355 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse"));
        Object term4384 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenRefInfo"));
        Object term4433 = newInstance(Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenKey"));
        Object term4505 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4506 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term4355, term4355.getClass(), "description", null);
        setField(term4355, term4355.getClass(), "headers", null);
        setField(term4355, term4355.getClass(), "headersObjectSchema", null);
        setField(term4355, term4355.getClass(), "content", term4356);
        setField(term4384, term4384.getClass(), "ref", null);
        setField(term4384, term4384.getClass(), "refClass", "rfFHGPcfpz");
        setField(term4384, term4384.getClass(), "refModule", "fViQeyMrrL");
        setField(term4384, term4384.getClass(), "refModuleLocation", "zzeaToyLmI");
        setField(term4384, term4384.getClass(), "refModuleAlias", "sKYWhmRMLx");
        setField(term4355, term4355.getClass(), "refInfo", term4384);
        setField(term4433, term4433.getClass(), "original", "SOJpgWUZCf");
        setBooleanField(term4433, term4433.getClass(), "isValid", false);
        setField(term4433, term4433.getClass(), "snakeCase", "jgywFOzBDw");
        setField(term4433, term4433.getClass(), "pascalCase", "yKIXLtCWYi");
        setField(term4433, term4433.getClass(), "camelCase", "EhuyRKrUJu");
        setField(term4433, term4433.getClass(), "kebabCase", "UlBxuoBXcJ");
        setField(term4355, term4355.getClass(), "jsonPathPiece", term4433);
        setField(term4355, term4355.getClass(), "vendorExtensions", term4495);
        setField(term4506, term4506.getClass(), "comparator", null);
        setField(term4506, term4506.getClass(), "root", null);
        setIntField(term4506, term4506.getClass(), "size", 0);
        setIntField(term4506, term4506.getClass(), "modCount", 0);
        setField(term4506, term4506.getClass(), "entrySet", null);
        setField(term4506, term4506.getClass(), "navigableKeySet", null);
        setField(term4506, term4506.getClass(), "descendingMap", null);
        setField(term4506, term4506.getClass(), "keySet", null);
        setField(term4506, term4506.getClass(), "values", null);
        setField(term4505, term4505.getClass(), "m", term4506);
        setField(term4355, term4355.getClass(), "imports", term4505);
        setBooleanField(term4355, term4355.getClass(), "componentModule", false);
        setField(term4355, term4355.getClass(), "pathFromDocRoot", "bMQrxvaBAI");
        setField(term4355, term4355.getClass(), "subpackage", "StFtysZlWm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openapijsonschematools.codegen.generators.openapimodels.CodegenResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasInlineHeader", argTypes, term4355, args);
    }

};


