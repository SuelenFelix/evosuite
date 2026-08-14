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

public class ExpansionBuffer_moveResolvedPartToNextProperty_4897027010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1511;

    public ExpansionBuffer_moveResolvedPartToNextProperty_4897027010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1511 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        setBooleanField(term1511, term1511.getClass(), "isFullyResolved", false);
        setField(term1511, term1511.getClass(), "resolved", null);
        setField(term1511, term1511.getClass(), "unresolved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "moveResolvedPartToNextProperty", argTypes, term1511, args);
    }

};


