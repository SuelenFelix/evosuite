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

public class Position_getCurrInvestment_57090423517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7391;
     Object term7397;

    public Position_getCurrInvestment_57090423517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7391 = newInstance(Class.forName("strategies.Position"));
        setField(term7391, term7391.getClass(), "formatter", null);
        setField(term7391, term7391.getClass(), "signals", null);
        setField(term7391, term7391.getClass(), "pt", null);
        setField(term7391, term7391.getClass(), "sId", null);
        setIntField(term7391, term7391.getClass(), "initVolume", 0);
        setIntField(term7391, term7391.getClass(), "currVolume", 0);
        setDoubleField(term7391, term7391.getClass(), "pr", 0.0);
        setField(term7391, term7391.getClass(), "openInst", null);
        setField(term7391, term7391.getClass(), "closeInst", null);
        setBooleanField(term7391, term7391.getClass(), "open", false);
        setDoubleField(term7391, term7391.getClass(), "currWinLoss", 0.0);
        setField(term7391, term7391.getClass(), "uuid", null);
        term7397 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term7397;
        callMethod(klass, "getCurrInvestment", argTypes, term7391, args);
    }

};


