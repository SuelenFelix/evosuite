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

public class State_merge_132200124921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265877;

    public State_merge_132200124921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265877 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term265877, term265877.getClass(), "globalNames", null);
        setField(term265877, term265877.getClass(), "table", null);
        setField(term265877, term265877.getClass(), "parent", null);
        setField(term265877, term265877.getClass(), "forwarding", null);
        setField(term265877, term265877.getClass(), "supers", null);
        setField(term265877, term265877.getClass(), "globalSymbols", null);
        setField(term265877, term265877.getClass(), "stateType", null);
        setField(term265877, term265877.getClass(), "type", null);
        setField(term265877, term265877.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "merge", argTypes, term265877, args);
    }

};


