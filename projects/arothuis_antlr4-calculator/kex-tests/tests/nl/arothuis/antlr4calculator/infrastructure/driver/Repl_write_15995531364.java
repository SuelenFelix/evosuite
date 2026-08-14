package nl.arothuis.antlr4calculator.infrastructure.driver;

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
import static nl.arothuis.antlr4calculator.infrastructure.driver.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Repl_write_15995531364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1825;

    public Repl_write_15995531364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1825 = newInstance(Class.forName("nl.arothuis.antlr4calculator.infrastructure.driver.Repl"));
        setField(term1825, term1825.getClass(), "scanner", null);
        setField(term1825, term1825.getClass(), "calculator", null);
        setField(term1825, term1825.getClass(), "output", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.arothuis.antlr4calculator.infrastructure.driver.Repl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "write", argTypes, term1825, args);
    }

};


