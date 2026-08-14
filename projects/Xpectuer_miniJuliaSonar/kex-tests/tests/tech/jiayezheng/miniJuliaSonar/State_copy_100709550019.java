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

public class State_copy_100709550019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264053;

    public State_copy_100709550019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264053 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term264053, term264053.getClass(), "globalNames", null);
        setField(term264053, term264053.getClass(), "table", null);
        setField(term264053, term264053.getClass(), "parent", null);
        setField(term264053, term264053.getClass(), "forwarding", null);
        setField(term264053, term264053.getClass(), "supers", null);
        setField(term264053, term264053.getClass(), "globalSymbols", null);
        setField(term264053, term264053.getClass(), "stateType", null);
        setField(term264053, term264053.getClass(), "type", null);
        setField(term264053, term264053.getClass(), "path", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term264053, args);
    }

};


