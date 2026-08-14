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

public class InstanceType_printType_18560307237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52497;

    public InstanceType_printType_18560307237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52497 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        setField(term52497, term52497.getClass(), "ctype", null);
        setField(term52497, term52497.getClass(), "params", null);
        setField(term52497, term52497.getClass(), "table", null);
        setField(term52497, term52497.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "printType", argTypes, term52497, args);
    }

};


