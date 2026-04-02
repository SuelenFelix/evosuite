package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Population_init_12955824490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;
     Object term3373;

    public Population_init_12955824490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3368 = newInstance(Class.forName("java.util.Random"));
        Object term3369 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term3369, term3369.getClass(), "value", 168391469188722L);
        setField(term3368, term3368.getClass(), "seed", term3369);
        setDoubleField(term3368, term3368.getClass(), "nextNextGaussian", 0.9113409083257852);
        setBooleanField(term3368, term3368.getClass(), "haveNextNextGaussian", false);
        term3373 = new Integer(-1694747156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Population");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Random");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("nn.model.Evaluatable");
        Object[] args = new Object[3];
        args[0] = term3368;
        args[1] = term3373;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


