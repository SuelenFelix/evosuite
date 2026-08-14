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

public class CircularDefinitionPreventer_isPropertyAlreadyVisited_17494253212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029;

    public CircularDefinitionPreventer_isPropertyAlreadyVisited_17494253212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term1031 = new LinkedHashMap();
        Set<Object> term1049 =  ((Map) term1031).keySet();
        LinkedHashSet term1030 = new LinkedHashSet((Collection<? extends Object>) term1049);
        term1029 = newInstance(Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer"));
        setField(term1029, term1029.getClass(), "keysUsed", term1030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.CircularDefinitionPreventer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "isPropertyAlreadyVisited", argTypes, term1029, args);
    }

};


