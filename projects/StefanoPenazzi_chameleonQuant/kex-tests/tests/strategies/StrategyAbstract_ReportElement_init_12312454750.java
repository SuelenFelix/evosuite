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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class StrategyAbstract_ReportElement_init_12312454750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum37;
     Object term11842;
     Object term11844;

    public StrategyAbstract_ReportElement_init_12312454750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11846 = Class.forName((String) "strategies.StrategyAbstract$ReportElementType");
        Field term11845 = ((Class) term11846).getDeclaredField((String) "INPUT");
        ((Field) term11845).setAccessible(true);
        enum37 = ((Field) term11845).get((Object) null);
        term11842 = new Integer(252575029);
        term11844 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.StrategyAbstract$ReportElement");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("strategies.StrategyAbstract");
        argTypes[1] = Class.forName("strategies.StrategyAbstract$ReportElementType");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = enum37;
        args[2] = "EeBVbzjcCI";
        args[3] = "UfQtPRyWRC";
        args[4] = term11842;
        args[5] = term11844;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


