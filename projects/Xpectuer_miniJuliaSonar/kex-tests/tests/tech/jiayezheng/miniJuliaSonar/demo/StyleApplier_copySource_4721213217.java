package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StyleApplier_copySource_4721213217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10565;
     Object term10567;
     Object term10569;

    public StyleApplier_copySource_4721213217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10565 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier"));
        setField(term10565, term10565.getClass(), "tags", null);
        setField(term10565, term10565.getClass(), "buffer", null);
        setField(term10565, term10565.getClass(), "source", null);
        setIntField(term10565, term10565.getClass(), "sourceOffset", 0);
        term10567 = new Integer(0);
        term10569 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10567;
        args[1] = term10569;
        callMethod(klass, "copySource", argTypes, term10565, args);
    }

};


