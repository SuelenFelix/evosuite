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

public class Population_getGenomes_116092556914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4713;

    public Population_getGenomes_116092556914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4713 = newInstance(Class.forName("nn.model.Population"));
        setField(term4713, term4713.getClass(), "genomes", null);
        setField(term4713, term4713.getClass(), "evaluator", null);
        setField(term4713, term4713.getClass(), "random", null);
        setIntField(term4713, term4713.getClass(), "populationSize", 0);
        setField(term4713, term4713.getClass(), "specieses", null);
        setField(term4713, term4713.getClass(), "best", null);
        setField(term4713, term4713.getClass(), "connectionInnovator", null);
        setField(term4713, term4713.getClass(), "nodeInnovator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Population");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenomes", argTypes, term4713, args);
    }

};


