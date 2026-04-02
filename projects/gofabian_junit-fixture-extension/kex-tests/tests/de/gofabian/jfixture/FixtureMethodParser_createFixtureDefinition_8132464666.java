package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class FixtureMethodParser_createFixtureDefinition_8132464666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;
     Object term82;
     Object term83;

    public FixtureMethodParser_createFixtureDefinition_8132464666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term77 = new HashMap();
        term76 = newInstance(Class.forName("de.gofabian.jfixture.FixtureMethodParser"));
        setField(term76, term76.getClass(), "cache", term77);
        term82 = newInstance(Class.forName("java.lang.Object"));
        Class<? extends Object> term332 = Class.forName((String) "java.util.IllegalFormatConversionException");
        Object[] term539 = (Object[]) newArray("java.lang.Class", 0);
        term83 = ((Class) term332).getDeclaredMethod((String) "getConversion", (Class[]) term539);
        ((Method) term83).setAccessible(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.reflect.Method");
        Object[] args = new Object[2];
        args[0] = term82;
        args[1] = term83;
        callMethod(klass, "createFixtureDefinition", argTypes, term76, args);
    }

};


