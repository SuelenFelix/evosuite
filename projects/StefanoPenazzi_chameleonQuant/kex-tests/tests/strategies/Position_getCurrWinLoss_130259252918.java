package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Position_getCurrWinLoss_130259252918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7399;
     Object term7405;

    public Position_getCurrWinLoss_130259252918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7399 = newInstance(Class.forName("strategies.Position"));
        setField(term7399, term7399.getClass(), "formatter", null);
        setField(term7399, term7399.getClass(), "signals", null);
        setField(term7399, term7399.getClass(), "pt", null);
        setField(term7399, term7399.getClass(), "sId", null);
        setIntField(term7399, term7399.getClass(), "initVolume", 0);
        setIntField(term7399, term7399.getClass(), "currVolume", 0);
        setDoubleField(term7399, term7399.getClass(), "pr", 0.0);
        setField(term7399, term7399.getClass(), "openInst", null);
        setField(term7399, term7399.getClass(), "closeInst", null);
        setBooleanField(term7399, term7399.getClass(), "open", false);
        setDoubleField(term7399, term7399.getClass(), "currWinLoss", 0.0);
        setField(term7399, term7399.getClass(), "uuid", null);
        term7405 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7405;
        callMethod(klass, "getCurrWinLoss", argTypes, term7399, args);
    }

};


