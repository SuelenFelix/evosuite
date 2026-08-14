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
import java.util.ArrayList;

public class Stack_pop_10476599893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237005;

    public Stack_pop_10476599893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term237006 = new ArrayList();
        term237005 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Stack"));
        setField(term237005, term237005.getClass(), "content", term237006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Stack");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "pop", argTypes, term237005, args);
    }

};


