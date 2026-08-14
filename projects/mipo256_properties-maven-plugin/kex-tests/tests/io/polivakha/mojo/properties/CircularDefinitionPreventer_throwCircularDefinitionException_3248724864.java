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
import java.util.LinkedHashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.LinkedHashSet;

public class CircularDefinitionPreventer_throwCircularDefinitionException_3248724864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1091;

    public CircularDefinitionPreventer_throwCircularDefinitionException_3248724864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1093 = new LinkedHashMap();
        Set<Object> term1099 =  ((Map) term1093).keySet();
        LinkedHashSet term1092 = new LinkedHashSet((Collection<? extends Object>) term1099);
        term1091 = newInstance(Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer"));
        setField(term1091, term1091.getClass(), "keysUsed", term1092);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "throwCircularDefinitionException", argTypes, term1091, args);
    }

};


