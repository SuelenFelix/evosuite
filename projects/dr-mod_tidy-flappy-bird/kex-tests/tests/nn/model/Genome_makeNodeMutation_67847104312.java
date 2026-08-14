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

public class Genome_makeNodeMutation_67847104312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7417;

    public Genome_makeNodeMutation_67847104312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7418 = new ArrayList();
        Object term7424 = newInstance(Class.forName("nn.model.Connection"));
        Object term7425 = newInstance(Class.forName("nn.model.Node"));
        Object term7428 = newInstance(Class.forName("nn.model.Node"));
        setField(term7425, term7425.getClass(), "type", null);
        setIntField(term7425, term7425.getClass(), "innovation", 1407309162);
        setField(term7425, term7425.getClass(), "connections", null);
        setDoubleField(term7425, term7425.getClass(), "bias", 0.8485928043846015);
        setField(term7424, term7424.getClass(), "in", term7425);
        setField(term7428, term7428.getClass(), "type", null);
        setIntField(term7428, term7428.getClass(), "innovation", -2058884635);
        setField(term7428, term7428.getClass(), "connections", null);
        setDoubleField(term7428, term7428.getClass(), "bias", 0.5264336188208859);
        setField(term7424, term7424.getClass(), "out", term7428);
        setFloatField(term7424, term7424.getClass(), "weight", 0.795941F);
        setBooleanField(term7424, term7424.getClass(), "expressed", false);
        setIntField(term7424, term7424.getClass(), "innovation", 919994471);
        Object term7434 = newInstance(Class.forName("nn.model.Connection"));
        Object term7435 = newInstance(Class.forName("nn.model.Node"));
        Object term7438 = newInstance(Class.forName("nn.model.Node"));
        setField(term7435, term7435.getClass(), "type", null);
        setIntField(term7435, term7435.getClass(), "innovation", -534033672);
        setField(term7435, term7435.getClass(), "connections", null);
        setDoubleField(term7435, term7435.getClass(), "bias", 0.8361530707429777);
        setField(term7434, term7434.getClass(), "in", term7435);
        setField(term7438, term7438.getClass(), "type", null);
        setIntField(term7438, term7438.getClass(), "innovation", -1162790806);
        setField(term7438, term7438.getClass(), "connections", null);
        setDoubleField(term7438, term7438.getClass(), "bias", 0.4215991359766782);
        setField(term7434, term7434.getClass(), "out", term7438);
        setFloatField(term7434, term7434.getClass(), "weight", 0.28105962F);
        setBooleanField(term7434, term7434.getClass(), "expressed", true);
        setIntField(term7434, term7434.getClass(), "innovation", -1731921726);
        ArrayList term7422 = new ArrayList();
        ((ArrayList) term7422).add(term7424);
        ((ArrayList) term7422).add(term7434);
        term7417 = newInstance(Class.forName("nn.model.Genome"));
        Object term7446 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7448 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7450 = newInstance(Class.forName("java.util.Random"));
        Object term7451 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7417, term7417.getClass(), "nodes", term7418);
        setField(term7417, term7417.getClass(), "connections", term7422);
        setIntField(term7446, term7446.getClass(), "counter", 100);
        setField(term7417, term7417.getClass(), "nodeInnovator", term7446);
        setIntField(term7448, term7448.getClass(), "counter", 100);
        setField(term7417, term7417.getClass(), "connectionInnovator", term7448);
        setLongField(term7451, term7451.getClass(), "value", 233705789046922L);
        setField(term7450, term7450.getClass(), "seed", term7451);
        setDoubleField(term7450, term7450.getClass(), "nextNextGaussian", 0.3422470250555786);
        setBooleanField(term7450, term7450.getClass(), "haveNextNextGaussian", false);
        setField(term7417, term7417.getClass(), "random", term7450);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeNodeMutation", argTypes, term7417, args);
    }

};


