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

public class Genome_init_11716018280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5087;
     Object term5089;
     Object term5091;

    public Genome_init_11716018280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5087 = newInstance(Class.forName("nn.model.NodeInnovator"));
        setIntField(term5087, term5087.getClass(), "counter", 100);
        term5089 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        setIntField(term5089, term5089.getClass(), "counter", 100);
        term5091 = newInstance(Class.forName("java.util.Random"));
        Object term5092 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term5092, term5092.getClass(), "value", 255199994074783L);
        setField(term5091, term5091.getClass(), "seed", term5092);
        setDoubleField(term5091, term5091.getClass(), "nextNextGaussian", 0.6391065297971349);
        setBooleanField(term5091, term5091.getClass(), "haveNextNextGaussian", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("nn.model.NodeInnovator");
        argTypes[1] = Class.forName("nn.model.ConnectionInnovator");
        argTypes[2] = Class.forName("java.util.Random");
        Object[] args = new Object[3];
        args[0] = term5087;
        args[1] = term5089;
        args[2] = term5091;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


