package nn.actions;

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
import static nn.actions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mating_crossover_11879603486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20073;

    public Mating_crossover_11879603486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20073 = newInstance(Class.forName("nn.actions.Mating"));
        setField(term20073, term20073.getClass(), "random", null);
        setField(term20073, term20073.getClass(), "nodeInnovator", null);
        setField(term20073, term20073.getClass(), "connectionInnovator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.Mating");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        argTypes[1] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "crossover", argTypes, term20073, args);
    }

};


