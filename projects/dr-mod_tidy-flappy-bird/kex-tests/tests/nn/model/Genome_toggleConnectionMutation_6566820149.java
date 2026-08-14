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

public class Genome_toggleConnectionMutation_6566820149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9225;

    public Genome_toggleConnectionMutation_6566820149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9226 = new ArrayList();
        ArrayList term9230 = new ArrayList();
        term9225 = newInstance(Class.forName("nn.model.Genome"));
        Object term9234 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9236 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9238 = newInstance(Class.forName("java.util.Random"));
        Object term9239 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9225, term9225.getClass(), "nodes", term9226);
        setField(term9225, term9225.getClass(), "connections", term9230);
        setIntField(term9234, term9234.getClass(), "counter", 100);
        setField(term9225, term9225.getClass(), "nodeInnovator", term9234);
        setIntField(term9236, term9236.getClass(), "counter", 100);
        setField(term9225, term9225.getClass(), "connectionInnovator", term9236);
        setLongField(term9239, term9239.getClass(), "value", 207466041698937L);
        setField(term9238, term9238.getClass(), "seed", term9239);
        setDoubleField(term9238, term9238.getClass(), "nextNextGaussian", 0.5197346036604176);
        setBooleanField(term9238, term9238.getClass(), "haveNextNextGaussian", false);
        setField(term9225, term9225.getClass(), "random", term9238);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleConnectionMutation", argTypes, term9225, args);
    }

};


