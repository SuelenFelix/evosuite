package io.polivakha.mojo.properties;

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
import static io.polivakha.mojo.properties.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class PropertyResolver_getPropertyValue_15900433292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1745;
     Object term1758;
     Object term1763;
     Object term1785;

    public PropertyResolver_getPropertyValue_15900433292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1745 = newInstance(Class.forName("io.polivakha.mojo.properties.PropertyResolver"));
        term1758 = new HashMap();
        term1763 = new HashMap();
        LinkedHashMap term1787 = new LinkedHashMap();
        Set<Object> term1803 =  ((Map) term1787).keySet();
        LinkedHashSet term1786 = new LinkedHashSet((Collection<? extends Object>) term1803);
        term1785 = newInstance(Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer"));
        setField(term1785, term1785.getClass(), "keysUsed", term1786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.PropertyResolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Properties");
        argTypes[2] = Class.forName("java.util.Properties");
        argTypes[3] = Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer");
        Object[] args = new Object[4];
        args[0] = "pCTimMblYc";
        args[1] = term1758;
        args[2] = term1763;
        args[3] = term1785;
        callMethod(klass, "getPropertyValue", argTypes, term1745, args);
    }

};


