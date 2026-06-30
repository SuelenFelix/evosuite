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
import java.util.ArrayList;
import java.lang.Object;

public class Population_calculateFitnessGenomes_9121034548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4518;
     Object term4558;

    public Population_calculateFitnessGenomes_9121034548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4519 = new ArrayList();
        ArrayList term4530 = new ArrayList();
        ArrayList term4536 = new ArrayList();
        ((ArrayList) term4536).add((Object)null);
        ((ArrayList) term4536).add((Object)null);
        ((ArrayList) term4536).add((Object)null);
        ((ArrayList) term4536).add((Object)null);
        ArrayList term4540 = new ArrayList();
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        ((ArrayList) term4540).add((Object)null);
        term4518 = newInstance(Class.forName("nn.model.Population"));
        Object term4523 = newInstance(Class.forName("java.util.Random"));
        Object term4524 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term4529 = newInstance(Class.forName("nn.model.Specieses"));
        Object term4534 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term4535 = newInstance(Class.forName("nn.model.Genome"));
        Object term4544 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term4546 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4548 = newInstance(Class.forName("java.util.Random"));
        Object term4549 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        Object term4554 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term4556 = newInstance(Class.forName("nn.model.NodeInnovator"));
        setField(term4518, term4518.getClass(), "genomes", term4519);
        setField(term4518, term4518.getClass(), "evaluator", null);
        setLongField(term4524, term4524.getClass(), "value", 91968791818150L);
        setField(term4523, term4523.getClass(), "seed", term4524);
        setDoubleField(term4523, term4523.getClass(), "nextNextGaussian", 0.08404543279803334);
        setBooleanField(term4523, term4523.getClass(), "haveNextNextGaussian", true);
        setField(term4518, term4518.getClass(), "random", term4523);
        setIntField(term4518, term4518.getClass(), "populationSize", -497534255);
        setField(term4529, term4529.getClass(), "specieses", term4530);
        setField(term4518, term4518.getClass(), "specieses", term4529);
        setField(term4535, term4535.getClass(), "nodes", term4536);
        setField(term4535, term4535.getClass(), "connections", term4540);
        setIntField(term4544, term4544.getClass(), "counter", 100);
        setField(term4535, term4535.getClass(), "nodeInnovator", term4544);
        setIntField(term4546, term4546.getClass(), "counter", 100);
        setField(term4535, term4535.getClass(), "connectionInnovator", term4546);
        setLongField(term4549, term4549.getClass(), "value", 1936501371660L);
        setField(term4548, term4548.getClass(), "seed", term4549);
        setDoubleField(term4548, term4548.getClass(), "nextNextGaussian", 0.5375131002500685);
        setBooleanField(term4548, term4548.getClass(), "haveNextNextGaussian", true);
        setField(term4535, term4535.getClass(), "random", term4548);
        setField(term4534, term4534.getClass(), "genome", term4535);
        setDoubleField(term4534, term4534.getClass(), "fitness", 0.8347207486220592);
        setField(term4518, term4518.getClass(), "best", term4534);
        setIntField(term4554, term4554.getClass(), "counter", 100);
        setField(term4518, term4518.getClass(), "connectionInnovator", term4554);
        setIntField(term4556, term4556.getClass(), "counter", 100);
        setField(term4518, term4518.getClass(), "nodeInnovator", term4556);
        ArrayList term4559 = new ArrayList();
        term4558 = newInstance(Class.forName("nn.model.Specieses"));
        setField(term4558, term4558.getClass(), "specieses", term4559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Population");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.Specieses");
        Object[] args = new Object[1];
        args[0] = term4558;
        callMethod(klass, "calculateFitnessGenomes", argTypes, term4518, args);
    }

};


