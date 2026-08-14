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

public class State_getStateOfType_170205220951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287195;

    public State_getStateOfType_170205220951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287195 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term287195, term287195.getClass(), "globalNames", null);
        setField(term287195, term287195.getClass(), "table", null);
        setField(term287195, term287195.getClass(), "parent", null);
        setField(term287195, term287195.getClass(), "forwarding", null);
        setField(term287195, term287195.getClass(), "supers", null);
        setField(term287195, term287195.getClass(), "globalSymbols", null);
        setField(term287195, term287195.getClass(), "stateType", null);
        setField(term287195, term287195.getClass(), "type", null);
        setField(term287195, term287195.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.State$StateType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getStateOfType", argTypes, term287195, args);
    }

};


