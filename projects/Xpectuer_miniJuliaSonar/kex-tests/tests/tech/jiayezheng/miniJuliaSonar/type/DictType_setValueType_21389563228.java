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

public class DictType_setValueType_21389563228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49420;

    public DictType_setValueType_21389563228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49420 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.DictType"));
        setField(term49420, term49420.getClass(), "keyType", null);
        setField(term49420, term49420.getClass(), "valueType", null);
        setField(term49420, term49420.getClass(), "table", null);
        setField(term49420, term49420.getClass(), "file", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.DictType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setValueType", argTypes, term49420, args);
    }

};


