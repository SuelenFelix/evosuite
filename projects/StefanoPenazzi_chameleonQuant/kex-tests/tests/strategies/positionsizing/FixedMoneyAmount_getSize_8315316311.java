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

public class FixedMoneyAmount_getSize_8315316311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term17;

    public FixedMoneyAmount_getSize_8315316311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = newInstance(Class.forName("strategies.positionsizing.FixedMoneyAmount"));
        setDoubleField(term15, term15.getClass(), "fm", 0.28570734989730284);
        term17 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.positionsizing.FixedMoneyAmount");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("strategies.StrategyI");
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17;
        callMethod(klass, "getSize", argTypes, term15, args);
    }

};


