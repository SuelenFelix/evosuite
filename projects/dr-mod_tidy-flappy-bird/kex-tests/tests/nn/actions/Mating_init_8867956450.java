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
import java.lang.Object;

public class Mating_init_8867956450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1436;
     Object term1441;
     Object term1443;

    public Mating_init_8867956450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1436 = newInstance(Class.forName("java.util.Random"));
        Object term1437 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setLongField(term1437, term1437.getClass(), "value", 105138792486701L);
        setField(term1436, term1436.getClass(), "seed", term1437);
        setDoubleField(term1436, term1436.getClass(), "nextNextGaussian", 0.9341364461850963);
        setBooleanField(term1436, term1436.getClass(), "haveNextNextGaussian", true);
        term1441 = newInstance(Class.forName("nn.model.NodeInnovator"));
        setIntField(term1441, term1441.getClass(), "counter", 100);
        term1443 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        setIntField(term1443, term1443.getClass(), "counter", 100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.actions.Mating");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Random");
        argTypes[1] = Class.forName("nn.model.NodeInnovator");
        argTypes[2] = Class.forName("nn.model.ConnectionInnovator");
        Object[] args = new Object[3];
        args[0] = term1436;
        args[1] = term1441;
        args[2] = term1443;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


