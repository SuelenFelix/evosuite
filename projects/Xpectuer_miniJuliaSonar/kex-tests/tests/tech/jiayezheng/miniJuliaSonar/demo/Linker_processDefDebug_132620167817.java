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

public class Linker_processDefDebug_132620167817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5725;

    public Linker_processDefDebug_132620167817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5725 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        setField(term5725, term5725.getClass(), "fileStyles", null);
        setField(term5725, term5725.getClass(), "outDir", null);
        setField(term5725, term5725.getClass(), "rootPath", null);
        setField(term5725, term5725.getClass(), "seenDef", null);
        setField(term5725, term5725.getClass(), "seenRef", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "processDefDebug", argTypes, term5725, args);
    }

};


