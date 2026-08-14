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

public class Genome_randomBias_86543780316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10627;

    public Genome_randomBias_86543780316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10628 = new ArrayList();
        Object term10634 = newInstance(Class.forName("nn.model.Connection"));
        Object term10635 = newInstance(Class.forName("nn.model.Node"));
        Object term10638 = newInstance(Class.forName("nn.model.Node"));
        setField(term10635, term10635.getClass(), "type", null);
        setIntField(term10635, term10635.getClass(), "innovation", -784924879);
        setField(term10635, term10635.getClass(), "connections", null);
        setDoubleField(term10635, term10635.getClass(), "bias", 0.5731930829917865);
        setField(term10634, term10634.getClass(), "in", term10635);
        setField(term10638, term10638.getClass(), "type", null);
        setIntField(term10638, term10638.getClass(), "innovation", 0);
        setField(term10638, term10638.getClass(), "connections", null);
        setDoubleField(term10638, term10638.getClass(), "bias", 0.0);
        setField(term10634, term10634.getClass(), "out", term10638);
        setFloatField(term10634, term10634.getClass(), "weight", 0.5547277F);
        setBooleanField(term10634, term10634.getClass(), "expressed", false);
        setIntField(term10634, term10634.getClass(), "innovation", -2047179134);
        Object term10644 = newInstance(Class.forName("nn.model.Connection"));
        Object term10645 = newInstance(Class.forName("nn.model.Node"));
        Object term10648 = newInstance(Class.forName("nn.model.Node"));
        setField(term10645, term10645.getClass(), "type", null);
        setIntField(term10645, term10645.getClass(), "innovation", 1644949396);
        setField(term10645, term10645.getClass(), "connections", null);
        setDoubleField(term10645, term10645.getClass(), "bias", 0.46738526389049295);
        setField(term10644, term10644.getClass(), "in", term10645);
        setField(term10648, term10648.getClass(), "type", null);
        setIntField(term10648, term10648.getClass(), "innovation", -1062027102);
        setField(term10648, term10648.getClass(), "connections", null);
        setDoubleField(term10648, term10648.getClass(), "bias", 0.3748057502836176);
        setField(term10644, term10644.getClass(), "out", term10648);
        setFloatField(term10644, term10644.getClass(), "weight", 0.040501416F);
        setBooleanField(term10644, term10644.getClass(), "expressed", true);
        setIntField(term10644, term10644.getClass(), "innovation", 765680355);
        Object term10654 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10654, term10654.getClass(), "in", term10645);
        setField(term10654, term10654.getClass(), "out", term10638);
        setFloatField(term10654, term10654.getClass(), "weight", 0.54085016F);
        setBooleanField(term10654, term10654.getClass(), "expressed", false);
        setIntField(term10654, term10654.getClass(), "innovation", -1012090049);
        Object term10658 = newInstance(Class.forName("nn.model.Connection"));
        Object term10659 = newInstance(Class.forName("nn.model.Node"));
        Object term10662 = newInstance(Class.forName("nn.model.Node"));
        setField(term10659, term10659.getClass(), "type", null);
        setIntField(term10659, term10659.getClass(), "innovation", 0);
        setField(term10659, term10659.getClass(), "connections", null);
        setDoubleField(term10659, term10659.getClass(), "bias", 0.0);
        setField(term10658, term10658.getClass(), "in", term10659);
        setField(term10662, term10662.getClass(), "type", null);
        setIntField(term10662, term10662.getClass(), "innovation", 0);
        setField(term10662, term10662.getClass(), "connections", null);
        setDoubleField(term10662, term10662.getClass(), "bias", 0.0);
        setField(term10658, term10658.getClass(), "out", term10662);
        setFloatField(term10658, term10658.getClass(), "weight", 0.38042516F);
        setBooleanField(term10658, term10658.getClass(), "expressed", false);
        setIntField(term10658, term10658.getClass(), "innovation", -2017073245);
        Object term10668 = newInstance(Class.forName("nn.model.Connection"));
        Object term10669 = newInstance(Class.forName("nn.model.Node"));
        setField(term10668, term10668.getClass(), "in", term10648);
        setField(term10669, term10669.getClass(), "type", null);
        setIntField(term10669, term10669.getClass(), "innovation", 1763217806);
        setField(term10669, term10669.getClass(), "connections", null);
        setDoubleField(term10669, term10669.getClass(), "bias", 0.2768470919610353);
        setField(term10668, term10668.getClass(), "out", term10669);
        setFloatField(term10668, term10668.getClass(), "weight", 6.133914E-4F);
        setBooleanField(term10668, term10668.getClass(), "expressed", false);
        setIntField(term10668, term10668.getClass(), "innovation", -154750730);
        Object term10675 = newInstance(Class.forName("nn.model.Connection"));
        Object term10676 = newInstance(Class.forName("nn.model.Node"));
        Object term10679 = newInstance(Class.forName("nn.model.Node"));
        setField(term10676, term10676.getClass(), "type", null);
        setIntField(term10676, term10676.getClass(), "innovation", 0);
        setField(term10676, term10676.getClass(), "connections", null);
        setDoubleField(term10676, term10676.getClass(), "bias", 0.0);
        setField(term10675, term10675.getClass(), "in", term10676);
        setField(term10679, term10679.getClass(), "type", null);
        setIntField(term10679, term10679.getClass(), "innovation", 0);
        setField(term10679, term10679.getClass(), "connections", null);
        setDoubleField(term10679, term10679.getClass(), "bias", 0.0);
        setField(term10675, term10675.getClass(), "out", term10679);
        setFloatField(term10675, term10675.getClass(), "weight", 0.6704848F);
        setBooleanField(term10675, term10675.getClass(), "expressed", true);
        setIntField(term10675, term10675.getClass(), "innovation", 1516598327);
        ArrayList term10632 = new ArrayList();
        ((ArrayList) term10632).add(term10634);
        ((ArrayList) term10632).add(term10644);
        ((ArrayList) term10632).add(term10644);
        ((ArrayList) term10632).add(term10654);
        ((ArrayList) term10632).add(term10658);
        ((ArrayList) term10632).add(term10658);
        ((ArrayList) term10632).add(term10668);
        ((ArrayList) term10632).add(term10675);
        ((ArrayList) term10632).add(term10675);
        term10627 = newInstance(Class.forName("nn.model.Genome"));
        Object term10687 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10689 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10691 = newInstance(Class.forName("java.util.Random"));
        Object term10692 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10627, term10627.getClass(), "nodes", term10628);
        setField(term10627, term10627.getClass(), "connections", term10632);
        setIntField(term10687, term10687.getClass(), "counter", 100);
        setField(term10627, term10627.getClass(), "nodeInnovator", term10687);
        setIntField(term10689, term10689.getClass(), "counter", 100);
        setField(term10627, term10627.getClass(), "connectionInnovator", term10689);
        setLongField(term10692, term10692.getClass(), "value", 64052298483609L);
        setField(term10691, term10691.getClass(), "seed", term10692);
        setDoubleField(term10691, term10691.getClass(), "nextNextGaussian", 0.7539051746561026);
        setBooleanField(term10691, term10691.getClass(), "haveNextNextGaussian", false);
        setField(term10627, term10627.getClass(), "random", term10691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomBias", argTypes, term10627, args);
    }

};


