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

public class Genome_toggleConnectionMutation_65668201411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7379;

    public Genome_toggleConnectionMutation_65668201411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7380 = new ArrayList();
        Object term7386 = newInstance(Class.forName("nn.model.Connection"));
        Object term7387 = newInstance(Class.forName("nn.model.Node"));
        Object term7390 = newInstance(Class.forName("nn.model.Node"));
        setField(term7387, term7387.getClass(), "type", null);
        setIntField(term7387, term7387.getClass(), "innovation", 185751892);
        setField(term7387, term7387.getClass(), "connections", null);
        setDoubleField(term7387, term7387.getClass(), "bias", 0.9377667036664316);
        setField(term7386, term7386.getClass(), "in", term7387);
        setField(term7390, term7390.getClass(), "type", null);
        setIntField(term7390, term7390.getClass(), "innovation", 0);
        setField(term7390, term7390.getClass(), "connections", null);
        setDoubleField(term7390, term7390.getClass(), "bias", 0.0);
        setField(term7386, term7386.getClass(), "out", term7390);
        setFloatField(term7386, term7386.getClass(), "weight", 0.8797888F);
        setBooleanField(term7386, term7386.getClass(), "expressed", true);
        setIntField(term7386, term7386.getClass(), "innovation", -1635571857);
        Object term7396 = newInstance(Class.forName("nn.model.Connection"));
        Object term7397 = newInstance(Class.forName("nn.model.Node"));
        Object term7400 = newInstance(Class.forName("nn.model.Node"));
        setField(term7397, term7397.getClass(), "type", null);
        setIntField(term7397, term7397.getClass(), "innovation", 0);
        setField(term7397, term7397.getClass(), "connections", null);
        setDoubleField(term7397, term7397.getClass(), "bias", 0.0);
        setField(term7396, term7396.getClass(), "in", term7397);
        setField(term7400, term7400.getClass(), "type", null);
        setIntField(term7400, term7400.getClass(), "innovation", 0);
        setField(term7400, term7400.getClass(), "connections", null);
        setDoubleField(term7400, term7400.getClass(), "bias", 0.0);
        setField(term7396, term7396.getClass(), "out", term7400);
        setFloatField(term7396, term7396.getClass(), "weight", 0.0048968196F);
        setBooleanField(term7396, term7396.getClass(), "expressed", true);
        setIntField(term7396, term7396.getClass(), "innovation", -1186882318);
        ArrayList term7384 = new ArrayList();
        ((ArrayList) term7384).add(term7386);
        ((ArrayList) term7384).add(term7396);
        term7379 = newInstance(Class.forName("nn.model.Genome"));
        Object term7408 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term7410 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term7412 = newInstance(Class.forName("java.util.Random"));
        Object term7413 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term7379, term7379.getClass(), "nodes", term7380);
        setField(term7379, term7379.getClass(), "connections", term7384);
        setIntField(term7408, term7408.getClass(), "counter", 100);
        setField(term7379, term7379.getClass(), "nodeInnovator", term7408);
        setIntField(term7410, term7410.getClass(), "counter", 100);
        setField(term7379, term7379.getClass(), "connectionInnovator", term7410);
        setLongField(term7413, term7413.getClass(), "value", 140430534877357L);
        setField(term7412, term7412.getClass(), "seed", term7413);
        setDoubleField(term7412, term7412.getClass(), "nextNextGaussian", 0.8863099799682007);
        setBooleanField(term7412, term7412.getClass(), "haveNextNextGaussian", true);
        setField(term7379, term7379.getClass(), "random", term7412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toggleConnectionMutation", argTypes, term7379, args);
    }

};


