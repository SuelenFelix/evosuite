package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Call_toString_12061083959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3621;

    public Call_toString_12061083959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3621 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call"));
        setField(term3621, term3621.getClass(), "name", null);
        setField(term3621, term3621.getClass(), "args", null);
        setField(term3621, term3621.getClass(), "keywords", null);
        setBooleanField(term3621, term3621.getClass(), "isInit", false);
        setField(term3621, term3621.getClass(), "nodeType", null);
        setIntField(term3621, term3621.getClass(), "start", 0);
        setIntField(term3621, term3621.getClass(), "end", 0);
        setField(term3621, term3621.getClass(), "file", null);
        setField(term3621, term3621.getClass(), "parent", null);
        setField(term3621, term3621.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term3621, args);
    }

};


