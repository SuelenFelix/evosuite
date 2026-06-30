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
     Object term9223;

    public Genome_toggleConnectionMutation_6566820149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9224 = new ArrayList();
        ArrayList term9228 = new ArrayList();
        term9223 = newInstance(Class.forName("nn.model.Genome"));
        Object term9232 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term9234 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term9236 = newInstance(Class.forName("java.util.Random"));
        Object term9237 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term9223, term9223.getClass(), "nodes", term9224);
        setField(term9223, term9223.getClass(), "connections", term9228);
        setIntField(term9232, term9232.getClass(), "counter", 100);
        setField(term9223, term9223.getClass(), "nodeInnovator", term9232);
        setIntField(term9234, term9234.getClass(), "counter", 100);
        setField(term9223, term9223.getClass(), "connectionInnovator", term9234);
        setLongField(term9237, term9237.getClass(), "value", 25973078507782L);
        setField(term9236, term9236.getClass(), "seed", term9237);
        setDoubleField(term9236, term9236.getClass(), "nextNextGaussian", 0.5197346036604176);
        setBooleanField(term9236, term9236.getClass(), "haveNextNextGaussian", false);
        setField(term9223, term9223.getClass(), "random", term9236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleConnectionMutation", argTypes, term9223, args);
    }

};


