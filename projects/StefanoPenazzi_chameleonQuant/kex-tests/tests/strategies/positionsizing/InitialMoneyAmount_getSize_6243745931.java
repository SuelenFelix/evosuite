package strategies.positionsizing;

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
import static strategies.positionsizing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class InitialMoneyAmount_getSize_6243745931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39;
     Object term41;

    public InitialMoneyAmount_getSize_6243745931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39 = newInstance(Class.forName("strategies.positionsizing.InitialMoneyAmount"));
        setDoubleField(term39, term39.getClass(), "fm", 0.8474802076607362);
        term41 = new Double(0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.positionsizing.InitialMoneyAmount");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("strategies.StrategyI");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term41;
        callMethod(klass, "getSize", argTypes, term39, args);
    }

};


