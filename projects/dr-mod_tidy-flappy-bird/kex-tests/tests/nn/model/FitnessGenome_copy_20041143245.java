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
     Object term10895;

    public FitnessGenome_copy_20041143245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10899 = newInstance(Class.forName("nn.model.Node"));
        setField(term10899, term10899.getClass(), "type", null);
        setIntField(term10899, term10899.getClass(), "innovation", -400720912);
        setField(term10899, term10899.getClass(), "connections", null);
        setDoubleField(term10899, term10899.getClass(), "bias", 0.03123965072102497);
        ArrayList term10897 = new ArrayList();
        ((ArrayList) term10897).add(term10899);
        Object term10906 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10906, term10906.getClass(), "in", null);
        setField(term10906, term10906.getClass(), "out", null);
        setFloatField(term10906, term10906.getClass(), "weight", 0.51252073F);
        setBooleanField(term10906, term10906.getClass(), "expressed", true);
        setIntField(term10906, term10906.getClass(), "innovation", -89522625);
        Object term10910 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10910, term10910.getClass(), "in", term10899);
        setField(term10910, term10910.getClass(), "out", null);
        setFloatField(term10910, term10910.getClass(), "weight", 0.9906085F);
        setBooleanField(term10910, term10910.getClass(), "expressed", false);
        setIntField(term10910, term10910.getClass(), "innovation", 1232958763);
        Object term10914 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10914, term10914.getClass(), "in", null);
        setField(term10914, term10914.getClass(), "out", null);
        setFloatField(term10914, term10914.getClass(), "weight", 0.5379623F);
        setBooleanField(term10914, term10914.getClass(), "expressed", true);
        setIntField(term10914, term10914.getClass(), "innovation", -2014792457);
        Object term10918 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10918, term10918.getClass(), "in", null);
        setField(term10918, term10918.getClass(), "out", null);
        setFloatField(term10918, term10918.getClass(), "weight", 0.010970712F);
        setBooleanField(term10918, term10918.getClass(), "expressed", false);
        setIntField(term10918, term10918.getClass(), "innovation", -1419341969);
        Object term10922 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10922, term10922.getClass(), "in", null);
        setField(term10922, term10922.getClass(), "out", null);
        setFloatField(term10922, term10922.getClass(), "weight", 0.19754016F);
        setBooleanField(term10922, term10922.getClass(), "expressed", true);
        setIntField(term10922, term10922.getClass(), "innovation", -1510967747);
        Object term10926 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10926, term10926.getClass(), "in", null);
        setField(term10926, term10926.getClass(), "out", null);
        setFloatField(term10926, term10926.getClass(), "weight", 0.16822469F);
        setBooleanField(term10926, term10926.getClass(), "expressed", false);
        setIntField(term10926, term10926.getClass(), "innovation", -2004794532);
        ArrayList term10904 = new ArrayList();
        ((ArrayList) term10904).add(term10906);
        ((ArrayList) term10904).add(term10910);
        ((ArrayList) term10904).add(term10914);
        ((ArrayList) term10904).add(term10914);
        ((ArrayList) term10904).add(term10918);
        ((ArrayList) term10904).add(term10906);
        ((ArrayList) term10904).add(term10906);
        ((ArrayList) term10904).add(term10922);
        ((ArrayList) term10904).add(term10926);
        term10895 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10896 = newInstance(Class.forName("nn.model.Genome"));
        Object term10932 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10934 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10936 = newInstance(Class.forName("java.util.Random"));
        Object term10937 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10896, term10896.getClass(), "nodes", term10897);
        setField(term10896, term10896.getClass(), "connections", term10904);
        setIntField(term10932, term10932.getClass(), "counter", 100);
        setField(term10896, term10896.getClass(), "nodeInnovator", term10932);
        setIntField(term10934, term10934.getClass(), "counter", 100);
        setField(term10896, term10896.getClass(), "connectionInnovator", term10934);
        setLongField(term10937, term10937.getClass(), "value", 256726286344537L);
        setField(term10936, term10936.getClass(), "seed", term10937);
        setDoubleField(term10936, term10936.getClass(), "nextNextGaussian", 0.026533684659376444);
        setBooleanField(term10936, term10936.getClass(), "haveNextNextGaussian", true);
        setField(term10896, term10896.getClass(), "random", term10936);
        setField(term10895, term10895.getClass(), "genome", term10896);
        setDoubleField(term10895, term10895.getClass(), "fitness", 0.11613622644165744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term10895, args);
    }

};


