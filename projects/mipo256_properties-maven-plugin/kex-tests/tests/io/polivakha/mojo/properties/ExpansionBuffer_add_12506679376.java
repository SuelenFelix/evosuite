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
import java.lang.Object;

public class ExpansionBuffer_add_12506679376 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1425;

    public ExpansionBuffer_add_12506679376() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1425 = newInstance(Class.forName("io.polivakha.mojo.properties.ExpansionBuffer"));
        Object term1427 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1428 = (byte[]) newByteArray(16);
        setBooleanField(term1425, term1425.getClass(), "isFullyResolved", true);
        setField(term1427, term1427.getClass(), "value", term1428);
        setByteField(term1427, term1427.getClass(), "coder", (byte) -58);
        setIntField(term1427, term1427.getClass(), "count", 579005622);
        setField(term1425, term1425.getClass(), "resolved", term1427);
        setField(term1425, term1425.getClass(), "unresolved", "MxlszYVzRf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.polivakha.mojo.properties.ExpansionBuffer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LQFpaHEwXR";
        callMethod(klass, "add", argTypes, term1425, args);
    }

};


