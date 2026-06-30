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
     Object term10625;

    public Genome_randomBias_86543780316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term10626 = new ArrayList();
        Object term10632 = newInstance(Class.forName("nn.model.Connection"));
        Object term10633 = newInstance(Class.forName("nn.model.Node"));
        Object term10636 = newInstance(Class.forName("nn.model.Node"));
        setField(term10633, term10633.getClass(), "type", null);
        setIntField(term10633, term10633.getClass(), "innovation", -784924879);
        setField(term10633, term10633.getClass(), "connections", null);
        setDoubleField(term10633, term10633.getClass(), "bias", 0.5731930829917865);
        setField(term10632, term10632.getClass(), "in", term10633);
        setField(term10636, term10636.getClass(), "type", null);
        setIntField(term10636, term10636.getClass(), "innovation", 0);
        setField(term10636, term10636.getClass(), "connections", null);
        setDoubleField(term10636, term10636.getClass(), "bias", 0.0);
        setField(term10632, term10632.getClass(), "out", term10636);
        setFloatField(term10632, term10632.getClass(), "weight", 0.5547277F);
        setBooleanField(term10632, term10632.getClass(), "expressed", false);
        setIntField(term10632, term10632.getClass(), "innovation", -2047179134);
        Object term10642 = newInstance(Class.forName("nn.model.Connection"));
        Object term10643 = newInstance(Class.forName("nn.model.Node"));
        Object term10646 = newInstance(Class.forName("nn.model.Node"));
        setField(term10643, term10643.getClass(), "type", null);
        setIntField(term10643, term10643.getClass(), "innovation", 1644949396);
        setField(term10643, term10643.getClass(), "connections", null);
        setDoubleField(term10643, term10643.getClass(), "bias", 0.46738526389049295);
        setField(term10642, term10642.getClass(), "in", term10643);
        setField(term10646, term10646.getClass(), "type", null);
        setIntField(term10646, term10646.getClass(), "innovation", -1062027102);
        setField(term10646, term10646.getClass(), "connections", null);
        setDoubleField(term10646, term10646.getClass(), "bias", 0.3748057502836176);
        setField(term10642, term10642.getClass(), "out", term10646);
        setFloatField(term10642, term10642.getClass(), "weight", 0.040501416F);
        setBooleanField(term10642, term10642.getClass(), "expressed", true);
        setIntField(term10642, term10642.getClass(), "innovation", 765680355);
        Object term10652 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10652, term10652.getClass(), "in", term10643);
        setField(term10652, term10652.getClass(), "out", term10636);
        setFloatField(term10652, term10652.getClass(), "weight", 0.54085016F);
        setBooleanField(term10652, term10652.getClass(), "expressed", false);
        setIntField(term10652, term10652.getClass(), "innovation", -1012090049);
        Object term10656 = newInstance(Class.forName("nn.model.Connection"));
        Object term10657 = newInstance(Class.forName("nn.model.Node"));
        Object term10660 = newInstance(Class.forName("nn.model.Node"));
        setField(term10657, term10657.getClass(), "type", null);
        setIntField(term10657, term10657.getClass(), "innovation", 0);
        setField(term10657, term10657.getClass(), "connections", null);
        setDoubleField(term10657, term10657.getClass(), "bias", 0.0);
        setField(term10656, term10656.getClass(), "in", term10657);
        setField(term10660, term10660.getClass(), "type", null);
        setIntField(term10660, term10660.getClass(), "innovation", 0);
        setField(term10660, term10660.getClass(), "connections", null);
        setDoubleField(term10660, term10660.getClass(), "bias", 0.0);
        setField(term10656, term10656.getClass(), "out", term10660);
        setFloatField(term10656, term10656.getClass(), "weight", 0.38042516F);
        setBooleanField(term10656, term10656.getClass(), "expressed", false);
        setIntField(term10656, term10656.getClass(), "innovation", -2017073245);
        Object term10666 = newInstance(Class.forName("nn.model.Connection"));
        Object term10667 = newInstance(Class.forName("nn.model.Node"));
        setField(term10666, term10666.getClass(), "in", term10646);
        setField(term10667, term10667.getClass(), "type", null);
        setIntField(term10667, term10667.getClass(), "innovation", 1763217806);
        setField(term10667, term10667.getClass(), "connections", null);
        setDoubleField(term10667, term10667.getClass(), "bias", 0.2768470919610353);
        setField(term10666, term10666.getClass(), "out", term10667);
        setFloatField(term10666, term10666.getClass(), "weight", 6.133914E-4F);
        setBooleanField(term10666, term10666.getClass(), "expressed", false);
        setIntField(term10666, term10666.getClass(), "innovation", -154750730);
        Object term10673 = newInstance(Class.forName("nn.model.Connection"));
        Object term10674 = newInstance(Class.forName("nn.model.Node"));
        Object term10677 = newInstance(Class.forName("nn.model.Node"));
        setField(term10674, term10674.getClass(), "type", null);
        setIntField(term10674, term10674.getClass(), "innovation", 0);
        setField(term10674, term10674.getClass(), "connections", null);
        setDoubleField(term10674, term10674.getClass(), "bias", 0.0);
        setField(term10673, term10673.getClass(), "in", term10674);
        setField(term10677, term10677.getClass(), "type", null);
        setIntField(term10677, term10677.getClass(), "innovation", 0);
        setField(term10677, term10677.getClass(), "connections", null);
        setDoubleField(term10677, term10677.getClass(), "bias", 0.0);
        setField(term10673, term10673.getClass(), "out", term10677);
        setFloatField(term10673, term10673.getClass(), "weight", 0.6704848F);
        setBooleanField(term10673, term10673.getClass(), "expressed", true);
        setIntField(term10673, term10673.getClass(), "innovation", 1516598327);
        ArrayList term10630 = new ArrayList();
        ((ArrayList) term10630).add(term10632);
        ((ArrayList) term10630).add(term10642);
        ((ArrayList) term10630).add(term10642);
        ((ArrayList) term10630).add(term10652);
        ((ArrayList) term10630).add(term10656);
        ((ArrayList) term10630).add(term10656);
        ((ArrayList) term10630).add(term10666);
        ((ArrayList) term10630).add(term10673);
        ((ArrayList) term10630).add(term10673);
        term10625 = newInstance(Class.forName("nn.model.Genome"));
        Object term10685 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10687 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10689 = newInstance(Class.forName("java.util.Random"));
        Object term10690 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10625, term10625.getClass(), "nodes", term10626);
        setField(term10625, term10625.getClass(), "connections", term10630);
        setIntField(term10685, term10685.getClass(), "counter", 100);
        setField(term10625, term10625.getClass(), "nodeInnovator", term10685);
        setIntField(term10687, term10687.getClass(), "counter", 100);
        setField(term10625, term10625.getClass(), "connectionInnovator", term10687);
        setLongField(term10690, term10690.getClass(), "value", 159902545640248L);
        setField(term10689, term10689.getClass(), "seed", term10690);
        setDoubleField(term10689, term10689.getClass(), "nextNextGaussian", 0.7539051746561026);
        setBooleanField(term10689, term10689.getClass(), "haveNextNextGaussian", false);
        setField(term10625, term10625.getClass(), "random", term10689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Genome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "randomBias", argTypes, term10625, args);
    }

};


