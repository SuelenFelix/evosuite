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
import java.util.ArrayList;

public class FitnessGenome_copy_20041143245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10907;

    public FitnessGenome_copy_20041143245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10911 = newInstance(Class.forName("nn.model.Node"));
        setField(term10911, term10911.getClass(), "type", null);
        setIntField(term10911, term10911.getClass(), "innovation", -400720912);
        setField(term10911, term10911.getClass(), "connections", null);
        setDoubleField(term10911, term10911.getClass(), "bias", 0.03123965072102497);
        ArrayList term10909 = new ArrayList();
        ((ArrayList) term10909).add(term10911);
        Object term10918 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10918, term10918.getClass(), "in", null);
        setField(term10918, term10918.getClass(), "out", null);
        setFloatField(term10918, term10918.getClass(), "weight", 0.51252073F);
        setBooleanField(term10918, term10918.getClass(), "expressed", true);
        setIntField(term10918, term10918.getClass(), "innovation", -89522625);
        Object term10922 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10922, term10922.getClass(), "in", term10911);
        setField(term10922, term10922.getClass(), "out", null);
        setFloatField(term10922, term10922.getClass(), "weight", 0.9906085F);
        setBooleanField(term10922, term10922.getClass(), "expressed", false);
        setIntField(term10922, term10922.getClass(), "innovation", 1232958763);
        Object term10926 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10926, term10926.getClass(), "in", null);
        setField(term10926, term10926.getClass(), "out", null);
        setFloatField(term10926, term10926.getClass(), "weight", 0.5379623F);
        setBooleanField(term10926, term10926.getClass(), "expressed", true);
        setIntField(term10926, term10926.getClass(), "innovation", -2014792457);
        Object term10930 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10930, term10930.getClass(), "in", null);
        setField(term10930, term10930.getClass(), "out", null);
        setFloatField(term10930, term10930.getClass(), "weight", 0.010970712F);
        setBooleanField(term10930, term10930.getClass(), "expressed", false);
        setIntField(term10930, term10930.getClass(), "innovation", -1419341969);
        Object term10934 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10934, term10934.getClass(), "in", null);
        setField(term10934, term10934.getClass(), "out", null);
        setFloatField(term10934, term10934.getClass(), "weight", 0.19754016F);
        setBooleanField(term10934, term10934.getClass(), "expressed", true);
        setIntField(term10934, term10934.getClass(), "innovation", -1510967747);
        Object term10938 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10938, term10938.getClass(), "in", null);
        setField(term10938, term10938.getClass(), "out", null);
        setFloatField(term10938, term10938.getClass(), "weight", 0.16822469F);
        setBooleanField(term10938, term10938.getClass(), "expressed", false);
        setIntField(term10938, term10938.getClass(), "innovation", -2004794532);
        ArrayList term10916 = new ArrayList();
        ((ArrayList) term10916).add(term10918);
        ((ArrayList) term10916).add(term10922);
        ((ArrayList) term10916).add(term10926);
        ((ArrayList) term10916).add(term10926);
        ((ArrayList) term10916).add(term10930);
        ((ArrayList) term10916).add(term10918);
        ((ArrayList) term10916).add(term10918);
        ((ArrayList) term10916).add(term10934);
        ((ArrayList) term10916).add(term10938);
        term10907 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10908 = newInstance(Class.forName("nn.model.Genome"));
        Object term10944 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10946 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10948 = newInstance(Class.forName("java.util.Random"));
        Object term10949 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10908, term10908.getClass(), "nodes", term10909);
        setField(term10908, term10908.getClass(), "connections", term10916);
        setIntField(term10944, term10944.getClass(), "counter", 100);
        setField(term10908, term10908.getClass(), "nodeInnovator", term10944);
        setIntField(term10946, term10946.getClass(), "counter", 100);
        setField(term10908, term10908.getClass(), "connectionInnovator", term10946);
        setLongField(term10949, term10949.getClass(), "value", 259974090803934L);
        setField(term10948, term10948.getClass(), "seed", term10949);
        setDoubleField(term10948, term10948.getClass(), "nextNextGaussian", 0.026533684659376444);
        setBooleanField(term10948, term10948.getClass(), "haveNextNextGaussian", true);
        setField(term10908, term10908.getClass(), "random", term10948);
        setField(term10907, term10907.getClass(), "genome", term10908);
        setDoubleField(term10907, term10907.getClass(), "fitness", 0.11613622644165744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term10907, args);
    }

};


