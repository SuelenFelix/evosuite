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
     Object term10682;
     Object term10717;

    public FitnessGenome_compareTo_7266809091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term10686 = newInstance(Class.forName("nn.model.Node"));
        setField(term10686, term10686.getClass(), "type", null);
        setIntField(term10686, term10686.getClass(), "innovation", 695330987);
        setField(term10686, term10686.getClass(), "connections", null);
        setDoubleField(term10686, term10686.getClass(), "bias", 0.7174146280831781);
        Object term10689 = newInstance(Class.forName("nn.model.Node"));
        setField(term10689, term10689.getClass(), "type", null);
        setIntField(term10689, term10689.getClass(), "innovation", 0);
        setField(term10689, term10689.getClass(), "connections", null);
        setDoubleField(term10689, term10689.getClass(), "bias", 0.0);
        Object term10692 = newInstance(Class.forName("nn.model.Node"));
        setField(term10692, term10692.getClass(), "type", null);
        setIntField(term10692, term10692.getClass(), "innovation", 0);
        setField(term10692, term10692.getClass(), "connections", null);
        setDoubleField(term10692, term10692.getClass(), "bias", 0.0);
        Object term10695 = newInstance(Class.forName("nn.model.Node"));
        setField(term10695, term10695.getClass(), "type", null);
        setIntField(term10695, term10695.getClass(), "innovation", 773432822);
        setField(term10695, term10695.getClass(), "connections", null);
        setDoubleField(term10695, term10695.getClass(), "bias", 0.6104966841551919);
        Object term10698 = newInstance(Class.forName("nn.model.Node"));
        setField(term10698, term10698.getClass(), "type", null);
        setIntField(term10698, term10698.getClass(), "innovation", 0);
        setField(term10698, term10698.getClass(), "connections", null);
        setDoubleField(term10698, term10698.getClass(), "bias", 0.0);
        ArrayList term10684 = new ArrayList();
        ((ArrayList) term10684).add(term10686);
        ((ArrayList) term10684).add(term10689);
        ((ArrayList) term10684).add(term10692);
        ((ArrayList) term10684).add(term10695);
        ((ArrayList) term10684).add(term10698);
        ((ArrayList) term10684).add(term10689);
        ArrayList term10703 = new ArrayList();
        term10682 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10683 = newInstance(Class.forName("nn.model.Genome"));
        Object term10707 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10709 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10711 = newInstance(Class.forName("java.util.Random"));
        Object term10712 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10683, term10683.getClass(), "nodes", term10684);
        setField(term10683, term10683.getClass(), "connections", term10703);
        setIntField(term10707, term10707.getClass(), "counter", 100);
        setField(term10683, term10683.getClass(), "nodeInnovator", term10707);
        setIntField(term10709, term10709.getClass(), "counter", 100);
        setField(term10683, term10683.getClass(), "connectionInnovator", term10709);
        setLongField(term10712, term10712.getClass(), "value", 28164837032416L);
        setField(term10711, term10711.getClass(), "seed", term10712);
        setDoubleField(term10711, term10711.getClass(), "nextNextGaussian", 0.9120605477208);
        setBooleanField(term10711, term10711.getClass(), "haveNextNextGaussian", false);
        setField(term10683, term10683.getClass(), "random", term10711);
        setField(term10682, term10682.getClass(), "genome", term10683);
        setDoubleField(term10682, term10682.getClass(), "fitness", 0.302896023969903);
        Object term10721 = newInstance(Class.forName("nn.model.Node"));
        setField(term10721, term10721.getClass(), "type", null);
        setIntField(term10721, term10721.getClass(), "innovation", 433039357);
        setField(term10721, term10721.getClass(), "connections", null);
        setDoubleField(term10721, term10721.getClass(), "bias", 0.5592771838075339);
        Object term10724 = newInstance(Class.forName("nn.model.Node"));
        setField(term10724, term10724.getClass(), "type", null);
        setIntField(term10724, term10724.getClass(), "innovation", -269909549);
        setField(term10724, term10724.getClass(), "connections", null);
        setDoubleField(term10724, term10724.getClass(), "bias", 0.11759977190822413);
        Object term10727 = newInstance(Class.forName("nn.model.Node"));
        setField(term10727, term10727.getClass(), "type", null);
        setIntField(term10727, term10727.getClass(), "innovation", 1469939797);
        setField(term10727, term10727.getClass(), "connections", null);
        setDoubleField(term10727, term10727.getClass(), "bias", 0.8093135131302098);
        Object term10730 = newInstance(Class.forName("nn.model.Node"));
        setField(term10730, term10730.getClass(), "type", null);
        setIntField(term10730, term10730.getClass(), "innovation", 0);
        setField(term10730, term10730.getClass(), "connections", null);
        setDoubleField(term10730, term10730.getClass(), "bias", 0.0);
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
        setIntField(term10739, term10739.getClass(), "innovation", 252799294);
        setField(term10739, term10739.getClass(), "connections", null);
        setDoubleField(term10739, term10739.getClass(), "bias", 0.5583293703509996);
        ArrayList term10719 = new ArrayList();
        ((ArrayList) term10719).add(term10721);
        ((ArrayList) term10719).add(term10724);
        ((ArrayList) term10719).add(term10724);
        ((ArrayList) term10719).add(term10727);
        ((ArrayList) term10719).add(term10730);
        ((ArrayList) term10719).add(term10730);
        ((ArrayList) term10719).add(term10733);
        ((ArrayList) term10719).add(term10736);
        ((ArrayList) term10719).add(term10739);
        Object term10746 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10746, term10746.getClass(), "in", term10721);
        setField(term10746, term10746.getClass(), "out", null);
        setFloatField(term10746, term10746.getClass(), "weight", 0.9700962F);
        setBooleanField(term10746, term10746.getClass(), "expressed", false);
        setIntField(term10746, term10746.getClass(), "innovation", -773707674);
        Object term10750 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10750, term10750.getClass(), "in", term10736);
        setField(term10750, term10750.getClass(), "out", null);
        setFloatField(term10750, term10750.getClass(), "weight", 0.7037769F);
        setBooleanField(term10750, term10750.getClass(), "expressed", true);
        setIntField(term10750, term10750.getClass(), "innovation", 1691516034);
        Object term10754 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10754, term10754.getClass(), "in", term10739);
        setField(term10754, term10754.getClass(), "out", null);
        setFloatField(term10754, term10754.getClass(), "weight", 0.43252808F);
        setBooleanField(term10754, term10754.getClass(), "expressed", true);
        setIntField(term10754, term10754.getClass(), "innovation", -484303394);
        Object term10758 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10758, term10758.getClass(), "in", null);
        setField(term10758, term10758.getClass(), "out", term10727);
        setFloatField(term10758, term10758.getClass(), "weight", 0.49736315F);
        setBooleanField(term10758, term10758.getClass(), "expressed", false);
        setIntField(term10758, term10758.getClass(), "innovation", 383244929);
        Object term10762 = newInstance(Class.forName("nn.model.Connection"));
        setField(term10762, term10762.getClass(), "in", null);
        setField(term10762, term10762.getClass(), "out", null);
        setFloatField(term10762, term10762.getClass(), "weight", 0.43500775F);
        setBooleanField(term10762, term10762.getClass(), "expressed", false);
        setIntField(term10762, term10762.getClass(), "innovation", 207213904);
        ArrayList term10744 = new ArrayList();
        ((ArrayList) term10744).add(term10746);
        ((ArrayList) term10744).add(term10750);
        ((ArrayList) term10744).add(term10754);
        ((ArrayList) term10744).add(term10758);
        ((ArrayList) term10744).add(term10750);
        ((ArrayList) term10744).add(term10750);
        ((ArrayList) term10744).add(term10762);
        term10717 = newInstance(Class.forName("nn.model.FitnessGenome"));
        Object term10718 = newInstance(Class.forName("nn.model.Genome"));
        Object term10768 = newInstance(Class.forName("nn.model.NodeInnovator"));
        Object term10770 = newInstance(Class.forName("nn.model.ConnectionInnovator"));
        Object term10772 = newInstance(Class.forName("java.util.Random"));
        Object term10773 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicLong"));
        setField(term10718, term10718.getClass(), "nodes", term10719);
        setField(term10718, term10718.getClass(), "connections", term10744);
        setIntField(term10768, term10768.getClass(), "counter", 100);
        setField(term10718, term10718.getClass(), "nodeInnovator", term10768);
        setIntField(term10770, term10770.getClass(), "counter", 100);
        setField(term10718, term10718.getClass(), "connectionInnovator", term10770);
        setLongField(term10773, term10773.getClass(), "value", 84049170981844L);
        setField(term10772, term10772.getClass(), "seed", term10773);
        setDoubleField(term10772, term10772.getClass(), "nextNextGaussian", 0.8514246643563477);
        setBooleanField(term10772, term10772.getClass(), "haveNextNextGaussian", false);
        setField(term10718, term10718.getClass(), "random", term10772);
        setField(term10717, term10717.getClass(), "genome", term10718);
        setDoubleField(term10717, term10717.getClass(), "fitness", 0.07779122290725593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.FitnessGenome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("nn.model.FitnessGenome");
        Object[] args = new Object[1];
        args[0] = term10717;
        callMethod(klass, "compareTo", argTypes, term10682, args);
    }

};


