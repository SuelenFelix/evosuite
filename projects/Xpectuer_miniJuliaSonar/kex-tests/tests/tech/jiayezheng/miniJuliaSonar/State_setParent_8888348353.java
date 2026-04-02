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

public class State_setParent_8888348353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253110;

    public State_setParent_8888348353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term253110 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term253110, term253110.getClass(), "globalNames", null);
        setField(term253110, term253110.getClass(), "table", null);
        setField(term253110, term253110.getClass(), "parent", null);
        setField(term253110, term253110.getClass(), "forwarding", null);
        setField(term253110, term253110.getClass(), "supers", null);
        setField(term253110, term253110.getClass(), "globalSymbols", null);
        setField(term253110, term253110.getClass(), "stateType", null);
        setField(term253110, term253110.getClass(), "type", null);
        setField(term253110, term253110.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setParent", argTypes, term253110, args);
    }

};


