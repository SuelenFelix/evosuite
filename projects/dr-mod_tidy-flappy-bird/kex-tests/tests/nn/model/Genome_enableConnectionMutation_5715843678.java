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

public class Genome_enableConnectionMutation_5715843678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9207;

    public Genome_enableConnectionMutation_5715843678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9208 = new ArrayList();
        ArrayList term9212 = new ArrayList();
        term9207 = newInstance(Class.forName("nn.model.Genome"));
        Object term9216 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9218 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9220 = newInstance(Class.forName("java.util.Random"));
        Object term9221 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9207, term9207.getClass(), "nodes", term9208);
        setField(term9207, term9207.getClass(), "connections", term9212);
        setIntField(term9216, term9216.getClass(), "counter", 100);
        setField(term9207, term9207.getClass(), "nodeInnovator", term9216);
        setIntField(term9218, term9218.getClass(), "counter", 100);
        setField(term9207, term9207.getClass(), "connectionInnovator", term9218);
        setLongField(term9221, term9221.getClass(), "value", 104329557584794L);
        setField(term9220, term9220.getClass(), "seed", term9221);
        setDoubleField(term9220, term9220.getClass(), "nextNextGaussian", 0.2849157687292415);
        setBooleanField(term9220, term9220.getClass(), "haveNextNextGaussian", true);
        setField(term9207, term9207.getClass(), "random", term9220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "enableConnectionMutation", argTypes, term9207, args);
    }

};


