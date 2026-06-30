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

public class FitnessGenome_compareTo_7266809091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10685;
     Object term10720;

    public FitnessGenome_compareTo_7266809091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10689 = newInstance(Class.forName("nn.model.Node"));
        setField(term10689, term10689.getClass(), "type", null);
        setIntField(term10689, term10689.getClass(), "innovation", 695330987);
        setField(term10689, term10689.getClass(), "connections", null);
        setDoubleField(term10689, term10689.getClass(), "bias", 0.7174146280831781);
        Object term10692 = newInstance(Class.forName("nn.model.Node"));
        setField(term10692, term10692.getClass(), "type", null);
        setIntField(term10692, term10692.getClass(), "innovation", 0);
        setField(term10692, term10692.getClass(), "connections", null);
        setDoubleField(term10692, term10692.getClass(), "bias", 0.0);
        Object term10695 = newInstance(Class.forName("nn.model.Node"));
        setField(term10695, term10695.getClass(), "type", null);
        setIntField(term10695, term10695.getClass(), "innovation", 0);
        setField(term10695, term10695.getClass(), "connections", null);
        setDoubleField(term10695, term10695.getClass(), "bias", 0.0);
        Object term10698 = newInstance(Class.forName("nn.model.Node"));
        setField(term10698, term10698.getClass(), "type", null);
        setIntField(term10698, term10698.getClass(), "innovation", 773432822);
        setField(term10698, term10698.getClass(), "connections", null);
        setDoubleField(term10698, term10698.getClass(), "bias", 0.6104966841551919);
        Object term10701 = newInstance(Class.forName("nn.model.Node"));
        setField(term10701, term10701.getClass(), "type", null);
        setIntField(term10701, term10701.getClass(), "innovation", 0);
        setField(term10701, term10701.getClass(), "connections", null);
        setDoubleField(term10701, term10701.getClass(), "bias", 0.0);
        ArrayList term10687 = new ArrayList();
        ((ArrayList) term10687).add(term10689);
        ((ArrayList) term10687).add(term10692);
        ((ArrayList) term10687).add(term10695);
        ((ArrayList) term10687).add(term10698);
        ((ArrayList) term10687).add(term10701);
        ((ArrayList) term10687).add(term10692);
        ArrayList term10706 = new ArrayList();
        term10685 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10686 = newInstance(Class.forName("nn.model.Genome"));
        Object term10710 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10712 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10714 = newInstance(Class.forName("java.util.Random"));
        Object term10715 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10686, term10686.getClass(), "nodes", term10687);
        setField(term10686, term10686.getClass(), "connections", term10706);
        setIntField(term10710, term10710.getClass(), "counter", 100);
        setField(term10686, term10686.getClass(), "nodeInnovator", term10710);
        setIntField(term10712, term10712.getClass(), "counter", 100);
        setField(term10686, term10686.getClass(), "connectionInnovator", term10712);
        setLongField(term10715, term10715.getClass(), "value", 254281548170488L);
        setField(term10714, term10714.getClass(), "seed", term10715);
        setDoubleField(term10714, term10714.getClass(), "nextNextGaussian", 0.9120605477208);
        setBooleanField(term10714, term10714.getClass(), "haveNextNextGaussian", false);
        setField(term10686, term10686.getClass(), "random", term10714);
        setField(term10685, term10685.getClass(), "genome", term10686);
        setDoubleField(term10685, term10685.getClass(), "fitness", 0.302896023969903);
        Object term10724 = newInstance(Class.forName("nn.model.Node"));
        setField(term10724, term10724.getClass(), "type", null);
        setIntField(term10724, term10724.getClass(), "innovation", 433039357);
        setField(term10724, term10724.getClass(), "connections", null);
        setDoubleField(term10724, term10724.getClass(), "bias", 0.5592771838075339);
        Object term10727 = newInstance(Class.forName("nn.model.Node"));
        setField(term10727, term10727.getClass(), "type", null);
        setIntField(term10727, term10727.getClass(), "innovation", -269909549);
        setField(term10727, term10727.getClass(), "connections", null);
        setDoubleField(term10727, term10727.getClass(), "bias", 0.11759977190822413);
        Object term10730 = newInstance(Class.forName("nn.model.Node"));
        setField(term10730, term10730.getClass(), "type", null);
        setIntField(term10730, term10730.getClass(), "innovation", 1469939797);
        setField(term10730, term10730.getClass(), "connections", null);
        setDoubleField(term10730, term10730.getClass(), "bias", 0.8093135131302098);
        Object term10733 = newInstance(Class.forName("nn.model.Node"));
        setField(term10733, term10733.getClass(), "type", null);
        setIntField(term10733, term10733.getClass(), "innovation", 0);
        setField(term10733, term10733.getClass(), "connections", null);
        setDoubleField(term10733, term10733.getClass(), "bias", 0.0);
        Object term10736 = newInstance(Class.forName("nn.model.Node"));
        setField(term10736, term10736.getClass(), "type", null);
        setIntField(term10736, term10736.getClass(), "innovation", 0);
        setField(term10736, term10736.getClass(), "connections", null);
        setDoubleField(term10736, term10736.getClass(), "bias", 0.0);
        Object term10739 = newInstance(Class.forName("nn.model.Node"));
        setField(term10739, term10739.getClass(), "type", null);
        setIntField(term10739, term10739.getClass(), "innovation", 0);
        setField(term10739, term10739.getClass(), "connections", null);
        setDoubleField(term10739, term10739.getClass(), "bias", 0.0);
        Object term10742 = newInstance(Class.forName("nn.model.Node"));
        setField(term10742, term10742.getClass(), "type", null);
        setIntField(term10742, term10742.getClass(), "innovation", 252799294);
        setField(term10742, term10742.getClass(), "connections", null);
        setDoubleField(term10742, term10742.getClass(), "bias", 0.5583293703509996);
        ArrayList term10722 = new ArrayList();
        ((ArrayList) term10722).add(term10724);
        ((ArrayList) term10722).add(term10727);
        ((ArrayList) term10722).add(term10727);
        ((ArrayList) term10722).add(term10730);
        ((ArrayList) term10722).add(term10733);
        ((ArrayList) term10722).add(term10733);
        ((ArrayList) term10722).add(term10736);
        ((ArrayList) term10722).add(term10739);
        ((ArrayList) term10722).add(term10742);
        Object term10749 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10749, term10749.getClass(), "in", term10724);
        setField(term10749, term10749.getClass(), "out", null);
        setFloatField(term10749, term10749.getClass(), "weight", 0.9700962F);
        setBooleanField(term10749, term10749.getClass(), "expressed", false);
        setIntField(term10749, term10749.getClass(), "innovation", -773707674);
        Object term10753 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10753, term10753.getClass(), "in", term10739);
        setField(term10753, term10753.getClass(), "out", null);
        setFloatField(term10753, term10753.getClass(), "weight", 0.7037769F);
        setBooleanField(term10753, term10753.getClass(), "expressed", true);
        setIntField(term10753, term10753.getClass(), "innovation", 1691516034);
        Object term10757 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10757, term10757.getClass(), "in", term10742);
        setField(term10757, term10757.getClass(), "out", null);
        setFloatField(term10757, term10757.getClass(), "weight", 0.43252808F);
        setBooleanField(term10757, term10757.getClass(), "expressed", true);
        setIntField(term10757, term10757.getClass(), "innovation", -484303394);
        Object term10761 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10761, term10761.getClass(), "in", null);
        setField(term10761, term10761.getClass(), "out", term10730);
        setFloatField(term10761, term10761.getClass(), "weight", 0.49736315F);
        setBooleanField(term10761, term10761.getClass(), "expressed", false);
        setIntField(term10761, term10761.getClass(), "innovation", 383244929);
        Object term10765 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10765, term10765.getClass(), "in", null);
        setField(term10765, term10765.getClass(), "out", null);
        setFloatField(term10765, term10765.getClass(), "weight", 0.43500775F);
        setBooleanField(term10765, term10765.getClass(), "expressed", false);
        setIntField(term10765, term10765.getClass(), "innovation", 207213904);
        ArrayList term10747 = new ArrayList();
        ((ArrayList) term10747).add(term10749);
        ((ArrayList) term10747).add(term10753);
        ((ArrayList) term10747).add(term10757);
        ((ArrayList) term10747).add(term10761);
        ((ArrayList) term10747).add(term10753);
        ((ArrayList) term10747).add(term10753);
        ((ArrayList) term10747).add(term10765);
        term10720 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10721 = newInstance(Class.forName("nn.model.Genome"));
        Object term10771 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10773 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10775 = newInstance(Class.forName("java.util.Random"));
        Object term10776 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10721, term10721.getClass(), "nodes", term10722);
        setField(term10721, term10721.getClass(), "connections", term10747);
        setIntField(term10771, term10771.getClass(), "counter", 100);
        setField(term10721, term10721.getClass(), "nodeInnovator", term10771);
        setIntField(term10773, term10773.getClass(), "counter", 100);
        setField(term10721, term10721.getClass(), "connectionInnovator", term10773);
        setLongField(term10776, term10776.getClass(), "value", 47785507608059L);
        setField(term10775, term10775.getClass(), "seed", term10776);
        setDoubleField(term10775, term10775.getClass(), "nextNextGaussian", 0.8514246643563477);
        setBooleanField(term10775, term10775.getClass(), "haveNextNextGaussian", false);
        setField(term10721, term10721.getClass(), "random", term10775);
        setField(term10720, term10720.getClass(), "genome", term10721);
        setDoubleField(term10720, term10720.getClass(), "fitness", 0.07779122290725593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term10720;
        callMethod(klass, "compareTo", argTypes, term10685, args);
    }

};


