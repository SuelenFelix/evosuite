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

public class Catch_toString_6095448683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23987;

    public Catch_toString_6095448683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23987 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch"));
        setField(term23987, term23987.getClass(), "binders", null);
        setField(term23987, term23987.getClass(), "body", null);
        setField(term23987, term23987.getClass(), "nodeType", null);
        setIntField(term23987, term23987.getClass(), "start", 0);
        setIntField(term23987, term23987.getClass(), "end", 0);
        setField(term23987, term23987.getClass(), "file", null);
        setField(term23987, term23987.getClass(), "parent", null);
        setField(term23987, term23987.getClass(), "name", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23987, args);
    }

};


