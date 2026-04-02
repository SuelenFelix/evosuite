package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StructType_addInstance_174432111110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334858;

    public StructType_addInstance_174432111110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334858 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType"));
        setField(term334858, term334858.getClass(), "instances", null);
        setField(term334858, term334858.getClass(), "name", null);
        setField(term334858, term334858.getClass(), "baseType", null);
        setField(term334858, term334858.getClass(), "table", null);
        setField(term334858, term334858.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addInstance", argTypes, term334858, args);
    }

};


