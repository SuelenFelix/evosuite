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

public class FixedMoneyAmount_Builder_fixedMoneyAmount_18843179961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public FixedMoneyAmount_Builder_fixedMoneyAmount_18843179961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("strategies.positionsizing.FixedMoneyAmount$Builder"));
        setDoubleField(term1, term1.getClass(), "fm", 0.13238746331190498);
        term3 = new Double(0.3455959125047594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.positionsizing.FixedMoneyAmount$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3;
        callMethod(klass, "fixedMoneyAmount", argTypes, term1, args);
    }

};


