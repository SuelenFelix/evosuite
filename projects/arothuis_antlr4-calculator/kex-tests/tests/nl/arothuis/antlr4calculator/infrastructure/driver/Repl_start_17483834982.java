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

public class Repl_start_17483834982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term901;

    public Repl_start_17483834982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term901 = newInstance(Class.forName("nl.arothuis.antlr4calculator.infrastructure.driver.Repl"));
        setField(term901, term901.getClass(), "scanner", null);
        setField(term901, term901.getClass(), "calculator", null);
        setField(term901, term901.getClass(), "output", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nl.arothuis.antlr4calculator.infrastructure.driver.Repl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term901, args);
    }

};


