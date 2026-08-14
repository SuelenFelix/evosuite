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

public class State_getGlobalTable_58080011649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285488;

    public State_getGlobalTable_58080011649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285488 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term285488, term285488.getClass(), "globalNames", null);
        setField(term285488, term285488.getClass(), "table", null);
        setField(term285488, term285488.getClass(), "parent", null);
        setField(term285488, term285488.getClass(), "forwarding", null);
        setField(term285488, term285488.getClass(), "supers", null);
        setField(term285488, term285488.getClass(), "globalSymbols", null);
        setField(term285488, term285488.getClass(), "stateType", null);
        setField(term285488, term285488.getClass(), "type", null);
        setField(term285488, term285488.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGlobalTable", argTypes, term285488, args);
    }

};


