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

public class ExpansionBuffer_hasMoreLegalPlaceholders_8951343758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1507;

    public ExpansionBuffer_hasMoreLegalPlaceholders_8951343758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1507 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        setBooleanField(term1507, term1507.getClass(), "isFullyResolved", false);
        setField(term1507, term1507.getClass(), "resolved", null);
        setField(term1507, term1507.getClass(), "unresolved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMoreLegalPlaceholders", argTypes, term1507, args);
    }

};


