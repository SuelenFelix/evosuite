package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class State_update_51067847737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277656;

    public State_update_51067847737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term277656 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term277656, term277656.getClass(), "globalNames", null);
        setField(term277656, term277656.getClass(), "table", null);
        setField(term277656, term277656.getClass(), "parent", null);
        setField(term277656, term277656.getClass(), "forwarding", null);
        setField(term277656, term277656.getClass(), "supers", null);
        setField(term277656, term277656.getClass(), "globalSymbols", null);
        setField(term277656, term277656.getClass(), "stateType", null);
        setField(term277656, term277656.getClass(), "type", null);
        setField(term277656, term277656.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "update", argTypes, term277656, args);
    }

};


