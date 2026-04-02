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

public class Population_biasedRandomGenome_171794233317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4719;

    public Population_biasedRandomGenome_171794233317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4719 = newInstance(Class.forName("nn.model.Population"));
        setField(term4719, term4719.getClass(), "genomes", null);
        setField(term4719, term4719.getClass(), "evaluator", null);
        setField(term4719, term4719.getClass(), "random", null);
        setIntField(term4719, term4719.getClass(), "populationSize", 0);
        setField(term4719, term4719.getClass(), "specieses", null);
        setField(term4719, term4719.getClass(), "best", null);
        setField(term4719, term4719.getClass(), "connectionInnovator", null);
        setField(term4719, term4719.getClass(), "nodeInnovator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Population");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "biasedRandomGenome", argTypes, term4719, args);
    }

};


